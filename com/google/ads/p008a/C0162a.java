package com.google.ads.p008a;

import android.os.Handler;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;

/* renamed from: com.google.ads.a.a */
public class C0162a extends C0161e {
    private volatile boolean f801b;
    private boolean f802c;
    private int f803d;
    private int f804e;
    private final ad f805f;

    public C0162a(bt btVar) {
        super(btVar, null);
        this.f801b = true;
        this.f802c = true;
        this.f803d = 0;
        this.f804e = 0;
        if (AdUtil.f1234a < ((Integer) ((bs) ((br) btVar.f1097d.m1816a()).f1077b.m1816a()).f1081c.m1817a()).intValue()) {
            C0229g.m1832a("Disabling hardware acceleration for an activation overlay.");
            m1372g();
        }
        this.f805f = ad.m1423a((C0184w) btVar.f1095b.m1816a(), C0168h.f860c, true, true);
        setWebViewClient(this.f805f);
    }

    public boolean m1377a() {
        return this.f801b;
    }

    public boolean m1378b() {
        return this.f802c;
    }

    public int m1379c() {
        return this.f804e;
    }

    public boolean canScrollHorizontally(int i) {
        return false;
    }

    public boolean canScrollVertically(int i) {
        return false;
    }

    public int m1380d() {
        return this.f803d;
    }

    public ad m1381e() {
        return this.f805f;
    }

    public void setOverlayActivated(boolean z) {
        this.f802c = z;
    }

    public void setOverlayEnabled(boolean z) {
        if (!z) {
            ((Handler) br.m1724a().f1078c.m1816a()).post(new C0163b(this, this));
        }
        this.f801b = z;
    }

    public void setXPosition(int i) {
        this.f803d = i;
    }

    public void setYPosition(int i) {
        this.f804e = i;
    }
}
