package com.google.analytics.p015b.p016a.p017a;

import com.google.tagmanager.p014a.C0255t;
import com.google.tagmanager.p014a.C0260b;
import com.google.tagmanager.p014a.C0261v;
import com.google.tagmanager.p014a.C0284x;
import com.google.tagmanager.p014a.C0288w;
import com.google.tagmanager.p014a.C0522k;
import com.google.tagmanager.p014a.C0526o;
import com.google.tagmanager.p014a.am;
import com.google.tagmanager.p014a.an;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.analytics.b.a.a.e */
public final class C0289e extends C0288w implements C0285j {
    private int f1437a;
    private C0292h f1438b;
    private Object f1439c;
    private List f1440d;
    private List f1441e;
    private List f1442f;
    private Object f1443g;
    private Object f1444h;
    private long f1445i;
    private boolean f1446j;
    private List f1447k;
    private List f1448l;
    private boolean f1449m;

    private C0289e() {
        this.f1438b = C0292h.STRING;
        this.f1439c = "";
        this.f1440d = Collections.emptyList();
        this.f1441e = Collections.emptyList();
        this.f1442f = Collections.emptyList();
        this.f1443g = "";
        this.f1444h = "";
        this.f1447k = Collections.emptyList();
        this.f1448l = Collections.emptyList();
        m2328t();
    }

    private void m2328t() {
    }

    private static C0289e m2329u() {
        return new C0289e();
    }

    private void m2330v() {
        if ((this.f1437a & 4) != 4) {
            this.f1440d = new ArrayList(this.f1440d);
            this.f1437a |= 4;
        }
    }

    private void m2331w() {
        if ((this.f1437a & 8) != 8) {
            this.f1441e = new ArrayList(this.f1441e);
            this.f1437a |= 8;
        }
    }

    private void m2332x() {
        if ((this.f1437a & 16) != 16) {
            this.f1442f = new ArrayList(this.f1442f);
            this.f1437a |= 16;
        }
    }

    private void m2333y() {
        if ((this.f1437a & 512) != 512) {
            this.f1447k = new ArrayList(this.f1447k);
            this.f1437a |= 512;
        }
    }

    private void m2334z() {
        if ((this.f1437a & 1024) != 1024) {
            this.f1448l = new ArrayList(this.f1448l);
            this.f1437a |= 1024;
        }
    }

    public C0286c m2335a(int i) {
        return (C0286c) this.f1440d.get(i);
    }

    public C0289e m2336a() {
        return C0289e.m2329u().m2338a(m2353d());
    }

    public C0289e m2337a(long j) {
        this.f1437a |= 128;
        this.f1445i = j;
        return this;
    }

    public C0289e m2338a(C0286c c0286c) {
        if (c0286c != C0286c.m2259a()) {
            if (c0286c.m2294d()) {
                m2339a(c0286c.m2295e());
            }
            if (c0286c.m2296f()) {
                this.f1437a |= 2;
                this.f1439c = c0286c.f1422g;
            }
            if (!c0286c.f1423h.isEmpty()) {
                if (this.f1440d.isEmpty()) {
                    this.f1440d = c0286c.f1423h;
                    this.f1437a &= -5;
                } else {
                    m2330v();
                    this.f1440d.addAll(c0286c.f1423h);
                }
            }
            if (!c0286c.f1424i.isEmpty()) {
                if (this.f1441e.isEmpty()) {
                    this.f1441e = c0286c.f1424i;
                    this.f1437a &= -9;
                } else {
                    m2331w();
                    this.f1441e.addAll(c0286c.f1424i);
                }
            }
            if (!c0286c.f1425j.isEmpty()) {
                if (this.f1442f.isEmpty()) {
                    this.f1442f = c0286c.f1425j;
                    this.f1437a &= -17;
                } else {
                    m2332x();
                    this.f1442f.addAll(c0286c.f1425j);
                }
            }
            if (c0286c.m2308r()) {
                this.f1437a |= 32;
                this.f1443g = c0286c.f1426k;
            }
            if (c0286c.m2310t()) {
                this.f1437a |= 64;
                this.f1444h = c0286c.f1427l;
            }
            if (c0286c.m2312v()) {
                m2337a(c0286c.m2313w());
            }
            if (c0286c.m2314x()) {
                m2342a(c0286c.m2315y());
            }
            if (!c0286c.f1430o.isEmpty()) {
                if (this.f1447k.isEmpty()) {
                    this.f1447k = c0286c.f1430o;
                    this.f1437a &= -513;
                } else {
                    m2333y();
                    this.f1447k.addAll(c0286c.f1430o);
                }
            }
            if (!c0286c.f1431p.isEmpty()) {
                if (this.f1448l.isEmpty()) {
                    this.f1448l = c0286c.f1431p;
                    this.f1437a &= -1025;
                } else {
                    m2334z();
                    this.f1448l.addAll(c0286c.f1431p);
                }
            }
            if (c0286c.m2284D()) {
                m2347b(c0286c.m2285E());
            }
            m2322a((C0284x) c0286c);
            m1913a(m1919r().m4585a(c0286c.f1419d));
        }
        return this;
    }

    public C0289e m2339a(C0292h c0292h) {
        if (c0292h == null) {
            throw new NullPointerException();
        }
        this.f1437a |= 1;
        this.f1438b = c0292h;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.analytics.p015b.p016a.p017a.C0289e m2340a(com.google.tagmanager.p014a.C0522k r5, com.google.tagmanager.p014a.C0526o r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.analytics.p015b.p016a.p017a.C0286c.f1416a;	 Catch:{ af -> 0x000f }
        r0 = r0.m1898b(r5, r6);	 Catch:{ af -> 0x000f }
        r0 = (com.google.analytics.p015b.p016a.p017a.C0286c) r0;	 Catch:{ af -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.m2338a(r0);
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.m4567a();	 Catch:{ all -> 0x0022 }
        r0 = (com.google.analytics.p015b.p016a.p017a.C0286c) r0;	 Catch:{ all -> 0x0022 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.m2338a(r1);
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.b.a.a.e.a(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.b.a.a.e");
    }

    public C0289e m2341a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f1437a |= 2;
        this.f1439c = str;
        return this;
    }

    public C0289e m2342a(boolean z) {
        this.f1437a |= 256;
        this.f1446j = z;
        return this;
    }

    public C0286c m2344b() {
        return C0286c.m2259a();
    }

    public C0286c m2345b(int i) {
        return (C0286c) this.f1441e.get(i);
    }

    public C0289e m2346b(C0286c c0286c) {
        if (c0286c == null) {
            throw new NullPointerException();
        }
        m2330v();
        this.f1440d.add(c0286c);
        return this;
    }

    public C0289e m2347b(boolean z) {
        this.f1437a |= 2048;
        this.f1449m = z;
        return this;
    }

    public /* synthetic */ C0260b m2348b(C0522k c0522k, C0526o c0526o) {
        return m2340a(c0522k, c0526o);
    }

    public C0286c m2349c() {
        Object d = m2353d();
        if (d.m2300j()) {
            return d;
        }
        throw C0260b.m1909a(d);
    }

    public C0286c m2350c(int i) {
        return (C0286c) this.f1442f.get(i);
    }

    public C0289e m2351c(C0286c c0286c) {
        if (c0286c == null) {
            throw new NullPointerException();
        }
        m2331w();
        this.f1441e.add(c0286c);
        return this;
    }

    public /* synthetic */ an m2352c(C0522k c0522k, C0526o c0526o) {
        return m2340a(c0522k, c0526o);
    }

    public /* synthetic */ Object clone() {
        return m2336a();
    }

    public C0286c m2353d() {
        int i = 1;
        C0286c c0286c = new C0286c(null);
        int i2 = this.f1437a;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        c0286c.f1421f = this.f1438b;
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        c0286c.f1422g = this.f1439c;
        if ((this.f1437a & 4) == 4) {
            this.f1440d = Collections.unmodifiableList(this.f1440d);
            this.f1437a &= -5;
        }
        c0286c.f1423h = this.f1440d;
        if ((this.f1437a & 8) == 8) {
            this.f1441e = Collections.unmodifiableList(this.f1441e);
            this.f1437a &= -9;
        }
        c0286c.f1424i = this.f1441e;
        if ((this.f1437a & 16) == 16) {
            this.f1442f = Collections.unmodifiableList(this.f1442f);
            this.f1437a &= -17;
        }
        c0286c.f1425j = this.f1442f;
        if ((i2 & 32) == 32) {
            i |= 4;
        }
        c0286c.f1426k = this.f1443g;
        if ((i2 & 64) == 64) {
            i |= 8;
        }
        c0286c.f1427l = this.f1444h;
        if ((i2 & 128) == 128) {
            i |= 16;
        }
        c0286c.f1428m = this.f1445i;
        if ((i2 & 256) == 256) {
            i |= 32;
        }
        c0286c.f1429n = this.f1446j;
        if ((this.f1437a & 512) == 512) {
            this.f1447k = Collections.unmodifiableList(this.f1447k);
            this.f1437a &= -513;
        }
        c0286c.f1430o = this.f1447k;
        if ((this.f1437a & 1024) == 1024) {
            this.f1448l = Collections.unmodifiableList(this.f1448l);
            this.f1437a &= -1025;
        }
        c0286c.f1431p = this.f1448l;
        if ((i2 & 2048) == 2048) {
            i |= 64;
        }
        c0286c.f1432q = this.f1449m;
        c0286c.f1420e = i;
        return c0286c;
    }

    public C0286c m2354d(int i) {
        return (C0286c) this.f1447k.get(i);
    }

    public C0289e m2355d(C0286c c0286c) {
        if (c0286c == null) {
            throw new NullPointerException();
        }
        m2332x();
        this.f1442f.add(c0286c);
        return this;
    }

    public /* synthetic */ C0255t m2356e() {
        return m2344b();
    }

    public /* synthetic */ C0261v m2357f() {
        return m2336a();
    }

    public /* synthetic */ C0260b m2358g() {
        return m2336a();
    }

    public /* synthetic */ am m2359h() {
        return m2349c();
    }

    public boolean m2360i() {
        return (this.f1437a & 1) == 1;
    }

    public final boolean m2361j() {
        if (!m2360i()) {
            return false;
        }
        int i;
        for (i = 0; i < m2362k(); i++) {
            if (!m2335a(i).m2300j()) {
                return false;
            }
        }
        for (i = 0; i < m2363l(); i++) {
            if (!m2345b(i).m2300j()) {
                return false;
            }
        }
        for (i = 0; i < m2364m(); i++) {
            if (!m2350c(i).m2300j()) {
                return false;
            }
        }
        for (i = 0; i < m2365n(); i++) {
            if (!m2354d(i).m2300j()) {
                return false;
            }
        }
        return m2326s();
    }

    public int m2362k() {
        return this.f1440d.size();
    }

    public int m2363l() {
        return this.f1441e.size();
    }

    public int m2364m() {
        return this.f1442f.size();
    }

    public int m2365n() {
        return this.f1447k.size();
    }

    public /* synthetic */ C0288w m2366o() {
        return m2336a();
    }

    public /* synthetic */ am m2367p() {
        return m2344b();
    }
}
