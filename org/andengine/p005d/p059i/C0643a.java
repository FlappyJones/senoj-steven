package org.andengine.p005d.p059i;

import android.os.Build.VERSION;

/* renamed from: org.andengine.d.i.a */
public class C0643a {
    public static final boolean f2629a;
    public static final boolean f2630b;
    public static final boolean f2631c;
    public static final boolean f2632d;
    public static final boolean f2633e;

    static {
        boolean z = true;
        f2629a = VERSION.SDK_INT >= 5;
        f2630b = VERSION.SDK_INT >= 8;
        f2631c = VERSION.SDK_INT >= 9;
        f2632d = VERSION.SDK_INT >= 11;
        if (VERSION.SDK_INT < 14) {
            z = false;
        }
        f2633e = z;
    }

    public static boolean m5171a(int i) {
        return VERSION.SDK_INT <= i;
    }

    public static boolean m5172a(int i, int i2) {
        return VERSION.SDK_INT >= i && VERSION.SDK_INT <= i2;
    }
}
