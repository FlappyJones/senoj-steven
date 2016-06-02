package com.dotgears.flappy;

import com.dotgears.C0140m;
import com.dotgears.C0143f;
import com.dotgears.C0145h;
import com.dotgears.C0147g;
import com.dotgears.C0152i;
import com.dotgears.C0153j;
import com.dotgears.C0155l;
import com.google.android.gms.C0338e;
import java.io.InputStream;

/* renamed from: com.dotgears.flappy.c */
public class C0148c extends C0147g {
    boolean f651H;
    boolean f652I;
    C0144a f653J;
    C0143f f654K;
    C0143f f655L;
    C0143f f656M;
    C0143f f657N;
    C0143f f658O;
    C0143f f659P;
    C0143f f660Q;
    C0143f f661R;
    C0155l f662S;
    C0152i f663T;
    C0152i f664U;
    C0152i f665V;
    C0152i f666W;
    C0152i f667X;
    C0152i f668Y;
    C0152i f669Z;
    C0152i aa;
    C0152i ab;
    int ac;
    int ad;
    int ae;
    int af;
    int ag;
    int ah;
    int ai;
    int aj;
    int ak;
    C0151f al;
    C0150e am;
    C0145h an;
    int ao;
    private boolean ap;

    public C0148c(int i, int i2, InputStream inputStream) {
        super(i, i2, inputStream);
        this.ap = true;
    }

    public static boolean m1255a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return i + i3 >= i5 && i <= i5 + i7 && i2 + i4 >= i6 && i2 <= i6 + i8;
    }

    public void m1256a(int i, int i2) {
        if (!this.f651H) {
            if (i >= this.f656M.f586b - 20 && i <= (this.f656M.f586b + this.f656M.f588d) + 20 && i2 >= this.f656M.f587c - 20 && i2 <= (this.f656M.f587c + this.f656M.f589e) + 20) {
                return;
            }
            if (this.f653J.f603w) {
                if (this.al.F && this.al.f680d == 1) {
                    this.al.f680d = 2;
                    this.al.f677a.m1334a(1.0f, 0.0f, 0, 0.5f);
                    this.f653J.f603w = false;
                    this.f653J.m1227b();
                }
            } else if (this.ao > 0) {
                this.f653J.m1227b();
            }
        }
    }

    public void m1257a(int i, int i2, int i3, int i4) {
        if (this.f651H && i4 >= 482 - this.ab.f684c && i4 <= 482) {
            m1241a(7, null, 5);
        }
    }

    public void m1258a(int i, C0140m c0140m) {
        switch (i) {
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                this.f652I = true;
                m1253c(0, this.y);
                this.am.m1262a();
                m1253c(8, 0);
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                m1253c(11, 0);
            case C0338e.MapAttrs_cameraTilt /*4*/:
                m1253c(13, 0);
            case C0338e.MapAttrs_cameraZoom /*5*/:
                m1261e();
                this.f654K.F = false;
                this.f659P.F = false;
                this.f661R.F = false;
                this.f651H = false;
                m1244a(false, 0, 0.5f);
                this.ac = 0;
                this.f653J.m1224a();
                this.ao = 2;
                this.ak = 1;
                this.y = 0;
                this.al.m1265a();
                this.A++;
                m1253c(7, 0);
            case C0338e.MapAttrs_uiCompass /*6*/:
                m1261e();
                m1244a(false, 0, 0.5f);
                m1253c(6, 0);
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                m1253c(3, 0);
            default:
        }
    }

    public void m1259b(float f) {
        m1242a(this.f663T, 0, 0, 1.0f);
        this.ac -= this.ao;
        if (this.ac <= -24) {
            this.ac = 0;
        }
        if (!this.f653J.f603w) {
            this.ag -= this.ao;
            this.ah -= this.ao;
            this.ai -= this.ao;
            if (this.ao > 0 && this.ak <= 0 && (this.ag == this.f653J.b || this.ag == this.f653J.b - 1)) {
                this.y++;
                m1253c(9, 0);
            }
            if (this.ag < (-this.f668Y.f683b)) {
                this.ag = this.ah;
                this.ad = this.ae;
                this.ah = this.ai;
                this.ae = this.af;
                this.ai = (this.ah + this.aj) + this.f668Y.f683b;
                this.af = C0153j.m1270a(180, 360);
                if (this.ak > 0) {
                    this.ak--;
                    if (this.ak == 0) {
                        this.ah = -this.f668Y.f683b;
                        this.ag = -this.f668Y.f683b;
                    }
                }
            }
        }
        this.f653J.m1225a(f);
        if (this.f651H) {
            m1242a(this.aa, (288 - this.aa.f683b) >> 1, 150, 1.0f);
            this.f653J.b = (288 - this.f653J.e) >> 1;
            this.f653J.c = (this.aa.f684c + 150) + 20;
            this.f653J.m1226a((C0147g) this);
            m1242a(this.f667X, this.ac, 512 - this.f667X.f684c, 1.0f);
        } else {
            if (this.f653J.c >= 400 - this.f653J.f && this.ao > 0) {
                m1252c(1.0f);
                m1233a(4, 0.5f);
                this.ao = 0;
                m1253c(12, 0);
                m1241a(2, this.C, 1000);
            }
            if (!this.f653J.f602v && this.ak <= 0 && this.ao > 0) {
                if (C0148c.m1255a(this.f653J.b, this.f653J.c, this.f653J.e, this.f653J.f, this.ag, (this.ad - this.f669Z.f684c) - 96, this.f669Z.f683b, this.f669Z.f684c)) {
                    m1252c(1.0f);
                    m1233a(4, 0.5f);
                    this.ao = 0;
                    m1253c(12, 0);
                    m1241a(3, null, 500);
                    m1241a(2, this.C, 1000);
                } else if (C0148c.m1255a(this.f653J.b, this.f653J.c, this.f653J.e, this.f653J.f, this.ag, this.ad, this.f668Y.f683b, this.f668Y.f684c)) {
                    m1252c(1.0f);
                    m1233a(4, 0.5f);
                    this.f653J.f602v = true;
                    this.ao = 0;
                    m1253c(12, 0);
                    m1241a(3, null, 500);
                    m1241a(2, this.C, 1000);
                }
                if (C0148c.m1255a(this.f653J.b, this.f653J.c, this.f653J.e, this.f653J.f, this.ah, (this.ae - this.f669Z.f684c) - 96, this.f669Z.f683b, this.f669Z.f684c)) {
                    m1252c(1.0f);
                    m1233a(4, 0.5f);
                    this.f653J.f602v = true;
                    this.ao = 0;
                    m1253c(12, 0);
                    m1241a(3, null, 500);
                    m1241a(2, this.C, 1000);
                } else if (C0148c.m1255a(this.f653J.b, this.f653J.c, this.f653J.e, this.f653J.f, this.ah, this.ae, this.f668Y.f683b, this.f668Y.f684c)) {
                    m1252c(1.0f);
                    m1233a(4, 0.5f);
                    this.f653J.f602v = true;
                    this.ao = 0;
                    m1253c(12, 0);
                    m1241a(3, null, 500);
                    m1241a(2, this.C, 1000);
                }
            }
            if (this.ak <= 0) {
                m1242a(this.f668Y, this.ag, this.ad, 1.0f);
                m1242a(this.f669Z, this.ag, (this.ad - this.f669Z.f684c) - 96, 1.0f);
                m1242a(this.f668Y, this.ah, this.ae, 1.0f);
                m1242a(this.f669Z, this.ah, (this.ae - this.f669Z.f684c) - 96, 1.0f);
                if (this.ai < 288) {
                    m1242a(this.f668Y, this.ai, this.af, 1.0f);
                    m1242a(this.f669Z, this.ai, (this.af - this.f669Z.f684c) - 96, 1.0f);
                }
            }
            if (this.C.F && this.C.f754k == 2 && !this.f654K.F) {
                this.f654K.m1221a((288 - ((this.f654K.f588d + this.f659P.f588d) + 16)) >> 1, 340);
                this.f659P.m1221a((this.f654K.f586b + this.f654K.f588d) + 16, 340);
            }
            if (this.am.F) {
                this.am.m1263a(f);
                this.am.m1264a((C0147g) this);
            } else {
                this.an.m1229a(144, 100, 6, 1.0f);
                this.an.m1228a(this.y, 20);
                this.an.m1230a(this);
            }
            this.f653J.m1226a((C0147g) this);
            m1242a(this.f667X, this.ac, 512 - this.f667X.f684c, 1.0f);
        }
        if (this.al.F) {
            this.al.m1266a(f);
            this.al.m1267a((C0147g) this);
        }
        if (this.f651H) {
            m1242a(this.ab, (288 - this.ab.f683b) >> 1, 432 - this.ab.f684c, 1.0f);
        }
        if (this.f654K.F) {
            this.f654K.m1220a(f);
            this.f654K.m1222a((C0147g) this);
            this.f659P.m1220a(f);
            this.f659P.m1222a((C0147g) this);
            if (this.f654K.f592h) {
                m1244a(true, 5, 0.5f);
                m1253c(10, 0);
            }
            if (this.f659P.f592h) {
                m1253c(1, 0);
                m1253c(10, 0);
            }
            if (this.f661R.F) {
                this.f661R.m1220a(f);
                this.f661R.m1222a((C0147g) this);
                if (this.f661R.f592h) {
                    m1253c(2, 0);
                }
            }
        }
    }

    public void m1260c() {
        this.an = new C0146b();
        this.f654K = new C0143f();
        this.f654K.m1223a("button_play");
        this.f659P = new C0143f();
        this.f659P.m1223a("button_score");
        this.f655L = new C0143f();
        this.f655L.m1223a("button_ok");
        this.f658O = new C0143f();
        this.f658O.m1223a("button_menu");
        this.f656M = new C0143f();
        this.f656M.m1223a("button_pause");
        this.f657N = new C0143f();
        this.f657N.m1223a("button_resume");
        this.f660Q = new C0143f();
        this.f660Q.m1223a("button_share");
        this.f661R = new C0143f();
        this.f661R.m1223a("button_rate");
        this.f662S = new C0155l("number_score");
        this.f664U = m1247b("bg_day");
        this.f665V = m1247b("bg_night");
        this.f666W = m1247b("bg_forest");
        this.f667X = m1247b("land");
        this.f668Y = m1247b("pipe_up");
        this.f669Z = m1247b("pipe_down");
        this.aa = m1247b("title");
        this.ab = m1247b("brand_copyright");
        this.aj = (288 - ((this.f668Y.f683b * 3) / 2)) / 2;
        this.ag = this.aj - (this.f668Y.f683b >> 1);
        this.ad = 274;
        this.ah = (this.ag + this.aj) + this.f668Y.f683b;
        this.ae = 274;
        this.ai = (this.ah + this.aj) + this.f668Y.f683b;
        this.af = 274;
        this.f653J = new C0144a();
        this.f653J.m1224a();
        this.al = new C0151f();
        this.am = new C0150e();
        this.f651H = true;
        m1241a(6, (C0140m) this, 1);
    }

    public void m1261e() {
        if (C0153j.m1269a() % 10 > 3) {
            this.f663T = this.f664U;
        } else {
            this.f663T = this.f665V;
        }
        this.n.m1325b();
        this.f654K.m1221a((288 - ((this.f654K.f588d + this.f659P.f588d) + 16)) >> 1, 340);
        this.f659P.m1221a((this.f654K.f586b + this.f654K.f588d) + 16, 340);
        this.f661R.m1221a((288 - this.f661R.f588d) >> 1, 270);
        this.al.F = false;
        this.am.F = false;
        this.C.F = false;
        this.C.G = false;
        this.f655L.F = false;
        this.f655L.G = false;
        this.f658O.F = false;
        this.f658O.G = false;
        this.f656M.F = false;
        this.f656M.G = false;
        this.f657N.F = false;
        this.f657N.G = false;
        this.f660Q.F = false;
        this.f660Q.G = false;
        this.f651H = true;
        this.ac = 0;
        this.f653J.m1224a();
        this.ao = 2;
        this.ak = 1;
        this.y = 0;
    }
}
