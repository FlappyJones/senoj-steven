package com.google.tagmanager.p014a;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.tagmanager.a.ar */
class ar extends C0516h {
    private static final int[] f2229c;
    private final int f2230d;
    private final C0516h f2231e;
    private final C0516h f2232f;
    private final int f2233g;
    private final int f2234h;
    private int f2235i;

    static {
        int i = 1;
        List arrayList = new ArrayList();
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Integer.MAX_VALUE));
        f2229c = new int[arrayList.size()];
        for (i2 = 0; i2 < f2229c.length; i2++) {
            f2229c[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
    }

    private ar(C0516h c0516h, C0516h c0516h2) {
        this.f2235i = 0;
        this.f2231e = c0516h;
        this.f2232f = c0516h2;
        this.f2233g = c0516h.m4583a();
        this.f2230d = this.f2233g + c0516h2.m4583a();
        this.f2234h = Math.max(c0516h.m4598j(), c0516h2.m4598j()) + 1;
    }

    static C0516h m4621a(C0516h c0516h, C0516h c0516h2) {
        ar arVar = c0516h instanceof ar ? (ar) c0516h : null;
        if (c0516h2.m4583a() == 0) {
            return c0516h;
        }
        if (c0516h.m4583a() == 0) {
            return c0516h2;
        }
        int a = c0516h.m4583a() + c0516h2.m4583a();
        if (a < 128) {
            return ar.m4622b(c0516h, c0516h2);
        }
        if (arVar != null && arVar.f2232f.m4583a() + c0516h2.m4583a() < 128) {
            return new ar(arVar.f2231e, ar.m4622b(arVar.f2232f, c0516h2));
        } else if (arVar == null || arVar.f2231e.m4598j() <= arVar.f2232f.m4598j() || arVar.m4635j() <= c0516h2.m4598j()) {
            return a >= f2229c[Math.max(c0516h.m4598j(), c0516h2.m4598j()) + 1] ? new ar(c0516h, c0516h2) : new at().m4640a(c0516h, c0516h2);
        } else {
            return new ar(arVar.f2231e, new ar(arVar.f2232f, c0516h2));
        }
    }

    private static aj m4622b(C0516h c0516h, C0516h c0516h2) {
        int a = c0516h.m4583a();
        int a2 = c0516h2.m4583a();
        byte[] bArr = new byte[(a + a2)];
        c0516h.m4591b(bArr, 0, 0, a);
        c0516h2.m4591b(bArr, 0, a, a2);
        return new aj(bArr);
    }

    private boolean m4624b(C0516h c0516h) {
        Iterator auVar = new au(null);
        aj ajVar = (aj) auVar.next();
        Iterator auVar2 = new au(null);
        aj ajVar2 = (aj) auVar2.next();
        int i = 0;
        aj ajVar3 = ajVar;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int a = ajVar3.m4603a() - i2;
            int a2 = ajVar2.m4603a() - i;
            int min = Math.min(a, a2);
            if (!(i2 == 0 ? ajVar3.m4607a(ajVar2, i, min) : ajVar2.m4607a(ajVar3, i2, min))) {
                return false;
            }
            int i4 = i3 + min;
            if (i4 >= this.f2230d) {
                break;
            }
            boolean z;
            if (min == a) {
                ajVar3 = (aj) auVar.next();
                i2 = 0;
            } else {
                i2 += min;
            }
            if (min == a2) {
                ajVar = (aj) auVar2.next();
                z = false;
            } else {
                aj ajVar4 = ajVar2;
                z = i + min;
                ajVar = ajVar4;
            }
            boolean z2 = z;
            ajVar2 = ajVar;
            i3 = i4;
        }
        if (i4 == this.f2230d) {
            return true;
        }
        throw new IllegalStateException();
    }

    public int m4626a() {
        return this.f2230d;
    }

    protected int m4627a(int i, int i2, int i3) {
        if (i2 + i3 <= this.f2233g) {
            return this.f2231e.m4584a(i, i2, i3);
        }
        if (i2 >= this.f2233g) {
            return this.f2232f.m4584a(i, i2 - this.f2233g, i3);
        }
        int i4 = this.f2233g - i2;
        return this.f2232f.m4584a(this.f2231e.m4584a(i, i2, i4), 0, i3 - i4);
    }

    public String m4628a(String str) {
        return new String(m4594e(), str);
    }

    protected void m4629a(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.f2233g) {
            this.f2231e.m4588a(bArr, i, i2, i3);
        } else if (i >= this.f2233g) {
            this.f2232f.m4588a(bArr, i - this.f2233g, i2, i3);
        } else {
            int i4 = this.f2233g - i;
            this.f2231e.m4588a(bArr, i, i2, i4);
            this.f2232f.m4588a(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    protected int m4630b(int i, int i2, int i3) {
        if (i2 + i3 <= this.f2233g) {
            return this.f2231e.m4589b(i, i2, i3);
        }
        if (i2 >= this.f2233g) {
            return this.f2232f.m4589b(i, i2 - this.f2233g, i3);
        }
        int i4 = this.f2233g - i2;
        return this.f2232f.m4589b(this.f2231e.m4589b(i, i2, i4), 0, i3 - i4);
    }

    void m4631b(OutputStream outputStream, int i, int i2) {
        if (i + i2 <= this.f2233g) {
            this.f2231e.m4590b(outputStream, i, i2);
        } else if (i >= this.f2233g) {
            this.f2232f.m4590b(outputStream, i - this.f2233g, i2);
        } else {
            int i3 = this.f2233g - i;
            this.f2231e.m4590b(outputStream, i, i3);
            this.f2232f.m4590b(outputStream, 0, i2 - i3);
        }
    }

    public C0517i m4632c() {
        return new av();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0516h)) {
            return false;
        }
        C0516h c0516h = (C0516h) obj;
        if (this.f2230d != c0516h.m4583a()) {
            return false;
        }
        if (this.f2230d == 0) {
            return true;
        }
        if (this.f2235i != 0) {
            int l = c0516h.m4600l();
            if (!(l == 0 || this.f2235i == l)) {
                return false;
            }
        }
        return m4624b(c0516h);
    }

    public boolean m4633g() {
        return this.f2232f.m4584a(this.f2231e.m4584a(0, 0, this.f2233g), 0, this.f2232f.m4583a()) == 0;
    }

    public C0522k m4634h() {
        return C0522k.m4718a(new aw(this));
    }

    public int hashCode() {
        int i = this.f2235i;
        if (i == 0) {
            i = m4630b(this.f2230d, 0, this.f2230d);
            if (i == 0) {
                i = 1;
            }
            this.f2235i = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return m4632c();
    }

    protected int m4635j() {
        return this.f2234h;
    }

    protected boolean m4636k() {
        return this.f2230d >= f2229c[this.f2234h];
    }

    protected int m4637l() {
        return this.f2235i;
    }
}
