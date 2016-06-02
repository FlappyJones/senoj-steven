package com.google.ads;

import com.google.ads.p008a.C0184w;
import com.google.ads.util.C0229g;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.p */
public class C0217p implements Runnable {
    private WeakReference f1179a;

    public C0217p(C0184w c0184w) {
        this.f1179a = new WeakReference(c0184w);
    }

    public void run() {
        C0184w c0184w = (C0184w) this.f1179a.get();
        if (c0184w == null) {
            C0229g.m1832a("The ad must be gone, so cancelling the refresh timer.");
        } else {
            c0184w.m1543x();
        }
    }
}
