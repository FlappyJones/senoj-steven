package org.andengine.p027a.p030c;

import android.media.SoundPool;
import org.andengine.p027a.C0561a;
import org.andengine.p027a.C0563d;
import org.andengine.p027a.p030c.p031a.C0567b;

/* renamed from: org.andengine.a.c.a */
public class C0568a extends C0561a {
    private int f2422c;
    private int f2423d;
    private boolean f2424e;
    private int f2425f;
    private float f2426g;

    C0568a(C0570c c0570c, int i) {
        super(c0570c);
        this.f2426g = 1.0f;
        this.f2422c = i;
    }

    private SoundPool m4872j() {
        return m4880i().m4889c();
    }

    protected /* synthetic */ C0563d m4873a() {
        return m4880i();
    }

    public void m4874a(boolean z) {
        this.f2424e = z;
    }

    protected void m4875c() {
        throw new C0567b();
    }

    public void m4876d() {
        super.m4861d();
        float b = m4859b();
        this.f2423d = m4872j().play(this.f2422c, this.a * b, this.b * b, 1, this.f2425f, this.f2426g);
    }

    public void m4877e() {
        super.m4862e();
        if (this.f2423d != 0) {
            m4872j().stop(this.f2423d);
        }
    }

    public void m4878f() {
        m4864g();
        m4872j().unload(this.f2422c);
        this.f2422c = 0;
        this.f2424e = false;
        m4880i().m4887b(this);
        super.m4863f();
    }

    public int m4879h() {
        return this.f2422c;
    }

    protected C0570c m4880i() {
        return (C0570c) super.m4858a();
    }
}
