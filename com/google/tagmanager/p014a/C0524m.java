package com.google.tagmanager.p014a;

import java.io.OutputStream;

/* renamed from: com.google.tagmanager.a.m */
public final class C0524m {
    private final byte[] f2333a;
    private final int f2334b;
    private int f2335c;
    private int f2336d;
    private final OutputStream f2337e;

    private C0524m(OutputStream outputStream, byte[] bArr) {
        this.f2336d = 0;
        this.f2337e = outputStream;
        this.f2333a = bArr;
        this.f2335c = 0;
        this.f2334b = bArr.length;
    }

    public static C0524m m4758a(OutputStream outputStream) {
        return C0524m.m4759a(outputStream, 4096);
    }

    public static C0524m m4759a(OutputStream outputStream, int i) {
        return new C0524m(outputStream, new byte[i]);
    }

    private void m4760b() {
        if (this.f2337e == null) {
            throw new C0525n();
        }
        this.f2337e.write(this.f2333a, 0, this.f2335c);
        this.f2335c = 0;
    }

    public void m4761a() {
        if (this.f2337e != null) {
            m4760b();
        }
    }

    public void m4762a(byte b) {
        if (this.f2335c == this.f2334b) {
            m4760b();
        }
        byte[] bArr = this.f2333a;
        int i = this.f2335c;
        this.f2335c = i + 1;
        bArr[i] = b;
        this.f2336d++;
    }

    public void m4763a(int i) {
        m4774e(i);
    }

    public void m4764a(long j) {
        m4771c(j);
    }

    public void m4765a(C0516h c0516h) {
        m4772d(c0516h.m4583a());
        m4769b(c0516h);
    }

    public void m4766a(C0516h c0516h, int i, int i2) {
        if (this.f2334b - this.f2335c >= i2) {
            c0516h.m4591b(this.f2333a, i, this.f2335c, i2);
            this.f2335c += i2;
            this.f2336d += i2;
            return;
        }
        int i3 = this.f2334b - this.f2335c;
        c0516h.m4591b(this.f2333a, i, this.f2335c, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.f2335c = this.f2334b;
        this.f2336d = i3 + this.f2336d;
        m4760b();
        if (i5 <= this.f2334b) {
            c0516h.m4591b(this.f2333a, i4, 0, i5);
            this.f2335c = i5;
        } else {
            c0516h.m4587a(this.f2337e, i4, i5);
        }
        this.f2336d += i5;
    }

    public void m4767b(int i) {
        m4772d(i);
    }

    public void m4768b(long j) {
        m4773d(j);
    }

    public void m4769b(C0516h c0516h) {
        m4766a(c0516h, 0, c0516h.m4583a());
    }

    public void m4770c(int i) {
        m4762a((byte) i);
    }

    public void m4771c(long j) {
        while ((-128 & j) != 0) {
            m4770c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m4770c((int) j);
    }

    public void m4772d(int i) {
        while ((i & -128) != 0) {
            m4770c((i & 127) | 128);
            i >>>= 7;
        }
        m4770c(i);
    }

    public void m4773d(long j) {
        m4770c(((int) j) & 255);
        m4770c(((int) (j >> 8)) & 255);
        m4770c(((int) (j >> 16)) & 255);
        m4770c(((int) (j >> 24)) & 255);
        m4770c(((int) (j >> 32)) & 255);
        m4770c(((int) (j >> 40)) & 255);
        m4770c(((int) (j >> 48)) & 255);
        m4770c(((int) (j >> 56)) & 255);
    }

    public void m4774e(int i) {
        m4770c(i & 255);
        m4770c((i >> 8) & 255);
        m4770c((i >> 16) & 255);
        m4770c((i >> 24) & 255);
    }
}
