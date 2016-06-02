package com.google.analytics.p012a.p013a;

import com.google.analytics.p015b.p016a.p017a.C0286c;
import com.google.tagmanager.p014a.C0255t;
import com.google.tagmanager.p014a.C0260b;
import com.google.tagmanager.p014a.C0261v;
import com.google.tagmanager.p014a.C0522k;
import com.google.tagmanager.p014a.C0526o;
import com.google.tagmanager.p014a.ah;
import com.google.tagmanager.p014a.ai;
import com.google.tagmanager.p014a.am;
import com.google.tagmanager.p014a.an;
import com.google.tagmanager.p014a.bg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.analytics.a.a.s */
public final class C0276s extends C0261v implements C0273t {
    private int f1371a;
    private ai f1372b;
    private List f1373c;
    private List f1374d;
    private List f1375e;
    private List f1376f;
    private List f1377g;
    private List f1378h;
    private Object f1379i;
    private Object f1380j;
    private Object f1381k;
    private Object f1382l;
    private C0257c f1383m;
    private float f1384n;
    private boolean f1385o;
    private ai f1386p;
    private int f1387q;

    private C0276s() {
        this.f1372b = ah.f2220a;
        this.f1373c = Collections.emptyList();
        this.f1374d = Collections.emptyList();
        this.f1375e = Collections.emptyList();
        this.f1376f = Collections.emptyList();
        this.f1377g = Collections.emptyList();
        this.f1378h = Collections.emptyList();
        this.f1379i = "";
        this.f1380j = "";
        this.f1381k = "0";
        this.f1382l = "";
        this.f1383m = C0257c.m1876a();
        this.f1386p = ah.f2220a;
        m2130q();
    }

    private void m2128A() {
        if ((this.f1371a & 16384) != 16384) {
            this.f1386p = new ah(this.f1386p);
            this.f1371a |= 16384;
        }
    }

    private void m2130q() {
    }

    private static C0276s m2131s() {
        return new C0276s();
    }

    private void m2132t() {
        if ((this.f1371a & 1) != 1) {
            this.f1372b = new ah(this.f1372b);
            this.f1371a |= 1;
        }
    }

    private void m2133u() {
        if ((this.f1371a & 2) != 2) {
            this.f1373c = new ArrayList(this.f1373c);
            this.f1371a |= 2;
        }
    }

    private void m2134v() {
        if ((this.f1371a & 4) != 4) {
            this.f1374d = new ArrayList(this.f1374d);
            this.f1371a |= 4;
        }
    }

    private void m2135w() {
        if ((this.f1371a & 8) != 8) {
            this.f1375e = new ArrayList(this.f1375e);
            this.f1371a |= 8;
        }
    }

    private void m2136x() {
        if ((this.f1371a & 16) != 16) {
            this.f1376f = new ArrayList(this.f1376f);
            this.f1371a |= 16;
        }
    }

    private void m2137y() {
        if ((this.f1371a & 32) != 32) {
            this.f1377g = new ArrayList(this.f1377g);
            this.f1371a |= 32;
        }
    }

    private void m2138z() {
        if ((this.f1371a & 64) != 64) {
            this.f1378h = new ArrayList(this.f1378h);
            this.f1371a |= 64;
        }
    }

    public C0276s m2139a() {
        return C0276s.m2131s().m2142a(m2154d());
    }

    public C0276s m2140a(float f) {
        this.f1371a |= 4096;
        this.f1384n = f;
        return this;
    }

    public C0276s m2141a(C0257c c0257c) {
        if ((this.f1371a & 2048) != 2048 || this.f1383m == C0257c.m1876a()) {
            this.f1383m = c0257c;
        } else {
            this.f1383m = C0257c.m1877a(this.f1383m).m1925a(c0257c).m1934d();
        }
        this.f1371a |= 2048;
        return this;
    }

    public C0276s m2142a(C0274q c0274q) {
        if (c0274q != C0274q.m2052a()) {
            if (!c0274q.f1353f.isEmpty()) {
                if (this.f1372b.isEmpty()) {
                    this.f1372b = c0274q.f1353f;
                    this.f1371a &= -2;
                } else {
                    m2132t();
                    this.f1372b.addAll(c0274q.f1353f);
                }
            }
            if (!c0274q.f1354g.isEmpty()) {
                if (this.f1373c.isEmpty()) {
                    this.f1373c = c0274q.f1354g;
                    this.f1371a &= -3;
                } else {
                    m2133u();
                    this.f1373c.addAll(c0274q.f1354g);
                }
            }
            if (!c0274q.f1355h.isEmpty()) {
                if (this.f1374d.isEmpty()) {
                    this.f1374d = c0274q.f1355h;
                    this.f1371a &= -5;
                } else {
                    m2134v();
                    this.f1374d.addAll(c0274q.f1355h);
                }
            }
            if (!c0274q.f1356i.isEmpty()) {
                if (this.f1375e.isEmpty()) {
                    this.f1375e = c0274q.f1356i;
                    this.f1371a &= -9;
                } else {
                    m2135w();
                    this.f1375e.addAll(c0274q.f1356i);
                }
            }
            if (!c0274q.f1357j.isEmpty()) {
                if (this.f1376f.isEmpty()) {
                    this.f1376f = c0274q.f1357j;
                    this.f1371a &= -17;
                } else {
                    m2136x();
                    this.f1376f.addAll(c0274q.f1357j);
                }
            }
            if (!c0274q.f1358k.isEmpty()) {
                if (this.f1377g.isEmpty()) {
                    this.f1377g = c0274q.f1358k;
                    this.f1371a &= -33;
                } else {
                    m2137y();
                    this.f1377g.addAll(c0274q.f1358k);
                }
            }
            if (!c0274q.f1359l.isEmpty()) {
                if (this.f1378h.isEmpty()) {
                    this.f1378h = c0274q.f1359l;
                    this.f1371a &= -65;
                } else {
                    m2138z();
                    this.f1378h.addAll(c0274q.f1359l);
                }
            }
            if (c0274q.m2121v()) {
                this.f1371a |= 128;
                this.f1379i = c0274q.f1360m;
            }
            if (c0274q.m2123x()) {
                this.f1371a |= 256;
                this.f1380j = c0274q.f1361n;
            }
            if (c0274q.m2125z()) {
                this.f1371a |= 512;
                this.f1381k = c0274q.f1362o;
            }
            if (c0274q.m2082B()) {
                this.f1371a |= 1024;
                this.f1382l = c0274q.f1363p;
            }
            if (c0274q.m2084D()) {
                m2141a(c0274q.m2085E());
            }
            if (c0274q.m2086F()) {
                m2140a(c0274q.m2087G());
            }
            if (c0274q.m2088H()) {
                m2144a(c0274q.m2089I());
            }
            if (!c0274q.f1367t.isEmpty()) {
                if (this.f1386p.isEmpty()) {
                    this.f1386p = c0274q.f1367t;
                    this.f1371a &= -16385;
                } else {
                    m2128A();
                    this.f1386p.addAll(c0274q.f1367t);
                }
            }
            if (c0274q.m2092L()) {
                m2157f(c0274q.m2093M());
            }
            m1913a(m1919r().m4585a(c0274q.f1351d));
        }
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.analytics.p012a.p013a.C0276s m2143a(com.google.tagmanager.p014a.C0522k r5, com.google.tagmanager.p014a.C0526o r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.analytics.p012a.p013a.C0274q.f1348a;	 Catch:{ af -> 0x000f }
        r0 = r0.m1898b(r5, r6);	 Catch:{ af -> 0x000f }
        r0 = (com.google.analytics.p012a.p013a.C0274q) r0;	 Catch:{ af -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.m2142a(r0);
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.m4567a();	 Catch:{ all -> 0x0022 }
        r0 = (com.google.analytics.p012a.p013a.C0274q) r0;	 Catch:{ all -> 0x0022 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.m2142a(r1);
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.s.a(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.s");
    }

    public C0276s m2144a(boolean z) {
        this.f1371a |= 8192;
        this.f1385o = z;
        return this;
    }

    public C0286c m2145a(int i) {
        return (C0286c) this.f1373c.get(i);
    }

    public C0270m m2147b(int i) {
        return (C0270m) this.f1374d.get(i);
    }

    public C0274q m2148b() {
        return C0274q.m2052a();
    }

    public /* synthetic */ C0260b m2149b(C0522k c0522k, C0526o c0526o) {
        return m2143a(c0522k, c0526o);
    }

    public C0266i m2150c(int i) {
        return (C0266i) this.f1375e.get(i);
    }

    public C0274q m2151c() {
        Object d = m2154d();
        if (d.m2109j()) {
            return d;
        }
        throw C0260b.m1909a(d);
    }

    public /* synthetic */ an m2152c(C0522k c0522k, C0526o c0526o) {
        return m2143a(c0522k, c0526o);
    }

    public /* synthetic */ Object clone() {
        return m2139a();
    }

    public C0266i m2153d(int i) {
        return (C0266i) this.f1376f.get(i);
    }

    public C0274q m2154d() {
        int i = 1;
        C0274q c0274q = new C0274q(null);
        int i2 = this.f1371a;
        if ((this.f1371a & 1) == 1) {
            this.f1372b = new bg(this.f1372b);
            this.f1371a &= -2;
        }
        c0274q.f1353f = this.f1372b;
        if ((this.f1371a & 2) == 2) {
            this.f1373c = Collections.unmodifiableList(this.f1373c);
            this.f1371a &= -3;
        }
        c0274q.f1354g = this.f1373c;
        if ((this.f1371a & 4) == 4) {
            this.f1374d = Collections.unmodifiableList(this.f1374d);
            this.f1371a &= -5;
        }
        c0274q.f1355h = this.f1374d;
        if ((this.f1371a & 8) == 8) {
            this.f1375e = Collections.unmodifiableList(this.f1375e);
            this.f1371a &= -9;
        }
        c0274q.f1356i = this.f1375e;
        if ((this.f1371a & 16) == 16) {
            this.f1376f = Collections.unmodifiableList(this.f1376f);
            this.f1371a &= -17;
        }
        c0274q.f1357j = this.f1376f;
        if ((this.f1371a & 32) == 32) {
            this.f1377g = Collections.unmodifiableList(this.f1377g);
            this.f1371a &= -33;
        }
        c0274q.f1358k = this.f1377g;
        if ((this.f1371a & 64) == 64) {
            this.f1378h = Collections.unmodifiableList(this.f1378h);
            this.f1371a &= -65;
        }
        c0274q.f1359l = this.f1378h;
        if ((i2 & 128) != 128) {
            i = 0;
        }
        c0274q.f1360m = this.f1379i;
        if ((i2 & 256) == 256) {
            i |= 2;
        }
        c0274q.f1361n = this.f1380j;
        if ((i2 & 512) == 512) {
            i |= 4;
        }
        c0274q.f1362o = this.f1381k;
        if ((i2 & 1024) == 1024) {
            i |= 8;
        }
        c0274q.f1363p = this.f1382l;
        if ((i2 & 2048) == 2048) {
            i |= 16;
        }
        c0274q.f1364q = this.f1383m;
        if ((i2 & 4096) == 4096) {
            i |= 32;
        }
        c0274q.f1365r = this.f1384n;
        if ((i2 & 8192) == 8192) {
            i |= 64;
        }
        c0274q.f1366s = this.f1385o;
        if ((this.f1371a & 16384) == 16384) {
            this.f1386p = new bg(this.f1386p);
            this.f1371a &= -16385;
        }
        c0274q.f1367t = this.f1386p;
        if ((i2 & 32768) == 32768) {
            i |= 128;
        }
        c0274q.f1368u = this.f1387q;
        c0274q.f1352e = i;
        return c0274q;
    }

    public C0266i m2155e(int i) {
        return (C0266i) this.f1377g.get(i);
    }

    public /* synthetic */ C0255t m2156e() {
        return m2148b();
    }

    public C0276s m2157f(int i) {
        this.f1371a |= 32768;
        this.f1387q = i;
        return this;
    }

    public /* synthetic */ C0261v m2158f() {
        return m2139a();
    }

    public /* synthetic */ C0260b m2159g() {
        return m2139a();
    }

    public /* synthetic */ am m2160h() {
        return m2151c();
    }

    public int m2161i() {
        return this.f1373c.size();
    }

    public final boolean m2162j() {
        int i;
        for (i = 0; i < m2161i(); i++) {
            if (!m2145a(i).m2300j()) {
                return false;
            }
        }
        for (i = 0; i < m2163k(); i++) {
            if (!m2147b(i).m2018j()) {
                return false;
            }
        }
        for (i = 0; i < m2164l(); i++) {
            if (!m2150c(i).m1967j()) {
                return false;
            }
        }
        for (i = 0; i < m2165m(); i++) {
            if (!m2153d(i).m1967j()) {
                return false;
            }
        }
        for (i = 0; i < m2166n(); i++) {
            if (!m2155e(i).m1967j()) {
                return false;
            }
        }
        return true;
    }

    public int m2163k() {
        return this.f1374d.size();
    }

    public int m2164l() {
        return this.f1375e.size();
    }

    public int m2165m() {
        return this.f1376f.size();
    }

    public int m2166n() {
        return this.f1377g.size();
    }

    public /* synthetic */ am m2167p() {
        return m2148b();
    }
}
