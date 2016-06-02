package com.google.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: com.google.tagmanager.m */
class C0545m {
    private static C0545m f2381a;
    private volatile C0546n f2382b;
    private volatile String f2383c;
    private volatile String f2384d;
    private volatile String f2385e;

    C0545m() {
        m4838e();
    }

    static C0545m m4831a() {
        C0545m c0545m;
        synchronized (C0545m.class) {
            if (f2381a == null) {
                f2381a = new C0545m();
            }
            c0545m = f2381a;
        }
        return c0545m;
    }

    private String m4832a(String str) {
        return str.split("&")[0].split("=")[1];
    }

    private String m4833b(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    synchronized boolean m4834a(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    C0542i.m4830d("Container preview url: " + decode);
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.f2382b = C0546n.CONTAINER_DEBUG;
                    } else {
                        this.f2382b = C0546n.CONTAINER;
                    }
                    this.f2385e = m4833b(uri);
                    if (this.f2382b == C0546n.CONTAINER || this.f2382b == C0546n.CONTAINER_DEBUG) {
                        this.f2384d = "/r?" + this.f2385e;
                    }
                    this.f2383c = m4832a(this.f2385e);
                } else {
                    if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                        C0542i.m4828b("Invalid preview uri: " + decode);
                        z = false;
                    } else if (m4832a(uri.getQuery()).equals(this.f2383c)) {
                        C0542i.m4830d("Exit preview mode for container: " + this.f2383c);
                        this.f2382b = C0546n.NONE;
                        this.f2384d = null;
                    } else {
                        z = false;
                    }
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }

    C0546n m4835b() {
        return this.f2382b;
    }

    String m4836c() {
        return this.f2384d;
    }

    String m4837d() {
        return this.f2383c;
    }

    void m4838e() {
        this.f2382b = C0546n.NONE;
        this.f2384d = null;
        this.f2383c = null;
        this.f2385e = null;
    }
}
