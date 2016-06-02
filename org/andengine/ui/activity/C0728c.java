package org.andengine.ui.activity;

import org.andengine.p005d.p057e.C0637a;
import org.andengine.ui.C0725c;
import org.andengine.ui.C0727b;

/* renamed from: org.andengine.ui.activity.c */
class C0728c implements C0727b {
    final /* synthetic */ BaseGameActivity f2881a;
    private final /* synthetic */ C0725c f2882b;

    C0728c(BaseGameActivity baseGameActivity, C0725c c0725c) {
        this.f2881a = baseGameActivity;
        this.f2882b = c0725c;
    }

    public void m5463a() {
        try {
            C0637a.m5154b(new StringBuilder(String.valueOf(this.f2881a.getClass().getSimpleName())).append(".onCreateScene").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            this.f2881a.m1097a(this.f2882b);
        } catch (Throwable th) {
            C0637a.m5156b(new StringBuilder(String.valueOf(this.f2881a.getClass().getSimpleName())).append(".onCreateScene failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
    }
}
