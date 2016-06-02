package org.andengine.opengl.p064b;

import android.opengl.GLES20;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.b.c */
public class C0678c extends C0673g {
    public static int f2710a;
    public static int f2711b;
    public static int f2712c;
    public static int f2713d;
    public static int f2714e;
    private static C0678c f2715l;

    static {
        f2710a = -1;
        f2711b = -1;
        f2712c = -1;
        f2713d = -1;
        f2714e = -1;
    }

    private C0678c() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nuniform float u_position_interpolation_mix_0;\nattribute vec4 a_position_0;\nattribute vec4 a_position_1;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tvec4 position = vec4(0, 0, 0, 1);\n\tposition.xy = mix(a_position_0.xy,a_position_1.xy,u_position_interpolation_mix_0);\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nuniform sampler2D u_texture_1;\nuniform bool u_textureselect_texture_0;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tif(u_textureselect_texture_0) {\n\t\tgl_FragColor = texture2D(u_texture_0, v_textureCoordinates);\n\t} else {\n\t\tgl_FragColor = texture2D(u_texture_1, v_textureCoordinates);\n\t}\n}");
    }

    public static C0678c m5259a() {
        if (f2715l == null) {
            f2715l = new C0678c();
        }
        return f2715l;
    }

    protected void m5260a(C0714e c0714e) {
        GLES20.glBindAttribLocation(this.h, 4, "a_position_0");
        GLES20.glBindAttribLocation(this.h, 5, "a_position_1");
        GLES20.glBindAttribLocation(this.h, 3, "a_textureCoordinates");
        super.m5244a(c0714e);
        f2710a = m5243a("u_modelViewProjectionMatrix");
        f2711b = m5243a("u_texture_0");
        f2712c = m5243a("u_texture_1");
        f2713d = m5243a("u_textureselect_texture_0");
        f2714e = m5243a("u_position_interpolation_mix_0");
    }

    public void m5261a(C0714e c0714e, C0706c c0706c) {
        GLES20.glDisableVertexAttribArray(1);
        GLES20.glDisableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(4);
        GLES20.glEnableVertexAttribArray(5);
        super.m5245a(c0714e, c0706c);
        GLES20.glUniformMatrix4fv(f2710a, 1, false, c0714e.m5437p(), 0);
        GLES20.glUniform1i(f2711b, 0);
        GLES20.glUniform1i(f2712c, 1);
    }

    public void m5262b(C0714e c0714e) {
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glDisableVertexAttribArray(4);
        GLES20.glDisableVertexAttribArray(5);
        super.m5247b(c0714e);
    }
}
