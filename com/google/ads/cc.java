package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.p008a.C0175n;
import com.google.ads.p008a.C0182u;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;

public class cc implements bu {
    public void m1748a(C0184w c0184w, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("url");
        String str2 = (String) hashMap.get("type");
        String str3 = (String) hashMap.get("afma_notify_dt");
        String str4 = (String) hashMap.get("activation_overlay_url");
        String str5 = (String) hashMap.get("check_packages");
        boolean equals = "1".equals(hashMap.get("drt_include"));
        String str6 = (String) hashMap.get("request_scenario");
        boolean equals2 = "1".equals(hashMap.get("use_webview_loadurl"));
        C0182u c0182u = C0182u.OFFLINE_EMPTY.f907e.equals(str6) ? C0182u.OFFLINE_EMPTY : C0182u.OFFLINE_USING_BUFFERED_ADS.f907e.equals(str6) ? C0182u.OFFLINE_USING_BUFFERED_ADS : C0182u.ONLINE_USING_BUFFERED_ADS.f907e.equals(str6) ? C0182u.ONLINE_USING_BUFFERED_ADS : C0182u.ONLINE_SERVER_REQUEST;
        C0229g.m1838c("Received ad url: <url: \"" + str + "\" type: \"" + str2 + "\" afmaNotifyDt: \"" + str3 + "\" activationOverlayUrl: \"" + str4 + "\" useWebViewLoadUrl: \"" + equals2 + "\">");
        if (!(TextUtils.isEmpty(str5) || TextUtils.isEmpty(str))) {
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] split = str5.split(",");
            BigInteger bigInteger2 = bigInteger;
            for (int i = 0; i < split.length; i++) {
                if (AdUtil.m1797a((Context) c0184w.m1527h().f1096c.m1819a(), split[i])) {
                    bigInteger2 = bigInteger2.setBit(i);
                }
            }
            str2 = String.format(Locale.US, "%X", new Object[]{bigInteger2});
            str = str.replaceAll("%40installed_markets%40", str2);
            br.m1724a().f1076a.m1818a(str2);
            C0229g.m1838c("Ad url modified to " + str);
        }
        C0175n j = c0184w.m1529j();
        if (j != null) {
            j.m1493d(equals);
            j.m1479a(c0182u);
            j.m1495e(equals2);
            j.m1494e(str4);
            j.m1492d(str);
        }
    }
}
