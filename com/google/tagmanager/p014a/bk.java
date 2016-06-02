package com.google.tagmanager.p014a;

/* renamed from: com.google.tagmanager.a.bk */
public final class bk {
    static final int f2272a;
    static final int f2273b;
    static final int f2274c;
    static final int f2275d;

    static {
        f2272a = bk.m4696a(1, 3);
        f2273b = bk.m4696a(1, 4);
        f2274c = bk.m4696a(2, 0);
        f2275d = bk.m4696a(3, 2);
    }

    static int m4695a(int i) {
        return i & 7;
    }

    static int m4696a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int m4697b(int i) {
        return i >>> 3;
    }
}
