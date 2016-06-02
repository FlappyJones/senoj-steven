package org.andengine.opengl.p064b;

import android.opengl.GLES20;
import java.util.HashMap;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.p064b.p065a.C0670b;
import org.andengine.opengl.p064b.p065a.C0671a;
import org.andengine.opengl.p064b.p065a.C0672c;
import org.andengine.opengl.p064b.p066b.C0675a;
import org.andengine.opengl.p064b.p066b.C0676b;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.b.g */
public class C0673g {
    private static final int[] f2692a;
    private static final int[] f2693b;
    private static final int[] f2694c;
    private static final int[] f2695d;
    private static final int[] f2696e;
    private static final byte[] f2697l;
    protected final C0675a f2698f;
    protected final C0675a f2699g;
    protected int f2700h;
    protected boolean f2701i;
    protected final HashMap f2702j;
    protected final HashMap f2703k;

    static {
        f2692a = new int[1];
        f2693b = new int[1];
        f2694c = new int[1];
        f2695d = new int[1];
        f2696e = new int[1];
        f2697l = new byte[64];
    }

    public C0673g(String str, String str2) {
        this(new C0676b(str), new C0676b(str2));
    }

    public C0673g(C0675a c0675a, C0675a c0675a2) {
        this.f2700h = -1;
        this.f2702j = new HashMap();
        this.f2703k = new HashMap();
        this.f2698f = c0675a;
        this.f2699g = c0675a2;
    }

    private static int m5240a(String str, int i) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            throw new C0670b("Could not create Shader of type: '" + i + '\"');
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, f2692a, 0);
        if (f2692a[0] != 0) {
            return glCreateShader;
        }
        throw new C0671a(GLES20.glGetShaderInfoLog(glCreateShader), str);
    }

    private void m5241a() {
        this.f2702j.clear();
        f2693b[0] = 0;
        GLES20.glGetProgramiv(this.f2700h, 35718, f2693b, 0);
        int i = f2693b[0];
        for (int i2 = 0; i2 < i; i2++) {
            GLES20.glGetActiveUniform(this.f2700h, i2, 64, f2694c, 0, f2695d, 0, f2696e, 0, f2697l, 0);
            int i3 = f2694c[0];
            if (i3 == 0) {
                while (i3 < 64 && f2697l[i3] != null) {
                    i3++;
                }
            }
            Object str = new String(f2697l, 0, i3);
            i3 = GLES20.glGetUniformLocation(this.f2700h, str);
            if (i3 == -1) {
                i3 = 0;
                while (i3 < 64 && f2697l[i3] != null) {
                    i3++;
                }
                str = new String(f2697l, 0, i3);
                i3 = GLES20.glGetUniformLocation(this.f2700h, str);
                if (i3 == -1) {
                    throw new C0672c("Invalid location for uniform: '" + str + "'.");
                }
            }
            this.f2702j.put(str, Integer.valueOf(i3));
        }
    }

    @Deprecated
    private void m5242c() {
        this.f2703k.clear();
        f2693b[0] = 0;
        GLES20.glGetProgramiv(this.f2700h, 35721, f2693b, 0);
        int i = f2693b[0];
        for (int i2 = 0; i2 < i; i2++) {
            GLES20.glGetActiveAttrib(this.f2700h, i2, 64, f2694c, 0, f2695d, 0, f2696e, 0, f2697l, 0);
            int i3 = f2694c[0];
            if (i3 == 0) {
                while (i3 < 64 && f2697l[i3] != null) {
                    i3++;
                }
            }
            Object str = new String(f2697l, 0, i3);
            i3 = GLES20.glGetAttribLocation(this.f2700h, str);
            if (i3 == -1) {
                i3 = 0;
                while (i3 < 64 && f2697l[i3] != null) {
                    i3++;
                }
                str = new String(f2697l, 0, i3);
                i3 = GLES20.glGetAttribLocation(this.f2700h, str);
                if (i3 == -1) {
                    throw new C0672c("Invalid location for attribute: '" + str + "'.");
                }
            }
            this.f2703k.put(str, Integer.valueOf(i3));
        }
    }

    public int m5243a(String str) {
        Integer num = (Integer) this.f2702j.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new C0670b("Unexpected uniform: '" + str + "'. Existing uniforms: " + this.f2702j.toString());
    }

    protected void m5244a(C0714e c0714e) {
        GLES20.glLinkProgram(this.f2700h);
        GLES20.glGetProgramiv(this.f2700h, 35714, f2692a, 0);
        if (f2692a[0] == 0) {
            throw new C0672c(GLES20.glGetProgramInfoLog(this.f2700h));
        }
        m5242c();
        m5241a();
        this.f2701i = true;
    }

    public void m5245a(C0714e c0714e, C0706c c0706c) {
        if (!this.f2701i) {
            m5249c(c0714e);
        }
        c0714e.m5420c(this.f2700h);
        c0706c.m5375a();
    }

    public void m5246a(boolean z) {
        this.f2701i = z;
    }

    public void m5247b(C0714e c0714e) {
    }

    public boolean m5248b() {
        return this.f2701i;
    }

    protected void m5249c(C0714e c0714e) {
        String a = this.f2698f.m5254a(c0714e);
        int a2 = C0673g.m5240a(a, 35633);
        String a3 = this.f2699g.m5254a(c0714e);
        int a4 = C0673g.m5240a(a3, 35632);
        this.f2700h = GLES20.glCreateProgram();
        GLES20.glAttachShader(this.f2700h, a2);
        GLES20.glAttachShader(this.f2700h, a4);
        try {
            m5244a(c0714e);
            GLES20.glDeleteShader(a2);
            GLES20.glDeleteShader(a4);
        } catch (C0670b e) {
            throw new C0672c("VertexShaderSource:\n##########################\n" + a + "\n##########################" + "\n\nFragmentShaderSource:\n##########################\n" + a3 + "\n##########################", e);
        }
    }
}
