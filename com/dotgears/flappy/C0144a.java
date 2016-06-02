package com.dotgears.flappy;

import com.dotgears.C0141q;
import com.dotgears.C0142e;
import com.dotgears.C0147g;
import com.dotgears.C0152i;
import com.dotgears.C0153j;

/* renamed from: com.dotgears.flappy.a */
public class C0144a extends C0141q {
    private C0142e f595A;
    private int f596B;
    float f597q;
    float f598r;
    float f599s;
    float f600t;
    float f601u;
    boolean f602v;
    boolean f603w;
    int f604x;
    float f605y;
    int f606z;

    public C0144a() {
        this.f596B = 30;
        m1216a("bird", 20, 20, 14, 14);
        int[] iArr = new int[12];
        iArr[1] = 1;
        iArr[2] = 2;
        iArr[3] = 1;
        iArr[5] = 1;
        iArr[6] = 2;
        iArr[7] = 1;
        iArr[9] = 1;
        iArr[10] = 2;
        iArr[11] = 1;
        m1213a(0, "flap", iArr, 12, 30, false);
        m1213a(1, "auto", iArr, 12, 10, true);
        this.f603w = true;
        this.f606z = C0153j.m1269a() % 3;
        this.f595A = new C0142e();
    }

    public void m1224a() {
        super.m1212a(80, 246);
        this.f597q = 0.0f;
        this.f600t = 0.0f;
        this.f601u = 1.0f;
        this.f599s = 0.4f;
        this.f602v = false;
        this.f603w = true;
        this.f604x = 0;
        m1214a(1, true);
        this.f606z = C0153j.m1269a() % 3;
    }

    public void m1225a(float f) {
        super.m1211a(f);
        if (this.f603w) {
            this.f604x += 8;
            if (this.f604x == 360) {
                this.f604x = 0;
            }
            this.f605y = C0153j.m1273b((float) this.f604x) * 4.0f;
            return;
        }
        this.f605y = 0.0f;
        this.f600t += this.f601u;
        if (this.f600t > 8.0f) {
            this.f600t = 8.0f;
        }
        this.c = (int) (((float) this.c) + this.f600t);
        if (this.c > 400 - this.f) {
            this.c = 400 - this.f;
            this.f601u = 0.0f;
            this.f600t = 0.0f;
        }
        this.f597q += this.f598r;
        this.f598r += this.f599s;
        if (this.f597q < -20.0f) {
            this.f597q = -20.0f;
        }
        if (this.f597q > 90.0f) {
            this.f597q = 90.0f;
        }
        this.f596B--;
        if (this.f596B == 0) {
            this.f596B = 30;
        }
        if (this.f595A.m) {
            this.f595A.m1217a(f);
        }
    }

    public void m1226a(C0147g c0147g) {
        if (this.n) {
            C0152i c0152i = this.p[(this.f606z * 3) + 1];
            if (!(this.j == null || this.j.f557a)) {
                c0152i = this.p[this.j.f566j + (this.f606z * 3)];
            }
            c0147g.m1243a(c0152i, this.b - this.g, ((int) this.f605y) + (this.c - this.h), 1.0f, (int) this.f597q);
        }
    }

    public void m1227b() {
        if (this.f603w) {
            this.f603w = false;
        }
        if (this.c >= 0 && !this.f602v) {
            m1214a(0, true);
            this.f600t = -5.0f;
            this.f601u = 0.3f;
            this.f598r = -10.0f;
            this.f599s = 0.4f;
            C0148c.D.m1241a(4, null, 5);
        }
    }
}
