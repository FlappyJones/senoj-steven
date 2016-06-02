package com.google.ads;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class bc {
    private ba f1014a;
    private long f1015b;

    public bc() {
        this.f1014a = null;
        this.f1015b = -1;
    }

    public void m1685a(ba baVar, int i) {
        this.f1014a = baVar;
        this.f1015b = TimeUnit.MILLISECONDS.convert((long) i, TimeUnit.SECONDS) + SystemClock.elapsedRealtime();
    }

    public boolean m1686a() {
        return this.f1014a != null && SystemClock.elapsedRealtime() < this.f1015b;
    }

    public ba m1687b() {
        return this.f1014a;
    }
}
