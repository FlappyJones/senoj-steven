package android.support.v4.app;

import android.support.v4.p001b.C0038e;
import android.util.Log;
import com.google.android.gms.C0338e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.b */
final class C0008b extends C0007w implements Runnable {
    final C0021o f104a;
    C0009c f105b;
    C0009c f106c;
    int f107d;
    int f108e;
    int f109f;
    int f110g;
    int f111h;
    int f112i;
    int f113j;
    boolean f114k;
    boolean f115l;
    String f116m;
    boolean f117n;
    int f118o;
    int f119p;
    CharSequence f120q;
    int f121r;
    CharSequence f122s;

    public C0008b(C0021o c0021o) {
        this.f115l = true;
        this.f118o = -1;
        this.f104a = c0021o;
    }

    private void m88a(int i, Fragment fragment, String str, int i2) {
        fragment.f46s = this.f104a;
        if (str != null) {
            if (fragment.f52y == null || str.equals(fragment.f52y)) {
                fragment.f52y = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f52y + " now " + str);
            }
        }
        if (i != 0) {
            if (fragment.f50w == 0 || fragment.f50w == i) {
                fragment.f50w = i;
                fragment.f51x = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f50w + " now " + i);
            }
        }
        C0009c c0009c = new C0009c();
        c0009c.f125c = i2;
        c0009c.f126d = fragment;
        m94a(c0009c);
    }

    public int m89a() {
        return m90a(false);
    }

    int m90a(boolean z) {
        if (this.f117n) {
            throw new IllegalStateException("commit already called");
        }
        if (C0021o.f144a) {
            Log.v("FragmentManager", "Commit: " + this);
            m95a("  ", null, new PrintWriter(new C0038e("FragmentManager")), null);
        }
        this.f117n = true;
        if (this.f114k) {
            this.f118o = this.f104a.m117a(this);
        } else {
            this.f118o = -1;
        }
        this.f104a.m134a((Runnable) this, z);
        return this.f118o;
    }

    public C0007w m91a(int i, Fragment fragment, String str) {
        m88a(i, fragment, str, 1);
        return this;
    }

    public C0007w m92a(Fragment fragment) {
        C0009c c0009c = new C0009c();
        c0009c.f125c = 6;
        c0009c.f126d = fragment;
        m94a(c0009c);
        return this;
    }

    void m93a(int i) {
        if (this.f114k) {
            if (C0021o.f144a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (C0009c c0009c = this.f105b; c0009c != null; c0009c = c0009c.f123a) {
                Fragment fragment;
                if (c0009c.f126d != null) {
                    fragment = c0009c.f126d;
                    fragment.f45r += i;
                    if (C0021o.f144a) {
                        Log.v("FragmentManager", "Bump nesting of " + c0009c.f126d + " to " + c0009c.f126d.f45r);
                    }
                }
                if (c0009c.f131i != null) {
                    for (int size = c0009c.f131i.size() - 1; size >= 0; size--) {
                        fragment = (Fragment) c0009c.f131i.get(size);
                        fragment.f45r += i;
                        if (C0021o.f144a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.f45r);
                        }
                    }
                }
            }
        }
    }

    void m94a(C0009c c0009c) {
        if (this.f105b == null) {
            this.f106c = c0009c;
            this.f105b = c0009c;
        } else {
            c0009c.f124b = this.f106c;
            this.f106c.f123a = c0009c;
            this.f106c = c0009c;
        }
        c0009c.f127e = this.f108e;
        c0009c.f128f = this.f109f;
        c0009c.f129g = this.f110g;
        c0009c.f130h = this.f111h;
        this.f107d++;
    }

    public void m95a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m96a(str, printWriter, true);
    }

    public void m96a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f116m);
            printWriter.print(" mIndex=");
            printWriter.print(this.f118o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f117n);
            if (this.f112i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f112i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f113j));
            }
            if (!(this.f108e == 0 && this.f109f == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f108e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f109f));
            }
            if (!(this.f110g == 0 && this.f111h == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f110g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f111h));
            }
            if (!(this.f119p == 0 && this.f120q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f119p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f120q);
            }
            if (!(this.f121r == 0 && this.f122s == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f121r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f122s);
            }
        }
        if (this.f105b != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str2 = str + "    ";
            int i = 0;
            C0009c c0009c = this.f105b;
            while (c0009c != null) {
                String str3;
                switch (c0009c.f125c) {
                    case C0338e.MapAttrs_mapType /*0*/:
                        str3 = "NULL";
                        break;
                    case C0338e.MapAttrs_cameraBearing /*1*/:
                        str3 = "ADD";
                        break;
                    case C0338e.MapAttrs_cameraTargetLat /*2*/:
                        str3 = "REPLACE";
                        break;
                    case C0338e.MapAttrs_cameraTargetLng /*3*/:
                        str3 = "REMOVE";
                        break;
                    case C0338e.MapAttrs_cameraTilt /*4*/:
                        str3 = "HIDE";
                        break;
                    case C0338e.MapAttrs_cameraZoom /*5*/:
                        str3 = "SHOW";
                        break;
                    case C0338e.MapAttrs_uiCompass /*6*/:
                        str3 = "DETACH";
                        break;
                    case C0338e.MapAttrs_uiRotateGestures /*7*/:
                        str3 = "ATTACH";
                        break;
                    default:
                        str3 = "cmd=" + c0009c.f125c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str3);
                printWriter.print(" ");
                printWriter.println(c0009c.f126d);
                if (z) {
                    if (!(c0009c.f127e == 0 && c0009c.f128f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0009c.f127e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0009c.f128f));
                    }
                    if (!(c0009c.f129g == 0 && c0009c.f130h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0009c.f129g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0009c.f130h));
                    }
                }
                if (c0009c.f131i != null && c0009c.f131i.size() > 0) {
                    for (int i2 = 0; i2 < c0009c.f131i.size(); i2++) {
                        printWriter.print(str2);
                        if (c0009c.f131i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str2);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(c0009c.f131i.get(i2));
                    }
                }
                c0009c = c0009c.f123a;
                i++;
            }
        }
    }

    public C0007w m97b(Fragment fragment) {
        C0009c c0009c = new C0009c();
        c0009c.f125c = 7;
        c0009c.f126d = fragment;
        m94a(c0009c);
        return this;
    }

    public String m98b() {
        return this.f116m;
    }

    public void m99b(boolean z) {
        if (C0021o.f144a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            m95a("  ", null, new PrintWriter(new C0038e("FragmentManager")), null);
        }
        m93a(-1);
        for (C0009c c0009c = this.f106c; c0009c != null; c0009c = c0009c.f124b) {
            Fragment fragment;
            switch (c0009c.f125c) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    fragment = c0009c.f126d;
                    fragment.f19G = c0009c.f130h;
                    this.f104a.m130a(fragment, C0021o.m115c(this.f112i), this.f113j);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    fragment = c0009c.f126d;
                    if (fragment != null) {
                        fragment.f19G = c0009c.f130h;
                        this.f104a.m130a(fragment, C0021o.m115c(this.f112i), this.f113j);
                    }
                    if (c0009c.f131i == null) {
                        break;
                    }
                    for (int i = 0; i < c0009c.f131i.size(); i++) {
                        fragment = (Fragment) c0009c.f131i.get(i);
                        fragment.f19G = c0009c.f129g;
                        this.f104a.m132a(fragment, false);
                    }
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    fragment = c0009c.f126d;
                    fragment.f19G = c0009c.f129g;
                    this.f104a.m132a(fragment, false);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    fragment = c0009c.f126d;
                    fragment.f19G = c0009c.f129g;
                    this.f104a.m148c(fragment, C0021o.m115c(this.f112i), this.f113j);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    fragment = c0009c.f126d;
                    fragment.f19G = c0009c.f130h;
                    this.f104a.m142b(fragment, C0021o.m115c(this.f112i), this.f113j);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    fragment = c0009c.f126d;
                    fragment.f19G = c0009c.f129g;
                    this.f104a.m154e(fragment, C0021o.m115c(this.f112i), this.f113j);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    fragment = c0009c.f126d;
                    fragment.f19G = c0009c.f129g;
                    this.f104a.m152d(fragment, C0021o.m115c(this.f112i), this.f113j);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0009c.f125c);
            }
        }
        if (z) {
            this.f104a.m123a(this.f104a.f158n, C0021o.m115c(this.f112i), this.f113j, true);
        }
        if (this.f118o >= 0) {
            this.f104a.m140b(this.f118o);
            this.f118o = -1;
        }
    }

    public void run() {
        if (C0021o.f144a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (!this.f114k || this.f118o >= 0) {
            m93a(1);
            for (C0009c c0009c = this.f105b; c0009c != null; c0009c = c0009c.f123a) {
                Fragment fragment;
                switch (c0009c.f125c) {
                    case C0338e.MapAttrs_cameraBearing /*1*/:
                        fragment = c0009c.f126d;
                        fragment.f19G = c0009c.f127e;
                        this.f104a.m132a(fragment, false);
                        break;
                    case C0338e.MapAttrs_cameraTargetLat /*2*/:
                        Fragment fragment2;
                        fragment = c0009c.f126d;
                        if (this.f104a.f151g != null) {
                            fragment2 = fragment;
                            for (int i = 0; i < this.f104a.f151g.size(); i++) {
                                fragment = (Fragment) this.f104a.f151g.get(i);
                                if (C0021o.f144a) {
                                    Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment2 + " old=" + fragment);
                                }
                                if (fragment2 == null || fragment.f51x == fragment2.f51x) {
                                    if (fragment == fragment2) {
                                        fragment2 = null;
                                        c0009c.f126d = null;
                                    } else {
                                        if (c0009c.f131i == null) {
                                            c0009c.f131i = new ArrayList();
                                        }
                                        c0009c.f131i.add(fragment);
                                        fragment.f19G = c0009c.f128f;
                                        if (this.f114k) {
                                            fragment.f45r++;
                                            if (C0021o.f144a) {
                                                Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.f45r);
                                            }
                                        }
                                        this.f104a.m130a(fragment, this.f112i, this.f113j);
                                    }
                                }
                            }
                        } else {
                            fragment2 = fragment;
                        }
                        if (fragment2 == null) {
                            break;
                        }
                        fragment2.f19G = c0009c.f127e;
                        this.f104a.m132a(fragment2, false);
                        break;
                    case C0338e.MapAttrs_cameraTargetLng /*3*/:
                        fragment = c0009c.f126d;
                        fragment.f19G = c0009c.f128f;
                        this.f104a.m130a(fragment, this.f112i, this.f113j);
                        break;
                    case C0338e.MapAttrs_cameraTilt /*4*/:
                        fragment = c0009c.f126d;
                        fragment.f19G = c0009c.f128f;
                        this.f104a.m142b(fragment, this.f112i, this.f113j);
                        break;
                    case C0338e.MapAttrs_cameraZoom /*5*/:
                        fragment = c0009c.f126d;
                        fragment.f19G = c0009c.f127e;
                        this.f104a.m148c(fragment, this.f112i, this.f113j);
                        break;
                    case C0338e.MapAttrs_uiCompass /*6*/:
                        fragment = c0009c.f126d;
                        fragment.f19G = c0009c.f128f;
                        this.f104a.m152d(fragment, this.f112i, this.f113j);
                        break;
                    case C0338e.MapAttrs_uiRotateGestures /*7*/:
                        fragment = c0009c.f126d;
                        fragment.f19G = c0009c.f127e;
                        this.f104a.m154e(fragment, this.f112i, this.f113j);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + c0009c.f125c);
                }
            }
            this.f104a.m123a(this.f104a.f158n, this.f112i, this.f113j, true);
            if (this.f114k) {
                this.f104a.m143b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f118o >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f118o);
        }
        if (this.f116m != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f116m);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
