package com.google.ads.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;

@TargetApi(4)
/* renamed from: com.google.ads.util.n */
public final class C0236n {
    private static int m1849a(Context context, float f, int i) {
        return (context.getApplicationInfo().flags & 8192) != 0 ? (int) (((float) i) / f) : i;
    }

    public static int m1850a(Context context, DisplayMetrics displayMetrics) {
        return C0236n.m1849a(context, displayMetrics.density, displayMetrics.heightPixels);
    }

    public static void m1851a(Intent intent, String str) {
        intent.setPackage(str);
    }

    public static int m1852b(Context context, DisplayMetrics displayMetrics) {
        return C0236n.m1849a(context, displayMetrics.density, displayMetrics.widthPixels);
    }
}
