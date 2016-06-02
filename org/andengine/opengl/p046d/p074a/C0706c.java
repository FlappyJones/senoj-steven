package org.andengine.opengl.p046d.p074a;

/* renamed from: org.andengine.opengl.d.a.c */
public class C0706c {
    private final int f2805a;
    private final C0704a[] f2806b;

    public C0706c(int i, C0704a... c0704aArr) {
        this.f2806b = c0704aArr;
        this.f2805a = i;
    }

    public void m5375a() {
        C0704a[] c0704aArr = this.f2806b;
        int i = this.f2805a;
        for (C0704a a : c0704aArr) {
            a.m5373a(i);
        }
    }
}
