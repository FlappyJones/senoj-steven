package com.google.ads.util;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.p008a.C0175n;
import com.google.ads.p008a.C0184w;
import com.google.ads.p008a.ad;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.ads.util.y */
public class C0245y extends ad {
    public C0245y(C0184w c0184w, Map map, boolean z, boolean z2) {
        super(c0184w, map, z, z2);
    }

    private static WebResourceResponse m1857a(String str, Context context) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            AdUtil.m1794a(httpURLConnection, context.getApplicationContext());
            httpURLConnection.connect();
            String str2 = "UTF-8";
            WebResourceResponse webResourceResponse = new WebResourceResponse("application/javascript", str2, new ByteArrayInputStream(AdUtil.m1789a(new InputStreamReader(httpURLConnection.getInputStream())).getBytes(str2)));
            return webResourceResponse;
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            if ("mraid.js".equalsIgnoreCase(new File(str).getName())) {
                C0175n j = this.a.m1529j();
                if (j != null) {
                    j.m1491c(true);
                } else {
                    this.a.m1515a(true);
                }
                bs bsVar = (bs) ((br) this.a.m1527h().f1097d.m1816a()).f1077b.m1816a();
                String str2;
                if (this.a.m1527h().m1726b()) {
                    str2 = (String) bsVar.f1085g.m1817a();
                    C0229g.m1832a("shouldInterceptRequest(" + str2 + ")");
                    return C0245y.m1857a(str2, webView.getContext());
                } else if (this.b) {
                    str2 = (String) bsVar.f1084f.m1817a();
                    C0229g.m1832a("shouldInterceptRequest(" + str2 + ")");
                    return C0245y.m1857a(str2, webView.getContext());
                } else {
                    str2 = (String) bsVar.f1083e.m1817a();
                    C0229g.m1832a("shouldInterceptRequest(" + str2 + ")");
                    return C0245y.m1857a(str2, webView.getContext());
                }
            }
        } catch (Throwable e) {
            C0229g.m1841d("IOException fetching MRAID JS.", e);
        } catch (Throwable e2) {
            C0229g.m1841d("An unknown error occurred fetching MRAID JS.", e2);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
