package android.support.v4.p001b;

import java.util.Map;

/* renamed from: android.support.v4.b.b */
class C0035b extends C0034f {
    final /* synthetic */ C0033a f195a;

    C0035b(C0033a c0033a) {
        this.f195a = c0033a;
    }

    protected int m225a() {
        return this.f195a.h;
    }

    protected int m226a(Object obj) {
        return obj == null ? this.f195a.m198a() : this.f195a.m200a(obj, obj.hashCode());
    }

    protected Object m227a(int i, int i2) {
        return this.f195a.g[(i << 1) + i2];
    }

    protected Object m228a(int i, Object obj) {
        return this.f195a.m201a(i, obj);
    }

    protected void m229a(int i) {
        this.f195a.m205d(i);
    }

    protected void m230a(Object obj, Object obj2) {
        this.f195a.put(obj, obj2);
    }

    protected int m231b(Object obj) {
        return this.f195a.m199a(obj);
    }

    protected Map m232b() {
        return this.f195a;
    }

    protected void m233c() {
        this.f195a.clear();
    }
}
