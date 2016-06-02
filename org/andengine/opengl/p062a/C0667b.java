package org.andengine.opengl.p062a;

import org.andengine.p005d.p056d.C0634a;

/* renamed from: org.andengine.opengl.a.b */
public class C0667b {
    private static final int f2675a;
    private static String f2676b;

    static {
        f2675a = C0634a.f2575C;
        f2676b = "";
    }

    public static void m5233a() {
        C0667b.m5234a("");
    }

    public static void m5234a(String str) {
        if (str.endsWith("/") || str.length() == 0) {
            f2676b = str;
            return;
        }
        throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
    }
}
