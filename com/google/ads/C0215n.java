package com.google.ads;

import android.app.Activity;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.ads.p008a.C0161e;
import com.google.ads.p008a.C0164c;
import com.google.ads.p008a.C0168h;
import com.google.ads.p008a.C0184w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import java.util.HashMap;

/* renamed from: com.google.ads.n */
public class C0215n implements bu {
    private static final C0168h f1176a;

    static {
        f1176a = (C0168h) C0168h.f858a.m1455b();
    }

    protected int m1777a(HashMap hashMap, String str, int i, DisplayMetrics displayMetrics) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            return (int) TypedValue.applyDimension(1, (float) Integer.parseInt(str2), displayMetrics);
        } catch (NumberFormatException e) {
            C0229g.m1832a("Could not parse \"" + str + "\" in a video gmsg: " + str2);
            return i;
        }
    }

    public void m1778a(C0184w c0184w, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("action");
        if (str == null) {
            C0229g.m1832a("No \"action\" parameter in a video gmsg.");
        } else if (webView instanceof C0161e) {
            C0161e c0161e = (C0161e) webView;
            Activity i = c0161e.m1374i();
            if (i == null) {
                C0229g.m1832a("Could not get adActivity for a video gmsg.");
                return;
            }
            boolean equals = str.equals("new");
            boolean equals2 = str.equals("position");
            DisplayMetrics a;
            int a2;
            if (equals || equals2) {
                a = AdUtil.m1787a(i);
                a2 = m1777a(hashMap, "x", 0, a);
                int a3 = m1777a(hashMap, "y", 0, a);
                int a4 = m1777a(hashMap, "w", -1, a);
                int a5 = m1777a(hashMap, "h", -1, a);
                if (equals && i.m1348a() == null) {
                    i.m1355b(a2, a3, a4, a5);
                    return;
                } else {
                    i.m1350a(a2, a3, a4, a5);
                    return;
                }
            }
            C0164c a6 = i.m1348a();
            if (a6 == null) {
                f1176a.m1448a(c0161e, "onVideoEvent", "{'event': 'error', 'what': 'no_video_view'}");
            } else if (str.equals("click")) {
                a = AdUtil.m1787a(i);
                int a7 = m1777a(hashMap, "x", 0, a);
                a2 = m1777a(hashMap, "y", 0, a);
                long uptimeMillis = SystemClock.uptimeMillis();
                a6.m1437a(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a7, (float) a2, 0));
            } else if (str.equals("controls")) {
                str = (String) hashMap.get("enabled");
                if (str == null) {
                    C0229g.m1832a("No \"enabled\" parameter in a controls video gmsg.");
                } else if (str.equals("true")) {
                    a6.setMediaControllerEnabled(true);
                } else {
                    a6.setMediaControllerEnabled(false);
                }
            } else if (str.equals("currentTime")) {
                str = (String) hashMap.get("time");
                if (str == null) {
                    C0229g.m1832a("No \"time\" parameter in a currentTime video gmsg.");
                    return;
                }
                try {
                    a6.m1436a((int) (Float.parseFloat(str) * 1000.0f));
                } catch (NumberFormatException e) {
                    C0229g.m1832a("Could not parse \"time\" parameter: " + str);
                }
            } else if (str.equals("hide")) {
                a6.setVisibility(4);
            } else if (str.equals("load")) {
                a6.m1438b();
            } else if (str.equals("pause")) {
                a6.m1439c();
            } else if (str.equals("play")) {
                a6.m1440d();
            } else if (str.equals("show")) {
                a6.setVisibility(0);
            } else if (str.equals("src")) {
                a6.setSrc((String) hashMap.get("src"));
            } else {
                C0229g.m1832a("Unknown video action: " + str);
            }
        } else {
            C0229g.m1832a("Could not get adWebView for a video gmsg.");
        }
    }
}
