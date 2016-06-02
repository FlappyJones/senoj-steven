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

/* renamed from: com.google.analytics.a.a.m */
public final class C0270m extends C0255t implements C0269p {
    public static aq f1336a;
    private static final C0270m f1337c;
    private static volatile ap f1338j;
    private final C0516h f1339d;
    private int f1340e;
    private int f1341f;
    private int f1342g;
    private byte f1343h;
    private int f1344i;

    static {
        f1336a = new C0271n();
        f1338j = null;
        f1337c = new C0270m(true);
        f1337c.m2010l();
    }

    private C0270m(C0522k c0522k, C0526o c0526o) {
        this.f1343h = (byte) -1;
        this.f1344i = -1;
        m2010l();
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
                        this.f1340e |= 1;
                        this.f1341f = c0522k.m4736f();
                        break;
                    case 16:
                        this.f1340e |= 2;
                        this.f1342g = c0522k.m4736f();
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
                    this.f1339d = i.m4714a();
                }
                m1872R();
            }
        }
        try {
            a.m4761a();
        } catch (IOException e4) {
        } finally {
            this.f1339d = i.m4714a();
        }
        m1872R();
    }

    private C0270m(C0261v c0261v) {
        super(c0261v);
        this.f1343h = (byte) -1;
        this.f1344i = -1;
        this.f1339d = c0261v.m1919r();
    }

    private C0270m(boolean z) {
        this.f1343h = (byte) -1;
        this.f1344i = -1;
        this.f1339d = C0516h.f2222a;
    }

    public static C0270m m2004a() {
        return f1337c;
    }

    public static C0272o m2005a(C0270m c0270m) {
        return C0270m.m2009h().m2030a(c0270m);
    }

    public static C0272o m2009h() {
        return C0272o.m2027n();
    }

    private void m2010l() {
        this.f1341f = 0;
        this.f1342g = 0;
    }

    public C0270m m2011b() {
        return f1337c;
    }

    public aq m2012c() {
        return f1336a;
    }

    public boolean m2013d() {
        return (this.f1340e & 1) == 1;
    }

    public int m2014e() {
        return this.f1341f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0270m)) {
            return super.equals(obj);
        }
        C0270m c0270m = (C0270m) obj;
        boolean z = m2013d() == c0270m.m2013d();
        if (m2013d()) {
            z = z && m2014e() == c0270m.m2014e();
        }
        z = z && m2015f() == c0270m.m2015f();
        return m2015f() ? z && m2016g() == c0270m.m2016g() : z;
    }

    public boolean m2015f() {
        return (this.f1340e & 2) == 2;
    }

    public int m2016g() {
        return this.f1342g;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = C0270m.class.hashCode() + 779;
        if (m2013d()) {
            hashCode = (((hashCode * 37) + 1) * 53) + m2014e();
        }
        if (m2015f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m2016g();
        }
        hashCode = (hashCode * 29) + this.f1339d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public C0272o m2017i() {
        return C0270m.m2009h();
    }

    public final boolean m2018j() {
        byte b = this.f1343h;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            if (!m2013d()) {
                this.f1343h = (byte) 0;
                return false;
            } else if (m2015f()) {
                this.f1343h = (byte) 1;
                return true;
            } else {
                this.f1343h = (byte) 0;
                return false;
            }
        }
    }

    public C0272o m2019k() {
        return C0270m.m2005a(this);
    }

    public /* synthetic */ an m2020n() {
        return m2019k();
    }

    public /* synthetic */ an m2021o() {
        return m2017i();
    }

    public /* synthetic */ am m2022p() {
        return m2011b();
    }
}
