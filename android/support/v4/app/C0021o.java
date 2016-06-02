package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p001b.C0037d;
import android.support.v4.p001b.C0038e;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import com.google.android.gms.C0338e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: android.support.v4.app.o */
final class C0021o extends C0019m {
    static final Interpolator f141A;
    static final Interpolator f142B;
    static final Interpolator f143C;
    static boolean f144a;
    static final boolean f145b;
    static final Interpolator f146z;
    ArrayList f147c;
    Runnable[] f148d;
    boolean f149e;
    ArrayList f150f;
    ArrayList f151g;
    ArrayList f152h;
    ArrayList f153i;
    ArrayList f154j;
    ArrayList f155k;
    ArrayList f156l;
    ArrayList f157m;
    int f158n;
    FragmentActivity f159o;
    C0011l f160p;
    Fragment f161q;
    boolean f162r;
    boolean f163s;
    boolean f164t;
    String f165u;
    boolean f166v;
    Bundle f167w;
    SparseArray f168x;
    Runnable f169y;

    static {
        boolean z = false;
        f144a = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        f145b = z;
        f146z = new DecelerateInterpolator(2.5f);
        f141A = new DecelerateInterpolator(1.5f);
        f142B = new AccelerateInterpolator(2.5f);
        f143C = new AccelerateInterpolator(1.5f);
    }

    C0021o() {
        this.f158n = 0;
        this.f167w = null;
        this.f168x = null;
        this.f169y = new C0022p(this);
    }

    static Animation m111a(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f141A);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    static Animation m112a(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f146z);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(f141A);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private void m113a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0038e("FragmentManager"));
        if (this.f159o != null) {
            try {
                this.f159o.dump("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                m135a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public static int m114b(int i, boolean z) {
        switch (i) {
            case 4097:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    public static int m115c(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    private void m116t() {
        if (this.f163s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f165u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f165u);
        }
    }

    public int m117a(C0008b c0008b) {
        int size;
        synchronized (this) {
            if (this.f156l == null || this.f156l.size() <= 0) {
                if (this.f155k == null) {
                    this.f155k = new ArrayList();
                }
                size = this.f155k.size();
                if (f144a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + c0008b);
                }
                this.f155k.add(c0008b);
            } else {
                size = ((Integer) this.f156l.remove(this.f156l.size() - 1)).intValue();
                if (f144a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + c0008b);
                }
                this.f155k.set(size, c0008b);
            }
        }
        return size;
    }

    public Fragment m118a(int i) {
        int size;
        Fragment fragment;
        if (this.f151g != null) {
            for (size = this.f151g.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f151g.get(size);
                if (fragment != null && fragment.f50w == i) {
                    return fragment;
                }
            }
        }
        if (this.f150f != null) {
            for (size = this.f150f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f150f.get(size);
                if (fragment != null && fragment.f50w == i) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public Fragment m119a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f150f.size()) {
            m113a(new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = (Fragment) this.f150f.get(i);
        if (fragment != null) {
            return fragment;
        }
        m113a(new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i));
        return fragment;
    }

    public Fragment m120a(String str) {
        int size;
        Fragment fragment;
        if (!(this.f151g == null || str == null)) {
            for (size = this.f151g.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f151g.get(size);
                if (fragment != null && str.equals(fragment.f52y)) {
                    return fragment;
                }
            }
        }
        if (!(this.f150f == null || str == null)) {
            for (size = this.f150f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f150f.get(size);
                if (fragment != null && str.equals(fragment.f52y)) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public C0007w m121a() {
        return new C0008b(this);
    }

    Animation m122a(Fragment fragment, int i, boolean z, int i2) {
        Animation a = fragment.m9a(i, z, fragment.f19G);
        if (a != null) {
            return a;
        }
        if (fragment.f19G != 0) {
            a = AnimationUtils.loadAnimation(this.f159o, fragment.f19G);
            if (a != null) {
                return a;
            }
        }
        if (i == 0) {
            return null;
        }
        int b = C0021o.m114b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return C0021o.m112a(this.f159o, 1.125f, 1.0f, 0.0f, 1.0f);
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                return C0021o.m112a(this.f159o, 1.0f, 0.975f, 1.0f, 0.0f);
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                return C0021o.m112a(this.f159o, 0.975f, 1.0f, 0.0f, 1.0f);
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return C0021o.m112a(this.f159o, 1.0f, 1.075f, 1.0f, 0.0f);
            case C0338e.MapAttrs_cameraZoom /*5*/:
                return C0021o.m111a(this.f159o, 0.0f, 1.0f);
            case C0338e.MapAttrs_uiCompass /*6*/:
                return C0021o.m111a(this.f159o, 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f159o.getWindow() != null) {
                    i2 = this.f159o.getWindow().getAttributes().windowAnimations;
                }
                return i2 == 0 ? null : null;
        }
    }

    void m123a(int i, int i2, int i3, boolean z) {
        if (this.f159o == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || this.f158n != i) {
            this.f158n = i;
            if (this.f150f != null) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < this.f150f.size()) {
                    int a;
                    Fragment fragment = (Fragment) this.f150f.get(i4);
                    if (fragment != null) {
                        m131a(fragment, i, i2, i3, false);
                        if (fragment.f25M != null) {
                            a = i5 | fragment.f25M.m188a();
                            i4++;
                            i5 = a;
                        }
                    }
                    a = i5;
                    i4++;
                    i5 = a;
                }
                if (i5 == 0) {
                    m150d();
                }
                if (this.f162r && this.f159o != null && this.f158n == 5) {
                    this.f159o.m69c();
                    this.f162r = false;
                }
            }
        }
    }

    public void m124a(int i, C0008b c0008b) {
        synchronized (this) {
            if (this.f155k == null) {
                this.f155k = new ArrayList();
            }
            int size = this.f155k.size();
            if (i < size) {
                if (f144a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + c0008b);
                }
                this.f155k.set(i, c0008b);
            } else {
                while (size < i) {
                    this.f155k.add(null);
                    if (this.f156l == null) {
                        this.f156l = new ArrayList();
                    }
                    if (f144a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f156l.add(Integer.valueOf(size));
                    size++;
                }
                if (f144a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + c0008b);
                }
                this.f155k.add(c0008b);
            }
        }
    }

    void m125a(int i, boolean z) {
        m123a(i, 0, 0, z);
    }

    public void m126a(Configuration configuration) {
        if (this.f151g != null) {
            for (int i = 0; i < this.f151g.size(); i++) {
                Fragment fragment = (Fragment) this.f151g.get(i);
                if (fragment != null) {
                    fragment.m14a(configuration);
                }
            }
        }
    }

    public void m127a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f33f < 0) {
            m113a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.f33f);
    }

    void m128a(Parcelable parcelable, ArrayList arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f67a != null) {
                int i;
                Fragment fragment;
                int i2;
                if (arrayList != null) {
                    for (i = 0; i < arrayList.size(); i++) {
                        fragment = (Fragment) arrayList.get(i);
                        if (f144a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.f67a[fragment.f33f];
                        fragmentState.f80k = fragment;
                        fragment.f32e = null;
                        fragment.f45r = 0;
                        fragment.f43p = false;
                        fragment.f39l = false;
                        fragment.f36i = null;
                        if (fragmentState.f79j != null) {
                            fragmentState.f79j.setClassLoader(this.f159o.getClassLoader());
                            fragment.f32e = fragmentState.f79j.getSparseParcelableArray("android:view_state");
                        }
                    }
                }
                this.f150f = new ArrayList(fragmentManagerState.f67a.length);
                if (this.f152h != null) {
                    this.f152h.clear();
                }
                for (i2 = 0; i2 < fragmentManagerState.f67a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.f67a[i2];
                    if (fragmentState2 != null) {
                        Fragment a = fragmentState2.m71a(this.f159o, this.f161q);
                        if (f144a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + a);
                        }
                        this.f150f.add(a);
                        fragmentState2.f80k = null;
                    } else {
                        this.f150f.add(null);
                        if (this.f152h == null) {
                            this.f152h = new ArrayList();
                        }
                        if (f144a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.f152h.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        fragment = (Fragment) arrayList.get(i3);
                        if (fragment.f37j >= 0) {
                            if (fragment.f37j < this.f150f.size()) {
                                fragment.f36i = (Fragment) this.f150f.get(fragment.f37j);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment + " target no longer exists: " + fragment.f37j);
                                fragment.f36i = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.f68b != null) {
                    this.f151g = new ArrayList(fragmentManagerState.f68b.length);
                    for (i = 0; i < fragmentManagerState.f68b.length; i++) {
                        fragment = (Fragment) this.f150f.get(fragmentManagerState.f68b[i]);
                        if (fragment == null) {
                            m113a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f68b[i]));
                        }
                        fragment.f39l = true;
                        if (f144a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i + ": " + fragment);
                        }
                        if (this.f151g.contains(fragment)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f151g.add(fragment);
                    }
                } else {
                    this.f151g = null;
                }
                if (fragmentManagerState.f69c != null) {
                    this.f153i = new ArrayList(fragmentManagerState.f69c.length);
                    for (i2 = 0; i2 < fragmentManagerState.f69c.length; i2++) {
                        C0008b a2 = fragmentManagerState.f69c[i2].m4a(this);
                        if (f144a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a2.f118o + "): " + a2);
                            a2.m96a("  ", new PrintWriter(new C0038e("FragmentManager")), false);
                        }
                        this.f153i.add(a2);
                        if (a2.f118o >= 0) {
                            m124a(a2.f118o, a2);
                        }
                    }
                    return;
                }
                this.f153i = null;
            }
        }
    }

    public void m129a(Fragment fragment) {
        if (!fragment.f23K) {
            return;
        }
        if (this.f149e) {
            this.f166v = true;
            return;
        }
        fragment.f23K = false;
        m131a(fragment, this.f158n, 0, 0, false);
    }

    public void m130a(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f45r);
        }
        boolean z = !fragment.m21a();
        if (!fragment.f13A || z) {
            if (this.f151g != null) {
                this.f151g.remove(fragment);
            }
            if (fragment.f16D && fragment.f17E) {
                this.f162r = true;
            }
            fragment.f39l = false;
            fragment.f40m = true;
            m131a(fragment, z ? 0 : 1, i, i2, false);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m131a(android.support.v4.app.Fragment r10, int r11, int r12, int r13, boolean r14) {
        /*
        r9 = this;
        r8 = 4;
        r6 = 3;
        r3 = 0;
        r5 = 1;
        r7 = 0;
        r0 = r10.f39l;
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r0 = r10.f13A;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        if (r11 <= r5) goto L_0x0010;
    L_0x000f:
        r11 = r5;
    L_0x0010:
        r0 = r10.f40m;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r10.f28a;
        if (r11 <= r0) goto L_0x001a;
    L_0x0018:
        r11 = r10.f28a;
    L_0x001a:
        r0 = r10.f23K;
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r0 = r10.f28a;
        if (r0 >= r8) goto L_0x0025;
    L_0x0022:
        if (r11 <= r6) goto L_0x0025;
    L_0x0024:
        r11 = r6;
    L_0x0025:
        r0 = r10.f28a;
        if (r0 >= r11) goto L_0x0240;
    L_0x0029:
        r0 = r10.f42o;
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r10.f43p;
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r0 = r10.f29b;
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r10.f29b = r7;
        r2 = r10.f30c;
        r0 = r9;
        r1 = r10;
        r4 = r3;
        r0.m131a(r1, r2, r3, r4, r5);
    L_0x0040:
        r0 = r10.f28a;
        switch(r0) {
            case 0: goto L_0x0048;
            case 1: goto L_0x0126;
            case 2: goto L_0x01ef;
            case 3: goto L_0x01ef;
            case 4: goto L_0x0210;
            default: goto L_0x0045;
        };
    L_0x0045:
        r10.f28a = r11;
        goto L_0x0031;
    L_0x0048:
        r0 = f144a;
        if (r0 == 0) goto L_0x0064;
    L_0x004c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0064:
        r0 = r10.f31d;
        if (r0 == 0) goto L_0x009d;
    L_0x0068:
        r0 = r10.f31d;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r10.f32e = r0;
        r0 = r10.f31d;
        r1 = "android:target_state";
        r0 = r9.m119a(r0, r1);
        r10.f36i = r0;
        r0 = r10.f36i;
        if (r0 == 0) goto L_0x008a;
    L_0x0080:
        r0 = r10.f31d;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r3);
        r10.f38k = r0;
    L_0x008a:
        r0 = r10.f31d;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r5);
        r10.f24L = r0;
        r0 = r10.f24L;
        if (r0 != 0) goto L_0x009d;
    L_0x0098:
        r10.f23K = r5;
        if (r11 <= r6) goto L_0x009d;
    L_0x009c:
        r11 = r6;
    L_0x009d:
        r0 = r9.f159o;
        r10.f47t = r0;
        r0 = r9.f161q;
        r10.f49v = r0;
        r0 = r9.f161q;
        if (r0 == 0) goto L_0x00d9;
    L_0x00a9:
        r0 = r9.f161q;
        r0 = r0.f48u;
    L_0x00ad:
        r10.f46s = r0;
        r10.f18F = r3;
        r0 = r9.f159o;
        r10.m12a(r0);
        r0 = r10.f18F;
        if (r0 != 0) goto L_0x00de;
    L_0x00ba:
        r0 = new android.support.v4.app.ac;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r2 = " did not call through to super.onAttach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00d9:
        r0 = r9.f159o;
        r0 = r0.f55b;
        goto L_0x00ad;
    L_0x00de:
        r0 = r10.f49v;
        if (r0 != 0) goto L_0x00e7;
    L_0x00e2:
        r0 = r9.f159o;
        r0.m64a(r10);
    L_0x00e7:
        r0 = r10.f15C;
        if (r0 != 0) goto L_0x00f0;
    L_0x00eb:
        r0 = r10.f31d;
        r10.m42g(r0);
    L_0x00f0:
        r10.f15C = r3;
        r0 = r10.f42o;
        if (r0 == 0) goto L_0x0126;
    L_0x00f6:
        r0 = r10.f31d;
        r0 = r10.m24b(r0);
        r1 = r10.f31d;
        r0 = r10.m25b(r0, r7, r1);
        r10.f21I = r0;
        r0 = r10.f21I;
        if (r0 == 0) goto L_0x0239;
    L_0x0108:
        r0 = r10.f21I;
        r10.f22J = r0;
        r0 = r10.f21I;
        r0 = android.support.v4.app.ab.m83a(r0);
        r10.f21I = r0;
        r0 = r10.f53z;
        if (r0 == 0) goto L_0x011f;
    L_0x0118:
        r0 = r10.f21I;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x011f:
        r0 = r10.f21I;
        r1 = r10.f31d;
        r10.m18a(r0, r1);
    L_0x0126:
        if (r11 <= r5) goto L_0x01ef;
    L_0x0128:
        r0 = f144a;
        if (r0 == 0) goto L_0x0144;
    L_0x012c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0144:
        r0 = r10.f42o;
        if (r0 != 0) goto L_0x01df;
    L_0x0148:
        r0 = r10.f51x;
        if (r0 == 0) goto L_0x0397;
    L_0x014c:
        r0 = r9.f160p;
        r1 = r10.f51x;
        r0 = r0.m102a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x019b;
    L_0x0158:
        r1 = r10.f44q;
        if (r1 != 0) goto L_0x019b;
    L_0x015c:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "No view found for id 0x";
        r2 = r2.append(r3);
        r3 = r10.f51x;
        r3 = java.lang.Integer.toHexString(r3);
        r2 = r2.append(r3);
        r3 = " (";
        r2 = r2.append(r3);
        r3 = r10.m29c();
        r4 = r10.f51x;
        r3 = r3.getResourceName(r4);
        r2 = r2.append(r3);
        r3 = ") for fragment ";
        r2 = r2.append(r3);
        r2 = r2.append(r10);
        r2 = r2.toString();
        r1.<init>(r2);
        r9.m113a(r1);
    L_0x019b:
        r10.f20H = r0;
        r1 = r10.f31d;
        r1 = r10.m24b(r1);
        r2 = r10.f31d;
        r1 = r10.m25b(r1, r0, r2);
        r10.f21I = r1;
        r1 = r10.f21I;
        if (r1 == 0) goto L_0x023d;
    L_0x01af:
        r1 = r10.f21I;
        r10.f22J = r1;
        r1 = r10.f21I;
        r1 = android.support.v4.app.ab.m83a(r1);
        r10.f21I = r1;
        if (r0 == 0) goto L_0x01cd;
    L_0x01bd:
        r1 = r9.m122a(r10, r12, r5, r13);
        if (r1 == 0) goto L_0x01c8;
    L_0x01c3:
        r2 = r10.f21I;
        r2.startAnimation(r1);
    L_0x01c8:
        r1 = r10.f21I;
        r0.addView(r1);
    L_0x01cd:
        r0 = r10.f53z;
        if (r0 == 0) goto L_0x01d8;
    L_0x01d1:
        r0 = r10.f21I;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x01d8:
        r0 = r10.f21I;
        r1 = r10.f31d;
        r10.m18a(r0, r1);
    L_0x01df:
        r0 = r10.f31d;
        r10.m44h(r0);
        r0 = r10.f21I;
        if (r0 == 0) goto L_0x01ed;
    L_0x01e8:
        r0 = r10.f31d;
        r10.m15a(r0);
    L_0x01ed:
        r10.f31d = r7;
    L_0x01ef:
        if (r11 <= r6) goto L_0x0210;
    L_0x01f1:
        r0 = f144a;
        if (r0 == 0) goto L_0x020d;
    L_0x01f5:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x020d:
        r10.m52o();
    L_0x0210:
        if (r11 <= r8) goto L_0x0045;
    L_0x0212:
        r0 = f144a;
        if (r0 == 0) goto L_0x022e;
    L_0x0216:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x022e:
        r10.f41n = r5;
        r10.m53p();
        r10.f31d = r7;
        r10.f32e = r7;
        goto L_0x0045;
    L_0x0239:
        r10.f22J = r7;
        goto L_0x0126;
    L_0x023d:
        r10.f22J = r7;
        goto L_0x01df;
    L_0x0240:
        r0 = r10.f28a;
        if (r0 <= r11) goto L_0x0045;
    L_0x0244:
        r0 = r10.f28a;
        switch(r0) {
            case 1: goto L_0x024b;
            case 2: goto L_0x02cb;
            case 3: goto L_0x02aa;
            case 4: goto L_0x0289;
            case 5: goto L_0x0265;
            default: goto L_0x0249;
        };
    L_0x0249:
        goto L_0x0045;
    L_0x024b:
        if (r11 >= r5) goto L_0x0045;
    L_0x024d:
        r0 = r9.f164t;
        if (r0 == 0) goto L_0x025c;
    L_0x0251:
        r0 = r10.f29b;
        if (r0 == 0) goto L_0x025c;
    L_0x0255:
        r0 = r10.f29b;
        r10.f29b = r7;
        r0.clearAnimation();
    L_0x025c:
        r0 = r10.f29b;
        if (r0 == 0) goto L_0x0338;
    L_0x0260:
        r10.f30c = r11;
        r11 = r5;
        goto L_0x0045;
    L_0x0265:
        r0 = 5;
        if (r11 >= r0) goto L_0x0289;
    L_0x0268:
        r0 = f144a;
        if (r0 == 0) goto L_0x0284;
    L_0x026c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0284:
        r10.m55r();
        r10.f41n = r3;
    L_0x0289:
        if (r11 >= r8) goto L_0x02aa;
    L_0x028b:
        r0 = f144a;
        if (r0 == 0) goto L_0x02a7;
    L_0x028f:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02a7:
        r10.m56s();
    L_0x02aa:
        if (r11 >= r6) goto L_0x02cb;
    L_0x02ac:
        r0 = f144a;
        if (r0 == 0) goto L_0x02c8;
    L_0x02b0:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STOPPED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02c8:
        r10.m57t();
    L_0x02cb:
        r0 = 2;
        if (r11 >= r0) goto L_0x024b;
    L_0x02ce:
        r0 = f144a;
        if (r0 == 0) goto L_0x02ea;
    L_0x02d2:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02ea:
        r0 = r10.f21I;
        if (r0 == 0) goto L_0x02fd;
    L_0x02ee:
        r0 = r9.f159o;
        r0 = r0.isFinishing();
        if (r0 != 0) goto L_0x02fd;
    L_0x02f6:
        r0 = r10.f32e;
        if (r0 != 0) goto L_0x02fd;
    L_0x02fa:
        r9.m153e(r10);
    L_0x02fd:
        r10.m58u();
        r0 = r10.f21I;
        if (r0 == 0) goto L_0x0330;
    L_0x0304:
        r0 = r10.f20H;
        if (r0 == 0) goto L_0x0330;
    L_0x0308:
        r0 = r9.f158n;
        if (r0 <= 0) goto L_0x0394;
    L_0x030c:
        r0 = r9.f164t;
        if (r0 != 0) goto L_0x0394;
    L_0x0310:
        r0 = r9.m122a(r10, r12, r3, r13);
    L_0x0314:
        if (r0 == 0) goto L_0x0329;
    L_0x0316:
        r1 = r10.f21I;
        r10.f29b = r1;
        r10.f30c = r11;
        r1 = new android.support.v4.app.q;
        r1.<init>(r9, r10);
        r0.setAnimationListener(r1);
        r1 = r10.f21I;
        r1.startAnimation(r0);
    L_0x0329:
        r0 = r10.f20H;
        r1 = r10.f21I;
        r0.removeView(r1);
    L_0x0330:
        r10.f20H = r7;
        r10.f21I = r7;
        r10.f22J = r7;
        goto L_0x024b;
    L_0x0338:
        r0 = f144a;
        if (r0 == 0) goto L_0x0354;
    L_0x033c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0354:
        r0 = r10.f15C;
        if (r0 != 0) goto L_0x035b;
    L_0x0358:
        r10.m59v();
    L_0x035b:
        r10.f18F = r3;
        r10.m49l();
        r0 = r10.f18F;
        if (r0 != 0) goto L_0x0383;
    L_0x0364:
        r0 = new android.support.v4.app.ac;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r2 = " did not call through to super.onDetach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0383:
        if (r14 != 0) goto L_0x0045;
    L_0x0385:
        r0 = r10.f15C;
        if (r0 != 0) goto L_0x038e;
    L_0x0389:
        r9.m151d(r10);
        goto L_0x0045;
    L_0x038e:
        r10.f47t = r7;
        r10.f46s = r7;
        goto L_0x0045;
    L_0x0394:
        r0 = r7;
        goto L_0x0314;
    L_0x0397:
        r0 = r7;
        goto L_0x019b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    public void m132a(Fragment fragment, boolean z) {
        if (this.f151g == null) {
            this.f151g = new ArrayList();
        }
        if (f144a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m147c(fragment);
        if (!fragment.f13A) {
            if (this.f151g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            this.f151g.add(fragment);
            fragment.f39l = true;
            fragment.f40m = false;
            if (fragment.f16D && fragment.f17E) {
                this.f162r = true;
            }
            if (z) {
                m141b(fragment);
            }
        }
    }

    public void m133a(FragmentActivity fragmentActivity, C0011l c0011l, Fragment fragment) {
        if (this.f159o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f159o = fragmentActivity;
        this.f160p = c0011l;
        this.f161q = fragment;
    }

    public void m134a(Runnable runnable, boolean z) {
        if (!z) {
            m116t();
        }
        synchronized (this) {
            if (this.f164t || this.f159o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.f147c == null) {
                this.f147c = new ArrayList();
            }
            this.f147c.add(runnable);
            if (this.f147c.size() == 1) {
                this.f159o.f54a.removeCallbacks(this.f169y);
                this.f159o.f54a.post(this.f169y);
            }
        }
    }

    public void m135a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        Fragment fragment;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.f150f != null) {
            size = this.f150f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.f150f.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.m19a(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.f151g != null) {
            size = this.f151g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.f151g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        if (this.f154j != null) {
            size = this.f154j.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.f154j.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        if (this.f153i != null) {
            size = this.f153i.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    C0008b c0008b = (C0008b) this.f153i.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0008b.toString());
                    c0008b.m95a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f155k != null) {
                int size2 = this.f155k.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        c0008b = (C0008b) this.f155k.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(c0008b);
                    }
                }
            }
            if (this.f156l != null && this.f156l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f156l.toArray()));
            }
        }
        if (this.f147c != null) {
            i = this.f147c.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    Runnable runnable = (Runnable) this.f147c.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(runnable);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.f159o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f160p);
        if (this.f161q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f161q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f158n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f163s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f164t);
        if (this.f162r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f162r);
        }
        if (this.f165u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f165u);
        }
        if (this.f152h != null && this.f152h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.f152h.toArray()));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean m136a(android.os.Handler r9, java.lang.String r10, int r11, int r12) {
        /*
        r8 = this;
        r2 = 1;
        r3 = 0;
        r0 = r8.f153i;
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return r3;
    L_0x0007:
        if (r10 != 0) goto L_0x0029;
    L_0x0009:
        if (r11 >= 0) goto L_0x0029;
    L_0x000b:
        r0 = r12 & 1;
        if (r0 != 0) goto L_0x0029;
    L_0x000f:
        r0 = r8.f153i;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r0 < 0) goto L_0x0006;
    L_0x0019:
        r1 = r8.f153i;
        r0 = r1.remove(r0);
        r0 = (android.support.v4.app.C0008b) r0;
        r0.m99b(r2);
        r8.m157f();
    L_0x0027:
        r3 = r2;
        goto L_0x0006;
    L_0x0029:
        r0 = -1;
        if (r10 != 0) goto L_0x002e;
    L_0x002c:
        if (r11 < 0) goto L_0x007d;
    L_0x002e:
        r0 = r8.f153i;
        r0 = r0.size();
        r1 = r0 + -1;
    L_0x0036:
        if (r1 < 0) goto L_0x004c;
    L_0x0038:
        r0 = r8.f153i;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.C0008b) r0;
        if (r10 == 0) goto L_0x0073;
    L_0x0042:
        r4 = r0.m98b();
        r4 = r10.equals(r4);
        if (r4 == 0) goto L_0x0073;
    L_0x004c:
        if (r1 < 0) goto L_0x0006;
    L_0x004e:
        r0 = r12 & 1;
        if (r0 == 0) goto L_0x007c;
    L_0x0052:
        r1 = r1 + -1;
    L_0x0054:
        if (r1 < 0) goto L_0x007c;
    L_0x0056:
        r0 = r8.f153i;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.C0008b) r0;
        if (r10 == 0) goto L_0x006a;
    L_0x0060:
        r4 = r0.m98b();
        r4 = r10.equals(r4);
        if (r4 != 0) goto L_0x0070;
    L_0x006a:
        if (r11 < 0) goto L_0x007c;
    L_0x006c:
        r0 = r0.f118o;
        if (r11 != r0) goto L_0x007c;
    L_0x0070:
        r1 = r1 + -1;
        goto L_0x0054;
    L_0x0073:
        if (r11 < 0) goto L_0x0079;
    L_0x0075:
        r0 = r0.f118o;
        if (r11 == r0) goto L_0x004c;
    L_0x0079:
        r1 = r1 + -1;
        goto L_0x0036;
    L_0x007c:
        r0 = r1;
    L_0x007d:
        r1 = r8.f153i;
        r1 = r1.size();
        r1 = r1 + -1;
        if (r0 == r1) goto L_0x0006;
    L_0x0087:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r1 = r8.f153i;
        r1 = r1.size();
        r1 = r1 + -1;
    L_0x0094:
        if (r1 <= r0) goto L_0x00a2;
    L_0x0096:
        r4 = r8.f153i;
        r4 = r4.remove(r1);
        r5.add(r4);
        r1 = r1 + -1;
        goto L_0x0094;
    L_0x00a2:
        r0 = r5.size();
        r6 = r0 + -1;
        r4 = r3;
    L_0x00a9:
        if (r4 > r6) goto L_0x00dd;
    L_0x00ab:
        r0 = f144a;
        if (r0 == 0) goto L_0x00cb;
    L_0x00af:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r7 = "Popping back stack state: ";
        r1 = r1.append(r7);
        r7 = r5.get(r4);
        r1 = r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x00cb:
        r0 = r5.get(r4);
        r0 = (android.support.v4.app.C0008b) r0;
        if (r4 != r6) goto L_0x00db;
    L_0x00d3:
        r1 = r2;
    L_0x00d4:
        r0.m99b(r1);
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x00a9;
    L_0x00db:
        r1 = r3;
        goto L_0x00d4;
    L_0x00dd:
        r8.m157f();
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.a(android.os.Handler, java.lang.String, int, int):boolean");
    }

    public boolean m137a(Menu menu) {
        if (this.f151g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f151g.size(); i++) {
            Fragment fragment = (Fragment) this.f151g.get(i);
            if (fragment != null && fragment.m31c(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean m138a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        Fragment fragment;
        int i = 0;
        ArrayList arrayList = null;
        if (this.f151g != null) {
            int i2 = 0;
            z = false;
            while (i2 < this.f151g.size()) {
                fragment = (Fragment) this.f151g.get(i2);
                if (fragment != null && fragment.m27b(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                }
                i2++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.f154j != null) {
            while (i < this.f154j.size()) {
                fragment = (Fragment) this.f154j.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.m50m();
                }
                i++;
            }
        }
        this.f154j = arrayList;
        return z;
    }

    public boolean m139a(MenuItem menuItem) {
        if (this.f151g == null) {
            return false;
        }
        for (int i = 0; i < this.f151g.size(); i++) {
            Fragment fragment = (Fragment) this.f151g.get(i);
            if (fragment != null && fragment.m32c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m140b(int i) {
        synchronized (this) {
            this.f155k.set(i, null);
            if (this.f156l == null) {
                this.f156l = new ArrayList();
            }
            if (f144a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f156l.add(Integer.valueOf(i));
        }
    }

    void m141b(Fragment fragment) {
        m131a(fragment, this.f158n, 0, 0, false);
    }

    public void m142b(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f53z) {
            fragment.f53z = true;
            if (fragment.f21I != null) {
                Animation a = m122a(fragment, i, false, i2);
                if (a != null) {
                    fragment.f21I.startAnimation(a);
                }
                fragment.f21I.setVisibility(8);
            }
            if (fragment.f39l && fragment.f16D && fragment.f17E) {
                this.f162r = true;
            }
            fragment.m20a(true);
        }
    }

    void m143b(C0008b c0008b) {
        if (this.f153i == null) {
            this.f153i = new ArrayList();
        }
        this.f153i.add(c0008b);
        m157f();
    }

    public void m144b(Menu menu) {
        if (this.f151g != null) {
            for (int i = 0; i < this.f151g.size(); i++) {
                Fragment fragment = (Fragment) this.f151g.get(i);
                if (fragment != null) {
                    fragment.m34d(menu);
                }
            }
        }
    }

    public boolean m145b() {
        return m155e();
    }

    public boolean m146b(MenuItem menuItem) {
        if (this.f151g == null) {
            return false;
        }
        for (int i = 0; i < this.f151g.size(); i++) {
            Fragment fragment = (Fragment) this.f151g.get(i);
            if (fragment != null && fragment.m36d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void m147c(Fragment fragment) {
        if (fragment.f33f < 0) {
            if (this.f152h == null || this.f152h.size() <= 0) {
                if (this.f150f == null) {
                    this.f150f = new ArrayList();
                }
                fragment.m11a(this.f150f.size(), this.f161q);
                this.f150f.add(fragment);
            } else {
                fragment.m11a(((Integer) this.f152h.remove(this.f152h.size() - 1)).intValue(), this.f161q);
                this.f150f.set(fragment.f33f, fragment);
            }
            if (f144a) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
    }

    public void m148c(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f53z) {
            fragment.f53z = false;
            if (fragment.f21I != null) {
                Animation a = m122a(fragment, i, true, i2);
                if (a != null) {
                    fragment.f21I.startAnimation(a);
                }
                fragment.f21I.setVisibility(0);
            }
            if (fragment.f39l && fragment.f16D && fragment.f17E) {
                this.f162r = true;
            }
            fragment.m20a(false);
        }
    }

    public boolean m149c() {
        m116t();
        m145b();
        return m136a(this.f159o.f54a, null, -1, 0);
    }

    void m150d() {
        if (this.f150f != null) {
            for (int i = 0; i < this.f150f.size(); i++) {
                Fragment fragment = (Fragment) this.f150f.get(i);
                if (fragment != null) {
                    m129a(fragment);
                }
            }
        }
    }

    void m151d(Fragment fragment) {
        if (fragment.f33f >= 0) {
            if (f144a) {
                Log.v("FragmentManager", "Freeing fragment index " + fragment);
            }
            this.f150f.set(fragment.f33f, null);
            if (this.f152h == null) {
                this.f152h = new ArrayList();
            }
            this.f152h.add(Integer.valueOf(fragment.f33f));
            this.f159o.m65a(fragment.f34g);
            fragment.m48k();
        }
    }

    public void m152d(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f13A) {
            fragment.f13A = true;
            if (fragment.f39l) {
                if (this.f151g != null) {
                    if (f144a) {
                        Log.v("FragmentManager", "remove from detach: " + fragment);
                    }
                    this.f151g.remove(fragment);
                }
                if (fragment.f16D && fragment.f17E) {
                    this.f162r = true;
                }
                fragment.f39l = false;
                m131a(fragment, 1, i, i2, false);
            }
        }
    }

    void m153e(Fragment fragment) {
        if (fragment.f22J != null) {
            if (this.f168x == null) {
                this.f168x = new SparseArray();
            } else {
                this.f168x.clear();
            }
            fragment.f22J.saveHierarchyState(this.f168x);
            if (this.f168x.size() > 0) {
                fragment.f32e = this.f168x;
                this.f168x = null;
            }
        }
    }

    public void m154e(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f13A) {
            fragment.f13A = false;
            if (!fragment.f39l) {
                if (this.f151g == null) {
                    this.f151g = new ArrayList();
                }
                if (this.f151g.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (f144a) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                this.f151g.add(fragment);
                fragment.f39l = true;
                if (fragment.f16D && fragment.f17E) {
                    this.f162r = true;
                }
                m131a(fragment, this.f158n, i, i2, false);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m155e() {
        /*
        r6 = this;
        r0 = 1;
        r2 = 0;
        r1 = r6.f149e;
        if (r1 == 0) goto L_0x000e;
    L_0x0006:
        r0 = new java.lang.IllegalStateException;
        r1 = "Recursive entry to executePendingTransactions";
        r0.<init>(r1);
        throw r0;
    L_0x000e:
        r1 = android.os.Looper.myLooper();
        r3 = r6.f159o;
        r3 = r3.f54a;
        r3 = r3.getLooper();
        if (r1 == r3) goto L_0x0024;
    L_0x001c:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must be called from main thread of process";
        r0.<init>(r1);
        throw r0;
    L_0x0024:
        r1 = r2;
    L_0x0025:
        monitor-enter(r6);
        r3 = r6.f147c;	 Catch:{ all -> 0x0097 }
        if (r3 == 0) goto L_0x0032;
    L_0x002a:
        r3 = r6.f147c;	 Catch:{ all -> 0x0097 }
        r3 = r3.size();	 Catch:{ all -> 0x0097 }
        if (r3 != 0) goto L_0x005a;
    L_0x0032:
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        r0 = r6.f166v;
        if (r0 == 0) goto L_0x00a5;
    L_0x0037:
        r3 = r2;
        r4 = r2;
    L_0x0039:
        r0 = r6.f150f;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x009e;
    L_0x0041:
        r0 = r6.f150f;
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 == 0) goto L_0x0056;
    L_0x004b:
        r5 = r0.f25M;
        if (r5 == 0) goto L_0x0056;
    L_0x004f:
        r0 = r0.f25M;
        r0 = r0.m188a();
        r4 = r4 | r0;
    L_0x0056:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0039;
    L_0x005a:
        r1 = r6.f147c;	 Catch:{ all -> 0x0097 }
        r3 = r1.size();	 Catch:{ all -> 0x0097 }
        r1 = r6.f148d;	 Catch:{ all -> 0x0097 }
        if (r1 == 0) goto L_0x0069;
    L_0x0064:
        r1 = r6.f148d;	 Catch:{ all -> 0x0097 }
        r1 = r1.length;	 Catch:{ all -> 0x0097 }
        if (r1 >= r3) goto L_0x006d;
    L_0x0069:
        r1 = new java.lang.Runnable[r3];	 Catch:{ all -> 0x0097 }
        r6.f148d = r1;	 Catch:{ all -> 0x0097 }
    L_0x006d:
        r1 = r6.f147c;	 Catch:{ all -> 0x0097 }
        r4 = r6.f148d;	 Catch:{ all -> 0x0097 }
        r1.toArray(r4);	 Catch:{ all -> 0x0097 }
        r1 = r6.f147c;	 Catch:{ all -> 0x0097 }
        r1.clear();	 Catch:{ all -> 0x0097 }
        r1 = r6.f159o;	 Catch:{ all -> 0x0097 }
        r1 = r1.f54a;	 Catch:{ all -> 0x0097 }
        r4 = r6.f169y;	 Catch:{ all -> 0x0097 }
        r1.removeCallbacks(r4);	 Catch:{ all -> 0x0097 }
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        r6.f149e = r0;
        r1 = r2;
    L_0x0086:
        if (r1 >= r3) goto L_0x009a;
    L_0x0088:
        r4 = r6.f148d;
        r4 = r4[r1];
        r4.run();
        r4 = r6.f148d;
        r5 = 0;
        r4[r1] = r5;
        r1 = r1 + 1;
        goto L_0x0086;
    L_0x0097:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        throw r0;
    L_0x009a:
        r6.f149e = r2;
        r1 = r0;
        goto L_0x0025;
    L_0x009e:
        if (r4 != 0) goto L_0x00a5;
    L_0x00a0:
        r6.f166v = r2;
        r6.m150d();
    L_0x00a5:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.e():boolean");
    }

    Bundle m156f(Fragment fragment) {
        Bundle bundle;
        if (this.f167w == null) {
            this.f167w = new Bundle();
        }
        fragment.m46i(this.f167w);
        if (this.f167w.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f167w;
            this.f167w = null;
        }
        if (fragment.f21I != null) {
            m153e(fragment);
        }
        if (fragment.f32e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f32e);
        }
        if (!fragment.f24L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f24L);
        }
        return bundle;
    }

    void m157f() {
        if (this.f157m != null) {
            for (int i = 0; i < this.f157m.size(); i++) {
                ((C0020n) this.f157m.get(i)).m110a();
            }
        }
    }

    ArrayList m158g() {
        ArrayList arrayList = null;
        if (this.f150f != null) {
            for (int i = 0; i < this.f150f.size(); i++) {
                Fragment fragment = (Fragment) this.f150f.get(i);
                if (fragment != null && fragment.f14B) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    fragment.f15C = true;
                    fragment.f37j = fragment.f36i != null ? fragment.f36i.f33f : -1;
                    if (f144a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                    }
                }
            }
        }
        return arrayList;
    }

    Parcelable m159h() {
        BackStackState[] backStackStateArr = null;
        m155e();
        if (f145b) {
            this.f163s = true;
        }
        if (this.f150f == null || this.f150f.size() <= 0) {
            return null;
        }
        int size = this.f150f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            Fragment fragment = (Fragment) this.f150f.get(i);
            if (fragment != null) {
                if (fragment.f33f < 0) {
                    m113a(new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.f33f));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.f28a <= 0 || fragmentState.f79j != null) {
                    fragmentState.f79j = fragment.f31d;
                } else {
                    fragmentState.f79j = m156f(fragment);
                    if (fragment.f36i != null) {
                        if (fragment.f36i.f33f < 0) {
                            m113a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f36i));
                        }
                        if (fragmentState.f79j == null) {
                            fragmentState.f79j = new Bundle();
                        }
                        m127a(fragmentState.f79j, "android:target_state", fragment.f36i);
                        if (fragment.f38k != 0) {
                            fragmentState.f79j.putInt("android:target_req_state", fragment.f38k);
                        }
                    }
                }
                if (f144a) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.f79j);
                }
                z2 = true;
            } else {
                z2 = z;
            }
            i++;
            z = z2;
        }
        if (z) {
            int[] iArr;
            int i2;
            FragmentManagerState fragmentManagerState;
            if (this.f151g != null) {
                i = this.f151g.size();
                if (i > 0) {
                    iArr = new int[i];
                    for (i2 = 0; i2 < i; i2++) {
                        iArr[i2] = ((Fragment) this.f151g.get(i2)).f33f;
                        if (iArr[i2] < 0) {
                            m113a(new IllegalStateException("Failure saving state: active " + this.f151g.get(i2) + " has cleared index: " + iArr[i2]));
                        }
                        if (f144a) {
                            Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f151g.get(i2));
                        }
                    }
                    if (this.f153i != null) {
                        i = this.f153i.size();
                        if (i > 0) {
                            backStackStateArr = new BackStackState[i];
                            for (i2 = 0; i2 < i; i2++) {
                                backStackStateArr[i2] = new BackStackState(this, (C0008b) this.f153i.get(i2));
                                if (f144a) {
                                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f153i.get(i2));
                                }
                            }
                        }
                    }
                    fragmentManagerState = new FragmentManagerState();
                    fragmentManagerState.f67a = fragmentStateArr;
                    fragmentManagerState.f68b = iArr;
                    fragmentManagerState.f69c = backStackStateArr;
                    return fragmentManagerState;
                }
            }
            iArr = null;
            if (this.f153i != null) {
                i = this.f153i.size();
                if (i > 0) {
                    backStackStateArr = new BackStackState[i];
                    for (i2 = 0; i2 < i; i2++) {
                        backStackStateArr[i2] = new BackStackState(this, (C0008b) this.f153i.get(i2));
                        if (f144a) {
                            Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f153i.get(i2));
                        }
                    }
                }
            }
            fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f67a = fragmentStateArr;
            fragmentManagerState.f68b = iArr;
            fragmentManagerState.f69c = backStackStateArr;
            return fragmentManagerState;
        } else if (!f144a) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    public void m160i() {
        this.f163s = false;
    }

    public void m161j() {
        this.f163s = false;
        m125a(1, false);
    }

    public void m162k() {
        this.f163s = false;
        m125a(2, false);
    }

    public void m163l() {
        this.f163s = false;
        m125a(4, false);
    }

    public void m164m() {
        this.f163s = false;
        m125a(5, false);
    }

    public void m165n() {
        m125a(4, false);
    }

    public void m166o() {
        this.f163s = true;
        m125a(3, false);
    }

    public void m167p() {
        m125a(2, false);
    }

    public void m168q() {
        m125a(1, false);
    }

    public void m169r() {
        this.f164t = true;
        m155e();
        m125a(0, false);
        this.f159o = null;
        this.f160p = null;
        this.f161q = null;
    }

    public void m170s() {
        if (this.f151g != null) {
            for (int i = 0; i < this.f151g.size(); i++) {
                Fragment fragment = (Fragment) this.f151g.get(i);
                if (fragment != null) {
                    fragment.m54q();
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.f161q != null) {
            C0037d.m238a(this.f161q, stringBuilder);
        } else {
            C0037d.m238a(this.f159o, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
