package org.andengine.p006c.p007b;

import android.util.SparseArray;
import com.google.android.gms.C0338e;
import org.andengine.input.p034a.C0650a;
import org.andengine.opengl.util.C0714e;
import org.andengine.p003b.p004b.p036a.C0576a;
import org.andengine.p003b.p032a.C0573a;
import org.andengine.p005d.p037a.p038a.C0577b;
import org.andengine.p005d.p056d.C0634a;
import org.andengine.p006c.C0134c;
import org.andengine.p006c.C0135a;
import org.andengine.p006c.p007b.p043a.C0597b;
import org.andengine.p006c.p007b.p043a.C0598a;

/* renamed from: org.andengine.c.b.e */
public class C0136e extends C0135a {
    protected C0136e f530I;
    protected C0577b f531J;
    private boolean f532K;
    private boolean f533L;
    private final SparseArray f534M;
    private boolean f535N;
    private final SparseArray f536O;
    private float f537a;
    private boolean f538b;
    private boolean f539c;
    private boolean f540d;
    private final C0576a f541e;
    private C0137c f542f;
    private C0599b f543g;
    private C0597b f544h;
    private boolean f545i;
    private boolean f546j;

    public C0136e() {
        this.f531J = new C0577b(4);
        this.f541e = new C0576a();
        this.f544h = new C0598a(C0634a.f2584b);
        this.f545i = true;
        this.f546j = true;
        this.f532K = false;
        this.f533L = false;
        this.f534M = new SparseArray();
        this.f535N = false;
        this.f536O = new SparseArray();
    }

    private Boolean m1192a(C0650a c0650a, float f, float f2, C0600d c0600d) {
        float[] b = c0600d.m5002b(f, f2);
        float f3 = b[0];
        float f4 = b[1];
        return c0600d.m5001a(c0650a, f3, f4) ? Boolean.TRUE : this.f543g != null ? Boolean.valueOf(this.f543g.m4999a(c0650a, c0600d, f3, f4)) : null;
    }

    protected void m1193a(float f) {
        this.f537a += f;
        this.f541e.a_(f);
        C0136e c0136e = this.f530I;
        if (c0136e == null || !this.f539c) {
            this.f544h.a_(f);
            super.m1159a(f);
        }
        if (c0136e != null) {
            c0136e.a_(f);
        }
    }

    public void m1194a(C0137c c0137c) {
        this.f542f = c0137c;
    }

    public void m1195a(C0134c c0134c) {
    }

    public boolean m1196a(C0650a c0650a) {
        Boolean valueOf;
        C0600d c0600d;
        float b;
        int e = c0650a.m5195e();
        boolean f = c0650a.m5196f();
        boolean h = c0650a.m5198h();
        if (!f) {
            if (this.f535N && ((C0137c) this.f536O.get(c0650a.m5194d())) != null) {
                switch (e) {
                    case C0338e.MapAttrs_cameraBearing /*1*/:
                    case C0338e.MapAttrs_cameraTargetLng /*3*/:
                        this.f536O.remove(c0650a.m5194d());
                        break;
                }
                valueOf = Boolean.valueOf(this.f542f.m1200a(this, c0650a));
                if (valueOf != null && valueOf.booleanValue()) {
                    return true;
                }
            }
            if (this.f532K) {
                SparseArray sparseArray = this.f534M;
                c0600d = (C0600d) sparseArray.get(c0650a.m5194d());
                if (c0600d != null) {
                    b = c0650a.m5191b();
                    float c = c0650a.m5193c();
                    switch (e) {
                        case C0338e.MapAttrs_cameraBearing /*1*/:
                        case C0338e.MapAttrs_cameraTargetLng /*3*/:
                            sparseArray.remove(c0650a.m5194d());
                            break;
                    }
                    valueOf = m1192a(c0650a, b, c, c0600d);
                    if (valueOf != null && valueOf.booleanValue()) {
                        return true;
                    }
                }
            }
        }
        if (this.f530I != null) {
            if (m1197b(c0650a)) {
                return true;
            }
            if (this.f540d) {
                return false;
            }
        }
        float b2 = c0650a.m5191b();
        b = c0650a.m5193c();
        C0577b c0577b = this.f531J;
        if (c0577b != null) {
            int size = c0577b.size();
            if (size > 0) {
                if (this.f546j) {
                    for (e = 0; e < size; e++) {
                        c0600d = (C0600d) c0577b.get(e);
                        if (c0600d.m5000a(b2, b)) {
                            Boolean a = m1192a(c0650a, b2, b, c0600d);
                            if (a != null && a.booleanValue()) {
                                if ((this.f532K && f) || (this.f533L && h)) {
                                    this.f534M.put(c0650a.m5194d(), c0600d);
                                }
                                return true;
                            }
                        }
                    }
                } else {
                    for (e = size - 1; e >= 0; e--) {
                        c0600d = (C0600d) c0577b.get(e);
                        if (c0600d.m5000a(b2, b)) {
                            Boolean a2 = m1192a(c0650a, b2, b, c0600d);
                            if (a2 != null && a2.booleanValue()) {
                                if ((this.f532K && f) || (this.f533L && h)) {
                                    this.f534M.put(c0650a.m5194d(), c0600d);
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (this.f542f == null) {
            return false;
        }
        valueOf = Boolean.valueOf(this.f542f.m1200a(this, c0650a));
        if (valueOf == null || !valueOf.booleanValue()) {
            return false;
        }
        if (this.f535N && f) {
            this.f536O.put(c0650a.m5194d(), this.f542f);
        }
        return true;
    }

    protected boolean m1197b(C0650a c0650a) {
        return this.f530I.m1196a(c0650a);
    }

    protected void m1198e(C0714e c0714e, C0573a c0573a) {
        C0136e c0136e = this.f530I;
        if (c0136e == null || !this.f538b) {
            if (this.f545i) {
                c0714e.m5434m();
                c0573a.m4913c(c0714e);
                c0714e.m5433l();
                this.f544h.m1145a(c0714e, c0573a);
                c0714e.m5435n();
            }
            c0714e.m5434m();
            m1199f(c0714e, c0573a);
            c0714e.m5433l();
            super.m1182e(c0714e, c0573a);
            c0714e.m5435n();
        }
        if (c0136e != null) {
            c0136e.m1163a(c0714e, c0573a);
        }
    }

    protected void m1199f(C0714e c0714e, C0573a c0573a) {
        c0573a.m4910b(c0714e);
    }
}
