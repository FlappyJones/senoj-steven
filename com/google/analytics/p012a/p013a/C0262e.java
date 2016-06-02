package com.google.analytics.p012a.p013a;

import com.google.tagmanager.p014a.C0255t;
import com.google.tagmanager.p014a.C0260b;
import com.google.tagmanager.p014a.C0261v;
import com.google.tagmanager.p014a.C0522k;
import com.google.tagmanager.p014a.C0526o;
import com.google.tagmanager.p014a.am;
import com.google.tagmanager.p014a.an;

/* renamed from: com.google.analytics.a.a.e */
public final class C0262e extends C0261v implements C0256h {
    private int f1308a;
    private C0263f f1309b;
    private int f1310c;
    private int f1311d;

    private C0262e() {
        this.f1309b = C0263f.NO_CACHE;
        m1921k();
    }

    private void m1921k() {
    }

    private static C0262e m1922l() {
        return new C0262e();
    }

    public C0262e m1923a() {
        return C0262e.m1922l().m1925a(m1934d());
    }

    public C0262e m1924a(int i) {
        this.f1308a |= 2;
        this.f1310c = i;
        return this;
    }

    public C0262e m1925a(C0257c c0257c) {
        if (c0257c != C0257c.m1876a()) {
            if (c0257c.m1886d()) {
                m1926a(c0257c.m1887e());
            }
            if (c0257c.m1888f()) {
                m1924a(c0257c.m1889g());
            }
            if (c0257c.m1890h()) {
                m1930b(c0257c.m1891i());
            }
            m1913a(m1919r().m4585a(c0257c.f1299d));
        }
        return this;
    }

    public C0262e m1926a(C0263f c0263f) {
        if (c0263f == null) {
            throw new NullPointerException();
        }
        this.f1308a |= 1;
        this.f1309b = c0263f;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.analytics.p012a.p013a.C0262e m1927a(com.google.tagmanager.p014a.C0522k r5, com.google.tagmanager.p014a.C0526o r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.analytics.p012a.p013a.C0257c.f1296a;	 Catch:{ af -> 0x000f }
        r0 = r0.m1898b(r5, r6);	 Catch:{ af -> 0x000f }
        r0 = (com.google.analytics.p012a.p013a.C0257c) r0;	 Catch:{ af -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.m1925a(r0);
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.m4567a();	 Catch:{ all -> 0x0022 }
        r0 = (com.google.analytics.p012a.p013a.C0257c) r0;	 Catch:{ all -> 0x0022 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.m1925a(r1);
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.e.a(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.e");
    }

    public C0257c m1929b() {
        return C0257c.m1876a();
    }

    public C0262e m1930b(int i) {
        this.f1308a |= 4;
        this.f1311d = i;
        return this;
    }

    public /* synthetic */ C0260b m1931b(C0522k c0522k, C0526o c0526o) {
        return m1927a(c0522k, c0526o);
    }

    public C0257c m1932c() {
        Object d = m1934d();
        if (d.m1892j()) {
            return d;
        }
        throw C0260b.m1909a(d);
    }

    public /* synthetic */ an m1933c(C0522k c0522k, C0526o c0526o) {
        return m1927a(c0522k, c0526o);
    }

    public /* synthetic */ Object clone() {
        return m1923a();
    }

    public C0257c m1934d() {
        int i = 1;
        C0257c c0257c = new C0257c(null);
        int i2 = this.f1308a;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        c0257c.f1301f = this.f1309b;
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        c0257c.f1302g = this.f1310c;
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        c0257c.f1303h = this.f1311d;
        c0257c.f1300e = i;
        return c0257c;
    }

    public /* synthetic */ C0255t m1935e() {
        return m1929b();
    }

    public /* synthetic */ C0261v m1936f() {
        return m1923a();
    }

    public /* synthetic */ C0260b m1937g() {
        return m1923a();
    }

    public /* synthetic */ am m1938h() {
        return m1932c();
    }

    public final boolean m1939j() {
        return true;
    }

    public /* synthetic */ am m1940p() {
        return m1929b();
    }
}
