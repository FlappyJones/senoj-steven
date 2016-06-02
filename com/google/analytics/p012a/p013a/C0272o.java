package com.google.analytics.p012a.p013a;

import com.google.tagmanager.p014a.C0255t;
import com.google.tagmanager.p014a.C0260b;
import com.google.tagmanager.p014a.C0261v;
import com.google.tagmanager.p014a.C0522k;
import com.google.tagmanager.p014a.C0526o;
import com.google.tagmanager.p014a.am;
import com.google.tagmanager.p014a.an;

/* renamed from: com.google.analytics.a.a.o */
public final class C0272o extends C0261v implements C0269p {
    private int f1345a;
    private int f1346b;
    private int f1347c;

    private C0272o() {
        m2026m();
    }

    private void m2026m() {
    }

    private static C0272o m2027n() {
        return new C0272o();
    }

    public C0272o m2028a() {
        return C0272o.m2027n().m2030a(m2038d());
    }

    public C0272o m2029a(int i) {
        this.f1345a |= 1;
        this.f1346b = i;
        return this;
    }

    public C0272o m2030a(C0270m c0270m) {
        if (c0270m != C0270m.m2004a()) {
            if (c0270m.m2013d()) {
                m2029a(c0270m.m2014e());
            }
            if (c0270m.m2015f()) {
                m2034b(c0270m.m2016g());
            }
            m1913a(m1919r().m4585a(c0270m.f1339d));
        }
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.analytics.p012a.p013a.C0272o m2031a(com.google.tagmanager.p014a.C0522k r5, com.google.tagmanager.p014a.C0526o r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.analytics.p012a.p013a.C0270m.f1336a;	 Catch:{ af -> 0x000f }
        r0 = r0.m1898b(r5, r6);	 Catch:{ af -> 0x000f }
        r0 = (com.google.analytics.p012a.p013a.C0270m) r0;	 Catch:{ af -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.m2030a(r0);
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.m4567a();	 Catch:{ all -> 0x0022 }
        r0 = (com.google.analytics.p012a.p013a.C0270m) r0;	 Catch:{ all -> 0x0022 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.m2030a(r1);
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.o.a(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.o");
    }

    public C0270m m2033b() {
        return C0270m.m2004a();
    }

    public C0272o m2034b(int i) {
        this.f1345a |= 2;
        this.f1347c = i;
        return this;
    }

    public /* synthetic */ C0260b m2035b(C0522k c0522k, C0526o c0526o) {
        return m2031a(c0522k, c0526o);
    }

    public C0270m m2036c() {
        Object d = m2038d();
        if (d.m2018j()) {
            return d;
        }
        throw C0260b.m1909a(d);
    }

    public /* synthetic */ an m2037c(C0522k c0522k, C0526o c0526o) {
        return m2031a(c0522k, c0526o);
    }

    public /* synthetic */ Object clone() {
        return m2028a();
    }

    public C0270m m2038d() {
        int i = 1;
        C0270m c0270m = new C0270m(null);
        int i2 = this.f1345a;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        c0270m.f1341f = this.f1346b;
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        c0270m.f1342g = this.f1347c;
        c0270m.f1340e = i;
        return c0270m;
    }

    public /* synthetic */ C0255t m2039e() {
        return m2033b();
    }

    public /* synthetic */ C0261v m2040f() {
        return m2028a();
    }

    public /* synthetic */ C0260b m2041g() {
        return m2028a();
    }

    public /* synthetic */ am m2042h() {
        return m2036c();
    }

    public boolean m2043i() {
        return (this.f1345a & 1) == 1;
    }

    public final boolean m2044j() {
        return m2043i() && m2045k();
    }

    public boolean m2045k() {
        return (this.f1345a & 2) == 2;
    }

    public /* synthetic */ am m2046p() {
        return m2033b();
    }
}
