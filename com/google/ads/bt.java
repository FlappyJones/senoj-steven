package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.p008a.C0162a;
import com.google.ads.p008a.C0184w;
import com.google.ads.p008a.ac;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.af;

public class bt extends aa {
    public final ad f1094a;
    public final ad f1095b;
    public final af f1096c;
    public final ad f1097d;
    public final ad f1098e;
    public final ad f1099f;
    public final ad f1100g;
    public final ad f1101h;
    public final ad f1102i;
    public final ad f1103j;
    public final ad f1104k;
    public final ae f1105l;
    public final ae f1106m;
    public final ae f1107n;
    public final ae f1108o;
    public final ae f1109p;
    public final ae f1110q;
    public final ae f1111r;
    public final ae f1112s;
    public final ae f1113t;

    public bt(br brVar, C0160a c0160a, AdView adView, C0210i c0210i, String str, Activity activity, Context context, ViewGroup viewGroup, ac acVar, C0184w c0184w) {
        Object obj = null;
        this.f1105l = new ae(this, "currentAd", null);
        this.f1106m = new ae(this, "nextAd", null);
        this.f1108o = new ae(this, "adListener");
        this.f1109p = new ae(this, "appEventListener");
        this.f1110q = new ae(this, "swipeableEventListener");
        this.f1111r = new ae(this, "spamSignals", null);
        this.f1112s = new ae(this, "spamSignalsUtil", null);
        this.f1113t = new ae(this, "usesManualImpressions", Boolean.valueOf(false));
        this.f1097d = new ad(this, "appState", brVar);
        this.f1094a = new ad(this, "ad", c0160a);
        this.f1103j = new ad(this, "adView", adView);
        this.f1100g = new ad(this, "adType", acVar);
        this.f1101h = new ad(this, "adUnitId", str);
        this.f1096c = new af(this, "activity", activity);
        this.f1104k = new ad(this, "interstitialAd", c0210i);
        this.f1102i = new ad(this, "bannerContainer", viewGroup);
        this.f1099f = new ad(this, "applicationContext", context);
        this.f1107n = new ae(this, "adSizes", null);
        this.f1095b = new ad(this, "adManager", c0184w);
        if (acVar != null && acVar.m1421b()) {
            obj = new C0162a(this);
        }
        this.f1098e = new ad(this, "activationOverlay", obj);
    }

    public boolean m1725a() {
        return !m1726b();
    }

    public boolean m1726b() {
        return ((ac) this.f1100g.m1816a()).m1419a();
    }
}
