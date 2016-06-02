package org.andengine.input.p034a.p035a;

import android.view.MotionEvent;
import org.andengine.input.p034a.C0650a;
import org.andengine.p005d.p037a.p052b.C0625g;

/* renamed from: org.andengine.input.a.a.a */
public abstract class C0645a implements C0644d {
    private C0574e f2634a;
    private final C0625g f2635b;

    public C0645a() {
        this.f2635b = new C0646b(this);
    }

    protected void m5176a(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        C0647c c0647c = (C0647c) this.f2635b.m5099d();
        c0647c.m5181a(C0650a.m5187a(f, f2, i, i2, MotionEvent.obtain(motionEvent)));
        this.f2635b.m5097b(c0647c);
    }

    public void m5177a(C0574e c0574e) {
        this.f2634a = c0574e;
    }

    public void a_(float f) {
        this.f2635b.a_(f);
    }
}
