package com.dotgears;

/* renamed from: com.dotgears.q */
public class C0141q extends C0140m {
    C0139d[] f569a;
    public int f570b;
    public int f571c;
    public int f572d;
    public int f573e;
    public int f574f;
    public int f575g;
    public int f576h;
    public float f577i;
    public C0139d f578j;
    public boolean f579k;
    public boolean f580l;
    public boolean f581m;
    public boolean f582n;
    public int f583o;
    public C0152i[] f584p;

    public C0141q() {
        this.f569a = new C0139d[10];
        this.f577i = 1.0f;
        this.f578j = null;
        this.f581m = false;
        this.f582n = false;
    }

    public void m1211a(float f) {
        if (this.f581m && this.f578j != null) {
            this.f578j.m1207a(f);
        }
    }

    public void m1212a(int i, int i2) {
        this.f570b = i;
        this.f571c = i2;
        this.f572d = 0;
        this.f581m = true;
        this.f582n = true;
        this.f579k = false;
        this.f580l = false;
        this.f577i = 1.0f;
    }

    public void m1213a(int i, String str, int[] iArr, int i2, int i3, boolean z) {
        this.f569a[i] = new C0139d(i, str, iArr, i2, i3, z);
    }

    public void m1214a(int i, boolean z) {
        if (z) {
            this.f569a[i].m1206a();
        }
        this.f569a[i].m1208b();
        this.f578j = this.f569a[i];
    }

    public void m1215a(C0147g c0147g) {
        if (this.f582n) {
            C0152i c0152i = this.f584p[0];
            if (this.f578j != null) {
                c0152i = this.f584p[this.f578j.f566j];
            }
            c0147g.m1235a(c0152i.f689i, this.f570b - this.f575g, this.f571c - this.f576h, 1.0f, 1.0f, this.f577i);
        }
    }

    public void m1216a(String str, int i, int i2, int i3, int i4) {
        this.f584p = C0147g.f620D.m1246a(str);
        this.f583o = this.f584p.length;
        if (i == 0 || i2 == 0) {
            this.f573e = this.f584p[0].f683b;
            this.f574f = this.f584p[0].f684c;
        } else {
            this.f573e = i;
            this.f574f = i2;
        }
        if (i3 == 0 || i4 == 0) {
            this.f575g = (this.f584p[0].f683b - this.f573e) >> 1;
            this.f576h = (this.f584p[0].f684c - this.f574f) >> 1;
            return;
        }
        this.f575g = i3;
        this.f576h = i4;
    }
}
