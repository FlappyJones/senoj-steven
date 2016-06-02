package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.C0229g;
import java.util.HashMap;

public class bv implements bu {
    public void m1728a(C0184w c0184w, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("name");
        if (str == null) {
            C0229g.m1836b("Error: App event with no name parameter.");
        } else {
            c0184w.m1513a(str, (String) hashMap.get("info"));
        }
    }
}
