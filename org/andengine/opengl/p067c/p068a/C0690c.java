package org.andengine.opengl.p067c.p068a;

import java.util.ArrayList;
import org.andengine.opengl.p067c.C0688d;
import org.andengine.opengl.p067c.C0693b;
import org.andengine.opengl.p067c.C0700c;
import org.andengine.opengl.p067c.C0701e;
import org.andengine.opengl.p067c.C0702f;
import org.andengine.opengl.p067c.p068a.p069b.C0683b;

/* renamed from: org.andengine.opengl.c.a.c */
public abstract class C0690c extends C0688d implements C0689a {
    protected final int f2741g;
    protected final int f2742h;
    protected final ArrayList f2743i;

    public C0690c(C0701e c0701e, int i, int i2, C0700c c0700c, C0702f c0702f, C0694b c0694b) {
        super(c0701e, c0700c, c0702f, c0694b);
        this.f2743i = new ArrayList();
        this.f2741g = i;
        this.f2742h = i2;
    }

    private void m5319b(C0683b c0683b, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal negative pTextureX supplied: '" + i + "'");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Illegal negative pTextureY supplied: '" + i2 + "'");
        } else if (c0683b.m5283c() + i > m5320a() || c0683b.m5284d() + i2 > m5322b()) {
            throw new IllegalArgumentException("Supplied pTextureAtlasSource must not exceed bounds of Texture.");
        }
    }

    public int m5320a() {
        return this.f2741g;
    }

    public void m5321a(C0683b c0683b, int i, int i2) {
        m5319b(c0683b, i, i2);
        c0683b.m5280a(i);
        c0683b.m5282b(i2);
        this.f2743i.add(c0683b);
        this.e = true;
    }

    public int m5322b() {
        return this.f2742h;
    }

    public /* synthetic */ C0693b m5323h() {
        return m5324j();
    }

    @Deprecated
    public C0694b m5324j() {
        return m5325k();
    }

    public C0694b m5325k() {
        return (C0694b) super.m5316h();
    }
}
