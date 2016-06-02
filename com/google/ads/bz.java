package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p008a.C0161e;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.C0229g;
import java.util.HashMap;

public class bz implements bu {
    public void m1732a(C0184w c0184w, HashMap hashMap, WebView webView) {
        if (webView instanceof C0161e) {
            ((C0161e) webView).setCustomClose("1".equals(hashMap.get("custom_close")));
        } else {
            C0229g.m1836b("Trying to set a custom close icon on a WebView that isn't an AdWebView");
        }
    }
}
