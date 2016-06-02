package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.C0229g;
import java.util.HashMap;

public class ce implements bu {
    public void m1753a(C0184w c0184w, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("afma_notify_dt");
        C0229g.m1838c("Received log message: <\"string\": \"" + ((String) hashMap.get("string")) + "\", \"afmaNotifyDt\": \"" + str + "\">");
    }
}
