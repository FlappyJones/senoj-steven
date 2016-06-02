package org.andengine.p006c.p047d.p048a;

import org.andengine.opengl.p046d.C0609b;
import org.andengine.opengl.p046d.C0708a;
import org.andengine.opengl.p046d.C0709e;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.p067c.p073c.C0696b;
import org.andengine.p006c.p047d.C0612a;

/* renamed from: org.andengine.c.d.a.a */
public class C0611a extends C0609b implements C0610b {
    public C0611a(C0709e c0709e, int i, C0708a c0708a, boolean z, C0706c c0706c) {
        super(c0709e, i, c0708a, z, c0706c);
    }

    public void m5046a(C0612a c0612a) {
        float[] fArr = this.a;
        float f = c0612a.m1184g().m5144f();
        fArr[2] = f;
        fArr[7] = f;
        fArr[12] = f;
        fArr[17] = f;
        m5039f();
    }

    public void m5047a(C0612a c0612a, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArr = this.a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[10] = f5;
        fArr[11] = f6;
        fArr[15] = f7;
        fArr[16] = f8;
        m5039f();
    }

    public void m5048b(C0612a c0612a) {
        float[] fArr = this.a;
        float o = c0612a.m5016o();
        float p = c0612a.m5017p();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = p;
        fArr[10] = o;
        fArr[11] = 0.0f;
        fArr[15] = o;
        fArr[16] = p;
        m5039f();
    }

    public void m5049c(C0612a c0612a) {
        float e;
        float d;
        float g;
        float f;
        float[] fArr = this.a;
        C0696b t = c0612a.m5058t();
        if (c0612a.m5060v()) {
            if (c0612a.m5059u()) {
                e = t.m5343e();
                d = t.m5342d();
                g = t.m5345g();
                f = t.m5344f();
            } else {
                e = t.m5342d();
                d = t.m5343e();
                g = t.m5345g();
                f = t.m5344f();
            }
        } else if (c0612a.m5059u()) {
            e = t.m5343e();
            d = t.m5342d();
            g = t.m5344f();
            f = t.m5345g();
        } else {
            e = t.m5342d();
            d = t.m5343e();
            g = t.m5344f();
            f = t.m5345g();
        }
        if (t.m5346h()) {
            fArr[3] = d;
            fArr[4] = g;
            fArr[8] = e;
            fArr[9] = g;
            fArr[13] = d;
            fArr[14] = f;
            fArr[18] = e;
            fArr[19] = f;
        } else {
            fArr[3] = e;
            fArr[4] = g;
            fArr[8] = e;
            fArr[9] = f;
            fArr[13] = d;
            fArr[14] = g;
            fArr[18] = d;
            fArr[19] = f;
        }
        m5039f();
    }
}
