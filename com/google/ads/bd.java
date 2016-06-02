package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import com.google.ads.p008a.C0184w;
import com.google.ads.p008a.ac;
import com.google.ads.util.C0227e;
import com.google.ads.util.C0229g;
import java.util.HashMap;
import java.util.List;

public class bd {
    private final C0184w f1016a;
    private bk f1017b;
    private final Object f1018c;
    private Thread f1019d;
    private final Object f1020e;
    private boolean f1021f;
    private final Object f1022g;

    protected bd() {
        this.f1017b = null;
        this.f1018c = new Object();
        this.f1019d = null;
        this.f1020e = new Object();
        this.f1021f = false;
        this.f1022g = new Object();
        this.f1016a = null;
    }

    public bd(C0184w c0184w) {
        this.f1017b = null;
        this.f1018c = new Object();
        this.f1019d = null;
        this.f1020e = new Object();
        this.f1021f = false;
        this.f1022g = new Object();
        C0227e.m1823a((Object) c0184w);
        this.f1016a = c0184w;
    }

    public static boolean m1691a(ba baVar, C0184w c0184w) {
        if (baVar.m1684j() == null) {
            return true;
        }
        if (!c0184w.m1527h().m1726b()) {
            C0208g c = ((ac) c0184w.m1527h().f1100g.m1816a()).m1422c();
            if (baVar.m1684j().m1419a()) {
                C0229g.m1842e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + c + ") in the ad-type field in the mediation UI.");
                return false;
            }
            C0208g c2 = baVar.m1684j().m1422c();
            if (c2 == c) {
                return true;
            }
            C0229g.m1842e("Mediation server returned ad size: '" + c2 + "', while the AdView was created with ad size: '" + c + "'. Using the ad-size passed to the AdView on creation.");
            return false;
        } else if (baVar.m1684j().m1419a()) {
            return true;
        } else {
            C0229g.m1842e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
            return false;
        }
    }

    private boolean m1693a(String str, Activity activity, C0201d c0201d, bh bhVar, HashMap hashMap, long j) {
        bk bkVar = new bk(this, (ac) this.f1016a.m1527h().f1100g.m1816a(), bhVar, str, c0201d, hashMap);
        synchronized (bkVar) {
            bkVar.m1709a(activity);
            while (!bkVar.m1712b() && j > 0) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bkVar.wait(j);
                    j -= SystemClock.elapsedRealtime() - elapsedRealtime;
                } catch (InterruptedException e) {
                    C0229g.m1832a("Interrupted while waiting for ad network to load ad using adapter class: " + str);
                }
            }
            this.f1016a.m1532m().m1389a(bkVar.m1714d());
            if (bkVar.m1712b() && bkVar.m1713c()) {
                ((Handler) br.m1724a().f1078c.m1816a()).post(new bg(this, bkVar, this.f1016a.m1527h().m1726b() ? null : bkVar.m1715e(), bhVar));
                return true;
            }
            if (!bkVar.m1712b()) {
                C0229g.m1832a("Timeout occurred in adapter class: " + bkVar.m1716f());
            }
            bkVar.m1708a();
            return false;
        }
    }

    private void m1695b(ba baVar, C0201d c0201d) {
        synchronized (this.f1020e) {
            C0227e.m1824a(Thread.currentThread(), this.f1019d);
        }
        List<C0212k> f = baVar.m1680f();
        long b = baVar.m1675a() ? (long) baVar.m1676b() : 10000;
        for (C0212k c0212k : f) {
            C0229g.m1832a("Looking to fetch ads from network: " + c0212k.m1771b());
            List<String> c = c0212k.m1772c();
            HashMap e = c0212k.m1774e();
            List d = c0212k.m1773d();
            String a = c0212k.m1770a();
            String b2 = c0212k.m1771b();
            String c2 = baVar.m1677c();
            if (d == null) {
                d = baVar.m1681g();
            }
            bh bhVar = new bh(a, b2, c2, d, baVar.m1682h(), baVar.m1683i());
            for (String b22 : c) {
                Activity activity = (Activity) this.f1016a.m1527h().f1096c.m1819a();
                if (activity == null) {
                    C0229g.m1832a("Activity is null while mediating.  Terminating mediation thread.");
                    return;
                }
                this.f1016a.m1532m().m1392c();
                if (!m1693a(b22, activity, c0201d, bhVar, e, b)) {
                    if (m1696b()) {
                        C0229g.m1832a("GWController.destroy() called. Terminating mediation thread.");
                        return;
                    }
                }
                return;
            }
        }
        ((Handler) br.m1724a().f1078c.m1816a()).post(new bf(this, baVar));
    }

    private boolean m1696b() {
        boolean z;
        synchronized (this.f1022g) {
            z = this.f1021f;
        }
        return z;
    }

    private boolean m1697b(bk bkVar) {
        boolean z;
        synchronized (this.f1022g) {
            if (m1696b()) {
                bkVar.m1708a();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void m1698a(ba baVar, C0201d c0201d) {
        synchronized (this.f1020e) {
            if (m1700a()) {
                C0229g.m1838c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
                return;
            }
            if (baVar.m1678d()) {
                this.f1016a.m1502a((float) baVar.m1679e());
                if (!this.f1016a.m1537r()) {
                    this.f1016a.m1525f();
                }
            } else if (this.f1016a.m1537r()) {
                this.f1016a.m1524e();
            }
            m1691a(baVar, this.f1016a);
            this.f1019d = new Thread(new be(this, baVar, c0201d));
            this.f1019d.start();
        }
    }

    public void m1699a(bk bkVar) {
        synchronized (this.f1018c) {
            if (this.f1017b != bkVar) {
                if (this.f1017b != null) {
                    this.f1017b.m1708a();
                }
                this.f1017b = bkVar;
            }
        }
    }

    public boolean m1700a() {
        boolean z;
        synchronized (this.f1020e) {
            z = this.f1019d != null;
        }
        return z;
    }
}
