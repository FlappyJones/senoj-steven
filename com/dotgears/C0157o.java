package com.dotgears;

/* renamed from: com.dotgears.o */
public class C0157o extends C0140m {
    public int f731a;
    public int f732b;
    public boolean f733c;
    public int f734d;
    public int f735e;
    public int f736f;
    public int f737g;
    public int f738h;
    public int f739i;
    public int f740j;
    public int f741k;
    public int f742l;
    private C0152i[] f743m;

    public C0157o() {
        this.f731a = 12;
        this.f732b = 14;
        this.f743m = C0147g.f620D.m1246a("number_context");
    }

    public void m1327a(float f) {
        if (this.F && this.f734d > 0) {
            this.f734d--;
            if (this.f737g < 2) {
                this.f741k += this.f737g;
                this.f739i++;
                if (this.f739i == 4) {
                    this.f739i = 0;
                    this.f737g += this.f738h;
                }
            }
            if (this.f734d <= 0) {
                this.F = false;
                this.G = false;
            }
        }
    }

    public void m1328a(C0147g c0147g) {
        if (this.G) {
            if (this.f733c) {
                c0147g.m1235a(this.f743m[10].f689i, this.f740j, this.f741k, 1.0f, 1.0f, 1.0f);
            }
            m1329a(c0147g, this.f735e, this.f740j + this.f742l, this.f741k, false, this.f736f);
        }
    }

    public void m1329a(C0147g c0147g, int i, int i2, int i3, boolean z, int i4) {
        int i5 = i2 - this.f731a;
        boolean z2 = true;
        int i6 = i;
        while (i4 > 0) {
            int i7;
            if (i6 > 0 || r0) {
                int i8 = i6 % 10;
                c0147g.m1235a(this.f743m[i8].f689i, i5, i3, 1.0f, 1.0f, 1.0f);
                i7 = i6 / 10;
                i5 = i8 != 1 ? i5 - (this.f731a - 2) : i5 - 4;
                z2 = z;
            } else {
                i7 = i6;
            }
            i4--;
            i6 = i7;
        }
    }
}
