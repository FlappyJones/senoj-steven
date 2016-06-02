package com.dotgears;

/* renamed from: com.dotgears.k */
public class C0154k extends C0140m {
    public int f718a;
    public int f719b;
    public int f720c;
    public int f721d;
    public int f722e;
    public int f723f;
    private C0152i[] f724g;

    public C0154k() {
        this.f724g = C0147g.f620D.m1246a("medals");
    }

    public void m1317a(float f) {
        if (this.F && this.f723f > 0) {
            this.f723f--;
            if (this.f723f <= 0) {
                this.f723f = 30;
                C0147g.f620D.m1250b((this.f718a - 3) + C0153j.m1270a(0, this.f720c + 6), (this.f719b - 3) + C0153j.m1270a(0, this.f721d + 6));
            }
        }
    }

    void m1318a(int i) {
        this.f718a = 0;
        this.f719b = 0;
        this.f720c = 44;
        this.f721d = 44;
        this.f722e = i;
        this.f723f = 30;
        this.F = true;
        this.G = true;
    }

    public void m1319a(C0147g c0147g) {
        if (this.G) {
            c0147g.m1235a(this.f724g[this.f722e].f689i, this.f718a, this.f719b, 1.0f, 1.0f, 1.0f);
        }
    }
}
