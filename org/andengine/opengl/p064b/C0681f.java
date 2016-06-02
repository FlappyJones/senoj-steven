package org.andengine.opengl.p064b;

import android.opengl.GLES20;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.b.f */
public class C0681f extends C0673g {
    public static int f2724a;
    public static int f2725b;
    public static int f2726c;
    private static C0681f f2727d;

    static {
        f2724a = -1;
        f2725b = -1;
        f2726c = -1;
    }

    private C0681f() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nuniform vec4 u_color;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tgl_FragColor = u_color * texture2D(u_texture_0, v_textureCoordinates);\n}");
    }

    public static C0681f m5271a() {
        if (f2727d == null) {
            f2727d = new C0681f();
        }
        return f2727d;
    }

    protected void m5272a(C0714e c0714e) {
        GLES20.glBindAttribLocation(this.h, 0, "a_position");
        GLES20.glBindAttribLocation(this.h, 3, "a_textureCoordinates");
        super.m5244a(c0714e);
        f2724a = m5243a("u_modelViewProjectionMatrix");
        f2725b = m5243a("u_texture_0");
        f2726c = m5243a("u_color");
    }

    public void m5273a(C0714e c0714e, C0706c c0706c) {
        GLES20.glDisableVertexAttribArray(1);
        super.m5245a(c0714e, c0706c);
        GLES20.glUniformMatrix4fv(f2724a, 1, false, c0714e.m5437p(), 0);
        GLES20.glUniform1i(f2725b, 0);
    }

    public void m5274b(C0714e c0714e) {
        GLES20.glEnableVertexAttribArray(1);
        super.m5247b(c0714e);
    }
}
