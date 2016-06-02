package org.andengine.opengl.p067c;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import org.andengine.opengl.p046d.C0608d;
import org.andengine.opengl.p046d.C0708a;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.p046d.p074a.C0707d;
import org.andengine.opengl.p064b.C0679d;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.c.g */
public class C0703g extends C0608d {
    public static final C0706c f2797a;
    protected final FloatBuffer f2798b;

    static {
        f2797a = new C0707d(2).m5377a(0, "a_position", 2, 5126, false).m5377a(3, "a_textureCoordinates", 2, 5126, false).m5376a();
    }

    public C0703g() {
        super(null, 12, C0708a.STATIC, true, f2797a);
        this.f2798b = this.f.asFloatBuffer();
        this.f2798b.put(0, 0.0f);
        this.f2798b.put(1, 0.0f);
        this.f2798b.put(2, 0.0f);
        this.f2798b.put(3, 0.0f);
        this.f2798b.put(4, 1.0f);
        this.f2798b.put(5, 0.0f);
        this.f2798b.put(6, 1.0f);
        this.f2798b.put(7, 0.0f);
        this.f2798b.put(8, 0.0f);
        this.f2798b.put(9, 1.0f);
        this.f2798b.put(10, 0.0f);
        this.f2798b.put(11, 1.0f);
    }

    protected void m5371a() {
        GLES20.glBufferData(34962, this.f.limit(), this.f, this.e);
    }

    public void m5372a(C0714e c0714e, C0687a c0687a) {
        c0687a.m5302d(c0714e);
        m5032a(c0714e, C0679d.m5263a());
        c0714e.m5431j();
        c0714e.m5433l();
        c0714e.m5406a(1000000.0f, 1000000.0f, 0.0f);
        c0714e.m5409a(1.0E-4f, 1.0E-4f, 0);
        m5030a(4, 3);
        c0714e.m5432k();
        m5034b(c0714e, C0679d.m5263a());
    }
}
