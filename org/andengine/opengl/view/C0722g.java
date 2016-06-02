package org.andengine.opengl.view;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.C0575a;
import org.andengine.p003b.p039c.C0587d;
import org.andengine.p005d.p057e.C0637a;

/* renamed from: org.andengine.opengl.view.g */
public class C0722g implements Renderer {
    final C0575a f2873a;
    final C0716a f2874b;
    final boolean f2875c;
    final C0126h f2876d;
    final C0714e f2877e;

    public C0722g(C0575a c0575a, C0716a c0716a, C0126h c0126h) {
        this.f2873a = c0575a;
        this.f2874b = c0716a;
        this.f2876d = c0126h;
        this.f2877e = new C0714e();
        this.f2875c = this.f2873a.m4946d().m4970e().m4982a();
    }

    public void onDrawFrame(GL10 gl10) {
        synchronized (C0714e.class) {
            if (this.f2875c && this.f2874b.m5446a()) {
                GLES20.glClear(32768);
            }
            try {
                this.f2873a.m4934a(this.f2877e);
            } catch (Throwable e) {
                C0637a.m5156b("GLThread interrupted!", e);
            }
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f2873a.m4930a(i, i2);
        GLES20.glViewport(0, 0, i, i2);
        this.f2877e.m5436o();
        if (this.f2876d != null) {
            this.f2876d.m1093a(this.f2877e, i, i2);
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (C0714e.class) {
            C0587d e = this.f2873a.m4946d().m4970e();
            this.f2877e.m5413a(e, this.f2874b, eGLConfig);
            this.f2877e.m5428g();
            this.f2877e.m5414a();
            this.f2877e.m5415a(e.m4983b());
            if (this.f2876d != null) {
                this.f2876d.m1092a(this.f2877e);
            }
        }
    }
}
