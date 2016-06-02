package org.andengine.input.p034a.p035a;

import org.andengine.input.p034a.C0650a;
import org.andengine.p005d.p037a.p052b.C0624f;

/* renamed from: org.andengine.input.a.a.c */
class C0647c extends C0624f {
    final /* synthetic */ C0645a f2637a;
    private C0650a f2638d;

    C0647c(C0645a c0645a) {
        this.f2637a = c0645a;
    }

    protected void m5180a() {
        super.m5092a();
        C0650a c0650a = this.f2638d;
        c0650a.m5201k().recycle();
        c0650a.m5189a();
    }

    public void m5181a(C0650a c0650a) {
        this.f2638d = c0650a;
    }

    public void run() {
        this.f2637a.f2634a.m4925a(this.f2638d);
    }
}
