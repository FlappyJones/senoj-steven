package com.google.tagmanager.p014a;

import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: com.google.tagmanager.a.aj */
class aj extends C0516h {
    protected final byte[] f2224c;
    private int f2225d;

    aj(byte[] bArr) {
        this.f2225d = 0;
        this.f2224c = bArr;
    }

    static int m4601a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public byte m4602a(int i) {
        return this.f2224c[i];
    }

    public int m4603a() {
        return this.f2224c.length;
    }

    protected int m4604a(int i, int i2, int i3) {
        int b = m4608b() + i2;
        return bj.m4689a(i, this.f2224c, b, b + i3);
    }

    public String m4605a(String str) {
        return new String(this.f2224c, m4608b(), m4603a(), str);
    }

    protected void m4606a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f2224c, i, bArr, i2, i3);
    }

    boolean m4607a(aj ajVar, int i, int i2) {
        if (i2 > ajVar.m4603a()) {
            throw new IllegalArgumentException("Length too large: " + i2 + m4603a());
        } else if (i + i2 > ajVar.m4603a()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + ajVar.m4603a());
        } else {
            byte[] bArr = this.f2224c;
            byte[] bArr2 = ajVar.f2224c;
            int b = m4608b() + i2;
            int b2 = m4608b();
            int b3 = ajVar.m4608b() + i;
            while (b2 < b) {
                if (bArr[b2] != bArr2[b3]) {
                    return false;
                }
                b2++;
                b3++;
            }
            return true;
        }
    }

    protected int m4608b() {
        return 0;
    }

    protected int m4609b(int i, int i2, int i3) {
        return aj.m4601a(i, this.f2224c, m4608b() + i2, i3);
    }

    void m4610b(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f2224c, m4608b() + i, i2);
    }

    public C0517i m4611c() {
        return new al();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0516h)) {
            return false;
        }
        if (m4603a() != ((C0516h) obj).m4583a()) {
            return false;
        }
        if (m4603a() == 0) {
            return true;
        }
        if (obj instanceof aj) {
            return m4607a((aj) obj, 0, m4603a());
        }
        if (obj instanceof ar) {
            return obj.equals(this);
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + obj.getClass());
    }

    public boolean m4612g() {
        int b = m4608b();
        return bj.m4691a(this.f2224c, b, m4603a() + b);
    }

    public C0522k m4613h() {
        return C0522k.m4717a(this);
    }

    public int hashCode() {
        int i = this.f2225d;
        if (i == 0) {
            i = m4603a();
            i = m4609b(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.f2225d = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return m4611c();
    }

    protected int m4614j() {
        return 0;
    }

    protected boolean m4615k() {
        return true;
    }

    protected int m4616l() {
        return this.f2225d;
    }
}
