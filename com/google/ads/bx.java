package com.google.ads;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.p008a.C0184w;
import com.google.ads.p008a.ab;
import com.google.ads.util.C0229g;
import java.util.HashMap;
import java.util.Locale;

public class bx implements bu {
    public void m1730a(C0184w c0184w, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("u");
        if (str == null) {
            C0229g.m1842e("Could not get URL from click gmsg.");
            return;
        }
        Uri parse;
        Uri a;
        ab m = c0184w.m1532m();
        if (m != null) {
            parse = Uri.parse(str);
            String host = parse.getHost();
            if (host != null && host.toLowerCase(Locale.US).endsWith(".admob.com")) {
                host = null;
                String path = parse.getPath();
                if (path != null) {
                    String[] split = path.split("/");
                    if (split.length >= 4) {
                        host = split[2] + "/" + split[3];
                    }
                }
                m.m1390a(host);
            }
        }
        bt h = c0184w.m1527h();
        Context context = (Context) h.f1099f.m1816a();
        parse = Uri.parse(str);
        try {
            ak akVar = (ak) h.f1112s.m1817a();
            if (akVar != null && akVar.m1608a(parse)) {
                a = akVar.m1606a(parse, context);
                new Thread(new C0216o(a.toString(), context)).start();
            }
        } catch (al e) {
            C0229g.m1842e("Unable to append parameter to URL: " + str);
        }
        a = parse;
        new Thread(new C0216o(a.toString(), context)).start();
    }
}
