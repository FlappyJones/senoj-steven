package com.dotgears;

/* renamed from: com.dotgears.f */
public class C0143f extends C0140m {
    public C0152i f585a;
    public int f586b;
    public int f587c;
    public int f588d;
    public int f589e;
    public boolean f590f;
    public boolean f591g;
    public boolean f592h;
    public boolean f593i;

    public void m1220a(float f) {
        int i = C0147g.f620D.f645u;
        int[] iArr = C0147g.f620D.f643s;
        int[] iArr2 = C0147g.f620D.f644t;
        this.f593i = false;
        int i2 = 0;
        while (i2 < i) {
            if (iArr[i2] > this.f586b && iArr[i2] < this.f586b + this.f588d && iArr2[i2] > this.f587c && iArr2[i2] < this.f587c + this.f589e) {
                this.f593i = true;
                break;
            }
            i2++;
        }
        this.f591g = false;
        this.f592h = false;
        if (this.f593i == this.f590f) {
            return;
        }
        if (this.f590f) {
            this.f592h = true;
            this.f590f = false;
            return;
        }
        this.f591g = true;
        this.f590f = true;
    }

    public void m1221a(int i, int i2) {
        this.f586b = i;
        this.f587c = i2;
        this.F = true;
        this.G = true;
        this.f593i = false;
        this.f591g = false;
        this.f592h = false;
        this.f590f = false;
    }

    public void m1222a(C0147g c0147g) {
        if (this.f590f) {
            c0147g.m1235a(this.f585a.f689i, this.f586b, this.f587c + 2, 1.0f, 1.0f, 1.0f);
            return;
        }
        c0147g.m1235a(this.f585a.f689i, this.f586b, this.f587c, 1.0f, 1.0f, 1.0f);
    }

    public void m1223a(String str) {
        this.f585a = C0147g.f620D.m1247b(str);
        this.f588d = this.f585a.f683b;
        this.f589e = this.f585a.f684c;
    }
}
