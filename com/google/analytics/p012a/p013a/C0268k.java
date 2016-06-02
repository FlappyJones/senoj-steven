package com.google.analytics.p012a.p013a;

import com.google.tagmanager.p014a.C0255t;
import com.google.tagmanager.p014a.C0260b;
import com.google.tagmanager.p014a.C0261v;
import com.google.tagmanager.p014a.C0522k;
import com.google.tagmanager.p014a.C0526o;
import com.google.tagmanager.p014a.am;
import com.google.tagmanager.p014a.an;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.analytics.a.a.k */
public final class C0268k extends C0261v implements C0265l {
    private int f1330a;
    private List f1331b;
    private int f1332c;
    private int f1333d;
    private boolean f1334e;
    private boolean f1335f;

    private C0268k() {
        this.f1331b = Collections.emptyList();
        m1980l();
    }

    private void m1980l() {
    }

    private static C0268k m1981m() {
        return new C0268k();
    }

    private void m1982n() {
        if ((this.f1330a & 1) != 1) {
            this.f1331b = new ArrayList(this.f1331b);
            this.f1330a |= 1;
        }
    }

    public C0268k m1983a() {
        return C0268k.m1981m().m1985a(m1995d());
    }

    public C0268k m1984a(int i) {
        this.f1330a |= 2;
        this.f1332c = i;
        return this;
    }

    public C0268k m1985a(C0266i c0266i) {
        if (c0266i != C0266i.m1948a()) {
            if (!c0266i.f1323f.isEmpty()) {
                if (this.f1331b.isEmpty()) {
                    this.f1331b = c0266i.f1323f;
                    this.f1330a &= -2;
                } else {
                    m1982n();
                    this.f1331b.addAll(c0266i.f1323f);
                }
            }
            if (c0266i.m1963f()) {
                m1984a(c0266i.m1964g());
            }
            if (c0266i.m1965h()) {
                m1990b(c0266i.m1966i());
            }
            if (c0266i.m1968k()) {
                m1987a(c0266i.m1969l());
            }
            if (c0266i.m1970m()) {
                m1991b(c0266i.m1974q());
            }
            m1913a(m1919r().m4585a(c0266i.f1321d));
        }
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.analytics.p012a.p013a.C0268k m1986a(com.google.tagmanager.p014a.C0522k r5, com.google.tagmanager.p014a.C0526o r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.analytics.p012a.p013a.C0266i.f1318a;	 Catch:{ af -> 0x000f }
        r0 = r0.m1898b(r5, r6);	 Catch:{ af -> 0x000f }
        r0 = (com.google.analytics.p012a.p013a.C0266i) r0;	 Catch:{ af -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.m1985a(r0);
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.m4567a();	 Catch:{ all -> 0x0022 }
        r0 = (com.google.analytics.p012a.p013a.C0266i) r0;	 Catch:{ all -> 0x0022 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.m1985a(r1);
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.k.a(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.k");
    }

    public C0268k m1987a(boolean z) {
        this.f1330a |= 8;
        this.f1334e = z;
        return this;
    }

    public C0266i m1989b() {
        return C0266i.m1948a();
    }

    public C0268k m1990b(int i) {
        this.f1330a |= 4;
        this.f1333d = i;
        return this;
    }

    public C0268k m1991b(boolean z) {
        this.f1330a |= 16;
        this.f1335f = z;
        return this;
    }

    public /* synthetic */ C0260b m1992b(C0522k c0522k, C0526o c0526o) {
        return m1986a(c0522k, c0526o);
    }

    public C0266i m1993c() {
        Object d = m1995d();
        if (d.m1967j()) {
            return d;
        }
        throw C0260b.m1909a(d);
    }

    public /* synthetic */ an m1994c(C0522k c0522k, C0526o c0526o) {
        return m1986a(c0522k, c0526o);
    }

    public /* synthetic */ Object clone() {
        return m1983a();
    }

    public C0266i m1995d() {
        int i = 1;
        C0266i c0266i = new C0266i(null);
        int i2 = this.f1330a;
        if ((this.f1330a & 1) == 1) {
            this.f1331b = Collections.unmodifiableList(this.f1331b);
            this.f1330a &= -2;
        }
        c0266i.f1323f = this.f1331b;
        if ((i2 & 2) != 2) {
            i = 0;
        }
        c0266i.f1324g = this.f1332c;
        if ((i2 & 4) == 4) {
            i |= 2;
        }
        c0266i.f1325h = this.f1333d;
        if ((i2 & 8) == 8) {
            i |= 4;
        }
        c0266i.f1326i = this.f1334e;
        if ((i2 & 16) == 16) {
            i |= 8;
        }
        c0266i.f1327j = this.f1335f;
        c0266i.f1322e = i;
        return c0266i;
    }

    public /* synthetic */ C0255t m1996e() {
        return m1989b();
    }

    public /* synthetic */ C0261v m1997f() {
        return m1983a();
    }

    public /* synthetic */ C0260b m1998g() {
        return m1983a();
    }

    public /* synthetic */ am m1999h() {
        return m1993c();
    }

    public boolean m2000i() {
        return (this.f1330a & 2) == 2;
    }

    public final boolean m2001j() {
        return m2000i();
    }

    public /* synthetic */ am m2002p() {
        return m1989b();
    }
}
