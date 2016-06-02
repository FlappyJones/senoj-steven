package com.google.ads.util;

/* renamed from: com.google.ads.util.j */
public class C0232j {
    static final /* synthetic */ boolean f1268a;

    static {
        f1268a = !C0232j.class.desiredAssertionStatus();
    }

    private C0232j() {
    }

    public static byte[] m1844a(String str) {
        return C0232j.m1845a(str.getBytes(), 0);
    }

    public static byte[] m1845a(byte[] bArr, int i) {
        return C0232j.m1846a(bArr, 0, bArr.length, i);
    }

    public static byte[] m1846a(byte[] bArr, int i, int i2, int i3) {
        C0234l c0234l = new C0234l(i3, new byte[((i2 * 3) / 4)]);
        if (!c0234l.m1847a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        } else if (c0234l.b == c0234l.a.length) {
            return c0234l.a;
        } else {
            Object obj = new byte[c0234l.b];
            System.arraycopy(c0234l.a, 0, obj, 0, c0234l.b);
            return obj;
        }
    }
}
