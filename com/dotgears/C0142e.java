package com.dotgears;

/* renamed from: com.dotgears.e */
public class C0142e extends C0141q {
    public C0142e() {
        m1216a("blink", 10, 10, 4, 4);
        int[] iArr = new int[5];
        iArr[1] = 1;
        iArr[2] = 2;
        iArr[3] = 1;
        m1213a(0, "blink", iArr, 5, 10, false);
        this.m = false;
        this.n = false;
        m1214a(0, true);
    }

    public void m1217a(float f) {
        if (this.m) {
            super.m1211a(f);
            if (this.j != null && this.j.f557a) {
                this.m = false;
                this.n = false;
            }
        }
    }

    public void m1218a(int i, int i2) {
        super.m1212a(i, i2);
        m1214a(0, true);
    }

    public void m1219a(C0147g c0147g) {
        if (this.n) {
            super.m1215a(c0147g);
        }
    }
}
