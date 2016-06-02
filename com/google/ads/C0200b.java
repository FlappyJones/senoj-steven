package com.google.ads;

import android.app.Activity;
import android.content.Intent;
import com.google.ads.p008a.C0184w;
import com.google.ads.p008a.C0185x;
import com.google.ads.util.C0229g;

/* renamed from: com.google.ads.b */
public class C0200b {
    public void m1669a(C0184w c0184w, C0185x c0185x) {
        synchronized (AdActivity.f774b) {
            if (AdActivity.f776d == null) {
                AdActivity.f776d = c0184w;
            } else if (AdActivity.f776d != c0184w) {
                C0229g.m1836b("Tried to launch a new AdActivity with a different AdManager.");
                return;
            }
            Activity activity = (Activity) c0184w.m1527h().f1096c.m1819a();
            if (activity == null) {
                C0229g.m1842e("activity was null while launching an AdActivity.");
                return;
            }
            Intent intent = new Intent(activity.getApplicationContext(), AdActivity.class);
            intent.putExtra("com.google.ads.AdOpener", c0185x.m1547a());
            try {
                C0229g.m1832a("Launching AdActivity.");
                activity.startActivity(intent);
            } catch (Throwable e) {
                C0229g.m1837b("Activity not found.", e);
            }
        }
    }

    public boolean m1670a() {
        boolean z;
        synchronized (AdActivity.f774b) {
            z = AdActivity.f777e != null;
        }
        return z;
    }

    public boolean m1671b() {
        boolean z;
        synchronized (AdActivity.f774b) {
            z = AdActivity.f775c != null;
        }
        return z;
    }
}
