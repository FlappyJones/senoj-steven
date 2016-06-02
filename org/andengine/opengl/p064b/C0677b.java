package org.andengine.opengl.p064b;

import android.opengl.GLES20;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.b.b */
public class C0677b extends C0673g {
    public static int f2707a;
    public static int f2708b;
    private static C0677b f2709c;

    static {
        f2707a = -1;
        f2708b = -1;
    }

    private C0677b() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_textureCoordinates;\nvarying vec4 v_color;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_color = a_color;\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nvarying lowp vec4 v_color;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tgl_FragColor = v_color * texture2D(u_texture_0, v_textureCoordinates);\n}");
    }

    public static C0677b m5256a() {
        if (f2709c == null) {
            f2709c = new C0677b();
        }
        return f2709c;
    }

    protected void m5257a(C0714e c0714e) {
        GLES20.glBindAttribLocation(this.h, 0, "a_position");
        GLES20.glBindAttribLocation(this.h, 1, "a_color");
        GLES20.glBindAttribLocation(this.h, 3, "a_textureCoordinates");
        super.m5244a(c0714e);
        f2707a = m5243a("u_modelViewProjectionMatrix");
        f2708b = m5243a("u_texture_0");
    }

    public void m5258a(C0714e c0714e, C0706c c0706c) {
        super.m5245a(c0714e, c0706c);
        GLES20.glUniformMatrix4fv(f2707a, 1, false, c0714e.m5437p(), 0);
        GLES20.glUniform1i(f2708b, 0);
    }
}
