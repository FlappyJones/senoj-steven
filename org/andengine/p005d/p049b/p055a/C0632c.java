package org.andengine.p005d.p049b.p055a;

import org.andengine.p003b.p032a.C0573a;
import org.andengine.p005d.p037a.p054d.C0627a;
import org.andengine.p005d.p058g.C0640a;
import org.andengine.p006c.p045c.C0606c;

/* renamed from: org.andengine.d.b.a.c */
public class C0632c extends C0630d {
    private static final float[] f2570a;
    private static final float[] f2571b;
    private static final float[] f2572c;

    static {
        f2570a = new float[8];
        f2571b = new float[8];
        f2572c = new float[8];
    }

    public static void m5128a(float f, float f2, float f3, float f4, C0627a c0627a, float[] fArr) {
        float f5 = f + f3;
        float f6 = f2 + f4;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f5;
        fArr[3] = f2;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f;
        fArr[7] = f6;
        c0627a.m5114a(fArr);
    }

    private static void m5129a(C0573a c0573a, float[] fArr) {
        fArr[0] = c0573a.m4899a();
        fArr[1] = c0573a.m4911c();
        fArr[2] = c0573a.m4907b();
        fArr[3] = c0573a.m4911c();
        fArr[4] = c0573a.m4907b();
        fArr[5] = c0573a.m4914d();
        fArr[6] = c0573a.m4899a();
        fArr[7] = c0573a.m4914d();
        C0640a.m5164a(fArr, c0573a.m4923k(), c0573a.m4919g(), c0573a.m4920h());
    }

    public static void m5130a(C0606c c0606c, float[] fArr) {
        C0632c.m5128a(0.0f, 0.0f, c0606c.m5016o(), c0606c.m5017p(), c0606c.m1188k(), fArr);
    }

    public static boolean m5131a(C0573a c0573a, C0606c c0606c) {
        C0632c.m5129a(c0573a, f2571b);
        C0632c.m5130a(c0606c, f2572c);
        return C0630d.m5126a(f2571b, 4, f2572c, 4);
    }

    public static boolean m5132a(C0606c c0606c, float f, float f2) {
        C0632c.m5130a(c0606c, f2570a);
        return C0630d.m5122a(f2570a, 4, f, f2);
    }
}
