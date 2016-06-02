package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p008a.C0184w;
import com.google.ads.p008a.C0185x;
import com.google.ads.util.C0229g;
import java.util.HashMap;

public class cf implements bu {
    private C0200b f1147a;

    public cf() {
        this(new C0200b());
    }

    public cf(C0200b c0200b) {
        this.f1147a = c0200b;
    }

    public void m1754a(C0184w c0184w, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("a");
        if (str == null) {
            C0229g.m1832a("Could not get the action parameter for open GMSG.");
        } else if (str.equals("webapp")) {
            this.f1147a.m1669a(c0184w, new C0185x("webapp", hashMap));
        } else if (str.equals("expand")) {
            this.f1147a.m1669a(c0184w, new C0185x("expand", hashMap));
        } else {
            this.f1147a.m1669a(c0184w, new C0185x("intent", hashMap));
        }
    }
}
