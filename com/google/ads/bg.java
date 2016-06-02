package com.google.ads;

import android.view.View;
import com.google.ads.util.C0229g;

class bg implements Runnable {
    final /* synthetic */ bk f1028a;
    final /* synthetic */ View f1029b;
    final /* synthetic */ bh f1030c;
    final /* synthetic */ bd f1031d;

    bg(bd bdVar, bk bkVar, View view, bh bhVar) {
        this.f1031d = bdVar;
        this.f1028a = bkVar;
        this.f1029b = view;
        this.f1030c = bhVar;
    }

    public void run() {
        if (this.f1031d.m1697b(this.f1028a)) {
            C0229g.m1832a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
        } else {
            this.f1031d.f1016a.m1507a(this.f1029b, this.f1028a, this.f1030c, false);
        }
    }
}
