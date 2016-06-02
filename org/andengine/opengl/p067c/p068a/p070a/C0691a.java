package org.andengine.opengl.p067c.p068a.p070a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.ArrayList;
import org.andengine.opengl.p067c.C0700c;
import org.andengine.opengl.p067c.C0701e;
import org.andengine.opengl.p067c.C0702f;
import org.andengine.opengl.p067c.p068a.C0690c;
import org.andengine.opengl.p067c.p068a.C0694b;
import org.andengine.opengl.p067c.p068a.p070a.p071a.C0685b;
import org.andengine.opengl.p067c.p072b.C0695a;
import org.andengine.opengl.util.C0714e;
import org.andengine.p005d.p026f.C0639b;
import org.andengine.p005d.p058g.C0640a;

/* renamed from: org.andengine.opengl.c.a.a.a */
public class C0691a extends C0690c {
    private final C0695a f2744j;

    public C0691a(C0701e c0701e, int i, int i2, C0695a c0695a, C0702f c0702f, C0694b c0694b) {
        super(c0701e, i, i2, c0695a.m5337b(), c0702f, c0694b);
        this.f2744j = c0695a;
    }

    public C0691a(C0701e c0701e, int i, int i2, C0702f c0702f) {
        this(c0701e, i, i2, C0695a.RGBA_8888, c0702f, null);
    }

    protected void m5326e(C0714e c0714e) {
        C0700c b = this.f2744j.m5337b();
        int a = b.m5362a();
        int b2 = b.m5363b();
        int c = b.m5364c();
        GLES20.glTexImage2D(3553, 0, a, this.g, this.h, 0, b2, c, null);
        boolean z = this.c.f2796n;
        Config a2 = z ? this.f2744j.m5336a() : Config.ARGB_8888;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        C0694b k = m5325k();
        int i = 0;
        while (i < size) {
            C0685b c0685b = (C0685b) arrayList.get(i);
            try {
                Bitmap a3 = c0685b.m5291a(a2);
                if (a3 == null) {
                    throw new C0639b("Caused by: " + c0685b.getClass().toString() + " --> " + c0685b.toString() + " returned a null Bitmap.");
                }
                Object obj = (C0640a.m5163a(a3.getWidth()) && C0640a.m5163a(a3.getHeight()) && b == C0700c.RGBA_8888) ? 1 : null;
                if (obj == null) {
                    GLES20.glPixelStorei(3317, 1);
                }
                if (z) {
                    GLUtils.texSubImage2D(3553, 0, c0685b.m5279a(), c0685b.m5281b(), a3, b2, c);
                } else {
                    c0714e.m5412a(3553, 0, c0685b.m5279a(), c0685b.m5281b(), a3, this.b);
                }
                if (obj == null) {
                    GLES20.glPixelStorei(3317, 4);
                }
                a3.recycle();
                if (k != null) {
                    k.m5334a(this, c0685b);
                }
                i++;
            } catch (Throwable e) {
                if (k != null) {
                    k.m5335a(this, c0685b, e);
                } else {
                    throw e;
                }
            }
        }
    }
}
