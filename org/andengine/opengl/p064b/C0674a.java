package org.andengine.opengl.p064b;

import android.opengl.GLES20;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.b.a */
public class C0674a extends C0673g {
    public static int f2704a;
    private static C0674a f2705b;

    static {
        f2704a = -1;
    }

    private C0674a() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec4 a_color;\nvarying vec4 v_color;\nvoid main() {\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n\tv_color = a_color;\n}", "precision lowp float;\nvarying vec4 v_color;\nvoid main() {\n\tgl_FragColor = v_color;\n}");
    }

    public static C0674a m5250a() {
        if (f2705b == null) {
            f2705b = new C0674a();
        }
        return f2705b;
    }

    protected void m5251a(C0714e c0714e) {
        GLES20.glBindAttribLocation(this.h, 0, "a_position");
        GLES20.glBindAttribLocation(this.h, 1, "a_color");
        super.m5244a(c0714e);
        f2704a = m5243a("u_modelViewProjectionMatrix");
    }

    public void m5252a(C0714e c0714e, C0706c c0706c) {
        GLES20.glDisableVertexAttribArray(3);
        super.m5245a(c0714e, c0706c);
        GLES20.glUniformMatrix4fv(f2704a, 1, false, c0714e.m5437p(), 0);
    }

    public void m5253b(C0714e c0714e) {
        GLES20.glEnableVertexAttribArray(3);
        super.m5247b(c0714e);
    }
}
