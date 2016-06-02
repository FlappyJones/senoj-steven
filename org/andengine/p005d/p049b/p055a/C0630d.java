package org.andengine.p005d.p049b.p055a;

import org.andengine.opengl.util.C0715f;

/* renamed from: org.andengine.d.b.a.d */
public class C0630d extends C0629a {
    public static boolean m5122a(float[] fArr, int i, float f, float f2) {
        return C0630d.m5123a(fArr, i, 0, 1, 2, f, f2);
    }

    public static boolean m5123a(float[] fArr, int i, int i2, int i3, int i4, float f, float f2) {
        int i5 = i - 1;
        boolean z = false;
        for (int i6 = 0; i6 < i; i6++) {
            boolean z2;
            float a = C0715f.m5438a(fArr, i2, i4, i6);
            float a2 = C0715f.m5438a(fArr, i3, i4, i6);
            float a3 = C0715f.m5438a(fArr, i2, i4, i5);
            float a4 = C0715f.m5438a(fArr, i3, i4, i5);
            if (((a2 >= f2 || a4 < f2) && (a4 >= f2 || a2 < f2)) || (a > f && a3 > f)) {
                z2 = z;
            } else {
                z2 = ((((f2 - a2) / (a4 - a2)) * (a3 - a)) + a < f ? 1 : 0) ^ z;
            }
            z = z2;
            i5 = i6;
        }
        return z;
    }

    private static boolean m5124a(float[] fArr, int i, int i2, int i3, int i4, int i5, float[] fArr2, int i6, int i7, int i8, int i9) {
        float a = C0715f.m5438a(fArr, i, i3, i4);
        float a2 = C0715f.m5438a(fArr, i2, i3, i4);
        float a3 = C0715f.m5438a(fArr, i, i3, i5);
        float a4 = C0715f.m5438a(fArr, i2, i3, i5);
        for (int i10 = i6 - 2; i10 >= 0; i10--) {
            if (C0631b.m5127a(a, a2, a3, a4, C0715f.m5438a(fArr2, i7, i9, i10), C0715f.m5438a(fArr2, i8, i9, i10), C0715f.m5438a(fArr2, i7, i9, i10 + 1), C0715f.m5438a(fArr2, i8, i9, i10 + 1))) {
                return true;
            }
        }
        return C0631b.m5127a(a, a2, a3, a4, C0715f.m5438a(fArr2, i7, i9, i6 + -1), C0715f.m5438a(fArr2, i8, i9, i6 + -1), C0715f.m5438a(fArr2, i7, i9, 0), C0715f.m5438a(fArr2, i8, i9, 0));
    }

    public static boolean m5125a(float[] fArr, int i, int i2, int i3, int i4, float[] fArr2, int i5, int i6, int i7, int i8) {
        for (int i9 = i - 2; i9 >= 0; i9--) {
            if (C0630d.m5124a(fArr, i2, i3, i4, i9, i9 + 1, fArr2, i5, i6, i7, i8)) {
                return true;
            }
        }
        if (C0630d.m5124a(fArr, i2, i3, i4, i - 1, 0, fArr2, i5, i6, i7, i8)) {
            return true;
        }
        if (C0630d.m5122a(fArr, i, C0715f.m5438a(fArr2, i6, i8, 0), C0715f.m5438a(fArr2, i7, i8, 0))) {
            return true;
        }
        return C0630d.m5122a(fArr2, i5, C0715f.m5438a(fArr, i2, i4, 0), C0715f.m5438a(fArr, i3, i4, 0));
    }

    public static boolean m5126a(float[] fArr, int i, float[] fArr2, int i2) {
        return C0630d.m5125a(fArr, i, 0, 1, 2, fArr2, i2, 0, 1, 2);
    }
}
