package org.andengine.input.p034a;

import android.view.MotionEvent;

/* renamed from: org.andengine.input.a.a */
public class C0650a {
    private static final C0651b f2639f;
    protected int f2640a;
    protected float f2641b;
    protected float f2642c;
    protected int f2643d;
    protected MotionEvent f2644e;

    static {
        f2639f = new C0651b();
    }

    public static C0650a m5187a(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        C0650a c0650a = (C0650a) f2639f.m5082d();
        c0650a.m5188b(f, f2, i, i2, motionEvent);
        return c0650a;
    }

    private void m5188b(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        this.f2641b = f;
        this.f2642c = f2;
        this.f2643d = i;
        this.f2640a = i2;
        this.f2644e = motionEvent;
    }

    public void m5189a() {
        f2639f.m5081c(this);
    }

    public void m5190a(float f, float f2) {
        this.f2641b = f;
        this.f2642c = f2;
    }

    public float m5191b() {
        return this.f2641b;
    }

    public void m5192b(float f, float f2) {
        this.f2641b += f;
        this.f2642c += f2;
    }

    public float m5193c() {
        return this.f2642c;
    }

    public int m5194d() {
        return this.f2640a;
    }

    public int m5195e() {
        return this.f2643d;
    }

    public boolean m5196f() {
        return this.f2643d == 0;
    }

    public boolean m5197g() {
        return this.f2643d == 1;
    }

    public boolean m5198h() {
        return this.f2643d == 2;
    }

    public boolean m5199i() {
        return this.f2643d == 3;
    }

    public boolean m5200j() {
        return this.f2643d == 4;
    }

    public MotionEvent m5201k() {
        return this.f2644e;
    }
}
