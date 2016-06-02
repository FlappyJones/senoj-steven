package org.andengine.opengl.util;

import android.opengl.Matrix;

/* renamed from: org.andengine.opengl.util.b */
public class C0711b {
    final float[] f2822a;
    int f2823b;
    private final float[] f2824c;

    public C0711b() {
        this.f2822a = new float[512];
        this.f2824c = new float[32];
        m5396a();
    }

    private static void m5395a(float[] fArr, int i, float f, float f2) {
        fArr[i + 0] = 1.0f;
        fArr[i + 1] = (float) Math.tan((double) (-0.017453292f * f2));
        fArr[i + 2] = 0.0f;
        fArr[i + 3] = 0.0f;
        fArr[i + 4] = (float) Math.tan((double) (-0.017453292f * f));
        fArr[i + 5] = 1.0f;
        fArr[i + 6] = 0.0f;
        fArr[i + 7] = 0.0f;
        fArr[i + 8] = 0.0f;
        fArr[i + 9] = 0.0f;
        fArr[i + 10] = 1.0f;
        fArr[i + 11] = 0.0f;
        fArr[i + 12] = 0.0f;
        fArr[i + 13] = 0.0f;
        fArr[i + 14] = 0.0f;
        fArr[i + 15] = 1.0f;
    }

    public void m5396a() {
        Matrix.setIdentityM(this.f2822a, this.f2823b);
    }

    public void m5397a(float f, float f2) {
        C0711b.m5395a(this.f2824c, 0, f, f2);
        System.arraycopy(this.f2822a, this.f2823b, this.f2824c, 16, 16);
        Matrix.multiplyMM(this.f2822a, this.f2823b, this.f2824c, 16, this.f2824c, 0);
    }

    public void m5398a(float f, float f2, float f3) {
        Matrix.translateM(this.f2822a, this.f2823b, f, f2, f3);
    }

    public void m5399a(float f, float f2, float f3, float f4) {
        Matrix.setRotateM(this.f2824c, 0, f, f2, f3, f4);
        System.arraycopy(this.f2822a, this.f2823b, this.f2824c, 16, 16);
        Matrix.multiplyMM(this.f2822a, this.f2823b, this.f2824c, 16, this.f2824c, 0);
    }

    public void m5400a(float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix.orthoM(this.f2822a, this.f2823b, f, f2, f3, f4, f5, f6);
    }

    public void m5401b() {
        if (this.f2823b + 16 >= 512) {
            throw new C0712c();
        }
        System.arraycopy(this.f2822a, this.f2823b, this.f2822a, this.f2823b + 16, 16);
        this.f2823b += 16;
    }

    public void m5402b(float f, float f2, float f3) {
        Matrix.scaleM(this.f2822a, this.f2823b, f, f2, f3);
    }

    public void m5403c() {
        if (this.f2823b - 16 <= -16) {
            throw new C0713d();
        }
        this.f2823b -= 16;
    }

    public void m5404d() {
        this.f2823b = 0;
        m5396a();
    }
}
