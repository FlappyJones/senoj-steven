package com.google.ads.p008a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.ads.AdActivity;
import com.google.ads.AdView;
import com.google.ads.C0160a;
import com.google.ads.C0201d;
import com.google.ads.C0204c;
import com.google.ads.C0206e;
import com.google.ads.C0208g;
import com.google.ads.C0209h;
import com.google.ads.C0210i;
import com.google.ads.C0211j;
import com.google.ads.C0216o;
import com.google.ads.C0217p;
import com.google.ads.at;
import com.google.ads.az;
import com.google.ads.ba;
import com.google.ads.bc;
import com.google.ads.bd;
import com.google.ads.bh;
import com.google.ads.bi;
import com.google.ads.bk;
import com.google.ads.bq;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.doubleclick.SwipeableDfpAdView;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0224c;
import com.google.ads.util.C0229g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.a.w */
public class C0184w {
    private static final Object f916a;
    private String f917A;
    private String f918B;
    private final bt f919b;
    private C0175n f920c;
    private C0201d f921d;
    private ab f922e;
    private C0161e f923f;
    private ad f924g;
    private boolean f925h;
    private long f926i;
    private boolean f927j;
    private boolean f928k;
    private boolean f929l;
    private boolean f930m;
    private boolean f931n;
    private SharedPreferences f932o;
    private long f933p;
    private C0217p f934q;
    private boolean f935r;
    private LinkedList f936s;
    private LinkedList f937t;
    private LinkedList f938u;
    private int f939v;
    private Boolean f940w;
    private bc f941x;
    private bd f942y;
    private bh f943z;

    static {
        f916a = new Object();
    }

    public C0184w(C0160a c0160a, Activity activity, C0208g c0208g, String str, ViewGroup viewGroup, boolean z) {
        this.f925h = false;
        this.f939v = -1;
        this.f917A = null;
        this.f918B = null;
        this.f935r = z;
        this.f922e = new ab();
        this.f920c = null;
        this.f921d = null;
        this.f928k = false;
        this.f933p = 60000;
        this.f929l = false;
        this.f931n = false;
        this.f930m = true;
        ac a = c0208g == null ? ac.f822a : ac.m1417a(c0208g, activity.getApplicationContext());
        if (c0160a instanceof SwipeableDfpAdView) {
            a.m1418a(true);
        }
        if (activity == null) {
            this.f919b = new bt(br.m1724a(), c0160a, c0160a instanceof AdView ? (AdView) c0160a : null, c0160a instanceof C0210i ? (C0210i) c0160a : null, str, null, null, viewGroup, a, this);
            return;
        }
        synchronized (f916a) {
            this.f932o = activity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
            if (z) {
                long j = this.f932o.getLong("Timeout" + str, -1);
                if (j < 0) {
                    this.f926i = 5000;
                } else {
                    this.f926i = j;
                }
            } else {
                this.f926i = 60000;
            }
        }
        this.f919b = new bt(br.m1724a(), c0160a, c0160a instanceof AdView ? (AdView) c0160a : null, c0160a instanceof C0210i ? (C0210i) c0160a : null, str, activity, activity.getApplicationContext(), viewGroup, a, this);
        this.f934q = new C0217p(this);
        this.f936s = new LinkedList();
        this.f937t = new LinkedList();
        this.f938u = new LinkedList();
        m1501a();
        AdUtil.m1814h((Context) this.f919b.f1099f.m1816a());
        this.f941x = new bc();
        this.f942y = new bd(this);
        this.f940w = null;
        this.f943z = null;
    }

    private void m1497a(bh bhVar, Boolean bool) {
        List d = bhVar.m1704d();
        if (d == null) {
            d = new ArrayList();
            d.add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
        }
        String b = bhVar.m1702b();
        m1499a(d, bhVar.m1701a(), b, bhVar.m1703c(), bool, this.f922e.m1393d(), this.f922e.m1394e());
    }

    private void m1498a(List list, String str) {
        List arrayList;
        if (list == null) {
            arrayList = new ArrayList();
            arrayList.add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
        } else {
            arrayList = list;
        }
        m1499a(arrayList, null, null, str, null, this.f922e.m1393d(), this.f922e.m1394e());
    }

    private void m1499a(List list, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        String a = AdUtil.m1788a((Context) this.f919b.f1099f.m1816a());
        az a2 = az.m1653a();
        String bigInteger = a2.m1656b().toString();
        String bigInteger2 = a2.m1657c().toString();
        for (String a3 : list) {
            new Thread(new C0216o(bi.m1706a(a3, (String) this.f919b.f1101h.m1816a(), bool, a, str, str2, str3, bigInteger, bigInteger2, str4, str5), (Context) this.f919b.f1099f.m1816a())).start();
        }
        this.f922e.m1391b();
    }

    public LinkedList m1500A() {
        return this.f937t;
    }

    public synchronized void m1501a() {
        C0208g c = ((ac) this.f919b.f1100g.m1816a()).m1422c();
        this.f923f = AdUtil.f1234a >= 14 ? new C0224c(this.f919b, c) : new C0161e(this.f919b, c);
        this.f923f.setVisibility(8);
        this.f924g = ad.m1423a(this, C0168h.f861d, true, this.f919b.m1726b());
        this.f923f.setWebViewClient(this.f924g);
        if (AdUtil.f1234a < ((Integer) ((bs) ((br) this.f919b.f1097d.m1816a()).f1077b.m1816a()).f1080b.m1817a()).intValue() && !((ac) this.f919b.f1100g.m1816a()).m1419a()) {
            C0229g.m1832a("Disabling hardware acceleration for a banner.");
            this.f923f.m1372g();
        }
    }

    public synchronized void m1502a(float f) {
        long j = this.f933p;
        this.f933p = (long) (1000.0f * f);
        if (m1537r() && this.f933p != j) {
            m1524e();
            m1525f();
        }
    }

    public synchronized void m1503a(int i) {
        this.f939v = i;
    }

    public void m1504a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        C0162a c0162a = (C0162a) this.f919b.f1098e.m1816a();
        int a = AdUtil.m1784a((Context) this.f919b.f1099f.m1816a(), i3 < 0 ? ((ac) this.f919b.f1100g.m1816a()).m1422c().m1762a() : i3);
        Context context = (Context) this.f919b.f1099f.m1816a();
        if (i4 < 0) {
            i4 = ((ac) this.f919b.f1100g.m1816a()).m1422c().m1763b();
        }
        LayoutParams layoutParams = new FrameLayout.LayoutParams(a, AdUtil.m1784a(context, i4));
        if (i3 < 0) {
            i5 = 0;
            i6 = 0;
        } else {
            i5 = i2;
            i6 = i;
        }
        a = i6 < 0 ? ((C0162a) this.f919b.f1098e.m1816a()).m1380d() : i6;
        if (i5 < 0) {
            i5 = ((C0162a) this.f919b.f1098e.m1816a()).m1379c();
        }
        ((C0162a) this.f919b.f1098e.m1816a()).setXPosition(a);
        ((C0162a) this.f919b.f1098e.m1816a()).setYPosition(i5);
        layoutParams.setMargins(AdUtil.m1784a((Context) this.f919b.f1099f.m1816a(), a), AdUtil.m1784a((Context) this.f919b.f1099f.m1816a(), i5), 0, 0);
        c0162a.setLayoutParams(layoutParams);
    }

    public void m1505a(long j) {
        synchronized (f916a) {
            Editor edit = this.f932o.edit();
            edit.putLong("Timeout" + this.f919b.f1101h, j);
            edit.commit();
            if (this.f935r) {
                this.f926i = j;
            }
        }
    }

    public void m1506a(View view) {
        ((ViewGroup) this.f919b.f1102i.m1816a()).setVisibility(0);
        ((ViewGroup) this.f919b.f1102i.m1816a()).removeAllViews();
        ((ViewGroup) this.f919b.f1102i.m1816a()).addView(view);
        if (((ac) this.f919b.f1100g.m1816a()).m1421b()) {
            ((C0184w) this.f919b.f1095b.m1816a()).m1509a((bq) this.f919b.f1105l.m1817a(), false, -1, -1, -1, -1);
            if (((C0162a) this.f919b.f1098e.m1816a()).m1377a()) {
                ((ViewGroup) this.f919b.f1102i.m1816a()).addView((View) this.f919b.f1098e.m1816a(), AdUtil.m1784a((Context) this.f919b.f1099f.m1816a(), ((ac) this.f919b.f1100g.m1816a()).m1422c().m1762a()), AdUtil.m1784a((Context) this.f919b.f1099f.m1816a(), ((ac) this.f919b.f1100g.m1816a()).m1422c().m1763b()));
            }
        }
    }

    public synchronized void m1507a(View view, bk bkVar, bh bhVar, boolean z) {
        C0229g.m1832a("AdManager.onReceiveGWhirlAd() called.");
        this.f928k = true;
        this.f943z = bhVar;
        if (this.f919b.m1725a()) {
            m1506a(view);
            m1497a(bhVar, Boolean.valueOf(z));
        }
        this.f942y.m1699a(bkVar);
        C0204c c0204c = (C0204c) this.f919b.f1108o.m1817a();
        if (c0204c != null) {
            c0204c.m1741a((C0160a) this.f919b.f1094a.m1816a());
        }
    }

    public synchronized void m1508a(ba baVar) {
        this.f920c = null;
        this.f942y.m1698a(baVar, this.f921d);
    }

    public void m1509a(bq bqVar, boolean z, int i, int i2, int i3, int i4) {
        ((C0162a) this.f919b.f1098e.m1816a()).setOverlayActivated(!z);
        m1504a(i, i2, i3, i4);
        if (this.f919b.f1110q.m1817a() == null) {
            return;
        }
        if (z) {
            ((C0211j) this.f919b.f1110q.m1817a()).m1768a((C0160a) this.f919b.f1094a.m1816a());
        } else {
            ((C0211j) this.f919b.f1110q.m1817a()).m1769b((C0160a) this.f919b.f1094a.m1816a());
        }
    }

    public synchronized void m1510a(C0201d c0201d) {
        C0229g.m1840d("v6.4.1 RC00");
        if (this.f925h) {
            C0229g.m1842e("loadAd called after ad was destroyed.");
        } else if (m1535p()) {
            C0229g.m1842e("loadAd called while the ad is already loading, so aborting.");
        } else if (AdActivity.m1339b()) {
            C0229g.m1842e("loadAd called while an interstitial or landing page is displayed, so aborting");
        } else if (AdUtil.m1808c((Context) this.f919b.f1099f.m1816a()) && AdUtil.m1806b((Context) this.f919b.f1099f.m1816a())) {
            if (at.m1634a((Context) this.f919b.f1099f.m1816a(), this.f932o.getLong("GoogleAdMobDoritosLife", 60000))) {
                at.m1633a((Activity) this.f919b.f1096c.m1819a());
            }
            this.f928k = false;
            this.f936s.clear();
            this.f937t.clear();
            this.f921d = c0201d;
            if (this.f941x.m1686a()) {
                this.f942y.m1698a(this.f941x.m1687b(), c0201d);
            } else {
                bq bqVar = new bq(this.f919b);
                this.f919b.f1106m.m1818a(bqVar);
                this.f920c = (C0175n) bqVar.f1073b.m1817a();
                this.f920c.m1480a(c0201d);
            }
        }
    }

    public synchronized void m1511a(C0206e c0206e) {
        this.f920c = null;
        if (c0206e == C0206e.NETWORK_ERROR) {
            m1502a(60.0f);
            if (!m1537r()) {
                m1526g();
            }
        }
        if (this.f919b.m1726b()) {
            if (c0206e == C0206e.NO_FILL) {
                this.f922e.m1385B();
            } else if (c0206e == C0206e.NETWORK_ERROR) {
                this.f922e.m1415z();
            }
        }
        C0229g.m1838c("onFailedToReceiveAd(" + c0206e + ")");
        C0204c c0204c = (C0204c) this.f919b.f1108o.m1817a();
        if (c0204c != null) {
            c0204c.m1742a((C0160a) this.f919b.f1094a.m1816a(), c0206e);
        }
    }

    public void m1512a(String str) {
        this.f918B = str;
        Uri build = new Builder().encodedQuery(str).build();
        StringBuilder stringBuilder = new StringBuilder();
        Map b = AdUtil.m1804b(build);
        for (String str2 : b.keySet()) {
            stringBuilder.append(str2).append(" = ").append((String) b.get(str2)).append("\n");
        }
        this.f917A = stringBuilder.toString().trim();
        if (TextUtils.isEmpty(this.f917A)) {
            this.f917A = null;
        }
    }

    public synchronized void m1513a(String str, String str2) {
        C0209h c0209h = (C0209h) this.f919b.f1109p.m1817a();
        if (c0209h != null) {
            c0209h.m1767a((C0160a) this.f919b.f1094a.m1816a(), str, str2);
        }
    }

    protected synchronized void m1514a(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C0229g.m1832a("Adding a click tracking URL: " + ((String) it.next()));
        }
        this.f938u = linkedList;
    }

    public synchronized void m1515a(boolean z) {
        this.f927j = z;
    }

    public String m1516b() {
        return this.f917A;
    }

    public synchronized void m1517b(long j) {
        if (j > 0) {
            this.f932o.edit().putLong("GoogleAdMobDoritosLife", j).commit();
        }
    }

    public synchronized void m1518b(ba baVar) {
        C0229g.m1832a("AdManager.onGWhirlNoFill() called.");
        m1498a(baVar.m1683i(), baVar.m1677c());
        C0204c c0204c = (C0204c) this.f919b.f1108o.m1817a();
        if (c0204c != null) {
            c0204c.m1742a((C0160a) this.f919b.f1094a.m1816a(), C0206e.NO_FILL);
        }
    }

    protected synchronized void m1519b(String str) {
        C0229g.m1832a("Adding a tracking URL: " + str);
        this.f936s.add(str);
    }

    public void m1520b(boolean z) {
        this.f940w = Boolean.valueOf(z);
    }

    public String m1521c() {
        return this.f918B;
    }

    protected synchronized void m1522c(String str) {
        C0229g.m1832a("Adding a manual tracking URL: " + str);
        m1500A().add(str);
    }

    public synchronized void m1523d() {
        this.f930m = false;
        C0229g.m1832a("Refreshing is no longer allowed on this AdView.");
    }

    public synchronized void m1524e() {
        if (this.f929l) {
            C0229g.m1832a("Disabling refreshing.");
            ((Handler) br.m1724a().f1078c.m1816a()).removeCallbacks(this.f934q);
            this.f929l = false;
        } else {
            C0229g.m1832a("Refreshing is already disabled.");
        }
    }

    public synchronized void m1525f() {
        this.f931n = false;
        if (!this.f919b.m1725a()) {
            C0229g.m1832a("Tried to enable refreshing on something other than an AdView.");
        } else if (!this.f930m) {
            C0229g.m1832a("Refreshing disabled on this AdView");
        } else if (this.f929l) {
            C0229g.m1832a("Refreshing is already enabled.");
        } else {
            C0229g.m1832a("Enabling refreshing every " + this.f933p + " milliseconds.");
            ((Handler) br.m1724a().f1078c.m1816a()).postDelayed(this.f934q, this.f933p);
            this.f929l = true;
        }
    }

    public void m1526g() {
        m1525f();
        this.f931n = true;
    }

    public bt m1527h() {
        return this.f919b;
    }

    public synchronized bc m1528i() {
        return this.f941x;
    }

    public synchronized C0175n m1529j() {
        return this.f920c;
    }

    public synchronized C0161e m1530k() {
        return this.f923f;
    }

    public synchronized ad m1531l() {
        return this.f924g;
    }

    public ab m1532m() {
        return this.f922e;
    }

    public synchronized int m1533n() {
        return this.f939v;
    }

    public long m1534o() {
        return this.f926i;
    }

    public synchronized boolean m1535p() {
        return this.f920c != null;
    }

    public synchronized boolean m1536q() {
        return this.f927j;
    }

    public synchronized boolean m1537r() {
        return this.f929l;
    }

    public synchronized void m1538s() {
        this.f922e.m1386C();
        C0229g.m1838c("onDismissScreen()");
        C0204c c0204c = (C0204c) this.f919b.f1108o.m1817a();
        if (c0204c != null) {
            c0204c.m1744c((C0160a) this.f919b.f1094a.m1816a());
        }
    }

    public synchronized void m1539t() {
        C0229g.m1838c("onPresentScreen()");
        C0204c c0204c = (C0204c) this.f919b.f1108o.m1817a();
        if (c0204c != null) {
            c0204c.m1743b((C0160a) this.f919b.f1094a.m1816a());
        }
    }

    public synchronized void m1540u() {
        C0229g.m1838c("onLeaveApplication()");
        C0204c c0204c = (C0204c) this.f919b.f1108o.m1817a();
        if (c0204c != null) {
            c0204c.m1745d((C0160a) this.f919b.f1094a.m1816a());
        }
    }

    public void m1541v() {
        this.f922e.m1395f();
        m1544y();
    }

    public synchronized void m1542w() {
        Activity activity = (Activity) this.f919b.f1096c.m1819a();
        if (activity == null) {
            C0229g.m1842e("activity was null while trying to ping tracking URLs.");
        } else {
            Iterator it = this.f936s.iterator();
            while (it.hasNext()) {
                new Thread(new C0216o((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    public synchronized void m1543x() {
        if (!this.f925h) {
            if (this.f921d == null) {
                C0229g.m1832a("Tried to refresh before calling loadAd().");
            } else if (this.f919b.m1725a()) {
                if (((AdView) this.f919b.f1103j.m1816a()).isShown() && AdUtil.m1810d()) {
                    C0229g.m1838c("Refreshing ad.");
                    m1510a(this.f921d);
                } else {
                    C0229g.m1832a("Not refreshing because the ad is not visible.");
                }
                if (this.f931n) {
                    m1524e();
                } else {
                    ((Handler) br.m1724a().f1078c.m1816a()).postDelayed(this.f934q, this.f933p);
                }
            } else {
                C0229g.m1832a("Tried to refresh an ad that wasn't an AdView.");
            }
        }
    }

    protected synchronized void m1544y() {
        Activity activity = (Activity) this.f919b.f1096c.m1819a();
        if (activity == null) {
            C0229g.m1842e("activity was null while trying to ping click tracking URLs.");
        } else {
            Iterator it = this.f938u.iterator();
            while (it.hasNext()) {
                new Thread(new C0216o((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    protected synchronized void m1545z() {
        this.f920c = null;
        this.f928k = true;
        this.f923f.setVisibility(0);
        if (this.f919b.m1725a()) {
            m1506a(this.f923f);
        }
        this.f922e.m1396g();
        if (this.f919b.m1725a()) {
            m1542w();
        }
        C0229g.m1838c("onReceiveAd()");
        C0204c c0204c = (C0204c) this.f919b.f1108o.m1817a();
        if (c0204c != null) {
            c0204c.m1741a((C0160a) this.f919b.f1094a.m1816a());
        }
        this.f919b.f1105l.m1818a(this.f919b.f1106m.m1817a());
        this.f919b.f1106m.m1818a(null);
    }
}
