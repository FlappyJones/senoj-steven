package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.C0006d;
import android.support.v4.content.C0047c;
import android.support.v4.p001b.C0037d;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class aa implements C0006d {
    final int f89a;
    final Bundle f90b;
    C0030y f91c;
    C0047c f92d;
    boolean f93e;
    boolean f94f;
    Object f95g;
    boolean f96h;
    boolean f97i;
    boolean f98j;
    boolean f99k;
    boolean f100l;
    boolean f101m;
    aa f102n;
    final /* synthetic */ C0031z f103o;

    void m75a() {
        if (this.f97i && this.f98j) {
            this.f96h = true;
        } else if (!this.f96h) {
            this.f96h = true;
            if (C0031z.f177a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            if (this.f92d == null && this.f91c != null) {
                this.f92d = this.f91c.m183a(this.f89a, this.f90b);
            }
            if (this.f92d == null) {
                return;
            }
            if (!this.f92d.getClass().isMemberClass() || Modifier.isStatic(this.f92d.getClass().getModifiers())) {
                if (!this.f101m) {
                    this.f92d.m259a(this.f89a, this);
                    this.f101m = true;
                }
                this.f92d.m258a();
                return;
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f92d);
        }
    }

    void m76a(C0047c c0047c, Object obj) {
        String str;
        if (this.f91c != null) {
            if (this.f103o.f181e != null) {
                String str2 = this.f103o.f181e.f55b.f165u;
                this.f103o.f181e.f55b.f165u = "onLoadFinished";
                str = str2;
            } else {
                str = null;
            }
            try {
                if (C0031z.f177a) {
                    Log.v("LoaderManager", "  onLoadFinished in " + c0047c + ": " + c0047c.m257a(obj));
                }
                this.f91c.m185a(c0047c, obj);
                this.f94f = true;
            } finally {
                if (this.f103o.f181e != null) {
                    this.f103o.f181e.f55b.f165u = str;
                }
            }
        }
    }

    public void m77a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f89a);
        printWriter.print(" mArgs=");
        printWriter.println(this.f90b);
        printWriter.print(str);
        printWriter.print("mCallbacks=");
        printWriter.println(this.f91c);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.f92d);
        if (this.f92d != null) {
            this.f92d.m261a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f93e || this.f94f) {
            printWriter.print(str);
            printWriter.print("mHaveData=");
            printWriter.print(this.f93e);
            printWriter.print("  mDeliveredData=");
            printWriter.println(this.f94f);
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(this.f95g);
        }
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.print(this.f96h);
        printWriter.print(" mReportNextStart=");
        printWriter.print(this.f99k);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f100l);
        printWriter.print(str);
        printWriter.print("mRetaining=");
        printWriter.print(this.f97i);
        printWriter.print(" mRetainingStarted=");
        printWriter.print(this.f98j);
        printWriter.print(" mListenerRegistered=");
        printWriter.println(this.f101m);
        if (this.f102n != null) {
            printWriter.print(str);
            printWriter.println("Pending Loader ");
            printWriter.print(this.f102n);
            printWriter.println(":");
            this.f102n.m77a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    void m78b() {
        if (C0031z.f177a) {
            Log.v("LoaderManager", "  Retaining: " + this);
        }
        this.f97i = true;
        this.f98j = this.f96h;
        this.f96h = false;
        this.f91c = null;
    }

    void m79c() {
        if (this.f97i) {
            if (C0031z.f177a) {
                Log.v("LoaderManager", "  Finished Retaining: " + this);
            }
            this.f97i = false;
            if (!(this.f96h == this.f98j || this.f96h)) {
                m81e();
            }
        }
        if (this.f96h && this.f93e && !this.f99k) {
            m76a(this.f92d, this.f95g);
        }
    }

    void m80d() {
        if (this.f96h && this.f99k) {
            this.f99k = false;
            if (this.f93e) {
                m76a(this.f92d, this.f95g);
            }
        }
    }

    void m81e() {
        if (C0031z.f177a) {
            Log.v("LoaderManager", "  Stopping: " + this);
        }
        this.f96h = false;
        if (!this.f97i && this.f92d != null && this.f101m) {
            this.f101m = false;
            this.f92d.m260a((C0006d) this);
            this.f92d.m263c();
        }
    }

    void m82f() {
        String str;
        C0030y c0030y = null;
        if (C0031z.f177a) {
            Log.v("LoaderManager", "  Destroying: " + this);
        }
        this.f100l = true;
        boolean z = this.f94f;
        this.f94f = false;
        if (this.f91c != null && this.f92d != null && this.f93e && z) {
            if (C0031z.f177a) {
                Log.v("LoaderManager", "  Reseting: " + this);
            }
            if (this.f103o.f181e != null) {
                String str2 = this.f103o.f181e.f55b.f165u;
                this.f103o.f181e.f55b.f165u = "onLoaderReset";
                str = str2;
            } else {
                str = null;
            }
            try {
                this.f91c.m184a(this.f92d);
            } finally {
                c0030y = this.f103o.f181e;
                if (c0030y != null) {
                    c0030y = this.f103o.f181e.f55b;
                    c0030y.f165u = str;
                }
            }
        }
        this.f91c = c0030y;
        this.f95g = c0030y;
        this.f93e = false;
        if (this.f92d != null) {
            if (this.f101m) {
                this.f101m = false;
                this.f92d.m260a((C0006d) this);
            }
            this.f92d.m265e();
        }
        if (this.f102n != null) {
            this.f102n.m82f();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" #");
        stringBuilder.append(this.f89a);
        stringBuilder.append(" : ");
        C0037d.m238a(this.f92d, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
