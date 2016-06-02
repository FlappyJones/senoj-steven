package org.andengine.p005d.p041h;

import java.util.Comparator;

/* renamed from: org.andengine.d.h.b */
class C0642b implements Comparator {
    C0642b() {
    }

    public int m5170a(C0641a c0641a, C0641a c0641a2) {
        float c = c0641a.m5169c();
        float c2 = c0641a2.m5169c();
        return c < c2 ? 1 : c > c2 ? -1 : 0;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m5170a((C0641a) obj, (C0641a) obj2);
    }
}
