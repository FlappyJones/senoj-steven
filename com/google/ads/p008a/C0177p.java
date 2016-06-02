package com.google.ads.p008a;

import com.google.ads.ba;
import com.google.ads.bt;

/* renamed from: com.google.ads.a.p */
class C0177p implements Runnable {
    final /* synthetic */ ba f889a;
    final /* synthetic */ C0175n f890b;

    C0177p(C0175n c0175n, ba baVar) {
        this.f890b = c0175n;
        this.f889a = baVar;
    }

    public void run() {
        if (this.f890b.f872i != null) {
            this.f890b.f872i.stopLoading();
            this.f890b.f872i.destroy();
        }
        ((C0184w) ((bt) this.f898a.f873j.f1072a.m1816a()).f1095b.m1816a()).m1512a(this.f890b.f877n);
        if (this.f890b.f878o != null) {
            ((ac) ((bt) this.f890b.f873j.f1072a.m1816a()).f1100g.m1816a()).m1420b(this.f890b.f878o);
        }
        ((C0184w) ((bt) this.f890b.f873j.f1072a.m1816a()).f1095b.m1816a()).m1508a(this.f889a);
    }
}
