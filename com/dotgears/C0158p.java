package com.dotgears;

import com.google.android.gms.C0338e;

/* renamed from: com.dotgears.p */
public class C0158p extends C0140m {
    public int f744a;
    public int f745b;
    public int f746c;
    public int f747d;
    public int f748e;
    public int f749f;
    public int f750g;
    public int f751h;
    public int f752i;
    public int f753j;
    public int f754k;
    public int f755l;
    public boolean f756m;
    public int f757n;
    public C0154k f758o;
    public C0159r f759p;
    public C0152i f760q;
    public C0152i f761r;
    public C0155l f762s;

    public C0158p() {
        this.f748e = 0;
        this.f749f = 0;
        this.f755l = 0;
        this.f761r = C0147g.f620D.m1247b("score_panel");
        this.f760q = C0147g.f620D.m1247b("new");
        this.f762s = C0147g.f620D.f622B;
        this.f746c = this.f761r.f683b;
        this.f747d = this.f761r.f684c;
        this.f757n = (512 - this.f747d) >> 1;
        this.f759p = new C0159r();
        this.f758o = new C0154k();
    }

    public void m1330a(float f) {
        if (this.F) {
            if (!this.f759p.f769g) {
                this.f759p.m1333a(f);
            }
            switch (this.f754k) {
                case C0338e.MapAttrs_mapType /*0*/:
                    this.f745b = (int) this.f759p.f763a;
                    if (!this.f759p.f769g) {
                        return;
                    }
                    if (this.f755l > 0) {
                        this.f754k = 1;
                        this.f759p.m1334a(0.0f, (float) this.f755l, 0, 0.5f);
                        return;
                    }
                    this.f754k = 2;
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    this.f748e = (int) this.f759p.f763a;
                    if (this.f759p.f769g) {
                        this.f754k = 2;
                        C0147g.f620D.m1232a(this.f748e);
                        if (this.f748e > this.f749f) {
                            this.f749f = this.f748e;
                            this.f756m = true;
                        }
                        if (this.f748e >= this.f753j) {
                            this.f758o.m1318a(0);
                        } else if (this.f748e >= this.f752i) {
                            this.f758o.m1318a(1);
                        } else if (this.f748e >= this.f751h) {
                            this.f758o.m1318a(2);
                        } else if (this.f748e >= this.f750g) {
                            this.f758o.m1318a(3);
                        }
                        this.f758o.f718a = this.f744a + 32;
                        this.f758o.f719b = this.f745b + 44;
                    }
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    this.f758o.m1317a(f);
                default:
            }
        }
    }

    public void m1331a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f755l = i;
        this.f749f = i2;
        this.f748e = 0;
        this.f750g = i3;
        this.f751h = i4;
        this.f752i = i5;
        this.f753j = i6;
        this.F = true;
        this.G = true;
        this.f756m = false;
        this.f744a = (288 - this.f746c) >> 1;
        this.f745b = 504;
        this.f759p.m1334a((float) this.f745b, (float) this.f757n, 11, 0.5f);
        this.f754k = 0;
        this.f758o.F = false;
        this.f758o.G = false;
    }

    public void m1332a(C0147g c0147g) {
        if (this.G) {
            c0147g.m1235a(this.f761r.f689i, this.f744a, this.f745b, 1.0f, 1.0f, 1.0f);
            this.f762s.m1320a(c0147g, this.f748e, this.f744a + 210, this.f745b + 36, false, 10);
            this.f762s.m1320a(c0147g, this.f749f, this.f744a + 210, this.f745b + 78, false, 10);
            if (this.f756m) {
                c0147g.m1235a(this.f760q.f689i, this.f744a + 142, this.f745b + 60, 1.0f, 1.0f, 1.0f);
            }
            this.f758o.m1319a(c0147g);
        }
    }
}
