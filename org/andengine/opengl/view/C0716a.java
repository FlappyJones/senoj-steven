package org.andengine.opengl.view;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: org.andengine.opengl.view.a */
public class C0716a implements EGLConfigChooser {
    private static final int[] f2855a;
    private static final int[] f2856b;
    private static final int[] f2857c;
    private static final int[] f2858d;
    private final boolean f2859e;
    private boolean f2860f;
    private boolean f2861g;
    private int f2862h;
    private int f2863i;
    private int f2864j;
    private int f2865k;
    private int f2866l;
    private int f2867m;

    static {
        f2855a = new int[1];
        r0 = new int[19];
        f2856b = r0;
        r0 = new int[19];
        f2857c = r0;
        r0 = new int[15];
        r0[0] = 12324;
        r0[1] = 5;
        r0[2] = 12323;
        r0[3] = 6;
        r0[4] = 12322;
        r0[5] = 5;
        r0[6] = 12321;
        r0[8] = 12325;
        r0[10] = 12326;
        r0[12] = 12352;
        r0[13] = 4;
        r0[14] = 12344;
        f2858d = r0;
    }

    public C0716a(boolean z) {
        this.f2862h = -1;
        this.f2863i = -1;
        this.f2864j = -1;
        this.f2865k = -1;
        this.f2866l = -1;
        this.f2867m = -1;
        this.f2859e = z;
    }

    private static int m5441a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, f2855a) ? f2855a[0] : i2;
    }

    private static int m5442a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, f2855a)) {
            return f2855a[0];
        }
        throw new IllegalArgumentException("EGLCONFIG_FALLBACK failed!");
    }

    private EGLConfig m5443a(EGL10 egl10, EGLDisplay eGLDisplay, C0717b c0717b) {
        int a;
        f2855a[0] = 0;
        if (this.f2859e) {
            a = C0716a.m5442a(egl10, eGLDisplay, f2856b);
            if (a > 0) {
                this.f2860f = true;
                return m5444a(egl10, eGLDisplay, f2856b, a, c0717b);
            }
            a = C0716a.m5442a(egl10, eGLDisplay, f2857c);
            if (a > 0) {
                this.f2861g = true;
                return m5444a(egl10, eGLDisplay, f2857c, a, c0717b);
            }
        }
        a = C0716a.m5442a(egl10, eGLDisplay, f2858d);
        if (a > 0) {
            return m5444a(egl10, eGLDisplay, f2858d, a, c0717b);
        }
        throw new IllegalArgumentException("No " + EGLConfig.class.getSimpleName() + " found!");
    }

    private EGLConfig m5444a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, int i, C0717b c0717b) {
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, f2855a)) {
            return m5445a(egl10, eGLDisplay, eGLConfigArr, c0717b);
        }
        throw new IllegalArgumentException("findEGLConfig failed!");
    }

    private EGLConfig m5445a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, C0717b c0717b) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            if (eGLConfig != null) {
                int a = C0716a.m5441a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int a2 = C0716a.m5441a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int a3 = C0716a.m5441a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int a4 = C0716a.m5441a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                int a5 = C0716a.m5441a(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int a6 = C0716a.m5441a(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (c0717b.m5453a(a, a2, a3, a4, a5, a6)) {
                    this.f2862h = a;
                    this.f2863i = a2;
                    this.f2864j = a3;
                    this.f2865k = a4;
                    this.f2866l = a5;
                    this.f2867m = a6;
                    return eGLConfig;
                }
            }
        }
        throw new IllegalArgumentException("No EGLConfig found!");
    }

    public boolean m5446a() {
        return this.f2861g;
    }

    public int m5447b() {
        return this.f2862h;
    }

    public int m5448c() {
        return this.f2863i;
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        try {
            return m5443a(egl10, eGLDisplay, C0717b.STRICT);
        } catch (IllegalArgumentException e) {
            try {
                return m5443a(egl10, eGLDisplay, C0717b.LOOSE_STENCIL);
            } catch (IllegalArgumentException e2) {
                try {
                    return m5443a(egl10, eGLDisplay, C0717b.LOOSE_DEPTH_AND_STENCIL);
                } catch (IllegalArgumentException e3) {
                    return m5443a(egl10, eGLDisplay, C0717b.ANY);
                }
            }
        }
    }

    public int m5449d() {
        return this.f2864j;
    }

    public int m5450e() {
        return this.f2865k;
    }

    public int m5451f() {
        return this.f2866l;
    }

    public int m5452g() {
        return this.f2867m;
    }
}
