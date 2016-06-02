package com.google.android.gms.p019b;

import java.util.Iterator;

/* renamed from: com.google.android.gms.b.c */
class C0307c implements C0306i {
    final /* synthetic */ C0305b f1498a;

    C0307c(C0305b c0305b) {
        this.f1498a = c0305b;
    }

    public void m2396a(C0304a c0304a) {
        this.f1498a.f1494a = c0304a;
        Iterator it = this.f1498a.f1496c.iterator();
        while (it.hasNext()) {
            ((C0308d) it.next()).m2397a(this.f1498a.f1494a);
        }
        this.f1498a.f1496c.clear();
        this.f1498a.f1495b = null;
    }
}
