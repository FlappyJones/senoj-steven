package org.andengine.p005d.p058g;

import android.util.FloatMath;
import java.util.Random;

/* renamed from: org.andengine.d.g.a */
public final class C0640a {
    public static final Random f2627a;

    static {
        f2627a = new Random(System.nanoTime());
    }

    public static final float m5162a(float f) {
        return 0.017453292f * f;
    }

    public static final boolean m5163a(int i) {
        return i != 0 && ((i - 1) & i) == 0;
    }

    public static float[] m5164a(float[] fArr, float f, float f2, float f3) {
        if (f != 0.0f) {
            float a = C0640a.m5162a(f);
            float sin = FloatMath.sin(a);
            float cos = FloatMath.cos(a);
            for (int length = fArr.length - 2; length >= 0; length -= 2) {
                float f4 = fArr[length];
                float f5 = fArr[length + 1];
                fArr[length] = (((f4 - f2) * cos) - ((f5 - f3) * sin)) + f2;
                fArr[length + 1] = (((f4 - f2) * sin) + ((f5 - f3) * cos)) + f3;
            }
        }
        return fArr;
    }

    public static float[] m5165b(float[] fArr, float f, float f2, float f3) {
        return C0640a.m5164a(fArr, -f, f2, f3);
    }
}
