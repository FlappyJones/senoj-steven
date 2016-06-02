package com.google.ads.p008a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.C0206e;
import com.google.ads.ak;
import com.google.ads.al;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import com.google.ads.util.C0245y;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.a.ad */
public class ad extends WebViewClient {
    private static final C0168h f826c;
    protected C0184w f827a;
    protected boolean f828b;
    private final Map f829d;
    private final boolean f830e;
    private boolean f831f;
    private boolean f832g;
    private boolean f833h;
    private boolean f834i;

    static {
        f826c = (C0168h) C0168h.f858a.m1455b();
    }

    public ad(C0184w c0184w, Map map, boolean z, boolean z2) {
        this.f827a = c0184w;
        this.f829d = map;
        this.f830e = z;
        this.f832g = z2;
        this.f828b = false;
        this.f833h = false;
        this.f834i = false;
    }

    public static ad m1423a(C0184w c0184w, Map map, boolean z, boolean z2) {
        return AdUtil.f1234a >= 11 ? new C0245y(c0184w, map, z, z2) : new ad(c0184w, map, z, z2);
    }

    public void m1424a(boolean z) {
        this.f828b = z;
    }

    public boolean m1425a() {
        return this.f831f;
    }

    public void m1426b(boolean z) {
        this.f832g = z;
    }

    public void m1427c(boolean z) {
        this.f833h = z;
    }

    public void m1428d(boolean z) {
        this.f834i = z;
    }

    public void onPageFinished(WebView webView, String str) {
        this.f831f = false;
        if (this.f833h) {
            C0175n j = this.f827a.m1529j();
            if (j != null) {
                j.m1487b();
            } else {
                C0229g.m1832a("adLoader was null while trying to setFinishedLoadingHtml().");
            }
            this.f833h = false;
        }
        if (this.f834i) {
            f826c.m1446a(webView);
            this.f834i = false;
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f831f = true;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f831f = false;
        C0175n j = this.f827a.m1529j();
        if (j != null) {
            j.m1481a(C0206e.NETWORK_ERROR);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            C0229g.m1832a("shouldOverrideUrlLoading(\"" + str + "\")");
            Uri parse = Uri.parse(str);
            if (f826c.m1451a(parse)) {
                f826c.m1450a(this.f827a, this.f829d, parse, webView);
                return true;
            } else if (this.f832g) {
                if (AdUtil.m1799a(parse)) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("u", str);
                AdActivity.m1335a(this.f827a, new C0185x("intent", hashMap));
                return true;
            } else if (this.f830e) {
                Uri a;
                HashMap hashMap2;
                bt h = this.f827a.m1527h();
                Context context = (Context) h.f1099f.m1816a();
                ak akVar = (ak) h.f1112s.m1817a();
                if (akVar != null && akVar.m1608a(parse)) {
                    a = akVar.m1606a(parse, context);
                    hashMap2 = new HashMap();
                    hashMap2.put("u", a.toString());
                    AdActivity.m1335a(this.f827a, new C0185x("intent", hashMap2));
                    return true;
                }
                a = parse;
                hashMap2 = new HashMap();
                hashMap2.put("u", a.toString());
                AdActivity.m1335a(this.f827a, new C0185x("intent", hashMap2));
                return true;
            } else {
                C0229g.m1842e("URL is not a GMSG and can't handle URL: " + str);
                return true;
            }
        } catch (al e) {
            C0229g.m1842e("Unable to append parameter to URL: " + str);
        } catch (Throwable th) {
            C0229g.m1841d("An unknown error occurred in shouldOverrideUrlLoading.", th);
        }
    }
}
