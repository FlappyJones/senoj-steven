package org.andengine.p003b.p039c.p040a;

import android.view.View.MeasureSpec;
import org.andengine.opengl.view.RenderSurfaceView;

/* renamed from: org.andengine.b.c.a.b */
public class C0583b extends C0582a {
    private final float f2478a;
    private final float f2479b;
    private float f2480c;
    private float f2481d;
    private float f2482e;
    private float f2483f;
    private float f2484g;
    private float f2485h;

    public C0583b(float f, float f2) {
        this.f2478a = f;
        this.f2479b = f2;
    }

    public void m4959a(RenderSurfaceView renderSurfaceView, int i, int i2) {
        float f;
        float f2;
        C0582a.m4958a(i, i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        float f3 = this.f2478a / this.f2479b;
        if (((float) size) / ((float) size2) < f3) {
            f = ((float) size2) * f3;
            f3 = (float) size2;
            f2 = this.f2479b / f3;
        } else {
            f3 = ((float) size) / f3;
            f = (float) size;
            f2 = this.f2478a / f;
        }
        this.f2480c = ((float) size) * f2;
        this.f2481d = f2 * ((float) size2);
        this.f2482e = (this.f2478a - this.f2480c) / 2.0f;
        this.f2483f = this.f2480c + this.f2482e;
        this.f2485h = (this.f2479b - this.f2481d) / 2.0f;
        this.f2484g = this.f2481d + this.f2485h;
        renderSurfaceView.m5439a((int) f, (int) f3);
    }
}
