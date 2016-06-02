package org.andengine.p006c;

import java.util.Comparator;
import java.util.List;
import org.andengine.p005d.p049b.p050b.C0614a;

/* renamed from: org.andengine.c.d */
public class C0615d extends C0614a {
    private static C0615d f2548a;
    private final Comparator f2549b;

    private C0615d() {
        this.f2549b = new C0616e(this);
    }

    public static C0615d m5067a() {
        if (f2548a == null) {
            f2548a = new C0615d();
        }
        return f2548a;
    }

    public void m5068a(List list) {
        m5065a(list, this.f2549b);
    }
}
