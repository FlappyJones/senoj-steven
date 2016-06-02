package com.google.ads.p008a;

import android.webkit.WebView;
import com.google.ads.bt;

/* renamed from: com.google.ads.a.t */
class C0181t implements Runnable {
    final /* synthetic */ C0175n f898a;
    private final String f899b;
    private final String f900c;
    private final WebView f901d;

    public C0181t(C0175n c0175n, WebView webView, String str, String str2) {
        this.f898a = c0175n;
        this.f901d = webView;
        this.f899b = str;
        this.f900c = str2;
    }

    public void run() {
        this.f898a.f873j.f1074c.m1818a(Boolean.valueOf(this.f898a.f879p));
        ((C0184w) ((bt) this.f898a.f873j.f1072a.m1816a()).f1095b.m1816a()).m1530k().m1370a(this.f898a.f879p);
        if (((bt) this.f898a.f873j.f1072a.m1816a()).f1098e.m1816a() != null) {
            ((C0162a) ((bt) this.f898a.f873j.f1072a.m1816a()).f1098e.m1816a()).setOverlayEnabled(!this.f898a.f879p);
        }
        if (this.f900c != null) {
            this.f901d.loadDataWithBaseURL(this.f899b, this.f900c, "text/html", "utf-8", null);
        } else {
            this.f901d.loadUrl(this.f899b);
        }
    }
}
