package org.andengine.opengl.p046d.p074a;

import android.opengl.GLES20;

/* renamed from: org.andengine.opengl.d.a.a */
public class C0704a {
    final int f2799a;
    final String f2800b;
    final int f2801c;
    final int f2802d;
    final boolean f2803e;
    final int f2804f;

    public C0704a(int i, String str, int i2, int i3, boolean z, int i4) {
        this.f2799a = i;
        this.f2800b = str;
        this.f2801c = i2;
        this.f2802d = i3;
        this.f2803e = z;
        this.f2804f = i4;
    }

    public void m5373a(int i) {
        GLES20.glVertexAttribPointer(this.f2799a, this.f2801c, this.f2802d, this.f2803e, i, this.f2804f);
    }
}
