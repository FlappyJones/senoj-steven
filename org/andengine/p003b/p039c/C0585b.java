package org.andengine.p003b.p039c;

import org.andengine.p003b.C0592c;
import org.andengine.p003b.C0593d;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p003b.p039c.p040a.C0581c;

/* renamed from: org.andengine.b.c.b */
public class C0585b {
    private C0592c f2488a;
    private final boolean f2489b;
    private final C0588e f2490c;
    private final C0581c f2491d;
    private final C0573a f2492e;
    private final C0590g f2493f;
    private final C0584a f2494g;
    private final C0587d f2495h;
    private C0591h f2496i;
    private C0593d f2497j;
    private int f2498k;

    public C0585b(boolean z, C0588e c0588e, C0581c c0581c, C0573a c0573a) {
        this.f2493f = new C0590g();
        this.f2494g = new C0584a();
        this.f2495h = new C0587d();
        this.f2496i = C0591h.SCREEN_ON;
        this.f2498k = 0;
        this.f2489b = z;
        this.f2490c = c0588e;
        this.f2491d = c0581c;
        this.f2492e = c0573a;
    }

    public C0585b m4965a(C0591h c0591h) {
        this.f2496i = c0591h;
        return this;
    }

    public boolean m4966a() {
        return this.f2488a != null;
    }

    public C0592c m4967b() {
        return this.f2488a;
    }

    public C0590g m4968c() {
        return this.f2493f;
    }

    public C0584a m4969d() {
        return this.f2494g;
    }

    public C0587d m4970e() {
        return this.f2495h;
    }

    public boolean m4971f() {
        return this.f2489b;
    }

    public C0588e m4972g() {
        return this.f2490c;
    }

    public C0581c m4973h() {
        return this.f2491d;
    }

    public C0573a m4974i() {
        return this.f2492e;
    }

    public boolean m4975j() {
        return this.f2497j != null;
    }

    public C0593d m4976k() {
        return this.f2497j;
    }

    public int m4977l() {
        return this.f2498k;
    }

    public C0591h m4978m() {
        return this.f2496i;
    }
}
