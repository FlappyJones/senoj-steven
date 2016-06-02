package org.andengine.input.sensor;

import java.util.Arrays;

/* renamed from: org.andengine.input.sensor.a */
public class C0652a {
    protected final float[] f2645a;
    protected int f2646b;
    protected int f2647c;

    public void m5204a(int i) {
        this.f2646b = i;
    }

    public void m5205a(float[] fArr) {
        System.arraycopy(fArr, 0, this.f2645a, 0, fArr.length);
    }

    public String toString() {
        return "Values: " + Arrays.toString(this.f2645a);
    }
}
