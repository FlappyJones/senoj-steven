package com.dotgears;

/* renamed from: com.dotgears.n */
public class C0156n extends C0140m {
    public C0140m[] f728a;
    int f729b;
    int f730c;

    public C0156n() {
        this.f728a = new C0140m[30];
    }

    public int m1321a() {
        return this.f730c;
    }

    public void m1322a(float f) {
        for (int i = 0; i < m1321a(); i++) {
            this.f728a[i].m1209a(f);
        }
    }

    public void m1323a(C0147g c0147g) {
        for (int i = 0; i < m1321a(); i++) {
            this.f728a[i].m1210a(c0147g);
        }
    }

    public void m1324a(C0140m c0140m) {
        this.f728a[this.f730c] = c0140m;
        this.f729b = 0;
        this.f730c++;
    }

    public void m1325b() {
        for (int i = 0; i < m1321a(); i++) {
            this.f728a[i].f567F = false;
            this.f728a[i].f568G = false;
        }
        this.f729b = 0;
    }

    C0140m m1326c() {
        C0140m c0140m = this.f728a[this.f729b];
        this.f729b++;
        if (this.f729b == m1321a()) {
            this.f729b = 0;
        }
        return c0140m;
    }
}
