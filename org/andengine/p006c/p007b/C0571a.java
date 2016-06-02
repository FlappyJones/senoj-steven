package org.andengine.p006c.p007b;

import org.andengine.input.p034a.C0650a;
import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.p032a.C0573a;

/* renamed from: org.andengine.c.b.a */
public class C0571a extends C0136e {
    protected C0573a f2430a;

    public C0571a() {
        this(null);
    }

    public C0571a(C0573a c0573a) {
        this.f2430a = c0573a;
    }

    public boolean m4890a(C0650a c0650a) {
        if (this.f2430a == null) {
            return false;
        }
        this.f2430a.m4904a(c0650a);
        if (super.m1196a(c0650a)) {
            return true;
        }
        this.f2430a.m4909b(c0650a);
        return false;
    }

    protected boolean m4891b(C0650a c0650a) {
        if (!(this.I instanceof C0571a)) {
            return super.m1197b(c0650a);
        }
        this.f2430a.m4909b(c0650a);
        boolean b = super.m1197b(c0650a);
        this.f2430a.m4904a(c0650a);
        return b;
    }

    protected void m4892f(C0714e c0714e, C0573a c0573a) {
        this.f2430a.m4916d(c0714e);
    }
}
