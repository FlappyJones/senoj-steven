package org.andengine.opengl.p067c;

import android.opengl.GLES20;

/* renamed from: org.andengine.opengl.c.f */
public class C0702f {
    public static final C0702f f2783a;
    public static final C0702f f2784b;
    public static final C0702f f2785c;
    public static final C0702f f2786d;
    public static final C0702f f2787e;
    public static final C0702f f2788f;
    public static final C0702f f2789g;
    public static final C0702f f2790h;
    public static final C0702f f2791i;
    public final int f2792j;
    public final int f2793k;
    public final float f2794l;
    public final float f2795m;
    public final boolean f2796n;

    static {
        f2783a = new C0702f(9728, 9728, 33071, 33071, false);
        f2784b = new C0702f(9729, 9729, 33071, 33071, false);
        f2785c = new C0702f(9728, 9728, 10497, 10497, false);
        f2786d = new C0702f(9729, 9729, 10497, 10497, false);
        f2787e = new C0702f(9728, 9728, 33071, 33071, true);
        f2788f = new C0702f(9729, 9729, 33071, 33071, true);
        f2789g = new C0702f(9728, 9728, 10497, 10497, true);
        f2790h = new C0702f(9729, 9729, 10497, 10497, true);
        f2791i = f2783a;
    }

    public C0702f(int i, int i2, int i3, int i4, boolean z) {
        this.f2793k = i;
        this.f2792j = i2;
        this.f2794l = (float) i3;
        this.f2795m = (float) i4;
        this.f2796n = z;
    }

    public void m5370a() {
        GLES20.glTexParameterf(3553, 10241, (float) this.f2793k);
        GLES20.glTexParameterf(3553, 10240, (float) this.f2792j);
        GLES20.glTexParameterf(3553, 10242, this.f2795m);
        GLES20.glTexParameterf(3553, 10243, this.f2794l);
    }
}
