package com.google.tagmanager.p014a;

import com.google.android.gms.C0338e;
import java.io.Serializable;

/* renamed from: com.google.tagmanager.a.t */
public abstract class C0255t extends C0254a implements Serializable {
    protected C0255t() {
    }

    protected C0255t(C0261v c0261v) {
    }

    private static boolean m1871b(C0528q c0528q, am amVar, C0522k c0522k, C0524m c0524m, C0526o c0526o, int i) {
        boolean z;
        boolean z2;
        int a = bk.m4695a(i);
        aa a2 = c0526o.m4776a(amVar, bk.m4697b(i));
        if (a2 == null) {
            z = false;
            z2 = true;
        } else if (a == C0528q.m4777a(a2.f2209b.m4799a(), false)) {
            z = false;
            z2 = false;
        } else if (a2.f2209b.f2353d && a2.f2209b.f2352c.m4700c() && a == C0528q.m4777a(a2.f2209b.m4799a(), true)) {
            z = true;
            z2 = false;
        } else {
            z = false;
            z2 = true;
        }
        if (z2) {
            return c0522k.m4728a(i, c0524m);
        }
        if (z) {
            a = c0522k.m4731c(c0522k.m4750s());
            if (a2.f2209b.m4799a() == bm.ENUM) {
                while (c0522k.m4754w() > 0) {
                    ad b = a2.f2209b.m4803e().m1944b(c0522k.m4745n());
                    if (b == null) {
                        return true;
                    }
                    c0528q.m4787b(a2.f2209b, a2.m4541a(b));
                }
            } else {
                while (c0522k.m4754w() > 0) {
                    c0528q.m4787b(a2.f2209b, C0528q.m4779a(c0522k, a2.f2209b.m4799a(), false));
                }
            }
            c0522k.m4733d(a);
        } else {
            Object h;
            switch (C0531u.f2349a[a2.f2209b.m4800b().ordinal()]) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    an n;
                    if (!a2.f2209b.m4801c()) {
                        am amVar2 = (am) c0528q.m4784a(a2.f2209b);
                        if (amVar2 != null) {
                            n = amVar2.m1867n();
                            if (n == null) {
                                n = a2.m4542b().m1868o();
                            }
                            if (a2.f2209b.m4799a() != bm.GROUP) {
                                c0522k.m4725a(a2.m4540a(), n, c0526o);
                            } else {
                                c0522k.m4726a(n, c0526o);
                            }
                            h = n.m1908h();
                            break;
                        }
                    }
                    n = null;
                    if (n == null) {
                        n = a2.m4542b().m1868o();
                    }
                    if (a2.f2209b.m4799a() != bm.GROUP) {
                        c0522k.m4726a(n, c0526o);
                    } else {
                        c0522k.m4725a(a2.m4540a(), n, c0526o);
                    }
                    h = n.m1908h();
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    int n2 = c0522k.m4745n();
                    h = a2.f2209b.m4803e().m1944b(n2);
                    if (h == null) {
                        c0524m.m4772d(i);
                        c0524m.m4767b(n2);
                        return true;
                    }
                    break;
                default:
                    h = C0528q.m4779a(c0522k, a2.f2209b.m4799a(), false);
                    break;
            }
            if (a2.f2209b.m4801c()) {
                c0528q.m4787b(a2.f2209b, a2.m4541a(h));
            } else {
                c0528q.m4786a(a2.f2209b, a2.m4541a(h));
            }
        }
        return true;
    }

    protected void m1872R() {
    }

    protected boolean m1873a(C0522k c0522k, C0524m c0524m, C0526o c0526o, int i) {
        return c0522k.m4728a(i, c0524m);
    }

    public aq m1874c() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
}
