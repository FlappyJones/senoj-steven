package org.andengine.p003b;

import org.andengine.p003b.p039c.C0585b;

/* renamed from: org.andengine.b.e */
public class C0594e extends C0575a {
    private final long f2521e;

    public C0594e(C0585b c0585b, int i) {
        super(c0585b);
        this.f2521e = 1000000000 / ((long) i);
    }

    public void m4996a(long j) {
        long j2 = this.f2521e - j;
        if (j2 <= 0) {
            super.m4931a(j);
            return;
        }
        Thread.sleep((long) ((int) (j2 / 1000000)));
        super.m4931a(j2 + j);
    }
}
