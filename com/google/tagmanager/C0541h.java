package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.tagmanager.h */
class C0541h {
    static Map f2369a;
    private static String f2370b;

    static {
        f2369a = new HashMap();
    }

    C0541h() {
    }

    static String m4823a(String str, String str2) {
        return str2 == null ? str.length() > 0 ? str : null : Uri.parse("http://hostname/?" + str).getQueryParameter(str2);
    }

    static void m4824a(Context context, String str) {
        C0548p.m4839a(context, "gtm_install_referrer", "referrer", str);
        C0541h.m4826b(context, str);
    }

    static void m4825a(String str) {
        synchronized (C0541h.class) {
            f2370b = str;
        }
    }

    static void m4826b(Context context, String str) {
        String a = C0541h.m4823a(str, "conv");
        if (a != null && a.length() > 0) {
            f2369a.put(a, str);
            C0548p.m4839a(context, "gtm_click_referrers", a, str);
        }
    }
}
