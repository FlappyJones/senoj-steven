package com.google.tagmanager.p014a;

/* renamed from: com.google.tagmanager.a.v */
public abstract class C0261v extends C0260b {
    private C0516h f1307a;

    protected C0261v() {
        this.f1307a = C0516h.f2222a;
    }

    public final C0261v m1913a(C0516h c0516h) {
        this.f1307a = c0516h;
        return this;
    }

    public abstract C0261v m1914a(C0255t c0255t);

    public /* synthetic */ Object clone() {
        return m1916f();
    }

    public abstract C0255t m1915e();

    public C0261v m1916f() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public /* synthetic */ C0260b m1917g() {
        return m1916f();
    }

    public /* synthetic */ am m1918p() {
        return m1915e();
    }

    public final C0516h m1919r() {
        return this.f1307a;
    }
}
