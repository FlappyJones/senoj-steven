package com.google.ads.util;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.google.ads.util.e */
public class C0227e {
    private static boolean f1258a;

    static {
        f1258a = Log.isLoggable("GoogleAdsAssertion", 3);
    }

    public static void m1823a(Object obj) {
        C0227e.m1829c(obj != null, "Assertion that an object is not null failed.");
    }

    public static void m1824a(Object obj, Object obj2) {
        C0227e.m1829c(obj == obj2, "Assertion that 'a' and 'b' refer to the same object failed.a: " + obj + ", b: " + obj2);
    }

    public static void m1825a(String str) {
        C0227e.m1829c(!TextUtils.isEmpty(str), "Expected a non empty string, got: " + str);
    }

    public static void m1826a(boolean z) {
        C0227e.m1829c(!z, "Assertion failed.");
    }

    public static void m1827a(boolean z, String str) {
        C0227e.m1829c(z, str);
    }

    public static void m1828b(boolean z, String str) {
        C0227e.m1829c(!z, str);
    }

    private static void m1829c(boolean z, String str) {
        if ((Log.isLoggable("GoogleAdsAssertion", 3) || f1258a) && !z) {
            Throwable c0228f = new C0228f(str);
            Log.d("GoogleAdsAssertion", str, c0228f);
            throw c0228f;
        }
    }
}
