package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.C0229g;
import java.util.HashMap;

public class ca implements bu {
    public void m1746a(C0184w c0184w, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("u");
        if (TextUtils.isEmpty(str)) {
            C0229g.m1842e("Could not get URL from track gmsg.");
        } else {
            new Thread(new C0216o(str, (Context) c0184w.m1527h().f1099f.m1816a())).start();
        }
    }
}
