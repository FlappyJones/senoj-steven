package android.support.v4.p001b;

/* renamed from: android.support.v4.b.c */
class C0036c {
    static final int[] f196a;
    static final long[] f197b;
    static final Object[] f198c;

    static {
        f196a = new int[0];
        f197b = new long[0];
        f198c = new Object[0];
    }

    public static int m234a(int i) {
        return C0036c.m237b(i * 4) / 4;
    }

    static int m235a(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = i - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i3 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return i3 ^ -1;
    }

    public static boolean m236a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int m237b(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }
}
