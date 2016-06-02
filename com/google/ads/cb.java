package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p008a.C0175n;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.C0229g;
import java.util.HashMap;

public class cb implements bu {
    public void m1747a(C0184w c0184w, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("errors");
        C0229g.m1842e("Invalid " + ((String) hashMap.get("type")) + " request error: " + str);
        C0175n j = c0184w.m1529j();
        if (j != null) {
            j.m1481a(C0206e.INVALID_REQUEST);
        }
    }
}
