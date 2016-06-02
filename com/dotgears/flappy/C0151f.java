package com.dotgears.flappy;

import com.dotgears.C0140m;
import com.dotgears.C0147g;
import com.dotgears.C0152i;
import com.dotgears.C0159r;
import com.google.android.gms.C0338e;

/* renamed from: com.dotgears.flappy.f */
public class C0151f extends C0140m {
    public C0159r f677a;
    public C0152i f678b;
    public C0152i f679c;
    int f680d;

    public C0151f() {
        this.f678b = C0147g.f620D.m1247b("text_ready");
        this.f679c = C0147g.f620D.m1247b("tutorial");
        this.f677a = new C0159r();
    }

    public void m1265a() {
        this.F = true;
        this.G = true;
        this.f677a.m1334a(0.0f, 1.0f, 0, 0.5f);
        this.f680d = 0;
    }

    public void m1266a(float f) {
        this.f677a.m1333a(f);
        switch (this.f680d) {
            case C0338e.MapAttrs_mapType /*0*/:
                if (this.f677a.f769g) {
                    this.f680d = 1;
                }
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                if (this.f677a.f769g) {
                    this.F = true;
                    this.G = false;
                }
            default:
        }
    }

    public void m1267a(C0147g c0147g) {
        c0147g.m1242a(this.f678b, (288 - this.f678b.f683b) >> 1, 146, this.f677a.f763a);
        c0147g.m1242a(this.f679c, (288 - this.f679c.f683b) >> 1, 220, this.f677a.f763a);
    }
}
