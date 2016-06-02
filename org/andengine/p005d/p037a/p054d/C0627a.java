package org.andengine.p005d.p037a.p054d;

import android.util.FloatMath;

/* renamed from: org.andengine.d.a.d.a */
public class C0627a {
    private float f2564a;
    private float f2565b;
    private float f2566c;
    private float f2567d;
    private float f2568e;
    private float f2569f;

    public C0627a() {
        this.f2564a = 1.0f;
        this.f2565b = 0.0f;
        this.f2566c = 0.0f;
        this.f2567d = 1.0f;
        this.f2568e = 0.0f;
        this.f2569f = 0.0f;
    }

    private void m5108a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.f2564a;
        float f8 = this.f2565b;
        float f9 = this.f2566c;
        float f10 = this.f2567d;
        float f11 = this.f2568e;
        float f12 = this.f2569f;
        this.f2564a = (f7 * f) + (f8 * f3);
        this.f2565b = (f7 * f2) + (f8 * f4);
        this.f2566c = (f9 * f) + (f10 * f3);
        this.f2567d = (f9 * f2) + (f10 * f4);
        this.f2568e = ((f11 * f) + (f12 * f3)) + f5;
        this.f2569f = ((f11 * f2) + (f12 * f4)) + f6;
    }

    private void m5109b(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.f2564a;
        float f8 = this.f2565b;
        float f9 = this.f2566c;
        float f10 = this.f2567d;
        float f11 = this.f2568e;
        float f12 = this.f2569f;
        this.f2564a = (f * f7) + (f2 * f9);
        this.f2565b = (f * f8) + (f2 * f10);
        this.f2566c = (f3 * f7) + (f4 * f9);
        this.f2567d = (f3 * f8) + (f4 * f10);
        this.f2568e = ((f7 * f5) + (f9 * f6)) + f11;
        this.f2569f = ((f5 * f8) + (f6 * f10)) + f12;
    }

    public final void m5110a() {
        this.f2564a = 1.0f;
        this.f2567d = 1.0f;
        this.f2565b = 0.0f;
        this.f2566c = 0.0f;
        this.f2568e = 0.0f;
        this.f2569f = 0.0f;
    }

    public final void m5111a(float f) {
        float f2 = 0.017453292f * f;
        float sin = FloatMath.sin(f2);
        f2 = FloatMath.cos(f2);
        float f3 = this.f2564a;
        float f4 = this.f2565b;
        float f5 = this.f2566c;
        float f6 = this.f2567d;
        float f7 = this.f2568e;
        float f8 = this.f2569f;
        this.f2564a = (f3 * f2) - (f4 * sin);
        this.f2565b = (f3 * sin) + (f4 * f2);
        this.f2566c = (f5 * f2) - (f6 * sin);
        this.f2567d = (f5 * sin) + (f6 * f2);
        this.f2568e = (f7 * f2) - (f8 * sin);
        this.f2569f = (f2 * f8) + (sin * f7);
    }

    public final void m5112a(float f, float f2) {
        this.f2568e += f;
        this.f2569f += f2;
    }

    public final void m5113a(C0627a c0627a) {
        this.f2564a = c0627a.f2564a;
        this.f2567d = c0627a.f2567d;
        this.f2565b = c0627a.f2565b;
        this.f2566c = c0627a.f2566c;
        this.f2568e = c0627a.f2568e;
        this.f2569f = c0627a.f2569f;
    }

    public final void m5114a(float[] fArr) {
        int i = 0;
        int length = fArr.length >> 1;
        int i2 = 0;
        while (true) {
            length--;
            if (length >= 0) {
                int i3 = i2 + 1;
                float f = fArr[i2];
                i2 = i3 + 1;
                float f2 = fArr[i3];
                int i4 = i + 1;
                fArr[i] = ((this.f2564a * f) + (this.f2566c * f2)) + this.f2568e;
                i = i4 + 1;
                fArr[i4] = ((f2 * this.f2567d) + (f * this.f2565b)) + this.f2569f;
            } else {
                return;
            }
        }
    }

    public final void m5115b(float f, float f2) {
        this.f2564a *= f;
        this.f2565b *= f2;
        this.f2566c *= f;
        this.f2567d *= f2;
        this.f2568e *= f;
        this.f2569f *= f2;
    }

    public final void m5116b(C0627a c0627a) {
        m5108a(c0627a.f2564a, c0627a.f2565b, c0627a.f2566c, c0627a.f2567d, c0627a.f2568e, c0627a.f2569f);
    }

    public final void m5117c(float f, float f2) {
        float tan = (float) Math.tan((double) (-0.017453292f * f));
        float tan2 = (float) Math.tan((double) (-0.017453292f * f2));
        float f3 = this.f2564a;
        float f4 = this.f2565b;
        float f5 = this.f2566c;
        float f6 = this.f2567d;
        float f7 = this.f2568e;
        float f8 = this.f2569f;
        this.f2564a = (f4 * tan) + f3;
        this.f2565b = (f3 * tan2) + f4;
        this.f2566c = (f6 * tan) + f5;
        this.f2567d = (f5 * tan2) + f6;
        this.f2568e = (tan * f8) + f7;
        this.f2569f = (f7 * tan2) + f8;
    }

    public final void m5118c(C0627a c0627a) {
        m5109b(c0627a.f2564a, c0627a.f2565b, c0627a.f2566c, c0627a.f2567d, c0627a.f2568e, c0627a.f2569f);
    }

    public String toString() {
        return "Transformation{[" + this.f2564a + ", " + this.f2566c + ", " + this.f2568e + "][" + this.f2565b + ", " + this.f2567d + ", " + this.f2569f + "][0.0, 0.0, 1.0]}";
    }
}
