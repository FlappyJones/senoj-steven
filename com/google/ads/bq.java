package com.google.ads;

import com.google.ads.p008a.C0175n;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;

public final class bq extends aa {
    public final ad f1072a;
    public final ae f1073b;
    public final ae f1074c;

    public bq(bt btVar) {
        this.f1074c = new ae(this, "disableNativeScroll", Boolean.valueOf(false));
        this.f1072a = new ad(this, "slotState", btVar);
        this.f1073b = new ae(this, "adLoader", new C0175n(this));
    }
}
