package com.dotgears;

/* renamed from: com.dotgears.d */
public class C0139d {
    public boolean f557a;
    public String f558b;
    public int f559c;
    public int[] f560d;
    public float f561e;
    public boolean f562f;
    public int f563g;
    public int f564h;
    public int f565i;
    public int f566j;

    public C0139d(int i, String str, int[] iArr, int i2, int i3, boolean z) {
        this.f558b = str;
        this.f559c = i2;
        this.f560d = new int[this.f559c];
        System.arraycopy(iArr, 0, this.f560d, 0, this.f559c);
        this.f561e = (float) (1000 / i3);
        this.f562f = z;
        this.f563g = i;
    }

    public void m1206a() {
        this.f564h = 0;
        this.f565i = 0;
        this.f566j = this.f560d[0];
    }

    public void m1207a(float f) {
        if (!this.f557a) {
            this.f564h += 15;
            if (((float) this.f564h) >= this.f561e) {
                this.f564h = 0;
                this.f565i++;
                if (this.f565i >= this.f559c) {
                    if (this.f562f) {
                        this.f565i = 0;
                    } else {
                        this.f557a = true;
                    }
                    this.f565i = 0;
                }
                this.f566j = this.f560d[this.f565i];
            }
        }
    }

    void m1208b() {
        if (!this.f562f && this.f557a) {
            m1206a();
        }
        this.f557a = false;
    }
}
