package com.dotgears;

import android.util.Log;

/* renamed from: com.dotgears.h */
public class C0145h {
    public static String f607l;
    public C0152i[] f608a;
    protected int[] f609b;
    protected int f610c;
    protected int f611d;
    protected int f612e;
    protected int f613f;
    protected int f614g;
    protected float f615h;
    public char[] f616i;
    public char[] f617j;
    public int f618k;

    static {
        f607l = "0123456789";
    }

    public C0145h(String str, int i) {
        int i2 = 0;
        this.f608a = new C0152i[256];
        this.f609b = new int[256];
        this.f616i = new char[256];
        this.f617j = new char[256];
        this.f618k = 0;
        C0152i[] a = C0147g.f620D.m1246a(str);
        while (i2 < a.length) {
            int parseInt = Integer.parseInt(a[i2].f682a.split("_")[1]);
            this.f608a[parseInt] = a[i2];
            this.f609b[parseInt] = a[i2].f683b;
            this.f610c = this.f610c > a[i2].f684c ? this.f610c : a[i2].f684c;
            Log.i("FlappyBird", "Number: " + a[i2].f682a + " " + parseInt);
            i2++;
        }
        this.f609b[32] = this.f609b[48];
        this.f611d = i;
    }

    public void m1228a(int i, int i2) {
        this.f618k = 0;
        int i3 = i;
        while (i2 > 0) {
            if (i3 > 0) {
                int i4 = i3 % 10;
                i3 /= 10;
                this.f617j[this.f618k] = f607l.charAt(i4);
                this.f618k++;
            }
            i2--;
        }
        for (i3 = 0; i3 < this.f618k; i3++) {
            this.f616i[i3] = this.f617j[(this.f618k - i3) - 1];
        }
        if (this.f618k == 0) {
            this.f616i[0] = '0';
            this.f618k = 1;
        }
    }

    public void m1229a(int i, int i2, int i3, float f) {
        this.f613f = i;
        this.f614g = i2;
        this.f612e = i3;
        this.f615h = f;
    }

    public void m1230a(C0147g c0147g) {
        int i;
        int i2 = 0;
        int i3 = this.f618k;
        int i4 = 0;
        for (i = 0; i < i3; i++) {
            i4 = (i4 + this.f609b[this.f616i[i]]) - this.f611d;
        }
        i = i4 + 2;
        i4 = this.f610c;
        if ((this.f612e & 2) != 0) {
            this.f613f -= i / 2;
        } else if ((this.f612e & 1) != 0) {
            this.f613f -= i;
        }
        if ((this.f612e & 4) != 0) {
            this.f614g -= i4 / 2;
        } else if ((this.f612e & 8) != 0) {
            this.f614g -= i4;
        }
        i = this.f613f;
        i4 = this.f614g;
        while (i2 < i3) {
            if (this.f608a[this.f616i[i2]] != null) {
                c0147g.m1242a(this.f608a[this.f616i[i2]], i, i4, this.f615h);
            }
            i = (i + this.f609b[this.f616i[i2]]) - this.f611d;
            i2++;
        }
    }
}
