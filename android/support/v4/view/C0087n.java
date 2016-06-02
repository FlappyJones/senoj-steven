package android.support.v4.view;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.view.n */
public class C0087n {
    static final C0088o f364a;

    static {
        if (VERSION.SDK_INT >= 17) {
            f364a = new C0090q();
        } else {
            f364a = new C0089p();
        }
    }

    public static int m820a(int i, int i2) {
        return f364a.m821a(i, i2);
    }
}
