package com.google.ads.util;

import java.lang.ref.WeakReference;

public final class af extends ac {
    final /* synthetic */ aa f1256d;

    public af(aa aaVar, String str, Object obj) {
        this.f1256d = aaVar;
        super(str, new WeakReference(obj), null);
    }

    public Object m1819a() {
        return ((WeakReference) this.a).get();
    }

    public String toString() {
        return this.f1256d.toString() + "." + this.b + " = " + m1819a() + " (?)";
    }
}
