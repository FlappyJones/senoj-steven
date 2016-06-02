package com.google.ads.util;

public abstract class ac {
    protected Object f1250a;
    protected final String f1251b;
    final /* synthetic */ aa f1252c;

    private ac(aa aaVar, String str) {
        this(aaVar, str, null);
    }

    private ac(aa aaVar, String str, Object obj) {
        this.f1252c = aaVar;
        this.f1251b = str;
        aaVar.m1723a(this);
        this.f1250a = obj;
    }

    public String toString() {
        return this.f1252c.toString() + "." + this.f1251b + " = " + this.f1250a;
    }
}
