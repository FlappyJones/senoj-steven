package com.google.tagmanager.p014a;

import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: com.google.tagmanager.a.j */
public final class C0521j extends OutputStream {
    private static final byte[] f2313a;
    private final int f2314b;
    private final ArrayList f2315c;
    private int f2316d;
    private byte[] f2317e;
    private int f2318f;

    static {
        f2313a = new byte[0];
    }

    C0521j(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer size < 0");
        }
        this.f2314b = i;
        this.f2315c = new ArrayList();
        this.f2317e = new byte[i];
    }

    private void m4712a(int i) {
        this.f2315c.add(new aj(this.f2317e));
        this.f2316d += this.f2317e.length;
        this.f2317e = new byte[Math.max(this.f2314b, Math.max(i, this.f2316d >>> 1))];
        this.f2318f = 0;
    }

    private void m4713c() {
        if (this.f2318f >= this.f2317e.length) {
            this.f2315c.add(new aj(this.f2317e));
            this.f2317e = f2313a;
        } else if (this.f2318f > 0) {
            Object obj = new byte[this.f2318f];
            System.arraycopy(this.f2317e, 0, obj, 0, this.f2318f);
            this.f2315c.add(new aj(obj));
        }
        this.f2316d += this.f2318f;
        this.f2318f = 0;
    }

    public synchronized C0516h m4714a() {
        m4713c();
        return C0516h.m4579a(this.f2315c);
    }

    public synchronized int m4715b() {
        return this.f2316d + this.f2318f;
    }

    public String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m4715b())});
    }

    public synchronized void write(int i) {
        if (this.f2318f == this.f2317e.length) {
            m4712a(1);
        }
        byte[] bArr = this.f2317e;
        int i2 = this.f2318f;
        this.f2318f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        if (i2 <= this.f2317e.length - this.f2318f) {
            System.arraycopy(bArr, i, this.f2317e, this.f2318f, i2);
            this.f2318f += i2;
        } else {
            int length = this.f2317e.length - this.f2318f;
            System.arraycopy(bArr, i, this.f2317e, this.f2318f, length);
            int i3 = i + length;
            length = i2 - length;
            m4712a(length);
            System.arraycopy(bArr, i3, this.f2317e, 0, length);
            this.f2318f = length;
        }
    }
}
