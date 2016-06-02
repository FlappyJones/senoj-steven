package org.andengine.opengl.p064b;

import android.opengl.GLES20;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.b.d */
public class C0679d extends C0673g {
    public static int f2716a;
    public static int f2717b;
    private static C0679d f2718c;

    static {
        f2716a = -1;
        f2717b = -1;
    }

    private C0679d() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tgl_FragColor = texture2D(u_texture_0, v_textureCoordinates);\n}");
    }

    public static C0679d m5263a() {
        if (f2718c == null) {
            f2718c = new C0679d();
        }
        return f2718c;
    }

    protected void m5264a(C0714e c0714e) {
        GLES20.glBindAttribLocation(this.h, 0, "a_position");
        GLES20.glBindAttribLocation(this.h, 3, "a_textureCoordinates");
        super.m5244a(c0714e);
        f2716a = m5243a("u_modelViewProjectionMatrix");
        f2717b = m5243a("u_texture_0");
    }

    public void m5265a(C0714e c0714e, C0706c c0706c) {
        GLES20.glDisableVertexAttribArray(1);
        super.m5245a(c0714e, c0706c);
        GLES20.glUniformMatrix4fv(f2716a, 1, false, c0714e.m5437p(), 0);
        GLES20.glUniform1i(f2717b, 0);
    }

    public void m5266b(C0714e c0714e) {
        GLES20.glEnableVertexAttribArray(1);
        super.m5247b(c0714e);
    }
}
