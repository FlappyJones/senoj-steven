package com.google.ads.p008a;

import com.google.ads.util.C0229g;

/* renamed from: com.google.ads.a.m */
public final class C0174m extends Exception {
    public final boolean f863a;

    public C0174m(String str, boolean z) {
        super(str);
        this.f863a = z;
    }

    public C0174m(String str, boolean z, Throwable th) {
        super(str, th);
        this.f863a = z;
    }

    public void m1458a(String str) {
        C0229g.m1836b(m1460c(str));
        C0229g.m1833a(null, (Throwable) this);
    }

    public void m1459b(String str) {
        Throwable th;
        String c = m1460c(str);
        if (!this.f863a) {
            th = null;
        }
        throw new RuntimeException(c, th);
    }

    public String m1460c(String str) {
        return this.f863a ? str + ": " + getMessage() : str;
    }
}
