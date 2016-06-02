package com.google.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;

public class br extends aa {
    private static final br f1075d;
    public final ae f1076a;
    public final ad f1077b;
    public final ad f1078c;

    static {
        f1075d = new br();
    }

    private br() {
        this.f1076a = new ae(this, "marketPackages", null);
        this.f1077b = new ad(this, "constants", new bs());
        this.f1078c = new ad(this, "uiHandler", new Handler(Looper.getMainLooper()));
    }

    public static br m1724a() {
        return f1075d;
    }
}
