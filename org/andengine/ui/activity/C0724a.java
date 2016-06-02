package org.andengine.ui.activity;

import org.andengine.p005d.p057e.C0637a;
import org.andengine.ui.C0723d;

/* renamed from: org.andengine.ui.activity.a */
class C0724a implements C0723d {
    final /* synthetic */ BaseGameActivity f2878a;

    C0724a(BaseGameActivity baseGameActivity) {
        this.f2878a = baseGameActivity;
    }

    public void m5459a() {
        try {
            C0637a.m5154b(new StringBuilder(String.valueOf(this.f2878a.getClass().getSimpleName())).append(".onGameCreated").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            this.f2878a.m1112r();
        } catch (Throwable th) {
            C0637a.m5156b(new StringBuilder(String.valueOf(this.f2878a.getClass().getSimpleName())).append(".onGameCreated failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
        this.f2878a.m1102c();
    }
}
