package com.google.ads;

import android.app.Activity;
import android.webkit.WebView;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.C0229g;
import java.util.HashMap;

/* renamed from: com.google.ads.m */
public class C0214m implements bu {
    public void m1776a(C0184w c0184w, HashMap hashMap, WebView webView) {
        if (((Activity) c0184w.m1527h().f1096c.m1819a()) == null) {
            C0229g.m1842e("Activity was null while responding to touch gmsg.");
            return;
        }
        String str = (String) hashMap.get("ty");
        String str2 = (String) hashMap.get("td");
        try {
            int parseInt = Integer.parseInt((String) hashMap.get("tx"));
            int parseInt2 = Integer.parseInt(str);
            int parseInt3 = Integer.parseInt(str2);
            ai aiVar = (ai) c0184w.m1527h().f1111r.m1817a();
            if (aiVar != null) {
                aiVar.m1585a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException e) {
            C0229g.m1842e("Could not parse touch parameters from gmsg.");
        }
    }
}
