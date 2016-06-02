package com.google.ads.p008a;

import com.google.ads.AdView;

/* renamed from: com.google.ads.a.b */
class C0163b implements Runnable {
    final /* synthetic */ C0162a f846a;
    final /* synthetic */ C0162a f847b;

    C0163b(C0162a c0162a, C0162a c0162a2) {
        this.f847b = c0162a;
        this.f846a = c0162a2;
    }

    public void run() {
        ((AdView) this.f847b.a.f1103j.m1816a()).removeView(this.f846a);
    }
}
