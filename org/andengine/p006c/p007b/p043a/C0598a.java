package org.andengine.p006c.p007b.p043a;

import android.opengl.GLES20;
import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p005d.p041h.C0595c;
import org.andengine.p005d.p056d.C0634a;

/* renamed from: org.andengine.c.b.a.a */
public class C0598a implements C0597b {
    private C0595c f2523a;
    private final C0634a f2524b;
    private boolean f2525c;

    protected C0598a() {
        this.f2523a = null;
        this.f2524b = new C0634a(0.0f, 0.0f, 0.0f, 1.0f);
        this.f2525c = true;
    }

    public C0598a(C0634a c0634a) {
        this.f2523a = null;
        this.f2524b = new C0634a(0.0f, 0.0f, 0.0f, 1.0f);
        this.f2525c = true;
        this.f2524b.m5137a(c0634a);
    }

    public void m4998a(C0714e c0714e, C0573a c0573a) {
        if (this.f2525c) {
            GLES20.glClearColor(this.f2524b.m5135a(), this.f2524b.m5139b(), this.f2524b.m5141c(), this.f2524b.m5142d());
            GLES20.glClear(16384);
        }
    }

    public void a_(float f) {
        if (this.f2523a != null) {
            this.f2523a.a_(f);
        }
    }
}
