package com.google.ads;

import java.io.OutputStream;

public final class aw {
    private final byte[] f988a;
    private final int f989b;
    private int f990c;
    private int f991d;
    private final OutputStream f992e;

    private aw(OutputStream outputStream, byte[] bArr) {
        this.f991d = 0;
        this.f992e = outputStream;
        this.f988a = bArr;
        this.f990c = 0;
        this.f989b = bArr.length;
    }

    public static aw m1637a(OutputStream outputStream) {
        return m1638a(outputStream, 4096);
    }

    public static aw m1638a(OutputStream outputStream, int i) {
        return new aw(outputStream, new byte[i]);
    }

    private void m1639b() {
        if (this.f992e == null) {
            throw new ax();
        }
        this.f992e.write(this.f988a, 0, this.f990c);
        this.f990c = 0;
    }

    public void m1640a() {
        if (this.f992e != null) {
            m1639b();
        }
    }

    public void m1641a(byte b) {
        if (this.f990c == this.f989b) {
            m1639b();
        }
        byte[] bArr = this.f988a;
        int i = this.f990c;
        this.f990c = i + 1;
        bArr[i] = b;
        this.f991d++;
    }

    public void m1642a(int i) {
        m1641a((byte) i);
    }

    public void m1643a(int i, int i2) {
        m1650b(ay.m1652a(i, i2));
    }

    public void m1644a(int i, long j) {
        m1643a(i, 0);
        m1646a(j);
    }

    public void m1645a(int i, String str) {
        m1643a(i, 2);
        m1647a(str);
    }

    public void m1646a(long j) {
        m1651b(j);
    }

    public void m1647a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m1650b(bytes.length);
        m1648a(bytes);
    }

    public void m1648a(byte[] bArr) {
        m1649a(bArr, 0, bArr.length);
    }

    public void m1649a(byte[] bArr, int i, int i2) {
        if (this.f989b - this.f990c >= i2) {
            System.arraycopy(bArr, i, this.f988a, this.f990c, i2);
            this.f990c += i2;
            this.f991d += i2;
            return;
        }
        int i3 = this.f989b - this.f990c;
        System.arraycopy(bArr, i, this.f988a, this.f990c, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.f990c = this.f989b;
        this.f991d = i3 + this.f991d;
        m1639b();
        if (i5 <= this.f989b) {
            System.arraycopy(bArr, i4, this.f988a, 0, i5);
            this.f990c = i5;
        } else {
            this.f992e.write(bArr, i4, i5);
        }
        this.f991d += i5;
    }

    public void m1650b(int i) {
        while ((i & -128) != 0) {
            m1642a((i & 127) | 128);
            i >>>= 7;
        }
        m1642a(i);
    }

    public void m1651b(long j) {
        while ((-128 & j) != 0) {
            m1642a((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m1642a((int) j);
    }
}
