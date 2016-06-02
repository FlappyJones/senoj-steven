package org.andengine.opengl.p046d.p074a;

import org.andengine.p005d.p026f.C0558a;
import org.andengine.p005d.p059i.C0643a;

/* renamed from: org.andengine.opengl.d.a.d */
public class C0707d {
    private static final boolean f2807a;
    private int f2808b;
    private final C0704a[] f2809c;
    private int f2810d;

    static {
        f2807a = C0643a.m5171a(8);
    }

    public C0707d(int i) {
        this.f2809c = new C0704a[i];
    }

    public C0706c m5376a() {
        if (this.f2808b == this.f2809c.length) {
            return new C0706c(this.f2810d, this.f2809c);
        }
        throw new C0558a("Not enough " + C0704a.class.getSimpleName() + "s added to this " + getClass().getSimpleName() + ".");
    }

    public C0707d m5377a(int i, String str, int i2, int i3, boolean z) {
        if (f2807a) {
            this.f2809c[this.f2808b] = new C0705b(i, str, i2, i3, z, this.f2810d);
        } else {
            this.f2809c[this.f2808b] = new C0704a(i, str, i2, i3, z, this.f2810d);
        }
        switch (i3) {
            case 5121:
                this.f2810d += i2 * 1;
                break;
            case 5126:
                this.f2810d += i2 * 4;
                break;
            default:
                throw new IllegalArgumentException("Unexpected pType: '" + i3 + "'.");
        }
        this.f2808b++;
        return this;
    }
}
