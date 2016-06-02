package com.google.ads.util;

import android.util.Log;

/* renamed from: com.google.ads.util.g */
public final class C0229g {
    public static C0231i f1259a;
    private static int f1260b;

    static {
        f1259a = null;
        f1260b = 5;
    }

    private static void m1830a(C0230h c0230h, String str) {
        C0229g.m1831a(c0230h, str, null);
    }

    private static void m1831a(C0230h c0230h, String str, Throwable th) {
        if (f1259a != null) {
            f1259a.m1843a(c0230h, str, th);
        }
    }

    public static void m1832a(String str) {
        if (C0229g.m1835a("Ads", 3)) {
            Log.d("Ads", str);
        }
        C0229g.m1830a(C0230h.DEBUG, str);
    }

    public static void m1833a(String str, Throwable th) {
        if (C0229g.m1835a("Ads", 3)) {
            Log.d("Ads", str, th);
        }
        C0229g.m1831a(C0230h.DEBUG, str, th);
    }

    private static boolean m1834a(int i) {
        return i >= f1260b;
    }

    public static boolean m1835a(String str, int i) {
        return C0229g.m1834a(i) || Log.isLoggable(str, i);
    }

    public static void m1836b(String str) {
        if (C0229g.m1835a("Ads", 6)) {
            Log.e("Ads", str);
        }
        C0229g.m1830a(C0230h.ERROR, str);
    }

    public static void m1837b(String str, Throwable th) {
        if (C0229g.m1835a("Ads", 6)) {
            Log.e("Ads", str);
            Log.i("Ads", "The following was caught and handled:", th);
        }
        C0229g.m1831a(C0230h.ERROR, str, th);
    }

    public static void m1838c(String str) {
        if (C0229g.m1835a("Ads", 4)) {
            Log.i("Ads", str);
        }
        C0229g.m1830a(C0230h.INFO, str);
    }

    public static void m1839c(String str, Throwable th) {
        if (C0229g.m1835a("Ads", 4)) {
            Log.i("Ads", str, th);
        }
        C0229g.m1831a(C0230h.INFO, str, th);
    }

    public static void m1840d(String str) {
        if (C0229g.m1835a("Ads", 2)) {
            Log.v("Ads", str);
        }
        C0229g.m1830a(C0230h.VERBOSE, str);
    }

    public static void m1841d(String str, Throwable th) {
        if (C0229g.m1835a("Ads", 5)) {
            Log.w("Ads", str);
            Log.i("Ads", "The following was caught and handled:", th);
        }
        C0229g.m1831a(C0230h.WARN, str, th);
    }

    public static void m1842e(String str) {
        if (C0229g.m1835a("Ads", 5)) {
            Log.w("Ads", str);
        }
        C0229g.m1830a(C0230h.WARN, str);
    }
}
