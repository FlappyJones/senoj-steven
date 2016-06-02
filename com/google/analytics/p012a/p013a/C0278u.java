package com.google.analytics.p012a.p013a;

import com.google.android.gms.C0338e;
import com.google.tagmanager.p014a.C0255t;
import com.google.tagmanager.p014a.C0261v;
import com.google.tagmanager.p014a.C0516h;
import com.google.tagmanager.p014a.C0522k;
import com.google.tagmanager.p014a.C0524m;
import com.google.tagmanager.p014a.C0526o;
import com.google.tagmanager.p014a.af;
import com.google.tagmanager.p014a.am;
import com.google.tagmanager.p014a.an;
import com.google.tagmanager.p014a.ap;
import com.google.tagmanager.p014a.aq;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.analytics.a.a.u */
public final class C0278u extends C0255t implements C0277x {
    public static aq f1388a;
    private static final C0278u f1389c;
    private static volatile ap f1390q;
    private final C0516h f1391d;
    private List f1392e;
    private List f1393f;
    private List f1394g;
    private List f1395h;
    private List f1396i;
    private List f1397j;
    private List f1398k;
    private List f1399l;
    private List f1400m;
    private List f1401n;
    private byte f1402o;
    private int f1403p;

    static {
        f1388a = new C0279v();
        f1390q = null;
        f1389c = new C0278u(true);
        f1389c.m2169E();
    }

    private C0278u(C0522k c0522k, C0526o c0526o) {
        this.f1402o = (byte) -1;
        this.f1403p = -1;
        m2169E();
        int i = 0;
        OutputStream i2 = C0516h.m4582i();
        C0524m a = C0524m.m4758a(i2);
        Object obj = null;
        while (obj == null) {
            try {
                int a2 = c0522k.m4722a();
                switch (a2) {
                    case C0338e.MapAttrs_mapType /*0*/:
                        obj = 1;
                        break;
                    case C0338e.MapAttrs_uiScrollGestures /*8*/:
                        if ((i & 1) != 1) {
                            this.f1392e = new ArrayList();
                            i |= 1;
                        }
                        this.f1392e.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case C0338e.MapAttrs_uiZoomControls /*10*/:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 1) != 1 && c0522k.m4754w() > 0) {
                            this.f1392e = new ArrayList();
                            i |= 1;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1392e.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 16:
                        if ((i & 2) != 2) {
                            this.f1393f = new ArrayList();
                            i |= 2;
                        }
                        this.f1393f.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 18:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 2) != 2 && c0522k.m4754w() > 0) {
                            this.f1393f = new ArrayList();
                            i |= 2;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1393f.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 24:
                        if ((i & 4) != 4) {
                            this.f1394g = new ArrayList();
                            i |= 4;
                        }
                        this.f1394g.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 26:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 4) != 4 && c0522k.m4754w() > 0) {
                            this.f1394g = new ArrayList();
                            i |= 4;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1394g.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 32:
                        if ((i & 8) != 8) {
                            this.f1395h = new ArrayList();
                            i |= 8;
                        }
                        this.f1395h.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 34:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 8) != 8 && c0522k.m4754w() > 0) {
                            this.f1395h = new ArrayList();
                            i |= 8;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1395h.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 40:
                        if ((i & 16) != 16) {
                            this.f1396i = new ArrayList();
                            i |= 16;
                        }
                        this.f1396i.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 42:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 16) != 16 && c0522k.m4754w() > 0) {
                            this.f1396i = new ArrayList();
                            i |= 16;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1396i.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 48:
                        if ((i & 32) != 32) {
                            this.f1397j = new ArrayList();
                            i |= 32;
                        }
                        this.f1397j.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 50:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 32) != 32 && c0522k.m4754w() > 0) {
                            this.f1397j = new ArrayList();
                            i |= 32;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1397j.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 56:
                        if ((i & 64) != 64) {
                            this.f1398k = new ArrayList();
                            i |= 64;
                        }
                        this.f1398k.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 58:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 64) != 64 && c0522k.m4754w() > 0) {
                            this.f1398k = new ArrayList();
                            i |= 64;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1398k.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 64:
                        if ((i & 128) != 128) {
                            this.f1399l = new ArrayList();
                            i |= 128;
                        }
                        this.f1399l.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 66:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 128) != 128 && c0522k.m4754w() > 0) {
                            this.f1399l = new ArrayList();
                            i |= 128;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1399l.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 72:
                        if ((i & 256) != 256) {
                            this.f1400m = new ArrayList();
                            i |= 256;
                        }
                        this.f1400m.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 74:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 256) != 256 && c0522k.m4754w() > 0) {
                            this.f1400m = new ArrayList();
                            i |= 256;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1400m.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 80:
                        if ((i & 512) != 512) {
                            this.f1401n = new ArrayList();
                            i |= 512;
                        }
                        this.f1401n.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 82:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i & 512) != 512 && c0522k.m4754w() > 0) {
                            this.f1401n = new ArrayList();
                            i |= 512;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1401n.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    default:
                        if (!m1873a(c0522k, a, c0526o, a2)) {
                            obj = 1;
                            break;
                        }
                        break;
                }
            } catch (af e) {
                throw e.m4566a(this);
            } catch (IOException e2) {
                throw new af(e2.getMessage()).m4566a(this);
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.f1392e = Collections.unmodifiableList(this.f1392e);
                }
                if ((i & 2) == 2) {
                    this.f1393f = Collections.unmodifiableList(this.f1393f);
                }
                if ((i & 4) == 4) {
                    this.f1394g = Collections.unmodifiableList(this.f1394g);
                }
                if ((i & 8) == 8) {
                    this.f1395h = Collections.unmodifiableList(this.f1395h);
                }
                if ((i & 16) == 16) {
                    this.f1396i = Collections.unmodifiableList(this.f1396i);
                }
                if ((i & 32) == 32) {
                    this.f1397j = Collections.unmodifiableList(this.f1397j);
                }
                if ((i & 64) == 64) {
                    this.f1398k = Collections.unmodifiableList(this.f1398k);
                }
                if ((i & 128) == 128) {
                    this.f1399l = Collections.unmodifiableList(this.f1399l);
                }
                if ((i & 256) == 256) {
                    this.f1400m = Collections.unmodifiableList(this.f1400m);
                }
                if ((i & 512) == 512) {
                    this.f1401n = Collections.unmodifiableList(this.f1401n);
                }
                try {
                    a.m4761a();
                } catch (IOException e3) {
                    m1872R();
                } finally {
                    this.f1391d = i2.m4714a();
                }
                m1872R();
            }
        }
        if ((i & 1) == 1) {
            this.f1392e = Collections.unmodifiableList(this.f1392e);
        }
        if ((i & 2) == 2) {
            this.f1393f = Collections.unmodifiableList(this.f1393f);
        }
        if ((i & 4) == 4) {
            this.f1394g = Collections.unmodifiableList(this.f1394g);
        }
        if ((i & 8) == 8) {
            this.f1395h = Collections.unmodifiableList(this.f1395h);
        }
        if ((i & 16) == 16) {
            this.f1396i = Collections.unmodifiableList(this.f1396i);
        }
        if ((i & 32) == 32) {
            this.f1397j = Collections.unmodifiableList(this.f1397j);
        }
        if ((i & 64) == 64) {
            this.f1398k = Collections.unmodifiableList(this.f1398k);
        }
        if ((i & 128) == 128) {
            this.f1399l = Collections.unmodifiableList(this.f1399l);
        }
        if ((i & 256) == 256) {
            this.f1400m = Collections.unmodifiableList(this.f1400m);
        }
        if ((i & 512) == 512) {
            this.f1401n = Collections.unmodifiableList(this.f1401n);
        }
        try {
            a.m4761a();
        } catch (IOException e4) {
        } finally {
            this.f1391d = i2.m4714a();
        }
        m1872R();
    }

    private C0278u(C0261v c0261v) {
        super(c0261v);
        this.f1402o = (byte) -1;
        this.f1403p = -1;
        this.f1391d = c0261v.m1919r();
    }

    private C0278u(boolean z) {
        this.f1402o = (byte) -1;
        this.f1403p = -1;
        this.f1391d = C0516h.f2222a;
    }

    public static C0280w m2168B() {
        return C0280w.m2225l();
    }

    private void m2169E() {
        this.f1392e = Collections.emptyList();
        this.f1393f = Collections.emptyList();
        this.f1394g = Collections.emptyList();
        this.f1395h = Collections.emptyList();
        this.f1396i = Collections.emptyList();
        this.f1397j = Collections.emptyList();
        this.f1398k = Collections.emptyList();
        this.f1399l = Collections.emptyList();
        this.f1400m = Collections.emptyList();
        this.f1401n = Collections.emptyList();
    }

    public static C0278u m2170a() {
        return f1389c;
    }

    public static C0280w m2171a(C0278u c0278u) {
        return C0278u.m2168B().m2237a(c0278u);
    }

    public int m2193A() {
        return this.f1401n.size();
    }

    public C0280w m2194C() {
        return C0278u.m2168B();
    }

    public C0280w m2195D() {
        return C0278u.m2171a(this);
    }

    public C0278u m2196b() {
        return f1389c;
    }

    public aq m2197c() {
        return f1388a;
    }

    public List m2198d() {
        return this.f1392e;
    }

    public int m2199e() {
        return this.f1392e.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0278u)) {
            return super.equals(obj);
        }
        C0278u c0278u = (C0278u) obj;
        boolean z = (m2198d().equals(c0278u.m2198d())) && m2200f().equals(c0278u.m2200f());
        z = z && m2202h().equals(c0278u.m2202h());
        z = z && m2205k().equals(c0278u.m2205k());
        z = z && m2207m().equals(c0278u.m2207m());
        z = z && m2212r().equals(c0278u.m2212r());
        z = z && m2214t().equals(c0278u.m2214t());
        z = z && m2216v().equals(c0278u.m2216v());
        z = z && m2218x().equals(c0278u.m2218x());
        return z && m2220z().equals(c0278u.m2220z());
    }

    public List m2200f() {
        return this.f1393f;
    }

    public int m2201g() {
        return this.f1393f.size();
    }

    public List m2202h() {
        return this.f1394g;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = C0278u.class.hashCode() + 779;
        if (m2199e() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m2198d().hashCode();
        }
        if (m2201g() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + m2200f().hashCode();
        }
        if (m2203i() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + m2202h().hashCode();
        }
        if (m2206l() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + m2205k().hashCode();
        }
        if (m2211q() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + m2207m().hashCode();
        }
        if (m2213s() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + m2212r().hashCode();
        }
        if (m2215u() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + m2214t().hashCode();
        }
        if (m2217w() > 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + m2216v().hashCode();
        }
        if (m2219y() > 0) {
            hashCode = (((hashCode * 37) + 9) * 53) + m2218x().hashCode();
        }
        if (m2193A() > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + m2220z().hashCode();
        }
        hashCode = (hashCode * 29) + this.f1391d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public int m2203i() {
        return this.f1394g.size();
    }

    public final boolean m2204j() {
        byte b = this.f1402o;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.f1402o = (byte) 1;
            return true;
        }
    }

    public List m2205k() {
        return this.f1395h;
    }

    public int m2206l() {
        return this.f1395h.size();
    }

    public List m2207m() {
        return this.f1396i;
    }

    public /* synthetic */ an m2208n() {
        return m2195D();
    }

    public /* synthetic */ an m2209o() {
        return m2194C();
    }

    public /* synthetic */ am m2210p() {
        return m2196b();
    }

    public int m2211q() {
        return this.f1396i.size();
    }

    public List m2212r() {
        return this.f1397j;
    }

    public int m2213s() {
        return this.f1397j.size();
    }

    public List m2214t() {
        return this.f1398k;
    }

    public int m2215u() {
        return this.f1398k.size();
    }

    public List m2216v() {
        return this.f1399l;
    }

    public int m2217w() {
        return this.f1399l.size();
    }

    public List m2218x() {
        return this.f1400m;
    }

    public int m2219y() {
        return this.f1400m.size();
    }

    public List m2220z() {
        return this.f1401n;
    }
}
