package org.andengine.ui.activity;

import org.andengine.p006c.p007b.C0136e;
import org.andengine.ui.C0723d;
import org.andengine.ui.C0725c;
import org.andengine.ui.C0727b;

public abstract class SimpleBaseGameActivity extends BaseGameActivity {
    public final void m1121a(C0136e c0136e, C0723d c0723d) {
        c0723d.m5458a();
    }

    public final void m1122a(C0727b c0727b) {
        m1124l();
        c0727b.m5462a();
    }

    public final void m1123a(C0725c c0725c) {
        c0725c.m5460a(m1125m());
    }

    protected abstract void m1124l();

    protected abstract C0136e m1125m();
}
