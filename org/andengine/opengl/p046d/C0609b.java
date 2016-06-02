package org.andengine.opengl.p046d;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.util.BufferUtils;
import org.andengine.p005d.p059i.C0643a;

/* renamed from: org.andengine.opengl.d.b */
public class C0609b extends C0608d {
    protected final float[] f2541a;
    protected final FloatBuffer f2542b;

    public C0609b(C0709e c0709e, int i, C0708a c0708a, boolean z, C0706c c0706c) {
        super(c0709e, i, c0708a, z, c0706c);
        this.f2541a = new float[i];
        if (C0643a.f2632d) {
            this.f2542b = this.f.asFloatBuffer();
        } else {
            this.f2542b = null;
        }
    }

    protected void m5041a() {
        if (C0643a.f2632d) {
            this.f2542b.position(0);
            this.f2542b.put(this.f2541a);
            GLES20.glBufferData(34962, this.f.capacity(), this.f, this.e);
            return;
        }
        BufferUtils.m5387a(this.f, this.f2541a, this.f2541a.length, 0);
        GLES20.glBufferData(34962, this.f.limit(), this.f, this.e);
    }
}
