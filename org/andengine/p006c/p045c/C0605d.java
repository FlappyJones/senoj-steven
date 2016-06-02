package org.andengine.p006c.p045c;

import org.andengine.input.p034a.C0650a;
import org.andengine.opengl.p046d.C0607c;
import org.andengine.opengl.p064b.C0673g;
import org.andengine.opengl.p067c.C0687a;
import org.andengine.opengl.p067c.C0702f;
import org.andengine.opengl.p067c.p073c.C0696b;
import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p006c.C0135a;

/* renamed from: org.andengine.c.c.d */
public abstract class C0605d extends C0135a implements C0603b {
    protected int f2526c;
    protected int f2527d;
    protected boolean f2528e;
    protected C0673g f2529f;

    public C0605d(float f, float f2, C0673g c0673g) {
        super(f, f2);
        this.f2526c = 770;
        this.f2527d = 771;
        this.f2528e = false;
        this.f2529f = c0673g;
    }

    public void m5004a(int i, int i2) {
        this.f2526c = i;
        this.f2527d = i2;
    }

    protected void m5005a(C0687a c0687a) {
        m5007a(c0687a.m5305g());
    }

    protected void m5006a(C0696b c0696b) {
        m5005a(c0696b.m5338a());
    }

    protected void m5007a(C0702f c0702f) {
        if (c0702f.f2796n) {
            m5004a(1, 771);
        }
    }

    public boolean m5008a(C0650a c0650a, float f, float f2) {
        return false;
    }

    protected void m5009b(C0714e c0714e, C0573a c0573a) {
        if (this.f2528e) {
            c0714e.m5414a();
            c0714e.m5411a(this.f2526c, this.f2527d);
        }
    }

    public void m5010b(boolean z) {
        this.f2528e = z;
    }

    protected void m5011d(C0714e c0714e, C0573a c0573a) {
        if (this.f2528e) {
            c0714e.m5419b();
        }
    }

    public void m5012n() {
        super.m1191n();
        C0607c a = m1157a();
        if (a != null && a.m5025b() && !a.m1146c()) {
            a.m1147n();
        }
    }
}
