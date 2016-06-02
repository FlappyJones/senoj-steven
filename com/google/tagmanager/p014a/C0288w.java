package com.google.tagmanager.p014a;

/* renamed from: com.google.tagmanager.a.w */
public abstract class C0288w extends C0261v implements C0283y {
    private C0528q f1435a;
    private boolean f1436b;

    protected C0288w() {
        this.f1435a = C0528q.m4782b();
    }

    private void m2320a() {
        if (!this.f1436b) {
            this.f1435a = this.f1435a.m4789d();
            this.f1436b = true;
        }
    }

    private C0528q m2321b() {
        this.f1435a.m4788c();
        this.f1436b = false;
        return this.f1435a;
    }

    protected final void m2322a(C0284x c0284x) {
        m2320a();
        this.f1435a.m4785a(c0284x.f1415a);
    }

    public /* synthetic */ Object clone() {
        return m2325o();
    }

    public /* synthetic */ C0261v m2323f() {
        return m2325o();
    }

    public /* synthetic */ C0260b m2324g() {
        return m2325o();
    }

    public C0288w m2325o() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean m2326s() {
        return this.f1435a.m4790e();
    }
}
