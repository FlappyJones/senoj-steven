package org.andengine.opengl.p067c.p073c;

import org.andengine.opengl.p067c.C0687a;

/* renamed from: org.andengine.opengl.c.c.c */
public class C0698c extends C0697a {
    protected float f2754b;
    protected float f2755c;
    protected float f2756d;
    protected float f2757e;
    protected float f2758f;
    protected float f2759g;
    protected float f2760h;
    protected float f2761i;
    protected final float f2762j;
    protected final boolean f2763k;

    public C0698c(C0687a c0687a, float f, float f2, float f3, float f4, float f5, boolean z) {
        super(c0687a);
        this.f2754b = f;
        this.f2755c = f2;
        if (z) {
            this.f2763k = true;
            this.f2756d = f4;
            this.f2757e = f3;
        } else {
            this.f2763k = false;
            this.f2756d = f3;
            this.f2757e = f4;
        }
        this.f2762j = f5;
        m5359l();
    }

    public C0698c(C0687a c0687a, float f, float f2, float f3, float f4, boolean z) {
        this(c0687a, f, f2, f3, f4, 1.0f, z);
    }

    public void m5348a(float f, float f2, float f3, float f4) {
        this.f2758f = f;
        this.f2760h = f2;
        this.f2759g = f3;
        this.f2761i = f4;
    }

    public float m5349b() {
        return this.f2763k ? this.f2757e * this.f2762j : this.f2756d * this.f2762j;
    }

    public float m5350c() {
        return this.f2763k ? this.f2756d * this.f2762j : this.f2757e * this.f2762j;
    }

    public float m5351d() {
        return this.f2758f;
    }

    public float m5352e() {
        return this.f2759g;
    }

    public float m5353f() {
        return this.f2760h;
    }

    public float m5354g() {
        return this.f2761i;
    }

    public boolean m5355h() {
        return this.f2763k;
    }

    public C0698c m5356i() {
        return this.f2763k ? new C0698c(this.a, this.f2754b, this.f2755c, this.f2757e, this.f2756d, this.f2762j, this.f2763k) : new C0698c(this.a, this.f2754b, this.f2755c, this.f2756d, this.f2757e, this.f2762j, this.f2763k);
    }

    public float m5357j() {
        return this.f2754b;
    }

    public float m5358k() {
        return this.f2755c;
    }

    public void m5359l() {
        C0687a c0687a = this.a;
        float a = (float) c0687a.m5295a();
        float b = (float) c0687a.m5297b();
        float j = m5357j();
        float k = m5358k();
        this.f2758f = j / a;
        this.f2759g = (j + this.f2756d) / a;
        this.f2760h = k / b;
        this.f2761i = (this.f2757e + k) / b;
    }
}
