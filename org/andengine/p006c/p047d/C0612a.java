package org.andengine.p006c.p047d;

import org.andengine.opengl.p046d.C0607c;
import org.andengine.opengl.p046d.C0708a;
import org.andengine.opengl.p046d.C0709e;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.p046d.p074a.C0707d;
import org.andengine.opengl.p064b.C0673g;
import org.andengine.opengl.p064b.C0677b;
import org.andengine.opengl.p067c.p073c.C0696b;
import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p006c.p045c.C0606c;
import org.andengine.p006c.p047d.p048a.C0610b;
import org.andengine.p006c.p047d.p048a.C0611a;

/* renamed from: org.andengine.c.d.a */
public class C0612a extends C0606c {
    public static final C0706c f2543g;
    protected boolean f2544I;
    public C0696b f2545h;
    protected final C0610b f2546i;
    protected boolean f2547j;

    static {
        f2543g = new C0707d(3).m5377a(0, "a_position", 2, 5126, false).m5377a(1, "a_color", 4, 5121, true).m5377a(3, "a_textureCoordinates", 2, 5126, false).m5376a();
    }

    public C0612a(float f, float f2, float f3, float f4, C0696b c0696b, C0610b c0610b, C0673g c0673g) {
        super(f, f2, f3, f4, c0673g);
        this.f2545h = c0696b;
        this.f2546i = c0610b;
        m5010b(true);
        m5006a(c0696b);
        m5062x();
        m5053b();
        m5063y();
    }

    public C0612a(float f, float f2, float f3, float f4, C0696b c0696b, C0709e c0709e, C0708a c0708a) {
        this(f, f2, f3, f4, c0696b, c0709e, c0708a, C0677b.m5256a());
    }

    public C0612a(float f, float f2, float f3, float f4, C0696b c0696b, C0709e c0709e, C0708a c0708a, C0673g c0673g) {
        this(f, f2, f3, f4, c0696b, (C0610b) new C0611a(c0709e, 20, c0708a, true, f2543g), c0673g);
    }

    public C0612a(float f, float f2, C0696b c0696b, C0709e c0709e) {
        this(f, f2, c0696b.m5340b(), c0696b.m5341c(), c0696b, c0709e, C0708a.STATIC);
    }

    public /* synthetic */ C0607c m5050a() {
        return m5061w();
    }

    protected void m5051a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f2546i.m5043a(this, f, f2, f3, f4, f5, f6, f7, f8);
    }

    public void m5052a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.v = f;
        this.w = f2;
        this.a = f3 - f;
        this.b = f4 - f2;
        m5051a(f9, f10, f11, f12, f13, f14, f15, f16);
        this.f2545h.m5339a(f5, f6, f7, f8);
        m5063y();
    }

    protected void m5053b() {
        this.f2546i.m5042a(this);
    }

    public void m5054b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.v = f;
        this.w = f2;
        this.a = f3 - f;
        this.b = f4 - f2;
        m5062x();
        this.f2545h.m5339a(f5, f6, f7, f8);
        m5063y();
    }

    protected void m5055b(C0714e c0714e, C0573a c0573a) {
        super.m5009b(c0714e, c0573a);
        m5058t().m5338a().m5302d(c0714e);
        this.f2546i.m5023a(c0714e, this.f);
    }

    protected void m5056c(C0714e c0714e, C0573a c0573a) {
        this.f2546i.m5021a(5, 4);
    }

    protected void m5057d(C0714e c0714e, C0573a c0573a) {
        this.f2546i.m5024b(c0714e, this.f);
        super.m5011d(c0714e, c0573a);
    }

    public C0696b m5058t() {
        return this.f2545h;
    }

    public boolean m5059u() {
        return this.f2544I;
    }

    public boolean m5060v() {
        return this.f2547j;
    }

    public C0610b m5061w() {
        return this.f2546i;
    }

    protected void m5062x() {
        this.f2546i.m5044b(this);
    }

    protected void m5063y() {
        this.f2546i.m5045c(this);
    }
}
