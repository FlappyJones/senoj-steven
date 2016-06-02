package com.google.ads.util;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import com.google.ads.bt;

@TargetApi(17)
/* renamed from: com.google.ads.util.z */
public final class C0246z {
    public static void m1858a(WebSettings webSettings, bt btVar) {
        C0237p.m1855a(webSettings, btVar);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }
}
