package org.andengine.p005d.p037a.p052b;

/* renamed from: org.andengine.d.a.b.b */
public abstract class C0620b extends C0619a {
    protected C0621c m5083a() {
        C0621c c0621c = (C0621c) super.m5080c();
        c0621c.f2558b = this;
        return c0621c;
    }

    protected /* synthetic */ void m5084a(Object obj) {
        m5087b((C0621c) obj);
    }

    protected void m5085a(C0621c c0621c) {
        c0621c.f2559c = false;
        c0621c.m5095c();
    }

    protected /* synthetic */ void m5086b(Object obj) {
        m5085a((C0621c) obj);
    }

    protected void m5087b(C0621c c0621c) {
        c0621c.m5092a();
        c0621c.f2559c = true;
    }

    protected /* synthetic */ Object m5088c() {
        return m5083a();
    }

    public synchronized void m5090c(C0621c c0621c) {
        if (c0621c.f2558b == null) {
            throw new IllegalArgumentException("PoolItem not assigned to a pool!");
        } else if (!c0621c.m5093a(this)) {
            throw new IllegalArgumentException("PoolItem from another pool!");
        } else if (c0621c.m5094b()) {
            throw new IllegalArgumentException("PoolItem already recycled!");
        } else {
            super.m5081c(c0621c);
        }
    }

    public synchronized boolean m5091d(C0621c c0621c) {
        return c0621c.f2558b == this;
    }
}
