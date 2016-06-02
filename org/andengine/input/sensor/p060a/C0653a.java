package org.andengine.input.sensor.p060a;

import java.util.Arrays;
import org.andengine.input.sensor.C0652a;

/* renamed from: org.andengine.input.sensor.a.a */
public class C0653a extends C0652a {
    private static final C0654f[] f2648d;

    static {
        f2648d = new C0654f[4];
        f2648d[0] = new C0655b();
        f2648d[1] = new C0656c();
        f2648d[2] = new C0657d();
        f2648d[3] = new C0658e();
    }

    public void m5206a(float[] fArr) {
        super.m5205a(fArr);
        f2648d[this.c].m5207a(this.a);
    }

    public String toString() {
        return "Acceleration: " + Arrays.toString(this.a);
    }
}
