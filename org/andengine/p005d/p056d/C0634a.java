package org.andengine.p005d.p056d;

/* renamed from: org.andengine.d.d.a */
public class C0634a {
    public static final float f2573A;
    public static final int f2574B;
    public static final int f2575C;
    public static final int f2576D;
    public static final int f2577E;
    public static final int f2578F;
    public static final int f2579G;
    public static final int f2580H;
    public static final int f2581I;
    public static final int f2582J;
    public static final C0634a f2583a;
    public static final C0634a f2584b;
    public static final C0634a f2585c;
    public static final C0634a f2586d;
    public static final C0634a f2587e;
    public static final C0634a f2588f;
    public static final C0634a f2589g;
    public static final C0634a f2590h;
    public static final C0634a f2591i;
    public static final int f2592j;
    public static final int f2593k;
    public static final int f2594l;
    public static final int f2595m;
    public static final int f2596n;
    public static final int f2597o;
    public static final int f2598p;
    public static final int f2599q;
    public static final int f2600r;
    public static final float f2601s;
    public static final float f2602t;
    public static final float f2603u;
    public static final float f2604v;
    public static final float f2605w;
    public static final float f2606x;
    public static final float f2607y;
    public static final float f2608z;
    private float f2609K;
    private float f2610L;
    private float f2611M;
    private float f2612N;
    private int f2613O;
    private float f2614P;

    static {
        f2583a = new C0634a(1.0f, 1.0f, 1.0f, 1.0f);
        f2584b = new C0634a(0.0f, 0.0f, 0.0f, 1.0f);
        f2585c = new C0634a(1.0f, 0.0f, 0.0f, 1.0f);
        f2586d = new C0634a(1.0f, 1.0f, 0.0f, 1.0f);
        f2587e = new C0634a(0.0f, 1.0f, 0.0f, 1.0f);
        f2588f = new C0634a(0.0f, 1.0f, 1.0f, 1.0f);
        f2589g = new C0634a(0.0f, 0.0f, 1.0f, 1.0f);
        f2590h = new C0634a(1.0f, 0.0f, 1.0f, 1.0f);
        f2591i = new C0634a(0.0f, 0.0f, 0.0f, 0.0f);
        f2592j = f2583a.m5143e();
        f2593k = f2584b.m5143e();
        f2594l = f2585c.m5143e();
        f2595m = f2586d.m5143e();
        f2596n = f2587e.m5143e();
        f2597o = f2588f.m5143e();
        f2598p = f2589g.m5143e();
        f2599q = f2590h.m5143e();
        f2600r = f2591i.m5143e();
        f2601s = f2583a.m5144f();
        f2602t = f2584b.m5144f();
        f2603u = f2585c.m5144f();
        f2604v = f2586d.m5144f();
        f2605w = f2587e.m5144f();
        f2606x = f2588f.m5144f();
        f2607y = f2589g.m5144f();
        f2608z = f2590h.m5144f();
        f2573A = f2591i.m5144f();
        f2574B = f2583a.m5145g();
        f2575C = f2584b.m5145g();
        f2576D = f2585c.m5145g();
        f2577E = f2586d.m5145g();
        f2578F = f2587e.m5145g();
        f2579G = f2588f.m5145g();
        f2580H = f2589g.m5145g();
        f2581I = f2590h.m5145g();
        f2582J = f2591i.m5145g();
    }

    public C0634a(float f, float f2, float f3, float f4) {
        m5136a(f, f2, f3, f4);
    }

    private final void m5133h() {
        this.f2613O = (this.f2613O & 16777215) | (((int) (255.0f * this.f2612N)) << 24);
        this.f2614P = C0635b.m5146a(this.f2613O);
    }

    private final void m5134i() {
        this.f2613O = C0635b.m5148b(this.f2609K, this.f2610L, this.f2611M, this.f2612N);
        this.f2614P = C0635b.m5146a(this.f2613O);
    }

    public final float m5135a() {
        return this.f2609K;
    }

    public final void m5136a(float f, float f2, float f3, float f4) {
        this.f2609K = f;
        this.f2610L = f2;
        this.f2611M = f3;
        this.f2612N = f4;
        m5134i();
    }

    public final void m5137a(C0634a c0634a) {
        this.f2609K = c0634a.f2609K;
        this.f2610L = c0634a.f2610L;
        this.f2611M = c0634a.f2611M;
        this.f2612N = c0634a.f2612N;
        this.f2613O = c0634a.f2613O;
        this.f2614P = c0634a.f2614P;
    }

    public final boolean m5138a(float f) {
        if (this.f2612N == f) {
            return false;
        }
        this.f2612N = f;
        m5133h();
        return true;
    }

    public final float m5139b() {
        return this.f2610L;
    }

    public boolean m5140b(C0634a c0634a) {
        return this.f2613O == c0634a.f2613O;
    }

    public final float m5141c() {
        return this.f2611M;
    }

    public final float m5142d() {
        return this.f2612N;
    }

    public final int m5143e() {
        return this.f2613O;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : (obj == null || getClass() != obj.getClass()) ? false : m5140b((C0634a) obj);
    }

    public final float m5144f() {
        return this.f2614P;
    }

    public final int m5145g() {
        return C0635b.m5147a(this.f2609K, this.f2610L, this.f2611M, this.f2612N);
    }

    public int hashCode() {
        return this.f2613O;
    }

    public String toString() {
        return "[Red: " + this.f2609K + ", Green: " + this.f2610L + ", Blue: " + this.f2611M + ", Alpha: " + this.f2612N + "]";
    }
}
