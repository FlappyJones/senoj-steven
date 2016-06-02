package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.ads.p008a.C0168h;
import java.util.Date;

public final class at {
    private static final C0168h f984a;

    static {
        f984a = (C0168h) C0168h.f858a.m1455b();
    }

    public static void m1633a(Activity activity) {
        new Thread(new av(activity)).start();
    }

    public static boolean m1634a(Context context, long j) {
        if (!m1635a(context, j, PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()))) {
            return false;
        }
        new Thread(new au(context)).start();
        return true;
    }

    static boolean m1635a(Context context, long j, SharedPreferences sharedPreferences) {
        return (sharedPreferences.contains("drt") && sharedPreferences.contains("drt_ts") && sharedPreferences.getLong("drt_ts", 0) >= new Date().getTime() - j) ? false : true;
    }
}
