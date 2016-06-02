package org.andengine.input.sensor.p061b;

import android.hardware.SensorManager;
import com.google.android.gms.C0338e;
import java.util.Arrays;
import org.andengine.input.sensor.C0652a;

/* renamed from: org.andengine.input.sensor.b.b */
public class C0661b extends C0652a {
    private final float[] f2649d;
    private final float[] f2650e;
    private final float[] f2651f;
    private int f2652g;

    private void m5216a() {
        SensorManager.getRotationMatrix(this.f2651f, null, this.f2649d, this.f2650e);
        switch (this.c) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                SensorManager.remapCoordinateSystem(this.f2651f, 2, 129, this.f2651f);
                break;
        }
        float[] fArr = this.a;
        SensorManager.getOrientation(this.f2651f, fArr);
        for (int length = fArr.length - 1; length >= 0; length--) {
            fArr[length] = fArr[length] * 57.295776f;
        }
    }

    @Deprecated
    public void m5217a(int i) {
        super.m5204a(i);
    }

    @Deprecated
    public void m5218a(float[] fArr) {
        super.m5205a(fArr);
    }

    public void m5219b(int i) {
        super.m5204a(i);
    }

    public void m5220b(float[] fArr) {
        System.arraycopy(fArr, 0, this.f2649d, 0, fArr.length);
        m5216a();
    }

    public void m5221c(int i) {
        this.f2652g = i;
    }

    public void m5222c(float[] fArr) {
        System.arraycopy(fArr, 0, this.f2650e, 0, fArr.length);
        m5216a();
    }

    public String toString() {
        return "Orientation: " + Arrays.toString(this.a);
    }
}
