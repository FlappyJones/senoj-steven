package com.google.ads;

import com.google.ads.util.C0227e;
import com.google.ads.util.C0229g;

class bl implements Runnable {
    final /* synthetic */ bk f1058a;

    bl(bk bkVar) {
        this.f1058a = bkVar;
    }

    public void run() {
        if (this.f1058a.m1718h()) {
            C0227e.m1823a(this.f1058a.f1051g);
            try {
                this.f1058a.f1051g.m1660a();
                C0229g.m1832a("Called destroy() for adapter with class: " + this.f1058a.f1051g.getClass().getName());
            } catch (Throwable th) {
                C0229g.m1837b("Error while destroying adapter (" + this.f1058a.m1716f() + "):", th);
            }
        }
    }
}
