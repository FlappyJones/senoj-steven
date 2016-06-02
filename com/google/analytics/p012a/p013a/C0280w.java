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

/* renamed from: com.google.analytics.a.a.w */
public final class C0280w extends C0261v implements C0277x {
    private int f1404a;
    private List f1405b;
    private List f1406c;
    private List f1407d;
    private List f1408e;
    private List f1409f;
    private List f1410g;
    private List f1411h;
    private List f1412i;
    private List f1413j;
    private List f1414k;

    private C0280w() {
        this.f1405b = Collections.emptyList();
        this.f1406c = Collections.emptyList();
        this.f1407d = Collections.emptyList();
        this.f1408e = Collections.emptyList();
        this.f1409f = Collections.emptyList();
        this.f1410g = Collections.emptyList();
        this.f1411h = Collections.emptyList();
        this.f1412i = Collections.emptyList();
        this.f1413j = Collections.emptyList();
        this.f1414k = Collections.emptyList();
        m2224k();
    }

    private void m2224k() {
    }

    private static C0280w m2225l() {
        return new C0280w();
    }

    private void m2226m() {
        if ((this.f1404a & 1) != 1) {
            this.f1405b = new ArrayList(this.f1405b);
            this.f1404a |= 1;
        }
    }

    private void m2227n() {
        if ((this.f1404a & 2) != 2) {
            this.f1406c = new ArrayList(this.f1406c);
            this.f1404a |= 2;
        }
    }

    private void m2228o() {
        if ((this.f1404a & 4) != 4) {
            this.f1407d = new ArrayList(this.f1407d);
            this.f1404a |= 4;
        }
    }

    private void m2229q() {
        if ((this.f1404a & 8) != 8) {
            this.f1408e = new ArrayList(this.f1408e);
            this.f1404a |= 8;
        }
    }

    private void m2230s() {
        if ((this.f1404a & 16) != 16) {
            this.f1409f = new ArrayList(this.f1409f);
            this.f1404a |= 16;
        }
    }

    private void m2231t() {
        if ((this.f1404a & 32) != 32) {
            this.f1410g = new ArrayList(this.f1410g);
            this.f1404a |= 32;
        }
    }

    private void m2232u() {
        if ((this.f1404a & 64) != 64) {
            this.f1411h = new ArrayList(this.f1411h);
            this.f1404a |= 64;
        }
    }

    private void m2233v() {
        if ((this.f1404a & 128) != 128) {
            this.f1412i = new ArrayList(this.f1412i);
            this.f1404a |= 128;
        }
    }

    private void m2234w() {
        if ((this.f1404a & 256) != 256) {
            this.f1413j = new ArrayList(this.f1413j);
            this.f1404a |= 256;
        }
    }

    private void m2235x() {
        if ((this.f1404a & 512) != 512) {
            this.f1414k = new ArrayList(this.f1414k);
            this.f1404a |= 512;
        }
    }

    public C0280w m2236a() {
        return C0280w.m2225l().m2237a(m2244d());
    }

    public C0280w m2237a(C0278u c0278u) {
        if (c0278u != C0278u.m2170a()) {
            if (!c0278u.f1392e.isEmpty()) {
                if (this.f1405b.isEmpty()) {
                    this.f1405b = c0278u.f1392e;
                    this.f1404a &= -2;
                } else {
                    m2226m();
                    this.f1405b.addAll(c0278u.f1392e);
                }
            }
            if (!c0278u.f1393f.isEmpty()) {
                if (this.f1406c.isEmpty()) {
                    this.f1406c = c0278u.f1393f;
                    this.f1404a &= -3;
                } else {
                    m2227n();
                    this.f1406c.addAll(c0278u.f1393f);
                }
            }
            if (!c0278u.f1394g.isEmpty()) {
                if (this.f1407d.isEmpty()) {
                    this.f1407d = c0278u.f1394g;
                    this.f1404a &= -5;
                } else {
                    m2228o();
                    this.f1407d.addAll(c0278u.f1394g);
                }
            }
            if (!c0278u.f1395h.isEmpty()) {
                if (this.f1408e.isEmpty()) {
                    this.f1408e = c0278u.f1395h;
                    this.f1404a &= -9;
                } else {
                    m2229q();
                    this.f1408e.addAll(c0278u.f1395h);
                }
            }
            if (!c0278u.f1396i.isEmpty()) {
                if (this.f1409f.isEmpty()) {
                    this.f1409f = c0278u.f1396i;
                    this.f1404a &= -17;
                } else {
                    m2230s();
                    this.f1409f.addAll(c0278u.f1396i);
                }
            }
            if (!c0278u.f1397j.isEmpty()) {
                if (this.f1410g.isEmpty()) {
                    this.f1410g = c0278u.f1397j;
                    this.f1404a &= -33;
                } else {
                    m2231t();
                    this.f1410g.addAll(c0278u.f1397j);
                }
            }
            if (!c0278u.f1398k.isEmpty()) {
                if (this.f1411h.isEmpty()) {
                    this.f1411h = c0278u.f1398k;
                    this.f1404a &= -65;
                } else {
                    m2232u();
                    this.f1411h.addAll(c0278u.f1398k);
                }
            }
            if (!c0278u.f1399l.isEmpty()) {
                if (this.f1412i.isEmpty()) {
                    this.f1412i = c0278u.f1399l;
                    this.f1404a &= -129;
                } else {
                    m2233v();
                    this.f1412i.addAll(c0278u.f1399l);
                }
            }
            if (!c0278u.f1400m.isEmpty()) {
                if (this.f1413j.isEmpty()) {
                    this.f1413j = c0278u.f1400m;
                    this.f1404a &= -257;
                } else {
                    m2234w();
                    this.f1413j.addAll(c0278u.f1400m);
                }
            }
            if (!c0278u.f1401n.isEmpty()) {
                if (this.f1414k.isEmpty()) {
                    this.f1414k = c0278u.f1401n;
                    this.f1404a &= -513;
                } else {
                    m2235x();
                    this.f1414k.addAll(c0278u.f1401n);
                }
            }
            m1913a(m1919r().m4585a(c0278u.f1391d));
        }
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.analytics.p012a.p013a.C0280w m2238a(com.google.tagmanager.p014a.C0522k r5, com.google.tagmanager.p014a.C0526o r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.analytics.p012a.p013a.C0278u.f1388a;	 Catch:{ af -> 0x000f }
        r0 = r0.m1898b(r5, r6);	 Catch:{ af -> 0x000f }
        r0 = (com.google.analytics.p012a.p013a.C0278u) r0;	 Catch:{ af -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.m2237a(r0);
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.m4567a();	 Catch:{ all -> 0x0022 }
        r0 = (com.google.analytics.p012a.p013a.C0278u) r0;	 Catch:{ all -> 0x0022 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.m2237a(r1);
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.w.a(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.w");
    }

    public C0278u m2240b() {
        return C0278u.m2170a();
    }

    public /* synthetic */ C0260b m2241b(C0522k c0522k, C0526o c0526o) {
        return m2238a(c0522k, c0526o);
    }

    public C0278u m2242c() {
        Object d = m2244d();
        if (d.m2204j()) {
            return d;
        }
        throw C0260b.m1909a(d);
    }

    public /* synthetic */ an m2243c(C0522k c0522k, C0526o c0526o) {
        return m2238a(c0522k, c0526o);
    }

    public /* synthetic */ Object clone() {
        return m2236a();
    }

    public C0278u m2244d() {
        C0278u c0278u = new C0278u(null);
        int i = this.f1404a;
        if ((this.f1404a & 1) == 1) {
            this.f1405b = Collections.unmodifiableList(this.f1405b);
            this.f1404a &= -2;
        }
        c0278u.f1392e = this.f1405b;
        if ((this.f1404a & 2) == 2) {
            this.f1406c = Collections.unmodifiableList(this.f1406c);
            this.f1404a &= -3;
        }
        c0278u.f1393f = this.f1406c;
        if ((this.f1404a & 4) == 4) {
            this.f1407d = Collections.unmodifiableList(this.f1407d);
            this.f1404a &= -5;
        }
        c0278u.f1394g = this.f1407d;
        if ((this.f1404a & 8) == 8) {
            this.f1408e = Collections.unmodifiableList(this.f1408e);
            this.f1404a &= -9;
        }
        c0278u.f1395h = this.f1408e;
        if ((this.f1404a & 16) == 16) {
            this.f1409f = Collections.unmodifiableList(this.f1409f);
            this.f1404a &= -17;
        }
        c0278u.f1396i = this.f1409f;
        if ((this.f1404a & 32) == 32) {
            this.f1410g = Collections.unmodifiableList(this.f1410g);
            this.f1404a &= -33;
        }
        c0278u.f1397j = this.f1410g;
        if ((this.f1404a & 64) == 64) {
            this.f1411h = Collections.unmodifiableList(this.f1411h);
            this.f1404a &= -65;
        }
        c0278u.f1398k = this.f1411h;
        if ((this.f1404a & 128) == 128) {
            this.f1412i = Collections.unmodifiableList(this.f1412i);
            this.f1404a &= -129;
        }
        c0278u.f1399l = this.f1412i;
        if ((this.f1404a & 256) == 256) {
            this.f1413j = Collections.unmodifiableList(this.f1413j);
            this.f1404a &= -257;
        }
        c0278u.f1400m = this.f1413j;
        if ((this.f1404a & 512) == 512) {
            this.f1414k = Collections.unmodifiableList(this.f1414k);
            this.f1404a &= -513;
        }
        c0278u.f1401n = this.f1414k;
        return c0278u;
    }

    public /* synthetic */ C0255t m2245e() {
        return m2240b();
    }

    public /* synthetic */ C0261v m2246f() {
        return m2236a();
    }

    public /* synthetic */ C0260b m2247g() {
        return m2236a();
    }

    public /* synthetic */ am m2248h() {
        return m2242c();
    }

    public final boolean m2249j() {
        return true;
    }

    public /* synthetic */ am m2250p() {
        return m2240b();
    }
}
