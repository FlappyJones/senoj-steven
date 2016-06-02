package com.google.ads.p008a;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.bu;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0170o;
import com.google.ads.util.C0229g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.ads.a.h */
public class C0168h {
    public static final C0170o f858a;
    public static final Map f859b;
    public static final Map f860c;
    public static final Map f861d;
    private static final C0168h f862e;

    static {
        f862e = new C0168h();
        f858a = new C0171j();
        f859b = Collections.unmodifiableMap(new C0172k());
        f860c = Collections.unmodifiableMap(new C0173l());
        f861d = Collections.unmodifiableMap(new C0169i());
    }

    public String m1445a(Uri uri, HashMap hashMap) {
        if (m1454c(uri)) {
            String host = uri.getHost();
            if (host == null) {
                C0229g.m1842e("An error occurred while parsing the AMSG parameters.");
                return null;
            } else if (host.equals("launch")) {
                hashMap.put("a", "intent");
                hashMap.put("u", hashMap.get("url"));
                hashMap.remove("url");
                return "/open";
            } else if (host.equals("closecanvas")) {
                return "/close";
            } else {
                if (host.equals("log")) {
                    return "/log";
                }
                C0229g.m1842e("An error occurred while parsing the AMSG: " + uri.toString());
                return null;
            }
        } else if (m1453b(uri)) {
            return uri.getPath();
        } else {
            C0229g.m1842e("Message was neither a GMSG nor an AMSG.");
            return null;
        }
    }

    public void m1446a(WebView webView) {
        m1448a(webView, "onshow", "{'version': 'afma-sdk-a-v6.4.1'}");
    }

    public void m1447a(WebView webView, String str) {
        C0229g.m1832a("Sending JS to a WebView: " + str);
        webView.loadUrl("javascript:" + str);
    }

    public void m1448a(WebView webView, String str, String str2) {
        String str3 = "AFMA_ReceiveMessage";
        if (str2 != null) {
            m1447a(webView, str3 + "('" + str + "', " + str2 + ");");
        } else {
            m1447a(webView, str3 + "('" + str + "');");
        }
    }

    public void m1449a(WebView webView, Map map) {
        m1448a(webView, "openableURLs", new JSONObject(map).toString());
    }

    public void m1450a(C0184w c0184w, Map map, Uri uri, WebView webView) {
        HashMap b = AdUtil.m1804b(uri);
        if (b == null) {
            C0229g.m1842e("An error occurred while parsing the message parameters.");
            return;
        }
        String a = m1445a(uri, b);
        if (a == null) {
            C0229g.m1842e("An error occurred while parsing the message.");
            return;
        }
        bu buVar = (bu) map.get(a);
        if (buVar == null) {
            C0229g.m1842e("No AdResponse found, <message: " + a + ">");
        } else {
            buVar.m1727a(c0184w, b, webView);
        }
    }

    public boolean m1451a(Uri uri) {
        return (uri == null || !uri.isHierarchical()) ? false : m1453b(uri) || m1454c(uri);
    }

    public void m1452b(WebView webView) {
        m1448a(webView, "onhide", null);
    }

    public boolean m1453b(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals("gmsg")) {
            return false;
        }
        scheme = uri.getAuthority();
        return scheme != null && scheme.equals("mobileads.google.com");
    }

    public boolean m1454c(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("admob");
    }
}
