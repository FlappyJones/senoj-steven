package com.google.analytics.p012a.p013a;

import com.google.android.gms.C0338e;
import com.google.tagmanager.p014a.C0255t;
import com.google.tagmanager.p014a.C0261v;
import com.google.tagmanager.p014a.C0516h;
import com.google.tagmanager.p014a.C0522k;
import com.google.tagmanager.p014a.C0524m;
import com.google.tagmanager.p014a.C0526o;
import com.google.tagmanager.p014a.ac;
import com.google.tagmanager.p014a.af;
import com.google.tagmanager.p014a.am;
import com.google.tagmanager.p014a.an;
import com.google.tagmanager.p014a.ap;
import com.google.tagmanager.p014a.aq;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.analytics.a.a.c */
public final class C0257c extends C0255t implements C0256h {
    public static aq f1296a;
    private static final C0257c f1297c;
    private static volatile ap f1298k;
    private final C0516h f1299d;
    private int f1300e;
    private C0263f f1301f;
    private int f1302g;
    private int f1303h;
    private byte f1304i;
    private int f1305j;

    static {
        f1296a = new C0259d();
        f1298k = null;
        f1297c = new C0257c(true);
        f1297c.m1883q();
    }

    private C0257c(C0522k c0522k, C0526o c0526o) {
        this.f1304i = (byte) -1;
        this.f1305j = -1;
        m1883q();
        OutputStream i = C0516h.m4582i();
        C0524m a = C0524m.m4758a(i);
        Object obj = null;
        while (obj == null) {
            try {
                int a2 = c0522k.m4722a();
                switch (a2) {
                    case C0338e.MapAttrs_mapType /*0*/:
                        obj = 1;
                        break;
                    case C0338e.MapAttrs_uiScrollGestures /*8*/:
                        int n = c0522k.m4745n();
                        C0263f a3 = C0263f.m1942a(n);
                        if (a3 != null) {
                            this.f1300e |= 1;
                            this.f1301f = a3;
                            break;
                        }
                        a.m4772d(a2);
                        a.m4772d(n);
                        break;
                    case 16:
                        this.f1300e |= 2;
                        this.f1302g = c0522k.m4736f();
                        break;
                    case 24:
                        this.f1300e |= 4;
                        this.f1303h = c0522k.m4736f();
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
                try {
                    a.m4761a();
                } catch (IOException e3) {
                    m1872R();
                } finally {
                    this.f1299d = i.m4714a();
                }
                m1872R();
            }
        }
        try {
            a.m4761a();
        } catch (IOException e4) {
        } finally {
            this.f1299d = i.m4714a();
        }
        m1872R();
    }

    private C0257c(C0261v c0261v) {
        super(c0261v);
        this.f1304i = (byte) -1;
        this.f1305j = -1;
        this.f1299d = c0261v.m1919r();
    }

    private C0257c(boolean z) {
        this.f1304i = (byte) -1;
        this.f1305j = -1;
        this.f1299d = C0516h.f2222a;
    }

    public static C0257c m1876a() {
        return f1297c;
    }

    public static C0262e m1877a(C0257c c0257c) {
        return C0257c.m1882k().m1925a(c0257c);
    }

    public static C0262e m1882k() {
        return C0262e.m1922l();
    }

    private void m1883q() {
        this.f1301f = C0263f.NO_CACHE;
        this.f1302g = 0;
        this.f1303h = 0;
    }

    public C0257c m1884b() {
        return f1297c;
    }

    public aq m1885c() {
        return f1296a;
    }

    public boolean m1886d() {
        return (this.f1300e & 1) == 1;
    }

    public C0263f m1887e() {
        return this.f1301f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0257c)) {
            return super.equals(obj);
        }
        C0257c c0257c = (C0257c) obj;
        boolean z = m1886d() == c0257c.m1886d();
        if (m1886d()) {
            z = z && m1887e() == c0257c.m1887e();
        }
        z = z && m1888f() == c0257c.m1888f();
        if (m1888f()) {
            z = z && m1889g() == c0257c.m1889g();
        }
        z = z && m1890h() == c0257c.m1890h();
        return m1890h() ? z && m1891i() == c0257c.m1891i() : z;
    }

    public boolean m1888f() {
        return (this.f1300e & 2) == 2;
    }

    public int m1889g() {
        return this.f1302g;
    }

    public boolean m1890h() {
        return (this.f1300e & 4) == 4;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = C0257c.class.hashCode() + 779;
        if (m1886d()) {
            hashCode = (((hashCode * 37) + 1) * 53) + ac.m4552a(m1887e());
        }
        if (m1888f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m1889g();
        }
        if (m1890h()) {
            hashCode = (((hashCode * 37) + 3) * 53) + m1891i();
        }
        hashCode = (hashCode * 29) + this.f1299d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public int m1891i() {
        return this.f1303h;
    }

    public final boolean m1892j() {
        byte b = this.f1304i;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.f1304i = (byte) 1;
            return true;
        }
    }

    public C0262e m1893l() {
        return C0257c.m1882k();
    }

    public C0262e m1894m() {
        return C0257c.m1877a(this);
    }

    public /* synthetic */ an m1895n() {
        return m1894m();
    }

    public /* synthetic */ an m1896o() {
        return m1893l();
    }

    public /* synthetic */ am m1897p() {
        return m1884b();
    }
}
