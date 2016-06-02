package com.google.tagmanager.p014a;

import java.io.InputStream;

/* renamed from: com.google.tagmanager.a.aw */
class aw extends InputStream {
    final /* synthetic */ ar f2243a;
    private au f2244b;
    private aj f2245c;
    private int f2246d;
    private int f2247e;
    private int f2248f;
    private int f2249g;

    public aw(ar arVar) {
        this.f2243a = arVar;
        m4649a();
    }

    private int m4648a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            m4650b();
            if (this.f2245c == null) {
                if (i3 == i2) {
                    return -1;
                }
                return i2 - i3;
            }
            int min = Math.min(this.f2246d - this.f2247e, i3);
            if (bArr != null) {
                this.f2245c.m4591b(bArr, this.f2247e, i4, min);
                i4 += min;
            }
            this.f2247e += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    private void m4649a() {
        this.f2244b = new au(null);
        this.f2245c = this.f2244b.m4645a();
        this.f2246d = this.f2245c.m4603a();
        this.f2247e = 0;
        this.f2248f = 0;
    }

    private void m4650b() {
        if (this.f2245c != null && this.f2247e == this.f2246d) {
            this.f2248f += this.f2246d;
            this.f2247e = 0;
            if (this.f2244b.hasNext()) {
                this.f2245c = this.f2244b.m4645a();
                this.f2246d = this.f2245c.m4603a();
                return;
            }
            this.f2245c = null;
            this.f2246d = 0;
        }
    }

    public int available() {
        return this.f2243a.m4626a() - (this.f2248f + this.f2247e);
    }

    public void mark(int i) {
        this.f2249g = this.f2248f + this.f2247e;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        m4650b();
        if (this.f2245c == null) {
            return -1;
        }
        aj ajVar = this.f2245c;
        int i = this.f2247e;
        this.f2247e = i + 1;
        return ajVar.m4602a(i) & 255;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            return m4648a(bArr, i, i2);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public synchronized void reset() {
        m4649a();
        m4648a(null, 0, this.f2249g);
    }

    public long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (long) m4648a(null, 0, (int) j);
    }
}
