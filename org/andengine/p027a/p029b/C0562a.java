package org.andengine.p027a.p029b;

/* renamed from: org.andengine.a.b.a */
public class C0562a {
    private static String f2419a;

    static {
        f2419a = "";
    }

    public static void m4865a() {
        C0562a.m4866a("");
    }

    public static void m4866a(String str) {
        if (str.endsWith("/") || str.length() == 0) {
            f2419a = str;
            return;
        }
        throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
    }
}
