package org.andengine.opengl.p067c.p068a.p069b;

/* renamed from: org.andengine.opengl.c.a.b.a */
public abstract class C0684a implements C0683b {
    protected int f2729a;
    protected int f2730b;
    protected int f2731c;
    protected int f2732d;

    public C0684a(int i, int i2, int i3, int i4) {
        this.f2729a = i;
        this.f2730b = i2;
        this.f2731c = i3;
        this.f2732d = i4;
    }

    public int m5285a() {
        return this.f2729a;
    }

    public void m5286a(int i) {
        this.f2729a = i;
    }

    public int m5287b() {
        return this.f2730b;
    }

    public void m5288b(int i) {
        this.f2730b = i;
    }

    public int m5289c() {
        return this.f2731c;
    }

    public int m5290d() {
        return this.f2732d;
    }

    public String toString() {
        return new StringBuilder(String.valueOf(getClass().getSimpleName())).append("( ").append(m5289c()).append("x").append(m5290d()).append(" @ ").append(this.f2729a).append("/").append(this.f2730b).append(" )").toString();
    }
}
