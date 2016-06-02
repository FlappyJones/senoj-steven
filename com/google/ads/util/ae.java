package com.google.ads.util;

public final class ae extends ac {
    final /* synthetic */ aa f1254d;
    private boolean f1255e;

    public ae(aa aaVar, String str) {
        this.f1254d = aaVar;
        super(str, null);
        this.f1255e = false;
        this.f1255e = false;
    }

    public ae(aa aaVar, String str, Object obj) {
        this.f1254d = aaVar;
        super(str, obj, null);
        this.f1255e = false;
        this.f1255e = false;
    }

    public synchronized Object m1817a() {
        return this.a;
    }

    public synchronized void m1818a(Object obj) {
        C0229g.m1840d("State changed - " + this.f1254d.toString() + "." + this.b + ": '" + obj + "' <-- '" + this.a + "'.");
        this.a = obj;
        this.f1255e = true;
    }

    public String toString() {
        return super.toString() + (this.f1255e ? " (*)" : "");
    }
}
