package com.google.ads.p008a;

import android.webkit.WebView;
import com.google.ads.C0208g;
import com.google.ads.bt;
import java.util.LinkedList;

/* renamed from: com.google.ads.a.v */
class C0183v implements Runnable {
    final /* synthetic */ C0175n f908a;
    private final C0184w f909b;
    private final WebView f910c;
    private final LinkedList f911d;
    private final int f912e;
    private final boolean f913f;
    private final String f914g;
    private final C0208g f915h;

    public C0183v(C0175n c0175n, C0184w c0184w, WebView webView, LinkedList linkedList, int i, boolean z, String str, C0208g c0208g) {
        this.f908a = c0175n;
        this.f909b = c0184w;
        this.f910c = webView;
        this.f911d = linkedList;
        this.f912e = i;
        this.f913f = z;
        this.f914g = str;
        this.f915h = c0208g;
    }

    public void run() {
        if (this.f910c != null) {
            this.f910c.stopLoading();
            this.f910c.destroy();
        }
        this.f909b.m1514a(this.f911d);
        this.f909b.m1503a(this.f912e);
        this.f909b.m1515a(this.f913f);
        this.f909b.m1512a(this.f914g);
        if (this.f915h != null) {
            ((ac) ((bt) this.f908a.f873j.f1072a.m1816a()).f1100g.m1816a()).m1420b(this.f915h);
            this.f909b.m1530k().setAdSize(this.f915h);
        }
        this.f909b.m1545z();
    }
}
