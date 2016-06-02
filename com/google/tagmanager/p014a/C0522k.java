package com.google.tagmanager.p014a;

import com.google.android.gms.C0338e;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.tagmanager.a.k */
public final class C0522k {
    private final byte[] f2319a;
    private final boolean f2320b;
    private int f2321c;
    private int f2322d;
    private int f2323e;
    private final InputStream f2324f;
    private int f2325g;
    private boolean f2326h;
    private int f2327i;
    private int f2328j;
    private int f2329k;
    private int f2330l;
    private int f2331m;
    private C0523l f2332n;

    private C0522k(aj ajVar) {
        this.f2326h = false;
        this.f2328j = Integer.MAX_VALUE;
        this.f2330l = 64;
        this.f2331m = 67108864;
        this.f2332n = null;
        this.f2319a = ajVar.f2224c;
        this.f2323e = ajVar.m4608b();
        this.f2321c = ajVar.m4608b() + ajVar.m4603a();
        this.f2327i = -this.f2323e;
        this.f2324f = null;
        this.f2320b = true;
    }

    private C0522k(InputStream inputStream) {
        this.f2326h = false;
        this.f2328j = Integer.MAX_VALUE;
        this.f2330l = 64;
        this.f2331m = 67108864;
        this.f2332n = null;
        this.f2319a = new byte[4096];
        this.f2321c = 0;
        this.f2323e = 0;
        this.f2327i = 0;
        this.f2324f = inputStream;
        this.f2320b = false;
    }

    public static long m4716a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    static C0522k m4717a(aj ajVar) {
        C0522k c0522k = new C0522k(ajVar);
        try {
            c0522k.m4731c(ajVar.m4603a());
            return c0522k;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static C0522k m4718a(InputStream inputStream) {
        return new C0522k(inputStream);
    }

    private boolean m4719a(boolean z) {
        if (this.f2323e < this.f2321c) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        } else if (this.f2327i + this.f2321c != this.f2328j) {
            if (this.f2332n != null) {
                this.f2332n.m4757a();
            }
            this.f2327i += this.f2321c;
            this.f2323e = 0;
            this.f2321c = this.f2324f == null ? -1 : this.f2324f.read(this.f2319a);
            if (this.f2321c == 0 || this.f2321c < -1) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f2321c + "\nThe InputStream implementation is buggy.");
            } else if (this.f2321c == -1) {
                this.f2321c = 0;
                if (!z) {
                    return false;
                }
                throw af.m4557b();
            } else {
                m4721z();
                int i = (this.f2327i + this.f2321c) + this.f2322d;
                if (i <= this.f2331m && i >= 0) {
                    return true;
                }
                throw af.m4564i();
            }
        } else if (!z) {
            return false;
        } else {
            throw af.m4557b();
        }
    }

    public static int m4720b(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    private void m4721z() {
        this.f2321c += this.f2322d;
        int i = this.f2327i + this.f2321c;
        if (i > this.f2328j) {
            this.f2322d = i - this.f2328j;
            this.f2321c -= this.f2322d;
            return;
        }
        this.f2322d = 0;
    }

    public int m4722a() {
        if (m4755x()) {
            this.f2325g = 0;
            return 0;
        }
        this.f2325g = m4750s();
        if (bk.m4697b(this.f2325g) != 0) {
            return this.f2325g;
        }
        throw af.m4560e();
    }

    public am m4723a(aq aqVar, C0526o c0526o) {
        int s = m4750s();
        if (this.f2329k >= this.f2330l) {
            throw af.m4563h();
        }
        int c = m4731c(s);
        this.f2329k++;
        am amVar = (am) aqVar.m1898b(this, c0526o);
        m4724a(0);
        this.f2329k--;
        m4733d(c);
        return amVar;
    }

    public void m4724a(int i) {
        if (this.f2325g != i) {
            throw af.m4561f();
        }
    }

    public void m4725a(int i, an anVar, C0526o c0526o) {
        if (this.f2329k >= this.f2330l) {
            throw af.m4563h();
        }
        this.f2329k++;
        anVar.m1907c(this, c0526o);
        m4724a(bk.m4696a(i, 4));
        this.f2329k--;
    }

    public void m4726a(an anVar, C0526o c0526o) {
        int s = m4750s();
        if (this.f2329k >= this.f2330l) {
            throw af.m4563h();
        }
        s = m4731c(s);
        this.f2329k++;
        anVar.m1907c(this, c0526o);
        m4724a(0);
        this.f2329k--;
        m4733d(s);
    }

    public void m4727a(C0524m c0524m) {
        int a;
        do {
            a = m4722a();
            if (a == 0) {
                return;
            }
        } while (m4728a(a, c0524m));
    }

    public boolean m4728a(int i, C0524m c0524m) {
        long e;
        int a;
        switch (bk.m4695a(i)) {
            case C0338e.MapAttrs_mapType /*0*/:
                e = m4734e();
                c0524m.m4772d(i);
                c0524m.m4764a(e);
                return true;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                e = m4753v();
                c0524m.m4772d(i);
                c0524m.m4768b(e);
                return true;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                C0516h l = m4743l();
                c0524m.m4772d(i);
                c0524m.m4765a(l);
                return true;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                c0524m.m4772d(i);
                m4727a(c0524m);
                a = bk.m4696a(bk.m4697b(i), 4);
                m4724a(a);
                c0524m.m4772d(a);
                return true;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                return false;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                a = m4752u();
                c0524m.m4772d(i);
                c0524m.m4763a(a);
                return true;
            default:
                throw af.m4562g();
        }
    }

    public double m4729b() {
        return Double.longBitsToDouble(m4753v());
    }

    public float m4730c() {
        return Float.intBitsToFloat(m4752u());
    }

    public int m4731c(int i) {
        if (i < 0) {
            throw af.m4558c();
        }
        int i2 = (this.f2327i + this.f2323e) + i;
        int i3 = this.f2328j;
        if (i2 > i3) {
            throw af.m4557b();
        }
        this.f2328j = i2;
        m4721z();
        return i3;
    }

    public long m4732d() {
        return m4751t();
    }

    public void m4733d(int i) {
        this.f2328j = i;
        m4721z();
    }

    public long m4734e() {
        return m4751t();
    }

    public byte[] m4735e(int i) {
        if (i < 0) {
            throw af.m4558c();
        } else if ((this.f2327i + this.f2323e) + i > this.f2328j) {
            m4737f((this.f2328j - this.f2327i) - this.f2323e);
            throw af.m4557b();
        } else if (i <= this.f2321c - this.f2323e) {
            Object obj = new byte[i];
            System.arraycopy(this.f2319a, this.f2323e, obj, 0, i);
            this.f2323e += i;
            return obj;
        } else if (i < 4096) {
            Object obj2 = new byte[i];
            r0 = this.f2321c - this.f2323e;
            System.arraycopy(this.f2319a, this.f2323e, obj2, 0, r0);
            this.f2323e = this.f2321c;
            m4719a(true);
            while (i - r0 > this.f2321c) {
                System.arraycopy(this.f2319a, 0, obj2, r0, this.f2321c);
                r0 += this.f2321c;
                this.f2323e = this.f2321c;
                m4719a(true);
            }
            System.arraycopy(this.f2319a, 0, obj2, r0, i - r0);
            this.f2323e = i - r0;
            return obj2;
        } else {
            int read;
            int i2 = this.f2323e;
            int i3 = this.f2321c;
            this.f2327i += this.f2321c;
            this.f2323e = 0;
            this.f2321c = 0;
            r0 = i - (i3 - i2);
            List<byte[]> arrayList = new ArrayList();
            int i4 = r0;
            while (i4 > 0) {
                Object obj3 = new byte[Math.min(i4, 4096)];
                r0 = 0;
                while (r0 < obj3.length) {
                    read = this.f2324f == null ? -1 : this.f2324f.read(obj3, r0, obj3.length - r0);
                    if (read == -1) {
                        throw af.m4557b();
                    }
                    this.f2327i += read;
                    r0 += read;
                }
                r0 = i4 - obj3.length;
                arrayList.add(obj3);
                i4 = r0;
            }
            Object obj4 = new byte[i];
            r0 = i3 - i2;
            System.arraycopy(this.f2319a, i2, obj4, 0, r0);
            read = r0;
            for (byte[] bArr : arrayList) {
                System.arraycopy(bArr, 0, obj4, read, bArr.length);
                read = bArr.length + read;
            }
            return obj4;
        }
    }

    public int m4736f() {
        return m4750s();
    }

    public void m4737f(int i) {
        if (i < 0) {
            throw af.m4558c();
        } else if ((this.f2327i + this.f2323e) + i > this.f2328j) {
            m4737f((this.f2328j - this.f2327i) - this.f2323e);
            throw af.m4557b();
        } else if (i <= this.f2321c - this.f2323e) {
            this.f2323e += i;
        } else {
            int i2 = this.f2321c - this.f2323e;
            this.f2323e = this.f2321c;
            m4719a(true);
            while (i - i2 > this.f2321c) {
                i2 += this.f2321c;
                this.f2323e = this.f2321c;
                m4719a(true);
            }
            this.f2323e = i - i2;
        }
    }

    public long m4738g() {
        return m4753v();
    }

    public int m4739h() {
        return m4752u();
    }

    public boolean m4740i() {
        return m4750s() != 0;
    }

    public String m4741j() {
        int s = m4750s();
        if (s > this.f2321c - this.f2323e || s <= 0) {
            return new String(m4735e(s), "UTF-8");
        }
        String str = new String(this.f2319a, this.f2323e, s, "UTF-8");
        this.f2323e = s + this.f2323e;
        return str;
    }

    public String m4742k() {
        C0516h ajVar;
        int s = m4750s();
        if (s > this.f2321c - this.f2323e || s <= 0) {
            ajVar = new aj(m4735e(s));
        } else {
            ajVar = C0516h.m4581a(this.f2319a, this.f2323e, s);
            this.f2323e = s + this.f2323e;
        }
        if (ajVar.m4596g()) {
            return ajVar.m4595f();
        }
        throw af.m4565j();
    }

    public C0516h m4743l() {
        int s = m4750s();
        if (s == 0) {
            return C0516h.f2222a;
        }
        if (s > this.f2321c - this.f2323e || s <= 0) {
            return new aj(m4735e(s));
        }
        C0516h c0518e = (this.f2320b && this.f2326h) ? new C0518e(this.f2319a, this.f2323e, s) : C0516h.m4581a(this.f2319a, this.f2323e, s);
        this.f2323e = s + this.f2323e;
        return c0518e;
    }

    public int m4744m() {
        return m4750s();
    }

    public int m4745n() {
        return m4750s();
    }

    public int m4746o() {
        return m4752u();
    }

    public long m4747p() {
        return m4753v();
    }

    public int m4748q() {
        return C0522k.m4720b(m4750s());
    }

    public long m4749r() {
        return C0522k.m4716a(m4751t());
    }

    public int m4750s() {
        byte y = m4756y();
        if (y >= null) {
            return y;
        }
        int i = y & 127;
        byte y2 = m4756y();
        if (y2 >= null) {
            return i | (y2 << 7);
        }
        i |= (y2 & 127) << 7;
        y2 = m4756y();
        if (y2 >= null) {
            return i | (y2 << 14);
        }
        i |= (y2 & 127) << 14;
        y2 = m4756y();
        if (y2 >= null) {
            return i | (y2 << 21);
        }
        i |= (y2 & 127) << 21;
        y2 = m4756y();
        i |= y2 << 28;
        if (y2 >= null) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (m4756y() >= null) {
                return i;
            }
        }
        throw af.m4559d();
    }

    public long m4751t() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte y = m4756y();
            j |= ((long) (y & 127)) << i;
            if ((y & 128) == 0) {
                return j;
            }
        }
        throw af.m4559d();
    }

    public int m4752u() {
        return (((m4756y() & 255) | ((m4756y() & 255) << 8)) | ((m4756y() & 255) << 16)) | ((m4756y() & 255) << 24);
    }

    public long m4753v() {
        byte y = m4756y();
        byte y2 = m4756y();
        return ((((((((((long) y2) & 255) << 8) | (((long) y) & 255)) | ((((long) m4756y()) & 255) << 16)) | ((((long) m4756y()) & 255) << 24)) | ((((long) m4756y()) & 255) << 32)) | ((((long) m4756y()) & 255) << 40)) | ((((long) m4756y()) & 255) << 48)) | ((((long) m4756y()) & 255) << 56);
    }

    public int m4754w() {
        if (this.f2328j == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f2328j - (this.f2327i + this.f2323e);
    }

    public boolean m4755x() {
        return this.f2323e == this.f2321c && !m4719a(false);
    }

    public byte m4756y() {
        if (this.f2323e == this.f2321c) {
            m4719a(true);
        }
        byte[] bArr = this.f2319a;
        int i = this.f2323e;
        this.f2323e = i + 1;
        return bArr[i];
    }
}
