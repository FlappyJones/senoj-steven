package com.google.tagmanager.p014a;

import java.util.Iterator;

/* renamed from: com.google.tagmanager.a.e */
class C0518e extends aj {
    private final int f2308d;
    private final int f2309e;

    C0518e(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            throw new IllegalArgumentException("Offset too small: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Length too small: " + i);
        } else if (((long) i) + ((long) i2) > ((long) bArr.length)) {
            throw new IllegalArgumentException("Offset+Length too large: " + i + "+" + i2);
        } else {
            this.f2308d = i;
            this.f2309e = i2;
        }
    }

    public byte m4705a(int i) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index too small: " + i);
        } else if (i < m4706a()) {
            return this.c[this.f2308d + i];
        } else {
            throw new ArrayIndexOutOfBoundsException("Index too large: " + i + ", " + m4706a());
        }
    }

    public int m4706a() {
        return this.f2309e;
    }

    protected void m4707a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, m4708b() + i, bArr, i2, i3);
    }

    protected int m4708b() {
        return this.f2308d;
    }

    public C0517i m4709c() {
        return new C0520g();
    }

    public /* synthetic */ Iterator iterator() {
        return m4709c();
    }
}
