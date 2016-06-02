package org.andengine.p005d.p057e;

import android.util.Log;

/* renamed from: org.andengine.d.e.a */
public class C0637a {
    private static String f2616a;
    private static String f2617b;
    private static C0638b f2618c;

    static {
        f2616a = "AndEngine";
        f2617b = "";
        f2618c = C0638b.VERBOSE;
    }

    public static void m5150a(String str) {
        C0637a.m5151a(f2616a, str, null);
    }

    public static void m5151a(String str, String str2, Throwable th) {
        if (!f2618c.m5161a(C0638b.VERBOSE)) {
            return;
        }
        if (th == null) {
            Log.v(str, str2);
        } else {
            Log.v(str, str2, th);
        }
    }

    public static void m5152a(String str, Throwable th) {
        C0637a.m5155b(f2616a, str, th);
    }

    public static void m5153a(Throwable th) {
        C0637a.m5156b(f2616a, th);
    }

    public static void m5154b(String str) {
        C0637a.m5155b(f2616a, str, null);
    }

    public static void m5155b(String str, String str2, Throwable th) {
        if (!f2618c.m5161a(C0638b.DEBUG)) {
            return;
        }
        if (th == null) {
            Log.d(str, str2);
        } else {
            Log.d(str, str2, th);
        }
    }

    public static void m5156b(String str, Throwable th) {
        C0637a.m5160d(f2616a, str, th);
    }

    public static void m5157c(String str) {
        C0637a.m5158c(f2616a, str, null);
    }

    public static void m5158c(String str, String str2, Throwable th) {
        if (!f2618c.m5161a(C0638b.WARNING)) {
            return;
        }
        if (th == null) {
            Log.w(str, str2);
        } else {
            Log.w(str, str2, th);
        }
    }

    public static void m5159d(String str) {
        C0637a.m5160d(f2616a, str, null);
    }

    public static void m5160d(String str, String str2, Throwable th) {
        if (!f2618c.m5161a(C0638b.ERROR)) {
            return;
        }
        if (th == null) {
            Log.e(str, str2);
        } else {
            Log.e(str, str2, th);
        }
    }
}
