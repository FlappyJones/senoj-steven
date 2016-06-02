package org.andengine.p005d.p056d;

/* renamed from: org.andengine.d.d.b */
public class C0635b {
    private static final float[] f2615a;

    static {
        f2615a = new float[3];
    }

    public static final float m5146a(int i) {
        return Float.intBitsToFloat(i & -1);
    }

    public static final int m5147a(float f, float f2, float f3, float f4) {
        return (((((int) (255.0f * f4)) << 24) | (((int) (255.0f * f)) << 16)) | (((int) (255.0f * f2)) << 8)) | (((int) (255.0f * f3)) << 0);
    }

    public static final int m5148b(float f, float f2, float f3, float f4) {
        return (((((int) (255.0f * f4)) << 24) | (((int) (255.0f * f3)) << 16)) | (((int) (255.0f * f2)) << 8)) | (((int) (255.0f * f)) << 0);
    }
}
