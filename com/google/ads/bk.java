package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.p008a.ac;
import com.google.ads.p009b.C0192b;
import com.google.ads.util.C0227e;
import java.util.HashMap;

public class bk {
    final ac f1045a;
    private final bh f1046b;
    private boolean f1047c;
    private boolean f1048d;
    private bj f1049e;
    private final bd f1050f;
    private C0192b f1051g;
    private boolean f1052h;
    private boolean f1053i;
    private View f1054j;
    private final String f1055k;
    private final C0201d f1056l;
    private final HashMap f1057m;

    public bk(bd bdVar, ac acVar, bh bhVar, String str, C0201d c0201d, HashMap hashMap) {
        C0227e.m1826a(TextUtils.isEmpty(str));
        this.f1050f = bdVar;
        this.f1045a = acVar;
        this.f1046b = bhVar;
        this.f1055k = str;
        this.f1056l = c0201d;
        this.f1057m = hashMap;
        this.f1047c = false;
        this.f1048d = false;
        this.f1049e = null;
        this.f1051g = null;
        this.f1052h = false;
        this.f1053i = false;
        this.f1054j = null;
    }

    public synchronized void m1708a() {
        C0227e.m1827a(this.f1052h, "destroy() called but startLoadAdTask has not been called.");
        ((Handler) br.m1724a().f1078c.m1816a()).post(new bl(this));
    }

    public synchronized void m1709a(Activity activity) {
        C0227e.m1828b(this.f1052h, "startLoadAdTask has already been called.");
        this.f1052h = true;
        ((Handler) br.m1724a().f1078c.m1816a()).post(new bm(this, activity, this.f1055k, this.f1056l, this.f1057m));
    }

    synchronized void m1710a(C0192b c0192b) {
        this.f1051g = c0192b;
    }

    synchronized void m1711a(boolean z, bj bjVar) {
        this.f1048d = z;
        this.f1047c = true;
        this.f1049e = bjVar;
        notify();
    }

    public synchronized boolean m1712b() {
        return this.f1047c;
    }

    public synchronized boolean m1713c() {
        C0227e.m1827a(this.f1047c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
        return this.f1048d;
    }

    public synchronized bj m1714d() {
        return this.f1049e == null ? bj.TIMEOUT : this.f1049e;
    }

    public synchronized View m1715e() {
        C0227e.m1827a(this.f1047c, "getAdView() called when isLoadAdTaskDone() is false.");
        return this.f1054j;
    }

    public synchronized String m1716f() {
        return this.f1051g != null ? this.f1051g.getClass().getName() : "\"adapter was not created.\"";
    }

    synchronized void m1717g() {
        this.f1053i = true;
    }

    synchronized boolean m1718h() {
        return this.f1053i;
    }
}
