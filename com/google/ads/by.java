package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p008a.C0161e;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.C0229g;
import java.util.HashMap;

public class by implements bu {
    public void m1731a(C0184w c0184w, HashMap hashMap, WebView webView) {
        if (webView instanceof C0161e) {
            ((C0161e) webView).m1371f();
        } else {
            C0229g.m1836b("Trying to close WebView that isn't an AdWebView");
        }
    }
}
