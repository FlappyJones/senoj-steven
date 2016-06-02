package org.andengine.opengl.p067c;

import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.c.d */
public abstract class C0688d implements C0687a {
    protected final C0701e f2735a;
    protected final C0700c f2736b;
    protected final C0702f f2737c;
    protected int f2738d;
    protected boolean f2739e;
    protected C0693b f2740f;

    public C0688d(C0701e c0701e, C0700c c0700c, C0702f c0702f, C0693b c0693b) {
        this.f2738d = -1;
        this.f2739e = false;
        this.f2735a = c0701e;
        this.f2736b = c0700c;
        this.f2737c = c0702f;
        this.f2740f = c0693b;
    }

    public void m5306a(C0714e c0714e) {
        this.f2738d = c0714e.m5430i();
        c0714e.m5422d(this.f2738d);
        m5312e(c0714e);
        this.f2737c.m5370a();
        this.f2739e = false;
        if (this.f2740f != null) {
            this.f2740f.m5332a(this);
        }
    }

    public void m5307b(C0714e c0714e) {
        c0714e.m5424e(this.f2738d);
        this.f2738d = -1;
        if (this.f2740f != null) {
            this.f2740f.m5333b(this);
        }
    }

    public void m5308c(C0714e c0714e) {
        m5307b(c0714e);
        m5306a(c0714e);
    }

    public boolean m5309c() {
        return this.f2738d != -1;
    }

    public void m5310d() {
        this.f2738d = -1;
    }

    public void m5311d(C0714e c0714e) {
        c0714e.m5422d(this.f2738d);
    }

    protected abstract void m5312e(C0714e c0714e);

    public boolean m5313e() {
        return this.f2739e;
    }

    public C0700c m5314f() {
        return this.f2736b;
    }

    public C0702f m5315g() {
        return this.f2737c;
    }

    public C0693b m5316h() {
        return this.f2740f;
    }

    public void m5317i() {
        this.f2735a.m5367a((C0687a) this);
    }
}
