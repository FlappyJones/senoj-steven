package org.andengine.ui.activity;

import org.andengine.p005d.p057e.C0637a;
import org.andengine.p006c.p007b.C0136e;
import org.andengine.ui.C0723d;
import org.andengine.ui.C0725c;

/* renamed from: org.andengine.ui.activity.b */
class C0726b implements C0725c {
    final /* synthetic */ BaseGameActivity f2879a;
    private final /* synthetic */ C0723d f2880b;

    C0726b(BaseGameActivity baseGameActivity, C0723d c0723d) {
        this.f2879a = baseGameActivity;
        this.f2880b = c0723d;
    }

    public void m5461a(C0136e c0136e) {
        this.f2879a.f477k.m4932a(c0136e);
        try {
            C0637a.m5154b(new StringBuilder(String.valueOf(this.f2879a.getClass().getSimpleName())).append(".onPopulateScene").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            this.f2879a.m1095a(c0136e, this.f2880b);
        } catch (Throwable th) {
            C0637a.m5156b(new StringBuilder(String.valueOf(this.f2879a.getClass().getSimpleName())).append(".onPopulateScene failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
    }
}
