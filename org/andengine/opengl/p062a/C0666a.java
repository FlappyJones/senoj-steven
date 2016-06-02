package org.andengine.opengl.p062a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.andengine.opengl.p067c.C0687a;
import org.andengine.opengl.p067c.C0700c;
import org.andengine.opengl.util.C0714e;
import org.andengine.p005d.p058g.C0640a;

/* renamed from: org.andengine.opengl.a.a */
public class C0666a {
    protected final Paint f2668a;
    protected final FontMetrics f2669b;
    protected final Canvas f2670c;
    private final C0687a f2671d;
    private final SparseArray f2672e;
    private final ArrayList f2673f;
    private final Paint f2674g;

    public float m5228a() {
        return this.f2669b.ascent;
    }

    protected Bitmap m5229a(C0669d c0669d) {
        String valueOf = String.valueOf(c0669d.f2678a);
        Bitmap createBitmap = Bitmap.createBitmap(c0669d.f2681d + 2, c0669d.f2682e + 2, Config.ARGB_8888);
        this.f2670c.setBitmap(createBitmap);
        this.f2670c.drawRect(0.0f, 0.0f, (float) createBitmap.getWidth(), (float) createBitmap.getHeight(), this.f2674g);
        m5230a(valueOf, -c0669d.f2683f, -(c0669d.f2684g + m5228a()));
        return createBitmap;
    }

    protected void m5230a(String str, float f, float f2) {
        this.f2670c.drawText(str, f + 1.0f, 1.0f + f2, this.f2668a);
    }

    public synchronized void m5231a(C0714e c0714e) {
        if (this.f2671d.m5300c()) {
            ArrayList arrayList = this.f2673f;
            if (arrayList.size() > 0) {
                this.f2671d.m5302d(c0714e);
                C0700c f = this.f2671d.m5304f();
                boolean z = this.f2671d.m5305g().f2796n;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0669d c0669d = (C0669d) arrayList.get(size);
                    if (!c0669d.m5239a()) {
                        Bitmap a = m5229a(c0669d);
                        Object obj = (C0640a.m5163a(a.getWidth()) && C0640a.m5163a(a.getHeight()) && f == C0700c.RGBA_8888) ? 1 : null;
                        if (obj == null) {
                            GLES20.glPixelStorei(3317, 1);
                        }
                        if (z) {
                            GLUtils.texSubImage2D(3553, 0, c0669d.f2679b, c0669d.f2680c, a);
                        } else {
                            c0714e.m5412a(3553, 0, c0669d.f2679b, c0669d.f2680c, a, f);
                        }
                        if (obj == null) {
                            GLES20.glPixelStorei(3317, 4);
                        }
                        a.recycle();
                    }
                }
                arrayList.clear();
                System.gc();
            }
        }
    }

    public synchronized void m5232b() {
        ArrayList arrayList = this.f2673f;
        SparseArray sparseArray = this.f2672e;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            arrayList.add((C0669d) sparseArray.valueAt(size));
        }
    }
}
