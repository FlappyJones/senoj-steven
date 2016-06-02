package org.andengine.p005d.p041h;

import org.andengine.p003b.p004b.C0132c;
import org.andengine.p005d.p037a.p038a.C0577b;

/* renamed from: org.andengine.d.h.c */
public class C0595c extends C0577b implements C0132c {
    private final Object f2522a;

    public boolean m4997a(C0641a c0641a) {
        if (c0641a != null) {
            return super.add(c0641a);
        }
        throw new IllegalArgumentException("Supplied " + C0641a.class.getSimpleName() + " must not be null.");
    }

    public void a_(float f) {
        int size = size();
        if (size > 0) {
            for (int i = size - 1; i >= 0; i--) {
                C0641a c0641a = (C0641a) get(i);
                c0641a.m5166a(f, this.f2522a);
                if (c0641a.m5167a() && c0641a.m5168b()) {
                    remove(i);
                }
            }
        }
    }

    public /* synthetic */ boolean add(Object obj) {
        return m4997a((C0641a) obj);
    }
}
