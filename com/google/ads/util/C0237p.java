package com.google.ads.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import java.io.File;

@TargetApi(11)
/* renamed from: com.google.ads.util.p */
public class C0237p {
    public static void m1853a(View view) {
        view.setLayerType(1, null);
    }

    public static void m1854a(Window window) {
        window.setFlags(16777216, 16777216);
    }

    public static void m1855a(WebSettings webSettings, bt btVar) {
        Context context = (Context) btVar.f1099f.m1816a();
        bs bsVar = (bs) ((br) btVar.f1097d.m1816a()).f1077b.m1816a();
        webSettings.setAppCacheEnabled(true);
        webSettings.setAppCacheMaxSize(((Long) bsVar.f1087i.m1817a()).longValue());
        webSettings.setAppCachePath(new File(context.getCacheDir(), "admob").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDatabasePath(context.getDatabasePath("admob").getAbsolutePath());
        webSettings.setDomStorageEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
    }

    public static void m1856b(View view) {
        view.setLayerType(0, null);
    }
}
