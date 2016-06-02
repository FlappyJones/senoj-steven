package org.andengine.p027a.p030c;

import android.content.Context;

/* renamed from: org.andengine.a.c.b */
public class C0569b {
    private static String f2427a;

    static {
        f2427a = "";
    }

    public static C0568a m4881a(C0570c c0570c, Context context, String str) {
        C0568a c0568a;
        synchronized (c0570c) {
            c0568a = new C0568a(c0570c, c0570c.m4889c().load(context.getAssets().openFd(f2427a + str), 1));
            c0570c.m4884a(c0568a);
        }
        return c0568a;
    }

    public static void m4882a() {
        C0569b.m4883a("");
    }

    public static void m4883a(String str) {
        if (str.endsWith("/") || str.length() == 0) {
            f2427a = str;
            return;
        }
        throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
    }
}
