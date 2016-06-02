package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.widget.h */
public class C0109h {
    private static final C0110k f462b;
    private Object f463a;

    static {
        if (VERSION.SDK_INT >= 14) {
            f462b = new C0112j();
        } else {
            f462b = new C0111i();
        }
    }

    public C0109h(Context context) {
        this.f463a = f462b.m1001a(context);
    }

    public void m995a(int i, int i2) {
        f462b.m1002a(this.f463a, i, i2);
    }

    public boolean m996a() {
        return f462b.m1003a(this.f463a);
    }

    public boolean m997a(float f) {
        return f462b.m1004a(this.f463a, f);
    }

    public boolean m998a(Canvas canvas) {
        return f462b.m1005a(this.f463a, canvas);
    }

    public void m999b() {
        f462b.m1006b(this.f463a);
    }

    public boolean m1000c() {
        return f462b.m1007c(this.f463a);
    }
}
