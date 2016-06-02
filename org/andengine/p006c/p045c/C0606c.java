package org.andengine.p006c.p045c;

import org.andengine.opengl.p064b.C0673g;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p005d.p049b.p055a.C0632c;

/* renamed from: org.andengine.c.c.c */
public abstract class C0606c extends C0605d implements C0604a {
    protected float f2530a;
    protected float f2531b;

    public C0606c(float f, float f2, float f3, float f4, C0673g c0673g) {
        super(f, f2, c0673g);
        this.f2530a = f3;
        this.f2531b = f4;
        m5018q();
        m5019r();
        m5020s();
    }

    public boolean m5013a(float f, float f2) {
        return C0632c.m5132a(this, f, f2);
    }

    public boolean m5014a(C0573a c0573a) {
        return !C0632c.m5131a(c0573a, this);
    }

    public float[] m5015h() {
        return a_(this.f2530a * 0.5f, this.f2531b * 0.5f);
    }

    public float m5016o() {
        return this.f2530a;
    }

    public float m5017p() {
        return this.f2531b;
    }

    public void m5018q() {
        this.y = this.f2530a * 0.5f;
        this.z = this.f2531b * 0.5f;
    }

    public void m5019r() {
        this.C = this.f2530a * 0.5f;
        this.D = this.f2531b * 0.5f;
    }

    public void m5020s() {
        this.G = this.f2530a * 0.5f;
        this.H = this.f2531b * 0.5f;
    }
}
