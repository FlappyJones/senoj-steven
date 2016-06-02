package org.andengine.p003b.p032a;

import org.andengine.input.p034a.C0650a;
import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.p004b.C0132c;
import org.andengine.p003b.p004b.C0579d;
import org.andengine.p003b.p032a.p033a.C0572a;
import org.andengine.p005d.p058g.C0640a;
import org.andengine.p006c.C0134c;

/* renamed from: org.andengine.b.a.a */
public class C0573a implements C0132c {
    static final float[] f2431a;
    protected float f2432b;
    protected float f2433c;
    protected float f2434d;
    protected float f2435e;
    protected float f2436f;
    protected float f2437g;
    protected int f2438h;
    protected int f2439i;
    protected int f2440j;
    protected int f2441k;
    protected boolean f2442l;
    protected C0579d f2443m;
    private float f2444n;
    private float f2445o;
    private C0572a f2446p;
    private C0134c f2447q;

    static {
        f2431a = new float[2];
    }

    public C0573a(float f, float f2, float f3, float f4) {
        this.f2444n = -1.0f;
        this.f2445o = 1.0f;
        this.f2436f = 0.0f;
        this.f2437g = 0.0f;
        m4901a(f, f2, f + f3, f2 + f4);
    }

    private void m4893a(C0650a c0650a, float f, float f2) {
        float a = m4899a();
        float b = m4907b();
        float c = m4911c();
        c0650a.m5190a(a + ((b - a) * f), ((m4914d() - c) * f2) + c);
    }

    private static void m4894a(C0714e c0714e, float f, float f2, float f3) {
        c0714e.m5416b(f, f2, 0.0f);
        c0714e.m5417b(f3, 0.0f, 0.0f, 1.0f);
        c0714e.m5416b(-f, -f2, 0.0f);
    }

    private void m4895e(C0650a c0650a) {
        float f = this.f2436f;
        if (f != 0.0f) {
            f2431a[0] = c0650a.m5191b();
            f2431a[1] = c0650a.m5193c();
            C0640a.m5164a(f2431a, -f, m4919g(), m4920h());
            c0650a.m5190a(f2431a[0], f2431a[1]);
        }
    }

    private void m4896f(C0650a c0650a) {
        float f = this.f2436f;
        if (f != 0.0f) {
            f2431a[0] = c0650a.m5191b();
            f2431a[1] = c0650a.m5193c();
            C0640a.m5165b(f2431a, f, m4919g(), m4920h());
            c0650a.m5190a(f2431a[0], f2431a[1]);
        }
    }

    private void m4897g(C0650a c0650a) {
        float f = -this.f2437g;
        if (f != 0.0f) {
            f2431a[0] = c0650a.m5191b();
            f2431a[1] = c0650a.m5193c();
            C0640a.m5164a(f2431a, f, (this.f2433c - this.f2432b) * 0.5f, (this.f2435e - this.f2434d) * 0.5f);
            c0650a.m5190a(f2431a[0], f2431a[1]);
        }
    }

    private void m4898h(C0650a c0650a) {
        float f = -this.f2437g;
        if (f != 0.0f) {
            f2431a[0] = c0650a.m5191b();
            f2431a[1] = c0650a.m5193c();
            C0640a.m5165b(f2431a, f, (this.f2433c - this.f2432b) * 0.5f, (this.f2435e - this.f2434d) * 0.5f);
            c0650a.m5190a(f2431a[0], f2431a[1]);
        }
    }

    public float m4899a() {
        return this.f2432b;
    }

    public void m4900a(float f, float f2) {
        float g = f - m4919g();
        float h = f2 - m4920h();
        this.f2432b += g;
        this.f2433c = g + this.f2433c;
        this.f2434d += h;
        this.f2435e += h;
    }

    public void m4901a(float f, float f2, float f3, float f4) {
        this.f2432b = f;
        this.f2433c = f3;
        this.f2434d = f2;
        this.f2435e = f4;
    }

    public void m4902a(int i, int i2, int i3, int i4) {
        if (this.f2441k == 0 && this.f2440j == 0) {
            m4908b(i, i2, i3, i4);
        } else if (this.f2440j != i3 || this.f2441k != i4) {
            m4903a(this.f2438h, this.f2439i, this.f2440j, this.f2441k, i, i2, i3, i4);
        }
    }

    protected void m4903a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f2442l) {
            float f = ((float) i7) / ((float) i3);
            float f2 = ((float) i8) / ((float) i4);
            float g = m4919g();
            float h = m4920h();
            f = (f * m4917e()) * 0.5f;
            f2 = (f2 * m4918f()) * 0.5f;
            m4901a(g - f, h - f2, f + g, f2 + h);
        }
        this.f2438h = i5;
        this.f2439i = i6;
        this.f2440j = i7;
        this.f2441k = i8;
    }

    public void m4904a(C0650a c0650a) {
        m4896f(c0650a);
        m4912c(c0650a);
        m4897g(c0650a);
    }

    public void m4905a(C0650a c0650a, int i, int i2) {
        float b = c0650a.m5191b();
        float c = c0650a.m5193c();
        float f = this.f2436f;
        if (f == 0.0f) {
            f = b / ((float) i);
            b = c / ((float) i2);
        } else if (f == 180.0f) {
            f = 1.0f - (b / ((float) i));
            b = 1.0f - (c / ((float) i2));
        } else {
            f2431a[0] = b;
            f2431a[1] = c;
            C0640a.m5164a(f2431a, f, (float) (i >> 1), (float) (i2 >> 1));
            f = f2431a[0] / ((float) i);
            b = f2431a[1] / ((float) i2);
        }
        m4893a(c0650a, f, b);
    }

    public void m4906a(C0714e c0714e) {
        if (this.f2446p != null) {
            this.f2446p.m1163a(c0714e, this);
        }
    }

    public void a_(float f) {
        if (this.f2443m != null) {
            this.f2443m.a_(f);
        }
        if (this.f2446p != null) {
            this.f2446p.a_(f);
        }
        m4924l();
    }

    public float m4907b() {
        return this.f2433c;
    }

    protected void m4908b(int i, int i2, int i3, int i4) {
        this.f2438h = i;
        this.f2439i = i2;
        this.f2440j = i3;
        this.f2441k = i4;
    }

    public void m4909b(C0650a c0650a) {
        m4898h(c0650a);
        m4915d(c0650a);
        m4895e(c0650a);
    }

    public void m4910b(C0714e c0714e) {
        c0714e.m5408a(m4899a(), m4907b(), m4914d(), m4911c(), this.f2444n, this.f2445o);
        float f = this.f2436f;
        if (f != 0.0f) {
            C0573a.m4894a(c0714e, m4919g(), m4920h(), f);
        }
    }

    public float m4911c() {
        return this.f2434d;
    }

    protected void m4912c(C0650a c0650a) {
        c0650a.m5192b(-this.f2432b, -this.f2434d);
    }

    public void m4913c(C0714e c0714e) {
        float e = m4917e();
        float f = m4918f();
        c0714e.m5408a(0.0f, e, f, 0.0f, this.f2444n, this.f2445o);
        float f2 = this.f2436f;
        if (f2 != 0.0f) {
            C0573a.m4894a(c0714e, e * 0.5f, f * 0.5f, f2);
        }
    }

    public float m4914d() {
        return this.f2435e;
    }

    protected void m4915d(C0650a c0650a) {
        c0650a.m5192b(this.f2432b, this.f2434d);
    }

    public void m4916d(C0714e c0714e) {
        float e = m4917e();
        float f = m4918f();
        c0714e.m5408a(0.0f, e, f, 0.0f, this.f2444n, this.f2445o);
        float f2 = this.f2437g;
        if (f2 != 0.0f) {
            C0573a.m4894a(c0714e, e * 0.5f, f * 0.5f, f2);
        }
    }

    public float m4917e() {
        return this.f2433c - this.f2432b;
    }

    public float m4918f() {
        return this.f2435e - this.f2434d;
    }

    public float m4919g() {
        return (this.f2432b + this.f2433c) * 0.5f;
    }

    public float m4920h() {
        return (this.f2434d + this.f2435e) * 0.5f;
    }

    public C0572a m4921i() {
        return this.f2446p;
    }

    public boolean m4922j() {
        return this.f2446p != null;
    }

    public float m4923k() {
        return this.f2436f;
    }

    public void m4924l() {
        if (this.f2447q != null) {
            float[] h = this.f2447q.m1153h();
            m4900a(h[0], h[1]);
        }
    }
}
