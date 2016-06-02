package android.support.v4.app;

import android.support.v4.p001b.C0037d;
import android.support.v4.p001b.C0044m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.z */
class C0031z extends C0029x {
    static boolean f177a;
    final C0044m f178b;
    final C0044m f179c;
    final String f180d;
    FragmentActivity f181e;
    boolean f182f;
    boolean f183g;

    static {
        f177a = false;
    }

    C0031z(String str, FragmentActivity fragmentActivity, boolean z) {
        this.f178b = new C0044m();
        this.f179c = new C0044m();
        this.f180d = str;
        this.f181e = fragmentActivity;
        this.f182f = z;
    }

    void m186a(FragmentActivity fragmentActivity) {
        this.f181e = fragmentActivity;
    }

    public void m187a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.f178b.m245b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.f178b.m245b(); i2++) {
                aa aaVar = (aa) this.f178b.m246b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f178b.m243a(i2));
                printWriter.print(": ");
                printWriter.println(aaVar.toString());
                aaVar.m77a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f179c.m245b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.f179c.m245b()) {
                aaVar = (aa) this.f179c.m246b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f179c.m243a(i));
                printWriter.print(": ");
                printWriter.println(aaVar.toString());
                aaVar.m77a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public boolean m188a() {
        int b = this.f178b.m245b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            aa aaVar = (aa) this.f178b.m246b(i);
            int i2 = (!aaVar.f96h || aaVar.f94f) ? 0 : 1;
            z |= i2;
        }
        return z;
    }

    void m189b() {
        if (f177a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f182f) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f182f = true;
        for (int b = this.f178b.m245b() - 1; b >= 0; b--) {
            ((aa) this.f178b.m246b(b)).m75a();
        }
    }

    void m190c() {
        if (f177a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (this.f182f) {
            for (int b = this.f178b.m245b() - 1; b >= 0; b--) {
                ((aa) this.f178b.m246b(b)).m81e();
            }
            this.f182f = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
    }

    void m191d() {
        if (f177a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (this.f182f) {
            this.f183g = true;
            this.f182f = false;
            for (int b = this.f178b.m245b() - 1; b >= 0; b--) {
                ((aa) this.f178b.m246b(b)).m78b();
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
    }

    void m192e() {
        if (this.f183g) {
            if (f177a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f183g = false;
            for (int b = this.f178b.m245b() - 1; b >= 0; b--) {
                ((aa) this.f178b.m246b(b)).m79c();
            }
        }
    }

    void m193f() {
        for (int b = this.f178b.m245b() - 1; b >= 0; b--) {
            ((aa) this.f178b.m246b(b)).f99k = true;
        }
    }

    void m194g() {
        for (int b = this.f178b.m245b() - 1; b >= 0; b--) {
            ((aa) this.f178b.m246b(b)).m80d();
        }
    }

    void m195h() {
        int b;
        if (!this.f183g) {
            if (f177a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (b = this.f178b.m245b() - 1; b >= 0; b--) {
                ((aa) this.f178b.m246b(b)).m82f();
            }
            this.f178b.m247c();
        }
        if (f177a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (b = this.f179c.m245b() - 1; b >= 0; b--) {
            ((aa) this.f179c.m246b(b)).m82f();
        }
        this.f179c.m247c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0037d.m238a(this.f181e, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
