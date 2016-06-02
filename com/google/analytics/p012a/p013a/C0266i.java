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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.analytics.a.a.i */
public final class C0266i extends C0255t implements C0265l {
    public static aq f1318a;
    private static final C0266i f1319c;
    private static volatile ap f1320m;
    private final C0516h f1321d;
    private int f1322e;
    private List f1323f;
    private int f1324g;
    private int f1325h;
    private boolean f1326i;
    private boolean f1327j;
    private byte f1328k;
    private int f1329l;

    static {
        f1318a = new C0267j();
        f1320m = null;
        f1319c = new C0266i(true);
        f1319c.m1958u();
    }

    private C0266i(C0522k c0522k, C0526o c0526o) {
        Object obj = null;
        this.f1328k = (byte) -1;
        this.f1329l = -1;
        m1958u();
        OutputStream i = C0516h.m4582i();
        C0524m a = C0524m.m4758a(i);
        int i2 = 0;
        while (obj == null) {
            try {
                int a2 = c0522k.m4722a();
                switch (a2) {
                    case C0338e.MapAttrs_mapType /*0*/:
                        obj = 1;
                        break;
                    case C0338e.MapAttrs_uiScrollGestures /*8*/:
                        this.f1322e |= 8;
                        this.f1327j = c0522k.m4740i();
                        break;
                    case 16:
                        this.f1322e |= 1;
                        this.f1324g = c0522k.m4736f();
                        break;
                    case 24:
                        if ((i2 & 1) != 1) {
                            this.f1323f = new ArrayList();
                            i2 |= 1;
                        }
                        this.f1323f.add(Integer.valueOf(c0522k.m4736f()));
                        break;
                    case 26:
                        a2 = c0522k.m4731c(c0522k.m4750s());
                        if ((i2 & 1) != 1 && c0522k.m4754w() > 0) {
                            this.f1323f = new ArrayList();
                            i2 |= 1;
                        }
                        while (c0522k.m4754w() > 0) {
                            this.f1323f.add(Integer.valueOf(c0522k.m4736f()));
                        }
                        c0522k.m4733d(a2);
                        break;
                    case 32:
                        this.f1322e |= 2;
                        this.f1325h = c0522k.m4736f();
                        break;
                    case 48:
                        this.f1322e |= 4;
                        this.f1326i = c0522k.m4740i();
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
                if ((i2 & 1) == 1) {
                    this.f1323f = Collections.unmodifiableList(this.f1323f);
                }
                try {
                    a.m4761a();
                } catch (IOException e3) {
                    m1872R();
                } finally {
                    this.f1321d = i.m4714a();
                }
                m1872R();
            }
        }
        if ((i2 & 1) == 1) {
            this.f1323f = Collections.unmodifiableList(this.f1323f);
        }
        try {
            a.m4761a();
        } catch (IOException e4) {
        } finally {
            this.f1321d = i.m4714a();
        }
        m1872R();
    }

    private C0266i(C0261v c0261v) {
        super(c0261v);
        this.f1328k = (byte) -1;
        this.f1329l = -1;
        this.f1321d = c0261v.m1919r();
    }

    private C0266i(boolean z) {
        this.f1328k = (byte) -1;
        this.f1329l = -1;
        this.f1321d = C0516h.f2222a;
    }

    public static C0266i m1948a() {
        return f1319c;
    }

    public static C0268k m1949a(C0266i c0266i) {
        return C0266i.m1957r().m1985a(c0266i);
    }

    public static C0268k m1957r() {
        return C0268k.m1981m();
    }

    private void m1958u() {
        this.f1323f = Collections.emptyList();
        this.f1324g = 0;
        this.f1325h = 0;
        this.f1326i = false;
        this.f1327j = false;
    }

    public C0266i m1959b() {
        return f1319c;
    }

    public aq m1960c() {
        return f1318a;
    }

    public List m1961d() {
        return this.f1323f;
    }

    public int m1962e() {
        return this.f1323f.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0266i)) {
            return super.equals(obj);
        }
        C0266i c0266i = (C0266i) obj;
        boolean z = (m1961d().equals(c0266i.m1961d())) && m1963f() == c0266i.m1963f();
        if (m1963f()) {
            z = z && m1964g() == c0266i.m1964g();
        }
        z = z && m1965h() == c0266i.m1965h();
        if (m1965h()) {
            z = z && m1966i() == c0266i.m1966i();
        }
        z = z && m1968k() == c0266i.m1968k();
        if (m1968k()) {
            z = z && m1969l() == c0266i.m1969l();
        }
        z = z && m1970m() == c0266i.m1970m();
        return m1970m() ? z && m1974q() == c0266i.m1974q() : z;
    }

    public boolean m1963f() {
        return (this.f1322e & 1) == 1;
    }

    public int m1964g() {
        return this.f1324g;
    }

    public boolean m1965h() {
        return (this.f1322e & 2) == 2;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = C0266i.class.hashCode() + 779;
        if (m1962e() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + m1961d().hashCode();
        }
        if (m1963f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m1964g();
        }
        if (m1965h()) {
            hashCode = (((hashCode * 37) + 4) * 53) + m1966i();
        }
        if (m1968k()) {
            hashCode = (((hashCode * 37) + 6) * 53) + ac.m4554a(m1969l());
        }
        if (m1970m()) {
            hashCode = (((hashCode * 37) + 1) * 53) + ac.m4554a(m1974q());
        }
        hashCode = (hashCode * 29) + this.f1321d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public int m1966i() {
        return this.f1325h;
    }

    public final boolean m1967j() {
        byte b = this.f1328k;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            if (m1963f()) {
                this.f1328k = (byte) 1;
                return true;
            }
            this.f1328k = (byte) 0;
            return false;
        }
    }

    public boolean m1968k() {
        return (this.f1322e & 4) == 4;
    }

    public boolean m1969l() {
        return this.f1326i;
    }

    public boolean m1970m() {
        return (this.f1322e & 8) == 8;
    }

    public /* synthetic */ an m1971n() {
        return m1976t();
    }

    public /* synthetic */ an m1972o() {
        return m1975s();
    }

    public /* synthetic */ am m1973p() {
        return m1959b();
    }

    public boolean m1974q() {
        return this.f1327j;
    }

    public C0268k m1975s() {
        return C0266i.m1957r();
    }

    public C0268k m1976t() {
        return C0266i.m1949a(this);
    }
}
