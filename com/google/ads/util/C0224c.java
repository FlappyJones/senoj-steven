package com.google.ads.util;

import com.google.ads.C0208g;
import com.google.ads.bt;
import com.google.ads.p008a.C0161e;
import com.google.ads.p008a.C0162a;

/* renamed from: com.google.ads.util.c */
public class C0224c extends C0161e {
    public C0224c(bt btVar, C0208g c0208g) {
        super(btVar, c0208g);
    }

    public boolean canScrollHorizontally(int i) {
        return this.a.f1098e.m1816a() != null ? !((C0162a) this.a.f1098e.m1816a()).m1378b() : super.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.a.f1098e.m1816a() != null ? !((C0162a) this.a.f1098e.m1816a()).m1378b() : super.canScrollVertically(i);
    }
}
