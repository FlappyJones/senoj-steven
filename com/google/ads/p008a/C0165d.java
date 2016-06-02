package com.google.ads.p008a;

import android.os.Handler;
import com.google.ads.br;
import com.google.ads.util.C0229g;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.a.d */
class C0165d implements Runnable {
    private final WeakReference f855a;

    public C0165d(C0164c c0164c) {
        this.f855a = new WeakReference(c0164c);
    }

    public void m1443a() {
        ((Handler) br.m1724a().f1078c.m1816a()).postDelayed(this, 250);
    }

    public void run() {
        C0164c c0164c = (C0164c) this.f855a.get();
        if (c0164c == null) {
            C0229g.m1840d("The video must be gone, so cancelling the timeupdate task.");
            return;
        }
        c0164c.m1442f();
        ((Handler) br.m1724a().f1078c.m1816a()).postDelayed(this, 250);
    }
}
