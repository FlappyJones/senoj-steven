package org.andengine.p006c;

import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.p004b.C0579d;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p005d.C0633c;
import org.andengine.p005d.p037a.p038a.C0577b;
import org.andengine.p005d.p037a.p054d.C0627a;
import org.andengine.p005d.p044c.C0601a;
import org.andengine.p005d.p056d.C0634a;
import org.andengine.p006c.p042a.C0596a;

/* renamed from: org.andengine.c.a */
public class C0135a implements C0134c {
    private static final float[] f494a;
    private static final float[] f495b;
    private static final C0601a f496c;
    protected float f497A;
    protected float f498B;
    protected float f499C;
    protected float f500D;
    protected float f501E;
    protected float f502F;
    protected float f503G;
    protected float f504H;
    private C0627a f505I;
    private C0627a f506J;
    private C0134c f507d;
    private C0596a f508e;
    private C0579d f509f;
    private boolean f510g;
    private boolean f511h;
    private C0627a f512i;
    private C0627a f513j;
    protected boolean f514k;
    protected boolean f515l;
    protected boolean f516m;
    protected boolean f517n;
    protected boolean f518o;
    protected boolean f519p;
    protected boolean f520q;
    protected int f521r;
    protected int f522s;
    protected C0577b f523t;
    protected C0634a f524u;
    protected float f525v;
    protected float f526w;
    protected float f527x;
    protected float f528y;
    protected float f529z;

    static {
        f494a = new float[2];
        f495b = new float[2];
        f496c = new C0602b();
    }

    public C0135a() {
        this(0.0f, 0.0f);
    }

    public C0135a(float f, float f2) {
        this.f515l = true;
        this.f518o = true;
        this.f521r = Integer.MIN_VALUE;
        this.f522s = 0;
        this.f524u = new C0634a(1.0f, 1.0f, 1.0f, 1.0f);
        this.f527x = 0.0f;
        this.f528y = 0.0f;
        this.f529z = 0.0f;
        this.f497A = 1.0f;
        this.f498B = 1.0f;
        this.f499C = 0.0f;
        this.f500D = 0.0f;
        this.f501E = 0.0f;
        this.f502F = 0.0f;
        this.f503G = 0.0f;
        this.f504H = 0.0f;
        this.f510g = true;
        this.f511h = true;
        this.f525v = f;
        this.f526w = f2;
    }

    private void m1157a() {
        this.f523t = new C0577b(4);
    }

    private void m1158c(C0134c c0134c) {
        if (c0134c.m1150d()) {
            String simpleName = c0134c.getClass().getSimpleName();
            String simpleName2 = c0134c.m1151e().getClass().getSimpleName();
            throw new IllegalStateException("pEntity '" + simpleName + "' already has a parent: '" + simpleName2 + "'. New parent: '" + getClass().getSimpleName() + "'!");
        }
    }

    protected void m1159a(float f) {
        if (this.f508e != null) {
            this.f508e.a_(f);
        }
        if (this.f509f != null) {
            this.f509f.a_(f);
        }
        if (this.f523t != null && !this.f519p) {
            C0577b c0577b = this.f523t;
            int size = c0577b.size();
            for (int i = 0; i < size; i++) {
                ((C0134c) c0577b.get(i)).a_(f);
            }
        }
    }

    public void m1160a(StringBuilder stringBuilder) {
        stringBuilder.append(getClass().getSimpleName());
        if (this.f523t != null && this.f523t.size() > 0) {
            stringBuilder.append(" [");
            C0577b c0577b = this.f523t;
            for (int i = 0; i < c0577b.size(); i++) {
                ((C0134c) c0577b.get(i)).m1148a(stringBuilder);
                if (i < c0577b.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("]");
        }
    }

    public void m1161a(C0134c c0134c) {
        this.f507d = c0134c;
    }

    protected void m1162a(C0714e c0714e) {
        m1170b(c0714e);
        m1174c(c0714e);
        m1177d(c0714e);
        m1181e(c0714e);
    }

    public final void m1163a(C0714e c0714e, C0573a c0573a) {
        if (!this.f515l) {
            return;
        }
        if (!this.f516m || !m1165a(c0573a)) {
            m1182e(c0714e, c0573a);
        }
    }

    public void m1164a(boolean z) {
        this.f515l = z;
    }

    public boolean m1165a(C0573a c0573a) {
        return false;
    }

    public float[] m1166a(float f, float f2, float[] fArr) {
        C0627a k = m1188k();
        fArr[0] = f;
        fArr[1] = f2;
        k.m5114a(fArr);
        return fArr;
    }

    public final void a_(float f) {
        if (!this.f517n) {
            m1159a(f);
        }
    }

    public float[] a_(float f, float f2) {
        return m1166a(f, f2, f495b);
    }

    protected void m1167b() {
    }

    public void m1168b(float f) {
        if (this.f524u.m5138a(f)) {
            m1167b();
        }
    }

    public void m1169b(C0134c c0134c) {
        m1158c(c0134c);
        if (this.f523t == null) {
            m1157a();
        }
        this.f523t.add(c0134c);
        c0134c.m1149a((C0134c) this);
        c0134c.m1156m();
    }

    protected void m1170b(C0714e c0714e) {
        c0714e.m5406a(this.f525v, this.f526w, 0.0f);
    }

    protected void m1171b(C0714e c0714e, C0573a c0573a) {
    }

    public float[] m1172b(float f, float f2) {
        return m1173b(f, f2, f494a);
    }

    public float[] m1173b(float f, float f2, float[] fArr) {
        fArr[0] = f;
        fArr[1] = f2;
        m1189l().m5114a(fArr);
        return fArr;
    }

    protected void m1174c(C0714e c0714e) {
        float f = this.f527x;
        if (f != 0.0f) {
            float f2 = this.f528y;
            float f3 = this.f529z;
            c0714e.m5406a(f2, f3, 0.0f);
            c0714e.m5407a(f, 0.0f, 0.0f, 1.0f);
            c0714e.m5406a(-f2, -f3, 0.0f);
        }
    }

    protected void m1175c(C0714e c0714e, C0573a c0573a) {
    }

    public boolean m1176c() {
        return this.f514k;
    }

    protected void m1177d(C0714e c0714e) {
        float f = this.f501E;
        float f2 = this.f502F;
        if (f != 0.0f || f2 != 0.0f) {
            float f3 = this.f503G;
            float f4 = this.f504H;
            c0714e.m5406a(f3, f4, 0.0f);
            c0714e.m5405a(f, f2);
            c0714e.m5406a(-f3, -f4, 0.0f);
        }
    }

    protected void m1178d(C0714e c0714e, C0573a c0573a) {
    }

    public boolean m1179d() {
        return this.f507d != null;
    }

    public C0134c m1180e() {
        return this.f507d;
    }

    protected void m1181e(C0714e c0714e) {
        float f = this.f497A;
        float f2 = this.f498B;
        if (f != 1.0f || f2 != 1.0f) {
            float f3 = this.f499C;
            float f4 = this.f500D;
            c0714e.m5406a(f3, f4, 0.0f);
            c0714e.m5409a(f, f2, 1);
            c0714e.m5406a(-f3, -f4, 0.0f);
        }
    }

    protected void m1182e(C0714e c0714e, C0573a c0573a) {
        int i = 0;
        c0714e.m5431j();
        m1162a(c0714e);
        C0577b c0577b = this.f523t;
        if (c0577b == null || !this.f518o) {
            m1171b(c0714e, c0573a);
            m1175c(c0714e, c0573a);
            m1178d(c0714e, c0573a);
        } else {
            if (this.f520q) {
                C0615d.m5067a().m5068a(this.f523t);
                this.f520q = false;
            }
            int size = c0577b.size();
            while (i < size) {
                C0134c c0134c = (C0134c) c0577b.get(i);
                if (c0134c.m1152f() >= 0) {
                    break;
                }
                c0134c.m1145a(c0714e, c0573a);
                i++;
            }
            m1171b(c0714e, c0573a);
            m1175c(c0714e, c0573a);
            m1178d(c0714e, c0573a);
            while (i < size) {
                ((C0134c) c0577b.get(i)).m1145a(c0714e, c0573a);
                i++;
            }
        }
        c0714e.m5432k();
    }

    public int m1183f() {
        return this.f522s;
    }

    protected void finalize() {
        super.finalize();
        if (!this.f514k) {
            m1191n();
        }
    }

    public C0634a m1184g() {
        return this.f524u;
    }

    public float[] m1185h() {
        return a_(0.0f, 0.0f);
    }

    public C0627a m1186i() {
        if (this.f512i == null) {
            this.f512i = new C0627a();
        }
        C0627a c0627a = this.f512i;
        if (this.f510g) {
            float f;
            float f2;
            c0627a.m5110a();
            float f3 = this.f497A;
            float f4 = this.f498B;
            if (!(f3 == 1.0f && f4 == 1.0f)) {
                f = this.f499C;
                f2 = this.f500D;
                c0627a.m5112a(-f, -f2);
                c0627a.m5115b(f3, f4);
                c0627a.m5112a(f, f2);
            }
            f3 = this.f501E;
            f4 = this.f502F;
            if (!(f3 == 0.0f && f4 == 0.0f)) {
                f = this.f503G;
                f2 = this.f504H;
                c0627a.m5112a(-f, -f2);
                c0627a.m5117c(f3, f4);
                c0627a.m5112a(f, f2);
            }
            f3 = this.f527x;
            if (f3 != 0.0f) {
                f4 = this.f528y;
                f = this.f529z;
                c0627a.m5112a(-f4, -f);
                c0627a.m5111a(f3);
                c0627a.m5112a(f4, f);
            }
            c0627a.m5112a(this.f525v, this.f526w);
            this.f510g = false;
        }
        return c0627a;
    }

    public C0627a m1187j() {
        if (this.f513j == null) {
            this.f513j = new C0627a();
        }
        C0627a c0627a = this.f513j;
        if (this.f511h) {
            float f;
            float f2;
            float f3;
            c0627a.m5110a();
            c0627a.m5112a(-this.f525v, -this.f526w);
            float f4 = this.f527x;
            if (f4 != 0.0f) {
                f = this.f528y;
                f2 = this.f529z;
                c0627a.m5112a(-f, -f2);
                c0627a.m5111a(-f4);
                c0627a.m5112a(f, f2);
            }
            f4 = this.f501E;
            f = this.f502F;
            if (!(f4 == 0.0f && f == 0.0f)) {
                f2 = this.f503G;
                f3 = this.f504H;
                c0627a.m5112a(-f2, -f3);
                c0627a.m5117c(-f4, -f);
                c0627a.m5112a(f2, f3);
            }
            f4 = this.f497A;
            f = this.f498B;
            if (!(f4 == 1.0f && f == 1.0f)) {
                f2 = this.f499C;
                f3 = this.f500D;
                c0627a.m5112a(-f2, -f3);
                c0627a.m5115b(1.0f / f4, 1.0f / f);
                c0627a.m5112a(f2, f3);
            }
            this.f511h = false;
        }
        return c0627a;
    }

    public C0627a m1188k() {
        if (this.f505I == null) {
            this.f505I = new C0627a();
        }
        C0627a c0627a = this.f505I;
        c0627a.m5113a(m1186i());
        C0134c c0134c = this.f507d;
        if (c0134c != null) {
            c0627a.m5116b(c0134c.m1154k());
        }
        return c0627a;
    }

    public C0627a m1189l() {
        if (this.f506J == null) {
            this.f506J = new C0627a();
        }
        C0627a c0627a = this.f506J;
        c0627a.m5113a(m1187j());
        C0134c c0134c = this.f507d;
        if (c0134c != null) {
            c0627a.m5118c(c0134c.m1155l());
        }
        return c0627a;
    }

    public void m1190m() {
    }

    public void m1191n() {
        if (this.f514k) {
            throw new C0633c();
        }
        this.f514k = true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        m1160a(stringBuilder);
        return stringBuilder.toString();
    }
}
