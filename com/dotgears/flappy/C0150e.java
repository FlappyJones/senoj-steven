package com.dotgears.flappy;

import com.dotgears.C0140m;
import com.dotgears.C0147g;
import com.dotgears.C0152i;
import com.dotgears.C0159r;
import com.google.android.gms.C0338e;

/* renamed from: com.dotgears.flappy.e */
public class C0150e extends C0140m {
    public C0159r f671a;
    public C0152i f672b;
    public int f673c;
    public float f674d;
    public float f675e;
    public int f676f;

    public C0150e() {
        this.f672b = C0147g.f620D.m1247b("text_game_over");
        this.f671a = new C0159r();
    }

    public void m1262a() {
        this.F = true;
        this.G = true;
        this.f671a.m1334a(0.0f, 1.0f, 11, 1.0f);
        this.f673c = -1;
        this.f674d = -2.0f;
        this.f675e = 0.25f;
        this.f676f = 0;
        C0148c.D.m1253c(10, 0);
    }

    public void m1263a(float f) {
        this.f671a.m1333a(f);
        if (this.f673c < 0) {
            this.f673c = (int) (((float) this.f673c) + this.f674d);
            this.f674d += this.f675e;
        } else {
            this.f673c = 0;
        }
        switch (this.f676f) {
            case C0338e.MapAttrs_mapType /*0*/:
                if (this.f671a.f769g) {
                    this.f676f = 1;
                    C0147g.f620D.f623C.m1331a(C0147g.f620D.f649y, C0147g.f620D.f650z, 10, 20, 30, 40);
                    C0148c.D.m1253c(10, 0);
                }
            case C0338e.MapAttrs_cameraBearing /*1*/:
                if (C0147g.f620D.f623C.f754k == 2) {
                    this.f676f = 2;
                }
            default:
        }
    }

    public void m1264a(C0147g c0147g) {
        c0147g.m1242a(this.f672b, (288 - this.f672b.f683b) >> 1, this.f673c + 130, this.f671a.f763a);
    }
}
