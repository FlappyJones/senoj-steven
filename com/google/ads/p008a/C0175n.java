package com.google.ads.p008a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.google.ads.AdView;
import com.google.ads.C0201d;
import com.google.ads.C0206e;
import com.google.ads.C0208g;
import com.google.ads.ai;
import com.google.ads.ak;
import com.google.ads.az;
import com.google.ads.ba;
import com.google.ads.bc;
import com.google.ads.bq;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.p011c.C0202a;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.a.n */
public class C0175n implements Runnable {
    boolean f864a;
    private String f865b;
    private String f866c;
    private String f867d;
    private String f868e;
    private boolean f869f;
    private C0186y f870g;
    private C0201d f871h;
    private WebView f872i;
    private bq f873j;
    private String f874k;
    private String f875l;
    private LinkedList f876m;
    private String f877n;
    private C0208g f878o;
    private boolean f879p;
    private volatile boolean f880q;
    private boolean f881r;
    private C0206e f882s;
    private boolean f883t;
    private int f884u;
    private Thread f885v;
    private boolean f886w;
    private C0182u f887x;

    protected C0175n() {
        this.f879p = false;
        this.f887x = C0182u.ONLINE_SERVER_REQUEST;
    }

    public C0175n(bq bqVar) {
        this.f879p = false;
        this.f887x = C0182u.ONLINE_SERVER_REQUEST;
        this.f873j = bqVar;
        this.f874k = null;
        this.f865b = null;
        this.f866c = null;
        this.f867d = null;
        this.f876m = new LinkedList();
        this.f882s = null;
        this.f883t = false;
        this.f884u = -1;
        this.f869f = false;
        this.f881r = false;
        this.f877n = null;
        this.f878o = null;
        if (((Activity) ((bt) bqVar.f1072a.m1816a()).f1096c.m1819a()) != null) {
            this.f872i = new C0161e((bt) bqVar.f1072a.m1816a(), null);
            this.f872i.setWebViewClient(ad.m1423a((C0184w) ((bt) bqVar.f1072a.m1816a()).f1095b.m1816a(), C0168h.f859b, false, false));
            this.f872i.setVisibility(8);
            this.f872i.setWillNotDraw(true);
            this.f870g = new C0186y(bqVar);
            return;
        }
        this.f872i = null;
        this.f870g = null;
        C0229g.m1842e("activity was null while trying to create an AdLoader.");
    }

    static void m1461a(String str, ba baVar, bc bcVar) {
        if (str != null && !str.contains("no-store") && !str.contains("no-cache")) {
            Matcher matcher = Pattern.compile("max-age\\s*=\\s*(\\d+)").matcher(str);
            if (matcher.find()) {
                try {
                    bcVar.m1685a(baVar, Integer.parseInt(matcher.group(1)));
                    C0229g.m1838c(String.format(Locale.US, "Caching gWhirl configuration for: %d seconds", new Object[]{Integer.valueOf(r0)}));
                    return;
                } catch (Throwable e) {
                    C0229g.m1837b("Caught exception trying to parse cache control directive. Overflow?", e);
                    return;
                }
            }
            C0229g.m1838c("Unrecognized cacheControlDirective: '" + str + "'. Not caching configuration.");
        }
    }

    private void m1464b(String str, String str2) {
        ((Handler) br.m1724a().f1078c.m1816a()).post(new C0181t(this, this.f872i, str2, str));
    }

    private String m1465c() {
        return this.f871h instanceof C0202a ? "AFMA_buildAdURL" : "AFMA_buildAdURL";
    }

    private String m1468d() {
        return this.f871h instanceof C0202a ? "AFMA_getSdkConstants();" : "AFMA_getSdkConstants();";
    }

    private String m1469e() {
        return this.f871h instanceof C0202a ? "http://www.gstatic.com/safa/" : "http://media.admob.com/";
    }

    private String m1472f() {
        return this.f871h instanceof C0202a ? "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>" : "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>";
    }

    private String m1473g() {
        return this.f871h instanceof C0202a ? "</script></head><body></body></html>" : "</script></head><body></body></html>";
    }

    private void m1474h() {
        WebView k = ((C0184w) ((bt) this.f873j.f1072a.m1816a()).f1095b.m1816a()).m1530k();
        ((C0184w) ((bt) this.f873j.f1072a.m1816a()).f1095b.m1816a()).m1531l().m1427c(true);
        ((C0184w) ((bt) this.f873j.f1072a.m1816a()).f1095b.m1816a()).m1532m().m1397h();
        ((Handler) br.m1724a().f1078c.m1816a()).post(new C0181t(this, k, this.f865b, this.f866c));
    }

    private void m1475i() {
        ((Handler) br.m1724a().f1078c.m1816a()).post(new C0183v(this, (C0184w) ((bt) this.f873j.f1072a.m1816a()).f1095b.m1816a(), this.f872i, this.f876m, this.f884u, this.f881r, this.f877n, this.f878o));
    }

    public String m1476a(Map map, Activity activity) {
        int i = 0;
        Context applicationContext = activity.getApplicationContext();
        ab m = ((C0184w) ((bt) this.f873j.f1072a.m1816a()).f1095b.m1816a()).m1532m();
        long m2 = m.m1402m();
        if (m2 > 0) {
            map.put("prl", Long.valueOf(m2));
        }
        m2 = m.m1403n();
        if (m2 > 0) {
            map.put("prnl", Long.valueOf(m2));
        }
        String l = m.m1401l();
        if (l != null) {
            map.put("ppcl", l);
        }
        l = m.m1400k();
        if (l != null) {
            map.put("pcl", l);
        }
        m2 = m.m1399j();
        if (m2 > 0) {
            map.put("pcc", Long.valueOf(m2));
        }
        map.put("preqs", Long.valueOf(m.m1404o()));
        map.put("oar", Long.valueOf(m.m1405p()));
        map.put("bas_on", Long.valueOf(m.m1408s()));
        map.put("bas_off", Long.valueOf(m.m1411v()));
        if (m.m1414y()) {
            map.put("aoi_timeout", "true");
        }
        if (m.m1384A()) {
            map.put("aoi_nofill", "true");
        }
        l = m.m1387D();
        if (l != null) {
            map.put("pit", l);
        }
        map.put("ptime", Long.valueOf(ab.m1383E()));
        m.m1388a();
        m.m1398i();
        if (((bt) this.f873j.f1072a.m1816a()).m1726b()) {
            map.put("format", "interstitial_mb");
        } else {
            C0208g c = ((ac) ((bt) this.f873j.f1072a.m1816a()).f1100g.m1816a()).m1422c();
            if (c.m1764c()) {
                map.put("smart_w", "full");
            }
            if (c.m1765d()) {
                map.put("smart_h", "auto");
            }
            if (c.m1766e()) {
                Map hashMap = new HashMap();
                hashMap.put("w", Integer.valueOf(c.m1762a()));
                hashMap.put("h", Integer.valueOf(c.m1763b()));
                map.put("ad_frame", hashMap);
            } else {
                map.put("format", c.toString());
            }
        }
        map.put("slotname", ((bt) this.f873j.f1072a.m1816a()).f1101h.m1816a());
        map.put("js", "afma-sdk-a-v6.4.1");
        try {
            int i2;
            int i3 = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
            CharSequence f = AdUtil.m1812f(applicationContext);
            if (!TextUtils.isEmpty(f)) {
                map.put("mv", f);
            }
            String str = (String) br.m1724a().f1076a.m1817a();
            if (!TextUtils.isEmpty(str)) {
                map.put("imbf", str);
            }
            map.put("msid", applicationContext.getPackageName());
            map.put("app_name", i3 + ".android." + applicationContext.getPackageName());
            map.put("isu", AdUtil.m1788a(applicationContext));
            Object d = AdUtil.m1809d(applicationContext);
            l = "net";
            if (d == null) {
                d = "null";
            }
            map.put(l, d);
            str = AdUtil.m1811e(applicationContext);
            if (!(str == null || str.length() == 0)) {
                map.put("cap", str);
            }
            map.put("u_audio", Integer.valueOf(AdUtil.m1813g(applicationContext).ordinal()));
            DisplayMetrics a = AdUtil.m1787a(activity);
            map.put("u_sd", Float.valueOf(a.density));
            map.put("u_h", Integer.valueOf(AdUtil.m1785a(applicationContext, a)));
            map.put("u_w", Integer.valueOf(AdUtil.m1802b(applicationContext, a)));
            map.put("hl", Locale.getDefault().getLanguage());
            bt btVar = (bt) this.f873j.f1072a.m1816a();
            ai aiVar = (ai) btVar.f1111r.m1817a();
            if (aiVar == null) {
                aiVar = ai.m1592a("afma-sdk-a-v6.4.1", (Context) activity);
                btVar.f1111r.m1818a(aiVar);
                btVar.f1112s.m1818a(new ak(aiVar));
            }
            map.put("ms", aiVar.m1582a(applicationContext));
            if (!(((bt) this.f873j.f1072a.m1816a()).f1103j == null || ((bt) this.f873j.f1072a.m1816a()).f1103j.m1816a() == null)) {
                AdView adView = (AdView) ((bt) this.f873j.f1072a.m1816a()).f1103j.m1816a();
                if (adView.getParent() != null) {
                    int[] iArr = new int[2];
                    adView.getLocationOnScreen(iArr);
                    i2 = iArr[0];
                    int i4 = iArr[1];
                    DisplayMetrics displayMetrics = ((Context) ((bt) this.f873j.f1072a.m1816a()).f1099f.m1816a()).getResources().getDisplayMetrics();
                    i3 = (!adView.isShown() || adView.getWidth() + i2 <= 0 || adView.getHeight() + i4 <= 0 || i2 > displayMetrics.widthPixels || i4 > displayMetrics.heightPixels) ? 0 : 1;
                    Map hashMap2 = new HashMap();
                    hashMap2.put("x", Integer.valueOf(i2));
                    hashMap2.put("y", Integer.valueOf(i4));
                    hashMap2.put("width", Integer.valueOf(adView.getWidth()));
                    hashMap2.put("height", Integer.valueOf(adView.getHeight()));
                    hashMap2.put("visible", Integer.valueOf(i3));
                    map.put("ad_pos", hashMap2);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            C0208g[] c0208gArr = (C0208g[]) ((bt) this.f873j.f1072a.m1816a()).f1107n.m1817a();
            if (c0208gArr != null) {
                i2 = c0208gArr.length;
                while (i < i2) {
                    C0208g c0208g = c0208gArr[i];
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    stringBuilder.append(c0208g.m1762a() + "x" + c0208g.m1763b());
                    i++;
                }
                map.put("sz", stringBuilder.toString());
            }
            TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
            CharSequence networkOperator = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                map.put("carrier", networkOperator);
            }
            map.put("pt", Integer.valueOf(telephonyManager.getPhoneType()));
            map.put("gnt", Integer.valueOf(telephonyManager.getNetworkType()));
            if (AdUtil.m1807c()) {
                map.put("simulator", Integer.valueOf(1));
            }
            map.put("session_id", az.m1653a().m1656b().toString());
            map.put("seq_num", az.m1653a().m1657c().toString());
            if (((ac) ((bt) this.f873j.f1072a.m1816a()).f1100g.m1816a()).m1421b()) {
                map.put("swipeable", Integer.valueOf(1));
            }
            if (((Boolean) ((bt) this.f873j.f1072a.m1816a()).f1113t.m1817a()).booleanValue()) {
                map.put("d_imp_hdr", Integer.valueOf(1));
            }
            l = AdUtil.m1790a(map);
            str = ((Boolean) ((bs) ((br) ((bt) this.f873j.f1072a.m1816a()).f1097d.m1816a()).f1077b.m1816a()).f1093o.m1817a()).booleanValue() ? m1472f() + m1465c() + "(" + l + ");" + m1473g() : m1472f() + m1468d() + m1465c() + "(" + l + ");" + m1473g();
            C0229g.m1838c("adRequestUrlHtml: " + str);
            return str;
        } catch (NameNotFoundException e) {
            throw new C0180s(this, "NameNotFoundException");
        }
    }

    protected void m1477a() {
        try {
            if (TextUtils.isEmpty(this.f868e)) {
                C0229g.m1836b("Got a mediation response with no content type. Aborting mediation.");
                m1482a(C0206e.INTERNAL_ERROR, false);
            } else if (this.f868e.startsWith("application/json")) {
                ba a = ba.m1672a(this.f866c);
                C0175n.m1461a(this.f867d, a, ((C0184w) ((bt) this.f873j.f1072a.m1816a()).f1095b.m1816a()).m1528i());
                ((Handler) br.m1724a().f1078c.m1816a()).post(new C0177p(this, a));
            } else {
                C0229g.m1836b("Got a mediation response with a content type: '" + this.f868e + "'. Expected something starting with 'application/json'. Aborting mediation.");
                m1482a(C0206e.INTERNAL_ERROR, false);
            }
        } catch (Throwable e) {
            C0229g.m1837b("AdLoader can't parse gWhirl server configuration.", e);
            m1482a(C0206e.INTERNAL_ERROR, false);
        }
    }

    public synchronized void m1478a(int i) {
        this.f884u = i;
    }

    public synchronized void m1479a(C0182u c0182u) {
        this.f887x = c0182u;
    }

    protected void m1480a(C0201d c0201d) {
        this.f871h = c0201d;
        this.f880q = false;
        this.f885v = new Thread(this);
        this.f885v.start();
    }

    public synchronized void m1481a(C0206e c0206e) {
        this.f882s = c0206e;
        notify();
    }

    protected void m1482a(C0206e c0206e, boolean z) {
        ((Handler) br.m1724a().f1078c.m1816a()).post(new C0179r((C0184w) ((bt) this.f873j.f1072a.m1816a()).f1095b.m1816a(), this.f872i, this.f870g, c0206e, z));
    }

    public synchronized void m1483a(C0208g c0208g) {
        this.f878o = c0208g;
    }

    protected synchronized void m1484a(String str) {
        this.f876m.add(str);
    }

    protected synchronized void m1485a(String str, String str2) {
        this.f865b = str2;
        this.f866c = str;
        notify();
    }

    public synchronized void m1486a(boolean z) {
        this.f879p = z;
    }

    protected synchronized void m1487b() {
        this.f883t = true;
        notify();
    }

    protected synchronized void m1488b(String str) {
        this.f868e = str;
    }

    protected synchronized void m1489b(boolean z) {
        this.f869f = z;
    }

    protected synchronized void m1490c(String str) {
        this.f867d = str;
    }

    public synchronized void m1491c(boolean z) {
        this.f881r = z;
    }

    public synchronized void m1492d(String str) {
        this.f874k = str;
        notify();
    }

    public synchronized void m1493d(boolean z) {
        this.f886w = z;
    }

    public synchronized void m1494e(String str) {
        this.f875l = str;
    }

    public synchronized void m1495e(boolean z) {
        this.f864a = z;
    }

    public synchronized void m1496f(String str) {
        this.f877n = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r12 = this;
        r3 = 0;
        r10 = 0;
        monitor-enter(r12);
        r0 = r12.f872i;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r0 = r12.f870g;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x0019;
    L_0x000c:
        r0 = "adRequestWebView was null while trying to load an ad.";
        com.google.ads.util.C0229g.m1842e(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
    L_0x0018:
        return;
    L_0x0019:
        r0 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.bt) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1096c;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1819a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (android.app.Activity) r0;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x003d;
    L_0x002d:
        r0 = "activity was null while forming an ad request.";
        com.google.ads.util.C0229g.m1842e(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        r1 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.bt) r1;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.f1095b;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.p008a.C0184w) r1;	 Catch:{ Throwable -> 0x0115 }
        r4 = r1.m1534o();	 Catch:{ Throwable -> 0x0115 }
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Throwable -> 0x0115 }
        r2 = r12.f871h;	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.bt) r1;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.f1099f;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (android.content.Context) r1;	 Catch:{ Throwable -> 0x0115 }
        r8 = r2.m1736a(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = "extras";
        r1 = r8.get(r1);	 Catch:{ Throwable -> 0x0115 }
        r2 = r1 instanceof java.util.Map;	 Catch:{ Throwable -> 0x0115 }
        if (r2 == 0) goto L_0x00e1;
    L_0x0079:
        r1 = (java.util.Map) r1;	 Catch:{ Throwable -> 0x0115 }
        r2 = "_adUrl";
        r2 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r9 = r2 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x0089;
    L_0x0085:
        r2 = (java.lang.String) r2;	 Catch:{ Throwable -> 0x0115 }
        r12.f865b = r2;	 Catch:{ Throwable -> 0x0115 }
    L_0x0089:
        r2 = "_requestUrl";
        r2 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r9 = r2 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x0097;
    L_0x0093:
        r2 = (java.lang.String) r2;	 Catch:{ Throwable -> 0x0115 }
        r12.f874k = r2;	 Catch:{ Throwable -> 0x0115 }
    L_0x0097:
        r2 = "_activationOverlayUrl";
        r2 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r9 = r2 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x00a5;
    L_0x00a1:
        r2 = (java.lang.String) r2;	 Catch:{ Throwable -> 0x0115 }
        r12.f875l = r2;	 Catch:{ Throwable -> 0x0115 }
    L_0x00a5:
        r2 = "_orientation";
        r2 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r9 = r2 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x00ba;
    L_0x00af:
        r9 = "p";
        r9 = r2.equals(r9);	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x0109;
    L_0x00b7:
        r2 = 1;
        r12.f884u = r2;	 Catch:{ Throwable -> 0x0115 }
    L_0x00ba:
        r2 = "_norefresh";
        r1 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r2 = r1 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r2 == 0) goto L_0x00e1;
    L_0x00c4:
        r2 = "t";
        r1 = r1.equals(r2);	 Catch:{ Throwable -> 0x0115 }
        if (r1 == 0) goto L_0x00e1;
    L_0x00cc:
        r1 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.bt) r1;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.f1095b;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.p008a.C0184w) r1;	 Catch:{ Throwable -> 0x0115 }
        r1.m1523d();	 Catch:{ Throwable -> 0x0115 }
    L_0x00e1:
        r1 = r12.f865b;	 Catch:{ Throwable -> 0x0115 }
        if (r1 != 0) goto L_0x030e;
    L_0x00e5:
        r1 = r12.f874k;	 Catch:{ Throwable -> 0x0115 }
        if (r1 != 0) goto L_0x01c2;
    L_0x00e9:
        r0 = r12.m1476a(r8, r0);	 Catch:{ s -> 0x0124 }
        r1 = r12.m1469e();	 Catch:{ Throwable -> 0x0115 }
        r12.m1464b(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Throwable -> 0x0115 }
        r0 = r0 - r6;
        r0 = r4 - r0;
        r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x0102;
    L_0x00ff:
        r12.wait(r0);	 Catch:{ InterruptedException -> 0x0144 }
    L_0x0102:
        r0 = r12.f880q;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x015e;
    L_0x0106:
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0109:
        r9 = "l";
        r2 = r2.equals(r9);	 Catch:{ Throwable -> 0x0115 }
        if (r2 == 0) goto L_0x00ba;
    L_0x0111:
        r2 = 0;
        r12.f884u = r2;	 Catch:{ Throwable -> 0x0115 }
        goto L_0x00ba;
    L_0x0115:
        r0 = move-exception;
        r1 = "An unknown error occurred in AdLoader.";
        com.google.ads.util.C0229g.m1837b(r1, r0);	 Catch:{ all -> 0x003a }
        r0 = com.google.ads.C0206e.INTERNAL_ERROR;	 Catch:{ all -> 0x003a }
        r1 = 1;
        r12.m1482a(r0, r1);	 Catch:{ all -> 0x003a }
    L_0x0121:
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0124:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>();	 Catch:{ Throwable -> 0x0115 }
        r2 = "Caught internal exception: ";
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0115 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0144:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>();	 Catch:{ Throwable -> 0x0115 }
        r2 = "AdLoader InterruptedException while getting the URL: ";
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0115 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1832a(r0);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x015e:
        r0 = r12.f882s;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x016b;
    L_0x0162:
        r0 = r12.f882s;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x016b:
        r0 = r12.f874k;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x0194;
    L_0x016f:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "AdLoader timed out after ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x0115 }
        r1 = "ms while getting the URL.";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.NETWORK_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0194:
        r0 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.bt) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1100g;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.p008a.ac) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1421b();	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x01c2;
    L_0x01ac:
        r0 = r12.f875l;	 Catch:{ Throwable -> 0x0115 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x01c2;
    L_0x01b4:
        r0 = "AdLoader doesn't have a URL for the activation overlay";
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x01c2:
        r0 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.bt) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1095b;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.p008a.C0184w) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1532m();	 Catch:{ Throwable -> 0x0115 }
        r1 = com.google.ads.p008a.C0178q.f891a;	 Catch:{ Throwable -> 0x0115 }
        r2 = r12.f887x;	 Catch:{ Throwable -> 0x0115 }
        r2 = r2.ordinal();	 Catch:{ Throwable -> 0x0115 }
        r1 = r1[r2];	 Catch:{ Throwable -> 0x0115 }
        switch(r1) {
            case 1: goto L_0x0278;
            case 2: goto L_0x0288;
            case 3: goto L_0x0292;
            case 4: goto L_0x029f;
            default: goto L_0x01e5;
        };	 Catch:{ Throwable -> 0x0115 }
    L_0x01e5:
        r0 = r12.f864a;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x02f2;
    L_0x01e9:
        r0 = "Not using loadUrl().";
        com.google.ads.util.C0229g.m1832a(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r12.f870g;	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.f886w;	 Catch:{ Throwable -> 0x0115 }
        r0.m1569a(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.bt) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1100g;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.p008a.ac) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1421b();	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0479;
    L_0x020d:
        r0 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.bt) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1098e;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.p008a.C0162a) r0;	 Catch:{ Throwable -> 0x0115 }
        r3 = r0.m1381e();	 Catch:{ Throwable -> 0x0115 }
        r0 = 1;
        r3.m1427c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.br.m1724a();	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1078c;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (android.os.Handler) r0;	 Catch:{ Throwable -> 0x0115 }
        r1 = new com.google.ads.a.o;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>(r12);	 Catch:{ Throwable -> 0x0115 }
        r0.post(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r3;
    L_0x023c:
        r1 = r12.f870g;	 Catch:{ Throwable -> 0x0115 }
        r2 = r12.f874k;	 Catch:{ Throwable -> 0x0115 }
        r1.m1568a(r2);	 Catch:{ Throwable -> 0x0115 }
    L_0x0243:
        r1 = r12.f880q;	 Catch:{ InterruptedException -> 0x025e }
        if (r1 != 0) goto L_0x02b5;
    L_0x0247:
        r1 = r12.f882s;	 Catch:{ InterruptedException -> 0x025e }
        if (r1 != 0) goto L_0x02b5;
    L_0x024b:
        r1 = r12.f866c;	 Catch:{ InterruptedException -> 0x025e }
        if (r1 != 0) goto L_0x02b5;
    L_0x024f:
        r1 = android.os.SystemClock.elapsedRealtime();	 Catch:{ InterruptedException -> 0x025e }
        r1 = r1 - r6;
        r1 = r4 - r1;
        r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r3 <= 0) goto L_0x02b5;
    L_0x025a:
        r12.wait(r1);	 Catch:{ InterruptedException -> 0x025e }
        goto L_0x0243;
    L_0x025e:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>();	 Catch:{ Throwable -> 0x0115 }
        r2 = "AdLoader InterruptedException while getting the ad server's response: ";
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0115 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1832a(r0);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0278:
        r0.m1407r();	 Catch:{ Throwable -> 0x0115 }
        r0.m1410u();	 Catch:{ Throwable -> 0x0115 }
        r0.m1413x();	 Catch:{ Throwable -> 0x0115 }
        r0 = "Request scenario: Online server request.";
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        goto L_0x01e5;
    L_0x0288:
        r0.m1409t();	 Catch:{ Throwable -> 0x0115 }
        r0 = "Request scenario: Online using buffered ads.";
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        goto L_0x01e5;
    L_0x0292:
        r0.m1412w();	 Catch:{ Throwable -> 0x0115 }
        r0.m1406q();	 Catch:{ Throwable -> 0x0115 }
        r0 = "Request scenario: Offline using buffered ads.";
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        goto L_0x01e5;
    L_0x029f:
        r0.m1406q();	 Catch:{ Throwable -> 0x0115 }
        r0 = "Request scenario: Offline with no buffered ads.";
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = "Network is unavailable.  Aborting ad request.";
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.NETWORK_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x02b5:
        r1 = r12.f880q;	 Catch:{ Throwable -> 0x0115 }
        if (r1 == 0) goto L_0x02bc;
    L_0x02b9:
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x02bc:
        r1 = r12.f882s;	 Catch:{ Throwable -> 0x0115 }
        if (r1 == 0) goto L_0x02c9;
    L_0x02c0:
        r0 = r12.f882s;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x02c9:
        r1 = r12.f866c;	 Catch:{ Throwable -> 0x0115 }
        if (r1 != 0) goto L_0x0476;
    L_0x02cd:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "AdLoader timed out after ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x0115 }
        r1 = "ms while waiting for the ad server's response.";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.NETWORK_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x02f2:
        r0 = r12.f874k;	 Catch:{ Throwable -> 0x0115 }
        r12.f865b = r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "Using loadUrl.  adBaseUrl: ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.f865b;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1832a(r0);	 Catch:{ Throwable -> 0x0115 }
    L_0x030e:
        r1 = r3;
    L_0x030f:
        r0 = r12.f864a;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x03e1;
    L_0x0313:
        r0 = r12.f869f;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0333;
    L_0x0317:
        r0 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.bt) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1095b;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.p008a.C0184w) r0;	 Catch:{ Throwable -> 0x0115 }
        r1 = 1;
        r0.m1520b(r1);	 Catch:{ Throwable -> 0x0115 }
        r12.m1477a();	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0333:
        r0 = r12.f868e;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0372;
    L_0x0337:
        r0 = r12.f868e;	 Catch:{ Throwable -> 0x0115 }
        r2 = "application/json";
        r0 = r0.startsWith(r2);	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x034b;
    L_0x0341:
        r0 = r12.f868e;	 Catch:{ Throwable -> 0x0115 }
        r2 = "text/javascript";
        r0 = r0.startsWith(r2);	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0372;
    L_0x034b:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "Expected HTML but received ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.f868e;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = ".";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1836b(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0372:
        r0 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.bt) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1107n;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1817a();	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x03d5;
    L_0x0384:
        r0 = r12.f878o;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x0396;
    L_0x0388:
        r0 = "Multiple supported ad sizes were specified, but the server did not respond with a size.";
        com.google.ads.util.C0229g.m1836b(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0396:
        r0 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.bt) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1107n;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1817a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (java.lang.Object[]) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = java.util.Arrays.asList(r0);	 Catch:{ Throwable -> 0x0115 }
        r2 = r12.f878o;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.contains(r2);	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x03e1;
    L_0x03b4:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "The ad server did not respond with a supported AdSize: ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.f878o;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1836b(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x03d5:
        r0 = r12.f878o;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x03e1;
    L_0x03d9:
        r0 = "adSize was expected to be null in AdLoader.";
        com.google.ads.util.C0229g.m1842e(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = 0;
        r12.f878o = r0;	 Catch:{ Throwable -> 0x0115 }
    L_0x03e1:
        r0 = r12.f873j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1072a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.bt) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.f1095b;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.m1816a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.p008a.C0184w) r0;	 Catch:{ Throwable -> 0x0115 }
        r2 = 0;
        r0.m1520b(r2);	 Catch:{ Throwable -> 0x0115 }
        r12.m1474h();	 Catch:{ Throwable -> 0x0115 }
    L_0x03fa:
        r0 = r12.f880q;	 Catch:{ InterruptedException -> 0x042f }
        if (r0 != 0) goto L_0x0449;
    L_0x03fe:
        r0 = r12.f883t;	 Catch:{ InterruptedException -> 0x042f }
        if (r0 == 0) goto L_0x0420;
    L_0x0402:
        r0 = r12.f873j;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.f1072a;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.m1816a();	 Catch:{ InterruptedException -> 0x042f }
        r0 = (com.google.ads.bt) r0;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.f1100g;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.m1816a();	 Catch:{ InterruptedException -> 0x042f }
        r0 = (com.google.ads.p008a.ac) r0;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.m1421b();	 Catch:{ InterruptedException -> 0x042f }
        if (r0 == 0) goto L_0x0449;
    L_0x041a:
        r0 = r1.m1425a();	 Catch:{ InterruptedException -> 0x042f }
        if (r0 == 0) goto L_0x0449;
    L_0x0420:
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ InterruptedException -> 0x042f }
        r2 = r2 - r6;
        r2 = r4 - r2;
        r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x0449;
    L_0x042b:
        r12.wait(r2);	 Catch:{ InterruptedException -> 0x042f }
        goto L_0x03fa;
    L_0x042f:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>();	 Catch:{ Throwable -> 0x0115 }
        r2 = "AdLoader InterruptedException while loading the HTML: ";
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0115 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1832a(r0);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0449:
        r0 = r12.f883t;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0452;
    L_0x044d:
        r12.m1475i();	 Catch:{ Throwable -> 0x0115 }
        goto L_0x0121;
    L_0x0452:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "AdLoader timed out after ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x0115 }
        r1 = "ms while loading the HTML.";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.C0229g.m1838c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.C0206e.NETWORK_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 1;
        r12.m1482a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        goto L_0x0121;
    L_0x0476:
        r1 = r0;
        goto L_0x030f;
    L_0x0479:
        r0 = r3;
        goto L_0x023c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.a.n.run():void");
    }
}
