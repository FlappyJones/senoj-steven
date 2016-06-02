package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.m */
public class C0114m {
    static final C0115n f464b;
    Object f465a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            f464b = new C0118q();
        } else if (i >= 9) {
            f464b = new C0117p();
        } else {
            f464b = new C0116o();
        }
    }

    C0114m(Context context, Interpolator interpolator) {
        this.f465a = f464b.m1038a(context, interpolator);
    }

    public static C0114m m1029a(Context context, Interpolator interpolator) {
        return new C0114m(context, interpolator);
    }

    public void m1030a(int i, int i2, int i3, int i4, int i5) {
        f464b.m1039a(this.f465a, i, i2, i3, i4, i5);
    }

    public boolean m1031a() {
        return f464b.m1040a(this.f465a);
    }

    public int m1032b() {
        return f464b.m1041b(this.f465a);
    }

    public int m1033c() {
        return f464b.m1042c(this.f465a);
    }

    public int m1034d() {
        return f464b.m1045f(this.f465a);
    }

    public int m1035e() {
        return f464b.m1046g(this.f465a);
    }

    public boolean m1036f() {
        return f464b.m1043d(this.f465a);
    }

    public void m1037g() {
        f464b.m1044e(this.f465a);
    }
}
