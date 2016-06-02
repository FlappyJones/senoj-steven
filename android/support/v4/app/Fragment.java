package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p001b.C0032l;
import android.support.v4.p001b.C0037d;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener {
    private static final C0032l f12P;
    boolean f13A;
    boolean f14B;
    boolean f15C;
    boolean f16D;
    boolean f17E;
    boolean f18F;
    int f19G;
    ViewGroup f20H;
    View f21I;
    View f22J;
    boolean f23K;
    boolean f24L;
    C0031z f25M;
    boolean f26N;
    boolean f27O;
    int f28a;
    View f29b;
    int f30c;
    Bundle f31d;
    SparseArray f32e;
    int f33f;
    String f34g;
    Bundle f35h;
    Fragment f36i;
    int f37j;
    int f38k;
    boolean f39l;
    boolean f40m;
    boolean f41n;
    boolean f42o;
    boolean f43p;
    boolean f44q;
    int f45r;
    C0021o f46s;
    FragmentActivity f47t;
    C0021o f48u;
    Fragment f49v;
    int f50w;
    int f51x;
    String f52y;
    boolean f53z;

    public class SavedState implements Parcelable {
        public static final Creator CREATOR;
        final Bundle f11a;

        static {
            CREATOR = new C0014g();
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f11a = parcel.readBundle();
            if (classLoader != null && this.f11a != null) {
                this.f11a.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f11a);
        }
    }

    static {
        f12P = new C0032l();
    }

    public Fragment() {
        this.f28a = 0;
        this.f33f = -1;
        this.f37j = -1;
        this.f17E = true;
        this.f24L = true;
    }

    public static Fragment m5a(Context context, String str) {
        return m6a(context, str, null);
    }

    public static Fragment m6a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) f12P.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f12P.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.f35h = bundle;
            }
            return fragment;
        } catch (Exception e) {
            throw new C0013f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (Exception e2) {
            throw new C0013f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (Exception e22) {
            throw new C0013f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e22);
        }
    }

    static boolean m7b(Context context, String str) {
        try {
            Class cls = (Class) f12P.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f12P.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public View m8a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation m9a(int i, boolean z, int i2) {
        return null;
    }

    public void m10a(int i, int i2, Intent intent) {
    }

    final void m11a(int i, Fragment fragment) {
        this.f33f = i;
        if (fragment != null) {
            this.f34g = fragment.f34g + ":" + this.f33f;
        } else {
            this.f34g = "android:fragment:" + this.f33f;
        }
    }

    public void m12a(Activity activity) {
        this.f18F = true;
    }

    public void m13a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f18F = true;
    }

    void m14a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f48u != null) {
            this.f48u.m126a(configuration);
        }
    }

    final void m15a(Bundle bundle) {
        if (this.f32e != null) {
            this.f22J.restoreHierarchyState(this.f32e);
            this.f32e = null;
        }
        this.f18F = false;
        m38e(bundle);
        if (!this.f18F) {
            throw new ac("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void m16a(Menu menu) {
    }

    public void m17a(Menu menu, MenuInflater menuInflater) {
    }

    public void m18a(View view, Bundle bundle) {
    }

    public void m19a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f50w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f51x));
        printWriter.print(" mTag=");
        printWriter.println(this.f52y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f28a);
        printWriter.print(" mIndex=");
        printWriter.print(this.f33f);
        printWriter.print(" mWho=");
        printWriter.print(this.f34g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f45r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f39l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f40m);
        printWriter.print(" mResumed=");
        printWriter.print(this.f41n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f42o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f43p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f53z);
        printWriter.print(" mDetached=");
        printWriter.print(this.f13A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f17E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f16D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f14B);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f15C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f24L);
        if (this.f46s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f46s);
        }
        if (this.f47t != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.f47t);
        }
        if (this.f49v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f49v);
        }
        if (this.f35h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f35h);
        }
        if (this.f31d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f31d);
        }
        if (this.f32e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f32e);
        }
        if (this.f36i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f36i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f38k);
        }
        if (this.f19G != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.f19G);
        }
        if (this.f20H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f20H);
        }
        if (this.f21I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f21I);
        }
        if (this.f22J != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f21I);
        }
        if (this.f29b != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.f29b);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.f30c);
        }
        if (this.f25M != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f25M.m187a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f48u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f48u + ":");
            this.f48u.m135a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void m20a(boolean z) {
    }

    final boolean m21a() {
        return this.f45r > 0;
    }

    public boolean m22a(MenuItem menuItem) {
        return false;
    }

    public final FragmentActivity m23b() {
        return this.f47t;
    }

    public LayoutInflater m24b(Bundle bundle) {
        return this.f47t.getLayoutInflater();
    }

    View m25b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f48u != null) {
            this.f48u.m160i();
        }
        return m8a(layoutInflater, viewGroup, bundle);
    }

    public void m26b(Menu menu) {
    }

    boolean m27b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f53z) {
            return false;
        }
        if (this.f16D && this.f17E) {
            z = true;
            m17a(menu, menuInflater);
        }
        return this.f48u != null ? z | this.f48u.m138a(menu, menuInflater) : z;
    }

    public boolean m28b(MenuItem menuItem) {
        return false;
    }

    public final Resources m29c() {
        if (this.f47t != null) {
            return this.f47t.getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void m30c(Bundle bundle) {
        this.f18F = true;
    }

    boolean m31c(Menu menu) {
        boolean z = false;
        if (this.f53z) {
            return false;
        }
        if (this.f16D && this.f17E) {
            z = true;
            m16a(menu);
        }
        return this.f48u != null ? z | this.f48u.m137a(menu) : z;
    }

    boolean m32c(MenuItem menuItem) {
        if (!this.f53z) {
            if (this.f16D && this.f17E && m22a(menuItem)) {
                return true;
            }
            if (this.f48u != null && this.f48u.m139a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m33d(Bundle bundle) {
        this.f18F = true;
    }

    void m34d(Menu menu) {
        if (!this.f53z) {
            if (this.f16D && this.f17E) {
                m26b(menu);
            }
            if (this.f48u != null) {
                this.f48u.m144b(menu);
            }
        }
    }

    public final boolean m35d() {
        return this.f13A;
    }

    boolean m36d(MenuItem menuItem) {
        if (!this.f53z) {
            if (m28b(menuItem)) {
                return true;
            }
            if (this.f48u != null && this.f48u.m146b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m37e() {
        this.f18F = true;
        if (!this.f26N) {
            this.f26N = true;
            if (!this.f27O) {
                this.f27O = true;
                this.f25M = this.f47t.m62a(this.f34g, this.f26N, false);
            }
            if (this.f25M != null) {
                this.f25M.m189b();
            }
        }
    }

    public void m38e(Bundle bundle) {
        this.f18F = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void m39f() {
        this.f18F = true;
    }

    public void m40f(Bundle bundle) {
    }

    public void m41g() {
        this.f18F = true;
    }

    void m42g(Bundle bundle) {
        if (this.f48u != null) {
            this.f48u.m160i();
        }
        this.f18F = false;
        m30c(bundle);
        if (!this.f18F) {
            throw new ac("Fragment " + this + " did not call through to super.onCreate()");
        } else if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f48u == null) {
                    m51n();
                }
                this.f48u.m128a(parcelable, null);
                this.f48u.m161j();
            }
        }
    }

    public void m43h() {
        this.f18F = true;
    }

    void m44h(Bundle bundle) {
        if (this.f48u != null) {
            this.f48u.m160i();
        }
        this.f18F = false;
        m33d(bundle);
        if (!this.f18F) {
            throw new ac("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.f48u != null) {
            this.f48u.m162k();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void m45i() {
        this.f18F = true;
    }

    void m46i(Bundle bundle) {
        m40f(bundle);
        if (this.f48u != null) {
            Parcelable h = this.f48u.m159h();
            if (h != null) {
                bundle.putParcelable("android:support:fragments", h);
            }
        }
    }

    public void m47j() {
        this.f18F = true;
        if (!this.f27O) {
            this.f27O = true;
            this.f25M = this.f47t.m62a(this.f34g, this.f26N, false);
        }
        if (this.f25M != null) {
            this.f25M.m195h();
        }
    }

    void m48k() {
        this.f33f = -1;
        this.f34g = null;
        this.f39l = false;
        this.f40m = false;
        this.f41n = false;
        this.f42o = false;
        this.f43p = false;
        this.f44q = false;
        this.f45r = 0;
        this.f46s = null;
        this.f47t = null;
        this.f50w = 0;
        this.f51x = 0;
        this.f52y = null;
        this.f53z = false;
        this.f13A = false;
        this.f15C = false;
        this.f25M = null;
        this.f26N = false;
        this.f27O = false;
    }

    public void m49l() {
        this.f18F = true;
    }

    public void m50m() {
    }

    void m51n() {
        this.f48u = new C0021o();
        this.f48u.m133a(this.f47t, new C0012e(this), this);
    }

    void m52o() {
        if (this.f48u != null) {
            this.f48u.m160i();
            this.f48u.m155e();
        }
        this.f18F = false;
        m37e();
        if (this.f18F) {
            if (this.f48u != null) {
                this.f48u.m163l();
            }
            if (this.f25M != null) {
                this.f25M.m194g();
                return;
            }
            return;
        }
        throw new ac("Fragment " + this + " did not call through to super.onStart()");
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f18F = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        m23b().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f18F = true;
    }

    void m53p() {
        if (this.f48u != null) {
            this.f48u.m160i();
            this.f48u.m155e();
        }
        this.f18F = false;
        m39f();
        if (!this.f18F) {
            throw new ac("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.f48u != null) {
            this.f48u.m164m();
            this.f48u.m155e();
        }
    }

    void m54q() {
        onLowMemory();
        if (this.f48u != null) {
            this.f48u.m170s();
        }
    }

    void m55r() {
        if (this.f48u != null) {
            this.f48u.m165n();
        }
        this.f18F = false;
        m41g();
        if (!this.f18F) {
            throw new ac("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void m56s() {
        if (this.f48u != null) {
            this.f48u.m166o();
        }
        this.f18F = false;
        m43h();
        if (!this.f18F) {
            throw new ac("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void m57t() {
        if (this.f48u != null) {
            this.f48u.m167p();
        }
        if (this.f26N) {
            this.f26N = false;
            if (!this.f27O) {
                this.f27O = true;
                this.f25M = this.f47t.m62a(this.f34g, this.f26N, false);
            }
            if (this.f25M == null) {
                return;
            }
            if (this.f47t.f61h) {
                this.f25M.m191d();
            } else {
                this.f25M.m190c();
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        C0037d.m238a(this, stringBuilder);
        if (this.f33f >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f33f);
        }
        if (this.f50w != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f50w));
        }
        if (this.f52y != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f52y);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    void m58u() {
        if (this.f48u != null) {
            this.f48u.m168q();
        }
        this.f18F = false;
        m45i();
        if (!this.f18F) {
            throw new ac("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.f25M != null) {
            this.f25M.m193f();
        }
    }

    void m59v() {
        if (this.f48u != null) {
            this.f48u.m169r();
        }
        this.f18F = false;
        m47j();
        if (!this.f18F) {
            throw new ac("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
