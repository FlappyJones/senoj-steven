package org.andengine.opengl.p067c.p068a.p070a;

import android.content.Context;
import android.content.res.AssetManager;
import org.andengine.opengl.p067c.p068a.p070a.p071a.C0685b;
import org.andengine.opengl.p067c.p068a.p070a.p071a.C0686a;
import org.andengine.opengl.p067c.p073c.C0698c;
import org.andengine.opengl.p067c.p073c.C0699d;

/* renamed from: org.andengine.opengl.c.a.a.b */
public class C0692b {
    private static String f2745a;

    static {
        f2745a = "";
    }

    public static C0698c m5327a(C0691a c0691a, Context context, String str, int i, int i2) {
        return C0692b.m5328a(c0691a, context.getAssets(), str, i, i2);
    }

    public static C0698c m5328a(C0691a c0691a, AssetManager assetManager, String str, int i, int i2) {
        return C0692b.m5329a(c0691a, C0686a.m5292a(assetManager, f2745a + str), i, i2);
    }

    public static C0698c m5329a(C0691a c0691a, C0685b c0685b, int i, int i2) {
        return C0699d.m5360a(c0691a, c0685b, i, i2);
    }

    public static void m5330a() {
        C0692b.m5331a("");
    }

    public static void m5331a(String str) {
        if (str.endsWith("/") || str.length() == 0) {
            f2745a = str;
            return;
        }
        throw new IllegalArgumentException("pAssetBasePath must end with '/' or be lenght zero.");
    }
}
