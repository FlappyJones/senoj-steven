package com.dotgears;

/* renamed from: com.dotgears.l */
public class C0155l {
    public int f725a;
    public int f726b;
    private C0152i[] f727c;

    public C0155l(String str) {
        this.f727c = C0147g.f620D.m1246a(str);
        this.f725a = this.f727c[0].f683b;
        this.f726b = this.f727c[0].f684c;
    }

    public void m1320a(C0147g c0147g, int i, int i2, int i3, boolean z, int i4) {
        int i5 = i2 - this.f725a;
        boolean z2 = true;
        int i6 = i;
        while (i4 > 0) {
            int i7;
            if (i6 > 0 || r0) {
                c0147g.m1235a(this.f727c[i6 % 10].f689i, i5, i3, 1.0f, 1.0f, 1.0f);
                i5 -= this.f725a;
                i7 = i6 / 10;
                z2 = z;
            } else {
                i7 = i6;
            }
            i4--;
            i6 = i7;
        }
    }
}
