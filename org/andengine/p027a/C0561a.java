package org.andengine.p027a;

/* renamed from: org.andengine.a.a */
public abstract class C0561a implements C0560c {
    protected float f2415a;
    protected float f2416b;
    private final C0563d f2417c;
    private boolean f2418d;

    public C0561a(C0563d c0563d) {
        this.f2415a = 1.0f;
        this.f2416b = 1.0f;
        this.f2417c = c0563d;
    }

    protected C0563d m4858a() {
        m4864g();
        return this.f2417c;
    }

    protected float m4859b() {
        m4864g();
        return this.f2417c.m4867a();
    }

    protected abstract void m4860c();

    public void m4861d() {
        m4864g();
    }

    public void m4862e() {
        m4864g();
    }

    public void m4863f() {
        m4864g();
        this.f2418d = true;
    }

    protected void m4864g() {
        if (this.f2418d) {
            m4860c();
        }
    }
}
