package com.google.tagmanager.p014a;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.tagmanager.a.ac */
public class ac {
    public static final byte[] f2213a;
    public static final ByteBuffer f2214b;

    static {
        f2213a = new byte[0];
        f2214b = ByteBuffer.wrap(f2213a);
    }

    public static int m4551a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    public static int m4552a(ad adVar) {
        return adVar.m1941a();
    }

    public static int m4553a(List list) {
        int i = 1;
        for (ad a : list) {
            i = ac.m4552a(a) + (i * 31);
        }
        return i;
    }

    public static int m4554a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean m4555a(byte[] bArr) {
        return bj.m4690a(bArr);
    }

    public static String m4556b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (Throwable e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
