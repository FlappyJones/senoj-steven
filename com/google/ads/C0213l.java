package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.p008a.C0162a;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.C0229g;
import java.util.HashMap;

/* renamed from: com.google.ads.l */
public class C0213l implements bu {
    public void m1775a(C0184w c0184w, HashMap hashMap, WebView webView) {
        int i = -1;
        if (webView instanceof C0162a) {
            try {
                int parseInt = !TextUtils.isEmpty((CharSequence) hashMap.get("w")) ? Integer.parseInt((String) hashMap.get("w")) : -1;
                int parseInt2 = !TextUtils.isEmpty((CharSequence) hashMap.get("h")) ? Integer.parseInt((String) hashMap.get("h")) : -1;
                int parseInt3 = !TextUtils.isEmpty((CharSequence) hashMap.get("x")) ? Integer.parseInt((String) hashMap.get("x")) : -1;
                if (!TextUtils.isEmpty((CharSequence) hashMap.get("y"))) {
                    i = Integer.parseInt((String) hashMap.get("y"));
                }
                if (hashMap.get("a") != null && ((String) hashMap.get("a")).equals("1")) {
                    c0184w.m1509a(null, true, parseInt3, i, parseInt, parseInt2);
                    return;
                } else if (hashMap.get("a") == null || !((String) hashMap.get("a")).equals("0")) {
                    c0184w.m1504a(parseInt3, i, parseInt, parseInt2);
                    return;
                } else {
                    c0184w.m1509a(null, false, parseInt3, i, parseInt, parseInt2);
                    return;
                }
            } catch (Throwable e) {
                C0229g.m1841d("Invalid number format in activation overlay response.", e);
                return;
            }
        }
        C0229g.m1836b("Trying to activate an overlay when this is not an overlay.");
    }
}
