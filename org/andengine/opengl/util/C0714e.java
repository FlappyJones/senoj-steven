package org.andengine.opengl.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteOrder;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import org.andengine.opengl.p067c.C0700c;
import org.andengine.opengl.view.C0716a;
import org.andengine.p003b.p039c.C0587d;
import org.andengine.p005d.p057e.C0637a;

/* renamed from: org.andengine.opengl.util.e */
public class C0714e {
    private final float[] f2825A;
    private final float[] f2826B;
    private final int[] f2827a;
    private String f2828b;
    private String f2829c;
    private String f2830d;
    private int f2831e;
    private int f2832f;
    private int f2833g;
    private int f2834h;
    private int f2835i;
    private int f2836j;
    private int f2837k;
    private int f2838l;
    private final int[] f2839m;
    private int f2840n;
    private int f2841o;
    private int f2842p;
    private int f2843q;
    private boolean f2844r;
    private boolean f2845s;
    private boolean f2846t;
    private boolean f2847u;
    private boolean f2848v;
    private float f2849w;
    private final C0711b f2850x;
    private final C0711b f2851y;
    private final float[] f2852z;

    public C0714e() {
        this.f2827a = new int[1];
        this.f2836j = -1;
        this.f2837k = -1;
        this.f2838l = -1;
        this.f2839m = new int[31];
        this.f2840n = -1;
        this.f2841o = 0;
        this.f2842p = -1;
        this.f2843q = -1;
        this.f2844r = true;
        this.f2845s = true;
        this.f2846t = false;
        this.f2847u = false;
        this.f2848v = false;
        this.f2849w = 1.0f;
        this.f2850x = new C0711b();
        this.f2851y = new C0711b();
        this.f2852z = new float[16];
        this.f2825A = new float[16];
        this.f2826B = new float[16];
    }

    public void m5405a(float f, float f2) {
        this.f2850x.m5397a(f, f2);
    }

    public void m5406a(float f, float f2, float f3) {
        this.f2850x.m5398a(f, f2, f3);
    }

    public void m5407a(float f, float f2, float f3, float f4) {
        this.f2850x.m5399a(f, f2, f3, f4);
    }

    public void m5408a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f2851y.m5400a(f, f2, f3, f4, f5, f6);
    }

    public void m5409a(float f, float f2, int i) {
        this.f2850x.m5402b(f, f2, (float) i);
    }

    public void m5410a(int i) {
        if (this.f2836j != i) {
            this.f2836j = i;
            GLES20.glBindBuffer(34962, i);
        }
    }

    public void m5411a(int i, int i2) {
        if (this.f2842p != i || this.f2843q != i2) {
            this.f2842p = i;
            this.f2843q = i2;
            GLES20.glBlendFunc(i, i2);
        }
    }

    public void m5412a(int i, int i2, int i3, int i4, Bitmap bitmap, C0700c c0700c) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        GLES20.glTexSubImage2D(i5, i6, i7, i8, bitmap.getWidth(), bitmap.getHeight(), c0700c.m5363b(), c0700c.m5364c(), C0710a.m5388a(bitmap, c0700c, ByteOrder.BIG_ENDIAN));
    }

    public void m5413a(C0587d c0587d, C0716a c0716a, EGLConfig eGLConfig) {
        this.f2828b = GLES20.glGetString(7938);
        this.f2829c = GLES20.glGetString(7937);
        this.f2830d = GLES20.glGetString(7939);
        this.f2831e = m5426f(34921);
        this.f2832f = m5426f(36347);
        this.f2833g = m5426f(36349);
        this.f2835i = m5426f(34930);
        this.f2834h = m5426f(3379);
        C0637a.m5154b("VERSION: " + this.f2828b);
        C0637a.m5154b("RENDERER: " + this.f2829c);
        C0637a.m5154b("EGLCONFIG: " + EGLConfig.class.getSimpleName() + "(Red=" + c0716a.m5447b() + ", Green=" + c0716a.m5448c() + ", Blue=" + c0716a.m5449d() + ", Alpha=" + c0716a.m5450e() + ", Depth=" + c0716a.m5451f() + ", Stencil=" + c0716a.m5452g() + ")");
        C0637a.m5154b("EXTENSIONS: " + this.f2830d);
        C0637a.m5154b("MAX_VERTEX_ATTRIBS: " + this.f2831e);
        C0637a.m5154b("MAX_VERTEX_UNIFORM_VECTORS: " + this.f2832f);
        C0637a.m5154b("MAX_FRAGMENT_UNIFORM_VECTORS: " + this.f2833g);
        C0637a.m5154b("MAX_TEXTURE_IMAGE_UNITS: " + this.f2835i);
        C0637a.m5154b("MAX_TEXTURE_SIZE: " + this.f2834h);
        this.f2850x.m5404d();
        this.f2851y.m5404d();
        this.f2836j = -1;
        this.f2837k = -1;
        this.f2838l = -1;
        Arrays.fill(this.f2839m, -1);
        this.f2840n = -1;
        this.f2841o = 0;
        this.f2842p = -1;
        this.f2843q = -1;
        m5423d();
        m5427f();
        m5419b();
        m5421c();
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glEnableVertexAttribArray(3);
        this.f2849w = 1.0f;
    }

    public boolean m5414a() {
        if (this.f2847u) {
            return true;
        }
        this.f2847u = true;
        GLES20.glEnable(3042);
        return false;
    }

    public boolean m5415a(boolean z) {
        return z ? m5423d() : m5425e();
    }

    public void m5416b(float f, float f2, float f3) {
        this.f2851y.m5398a(f, f2, f3);
    }

    public void m5417b(float f, float f2, float f3, float f4) {
        this.f2851y.m5399a(f, f2, f3, f4);
    }

    public void m5418b(int i) {
        if (this.f2836j == i) {
            this.f2836j = -1;
        }
        this.f2827a[0] = i;
        GLES20.glDeleteBuffers(1, this.f2827a, 0);
    }

    public boolean m5419b() {
        if (!this.f2847u) {
            return false;
        }
        this.f2847u = false;
        GLES20.glDisable(3042);
        return true;
    }

    public void m5420c(int i) {
        if (this.f2838l != i) {
            this.f2838l = i;
            GLES20.glUseProgram(i);
        }
    }

    public boolean m5421c() {
        if (!this.f2848v) {
            return false;
        }
        this.f2848v = false;
        GLES20.glDisable(2884);
        return true;
    }

    public void m5422d(int i) {
        if (this.f2839m[this.f2841o] != i) {
            this.f2839m[this.f2841o] = i;
            GLES20.glBindTexture(3553, i);
        }
    }

    public boolean m5423d() {
        if (this.f2844r) {
            return true;
        }
        this.f2844r = true;
        GLES20.glEnable(3024);
        return false;
    }

    public void m5424e(int i) {
        if (this.f2839m[this.f2841o] == i) {
            this.f2839m[this.f2841o] = -1;
        }
        this.f2827a[0] = i;
        GLES20.glDeleteTextures(1, this.f2827a, 0);
    }

    public boolean m5425e() {
        if (!this.f2844r) {
            return false;
        }
        this.f2844r = false;
        GLES20.glDisable(3024);
        return true;
    }

    public int m5426f(int i) {
        GLES20.glGetIntegerv(i, this.f2827a, 0);
        return this.f2827a[0];
    }

    public boolean m5427f() {
        if (this.f2845s) {
            return true;
        }
        this.f2845s = true;
        GLES20.glEnable(2929);
        return false;
    }

    public boolean m5428g() {
        if (!this.f2845s) {
            return false;
        }
        this.f2845s = false;
        GLES20.glDisable(2929);
        return true;
    }

    public int m5429h() {
        GLES20.glGenBuffers(1, this.f2827a, 0);
        return this.f2827a[0];
    }

    public int m5430i() {
        GLES20.glGenTextures(1, this.f2827a, 0);
        return this.f2827a[0];
    }

    public void m5431j() {
        this.f2850x.m5401b();
    }

    public void m5432k() {
        this.f2850x.m5403c();
    }

    public void m5433l() {
        this.f2850x.m5396a();
    }

    public void m5434m() {
        this.f2851y.m5401b();
    }

    public void m5435n() {
        this.f2851y.m5403c();
    }

    public void m5436o() {
        this.f2851y.m5396a();
    }

    public float[] m5437p() {
        Matrix.multiplyMM(this.f2826B, 0, this.f2851y.f2822a, this.f2851y.f2823b, this.f2850x.f2822a, this.f2850x.f2823b);
        return this.f2826B;
    }
}
