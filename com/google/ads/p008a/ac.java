package com.google.ads.p008a;

import android.content.Context;
import com.google.ads.C0208g;

/* renamed from: com.google.ads.a.ac */
public class ac {
    public static final ac f822a;
    private C0208g f823b;
    private boolean f824c;
    private final boolean f825d;

    static {
        f822a = new ac(null, true);
    }

    private ac(C0208g c0208g, boolean z) {
        this.f823b = c0208g;
        this.f825d = z;
    }

    public static ac m1416a(C0208g c0208g) {
        return ac.m1417a(c0208g, null);
    }

    public static ac m1417a(C0208g c0208g, Context context) {
        return new ac(C0208g.m1759a(c0208g, context), false);
    }

    public void m1418a(boolean z) {
        this.f824c = z;
    }

    public boolean m1419a() {
        return this.f825d;
    }

    public void m1420b(C0208g c0208g) {
        if (!this.f825d) {
            this.f823b = c0208g;
        }
    }

    public boolean m1421b() {
        return this.f824c;
    }

    public C0208g m1422c() {
        return this.f823b;
    }
}
