package org.andengine.p005d.p037a.p052b;

import org.andengine.p003b.p004b.C0132c;
import org.andengine.p005d.p037a.p038a.C0618a;
import org.andengine.p005d.p037a.p051c.C0617a;
import org.andengine.p005d.p037a.p051c.p053a.C0626a;

/* renamed from: org.andengine.d.a.b.d */
public abstract class C0622d implements C0132c {
    private final C0620b f2560a;
    private final C0617a f2561b;

    public C0622d() {
        this.f2561b = new C0626a(new C0618a());
        this.f2560a = new C0623e(this);
    }

    protected abstract void m5096a(C0621c c0621c);

    public void a_(float f) {
        C0617a c0617a = this.f2561b;
        C0620b c0620b = this.f2560a;
        while (true) {
            C0621c c0621c = (C0621c) c0617a.m5070a();
            if (c0621c != null) {
                m5096a(c0621c);
                c0620b.m5090c(c0621c);
            } else {
                return;
            }
        }
    }

    public void m5097b(C0621c c0621c) {
        if (c0621c == null) {
            throw new IllegalArgumentException("PoolItem already recycled!");
        } else if (this.f2560a.m5091d(c0621c)) {
            this.f2561b.m5071a(c0621c);
        } else {
            throw new IllegalArgumentException("PoolItem from another pool!");
        }
    }

    protected abstract C0621c m5098c();

    public C0621c m5099d() {
        return (C0621c) this.f2560a.m5082d();
    }
}
