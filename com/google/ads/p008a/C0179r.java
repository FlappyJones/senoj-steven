package com.google.ads.p008a;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.C0206e;

/* renamed from: com.google.ads.a.r */
class C0179r implements Runnable {
    private final C0184w f892a;
    private final WebView f893b;
    private final C0186y f894c;
    private final C0206e f895d;
    private final boolean f896e;

    public C0179r(C0184w c0184w, WebView webView, C0186y c0186y, C0206e c0206e, boolean z) {
        this.f892a = c0184w;
        this.f893b = webView;
        this.f894c = c0186y;
        this.f895d = c0206e;
        this.f896e = z;
    }

    public void run() {
        if (this.f893b != null) {
            this.f893b.stopLoading();
            this.f893b.destroy();
        }
        if (this.f894c != null) {
            this.f894c.m1567a();
        }
        if (this.f896e) {
            this.f892a.m1530k().stopLoading();
            if (this.f892a.m1527h().f1102i.m1816a() != null) {
                ((ViewGroup) this.f892a.m1527h().f1102i.m1816a()).setVisibility(8);
            }
        }
        this.f892a.m1511a(this.f895d);
    }
}
