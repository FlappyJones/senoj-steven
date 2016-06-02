package org.andengine.opengl.p064b;

import android.opengl.GLES20;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.b.e */
public class C0680e extends C0673g {
    public static int f2719a;
    public static int f2720b;
    public static int f2721c;
    public static int f2722d;
    private static C0680e f2723e;

    static {
        f2719a = -1;
        f2720b = -1;
        f2721c = -1;
        f2722d = -1;
    }

    private C0680e() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nuniform sampler2D u_texture_1;\nuniform bool u_textureselect_texture_0;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tif(u_textureselect_texture_0) {\n\t\tgl_FragColor = texture2D(u_texture_0, v_textureCoordinates);\n\t} else {\n\t\tgl_FragColor = texture2D(u_texture_1, v_textureCoordinates);\n\t}\n}");
    }

    public static C0680e m5267a() {
        if (f2723e == null) {
            f2723e = new C0680e();
        }
        return f2723e;
    }

    protected void m5268a(C0714e c0714e) {
        GLES20.glBindAttribLocation(this.h, 0, "a_position");
        GLES20.glBindAttribLocation(this.h, 3, "a_textureCoordinates");
        super.m5244a(c0714e);
        f2719a = m5243a("u_modelViewProjectionMatrix");
        f2720b = m5243a("u_texture_0");
        f2721c = m5243a("u_texture_1");
        f2722d = m5243a("u_textureselect_texture_0");
    }

    public void m5269a(C0714e c0714e, C0706c c0706c) {
        GLES20.glDisableVertexAttribArray(1);
        super.m5245a(c0714e, c0706c);
        GLES20.glUniformMatrix4fv(f2719a, 1, false, c0714e.m5437p(), 0);
        GLES20.glUniform1i(f2720b, 0);
        GLES20.glUniform1i(f2721c, 1);
    }

    public void m5270b(C0714e c0714e) {
        GLES20.glEnableVertexAttribArray(1);
        super.m5247b(c0714e);
    }
}
