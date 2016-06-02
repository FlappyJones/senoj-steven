package com.google.ads;

import android.app.Activity;
import com.google.ads.p009b.C0189j;
import com.google.ads.p009b.C0191a;
import com.google.ads.p009b.C0192b;
import com.google.ads.p009b.C0193c;
import com.google.ads.p009b.C0195e;
import com.google.ads.p009b.C0197g;
import com.google.ads.util.C0229g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class bm implements Runnable {
    private final bk f1059a;
    private final String f1060b;
    private final C0201d f1061c;
    private final HashMap f1062d;
    private final boolean f1063e;
    private final WeakReference f1064f;

    public bm(bk bkVar, Activity activity, String str, C0201d c0201d, HashMap hashMap) {
        this.f1059a = bkVar;
        this.f1060b = str;
        this.f1064f = new WeakReference(activity);
        this.f1061c = c0201d;
        this.f1062d = new HashMap(hashMap);
        this.f1063e = m1721a(this.f1062d);
    }

    private void m1719a(C0192b c0192b) {
        Activity activity = (Activity) this.f1064f.get();
        if (activity == null) {
            throw new bn("Activity became null while trying to instantiate adapter.");
        }
        C0197g c0197g;
        this.f1059a.m1710a(c0192b);
        Class c = c0192b.m1662c();
        if (c != null) {
            C0197g c0197g2 = (C0197g) c.newInstance();
            c0197g2.m1666a(this.f1062d);
            c0197g = c0197g2;
        } else {
            c0197g = null;
        }
        c = c0192b.m1661b();
        C0189j c0189j = c != null ? (C0189j) this.f1061c.m1735a(c) : null;
        C0191a c0191a = new C0191a(this.f1061c, activity, this.f1063e);
        if (this.f1059a.f1045a.m1419a()) {
            if (c0192b instanceof C0195e) {
                ((C0195e) c0192b).m1664a(new bp(this.f1059a), activity, c0197g, c0191a, c0189j);
            } else {
                throw new bn("Adapter " + this.f1060b + " doesn't support the MediationInterstitialAdapter" + " interface.");
            }
        } else if (c0192b instanceof C0193c) {
            ((C0193c) c0192b).m1663a(new bo(this.f1059a), activity, c0197g, this.f1059a.f1045a.m1422c(), c0191a, c0189j);
        } else {
            throw new bn("Adapter " + this.f1060b + " doesn't support the MediationBannerAdapter interface");
        }
        this.f1059a.m1717g();
    }

    private void m1720a(String str, Throwable th, bj bjVar) {
        C0229g.m1837b(str, th);
        this.f1059a.m1711a(false, bjVar);
    }

    private static boolean m1721a(Map map) {
        String str = (String) map.remove("gwhirl_share_location");
        if ("1".equals(str)) {
            return true;
        }
        if (!(str == null || "0".equals(str))) {
            C0229g.m1836b("Received an illegal value, '" + str + "', for the special share location parameter from mediation server" + " (expected '0' or '1'). Will not share the location.");
        }
        return false;
    }

    public void run() {
        try {
            C0229g.m1832a("Trying to instantiate: " + this.f1060b);
            m1719a((C0192b) bi.m1705a(this.f1060b, C0192b.class));
        } catch (Throwable e) {
            m1720a("Cannot find adapter class '" + this.f1060b + "'. Did you link the ad network's mediation adapter? Skipping ad network.", e, bj.NOT_FOUND);
        } catch (Throwable e2) {
            m1720a("Error while creating adapter and loading ad from ad network. Skipping ad network.", e2, bj.EXCEPTION);
        }
    }
}
