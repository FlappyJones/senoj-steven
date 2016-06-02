package com.google.ads;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.ads.p008a.C0161e;
import com.google.ads.p008a.C0164c;
import com.google.ads.p008a.C0168h;
import com.google.ads.p008a.C0184w;
import com.google.ads.p008a.C0185x;
import com.google.ads.p008a.ad;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import com.google.ads.util.C0236n;
import com.google.ads.util.C0237p;
import com.google.android.gms.C0338e;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdActivity extends Activity implements OnClickListener {
    private static final C0168h f773a;
    private static final Object f774b;
    private static AdActivity f775c;
    private static C0184w f776d;
    private static AdActivity f777e;
    private static AdActivity f778f;
    private static final C0200b f779g;
    private C0161e f780h;
    private FrameLayout f781i;
    private int f782j;
    private ViewGroup f783k;
    private boolean f784l;
    private long f785m;
    private RelativeLayout f786n;
    private AdActivity f787o;
    private boolean f788p;
    private boolean f789q;
    private boolean f790r;
    private boolean f791s;
    private C0164c f792t;

    static {
        f773a = (C0168h) C0168h.f858a.m1455b();
        f774b = new Object();
        f775c = null;
        f776d = null;
        f777e = null;
        f778f = null;
        f779g = new C0200b();
    }

    public AdActivity() {
        this.f783k = null;
        this.f787o = null;
    }

    public static void m1335a(C0184w c0184w, C0185x c0185x) {
        f779g.m1669a(c0184w, c0185x);
    }

    private void m1336a(String str) {
        C0229g.m1836b(str);
        finish();
    }

    private void m1337a(String str, Throwable th) {
        C0229g.m1837b(str, th);
        finish();
    }

    public static boolean m1339b() {
        return f779g.m1670a();
    }

    private LayoutParams m1340c(int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = new LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    public static boolean m1341c() {
        return f779g.m1671b();
    }

    private void m1346h() {
        if (!this.f784l) {
            if (this.f780h != null) {
                f773a.m1452b(this.f780h);
                this.f780h.setAdActivity(null);
                this.f780h.setIsExpandedMraid(false);
                if (!(this.f789q || this.f786n == null || this.f783k == null)) {
                    if (this.f790r && !this.f791s) {
                        C0229g.m1832a("Disabling hardware acceleration on collapsing MRAID WebView.");
                        this.f780h.m1372g();
                    } else if (!this.f790r && this.f791s) {
                        C0229g.m1832a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
                        this.f780h.m1373h();
                    }
                    this.f786n.removeView(this.f780h);
                    this.f783k.addView(this.f780h);
                }
            }
            if (this.f792t != null) {
                this.f792t.m1441e();
                this.f792t = null;
            }
            if (this == f775c) {
                f775c = null;
            }
            f778f = this.f787o;
            synchronized (f774b) {
                if (!(f776d == null || !this.f789q || this.f780h == null)) {
                    if (this.f780h == f776d.m1530k()) {
                        f776d.m1501a();
                    }
                    this.f780h.stopLoading();
                }
                if (this == f777e) {
                    f777e = null;
                    if (f776d != null) {
                        f776d.m1538s();
                        f776d = null;
                    } else {
                        C0229g.m1842e("currentAdManager is null while trying to destroy AdActivity.");
                    }
                }
            }
            this.f784l = true;
            C0229g.m1832a("AdActivity is closing.");
        }
    }

    protected View m1347a(int i, boolean z) {
        this.f782j = (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
        this.f781i = new FrameLayout(getApplicationContext());
        this.f781i.setMinimumWidth(this.f782j);
        this.f781i.setMinimumHeight(this.f782j);
        this.f781i.setOnClickListener(this);
        m1354a(z);
        return this.f781i;
    }

    public C0164c m1348a() {
        return this.f792t;
    }

    protected C0164c m1349a(Activity activity) {
        return new C0164c(activity, this.f780h);
    }

    public void m1350a(int i, int i2, int i3, int i4) {
        if (this.f792t != null) {
            this.f792t.setLayoutParams(m1340c(i, i2, i3, i4));
            this.f792t.requestLayout();
        }
    }

    protected void m1351a(C0161e c0161e, boolean z, int i, boolean z2, boolean z3) {
        requestWindowFeature(1);
        Window window = getWindow();
        window.setFlags(1024, 1024);
        if (AdUtil.f1234a >= 11) {
            if (this.f790r) {
                C0229g.m1832a("Enabling hardware acceleration on the AdActivity window.");
                C0237p.m1854a(window);
            } else {
                C0229g.m1832a("Disabling hardware acceleration on the AdActivity WebView.");
                c0161e.m1372g();
            }
        }
        ViewParent parent = c0161e.getParent();
        if (parent != null) {
            if (!z2) {
                m1336a("Interstitial created with an AdWebView that has a parent.");
                return;
            } else if (parent instanceof ViewGroup) {
                this.f783k = (ViewGroup) parent;
                this.f783k.removeView(c0161e);
            } else {
                m1336a("MRAID banner was not a child of a ViewGroup.");
                return;
            }
        }
        if (c0161e.m1374i() != null) {
            m1336a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
            return;
        }
        setRequestedOrientation(i);
        c0161e.setAdActivity(this);
        View a = m1347a(z2 ? 50 : 32, z3);
        this.f786n.addView(c0161e, -1, -1);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (z2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        }
        this.f786n.addView(a, layoutParams);
        this.f786n.setKeepScreenOn(true);
        setContentView(this.f786n);
        this.f786n.getRootView().setBackgroundColor(-16777216);
        if (z) {
            f773a.m1446a((WebView) c0161e);
        }
    }

    protected void m1352a(C0184w c0184w) {
        this.f780h = null;
        this.f785m = SystemClock.elapsedRealtime();
        this.f788p = true;
        synchronized (f774b) {
            if (f775c == null) {
                f775c = this;
                c0184w.m1540u();
            }
        }
    }

    protected void m1353a(HashMap hashMap, C0184w c0184w) {
        int i = 0;
        if (hashMap == null) {
            m1336a("Could not get the paramMap in launchIntent()");
            return;
        }
        Intent intent = new Intent();
        String str = (String) hashMap.get("u");
        String str2 = (String) hashMap.get("m");
        String str3 = (String) hashMap.get("i");
        String str4 = (String) hashMap.get("p");
        String str5 = (String) hashMap.get("c");
        String str6 = (String) hashMap.get("f");
        String str7 = (String) hashMap.get("e");
        int i2 = !TextUtils.isEmpty(str) ? 1 : 0;
        int i3 = !TextUtils.isEmpty(str2) ? 1 : 0;
        if (i2 != 0 && i3 != 0) {
            intent.setDataAndType(Uri.parse(str), str2);
        } else if (i2 != 0) {
            intent.setData(Uri.parse(str));
        } else if (i3 != 0) {
            intent.setType(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.setAction(str3);
        } else if (i2 != 0) {
            intent.setAction("android.intent.action.VIEW");
        }
        if (!TextUtils.isEmpty(str4) && AdUtil.f1234a >= 4) {
            C0236n.m1851a(intent, str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/");
            if (split.length < 2) {
                C0229g.m1842e("Warning: Could not parse component name from open GMSG: " + str5);
            }
            intent.setClassName(split[0], split[1]);
        }
        if (!TextUtils.isEmpty(str6)) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(str6);
            } catch (NumberFormatException e) {
                C0229g.m1842e("Warning: Could not parse flags from open GMSG: " + str6);
                parseInt = 0;
            }
            intent.addFlags(parseInt);
        }
        if (!TextUtils.isEmpty(str7)) {
            JSONObject jSONObject = new JSONObject(str7);
            JSONArray names = jSONObject.names();
            while (i < names.length()) {
                str3 = names.getString(i);
                JSONObject jSONObject2 = jSONObject.getJSONObject(str3);
                int i4 = jSONObject2.getInt("t");
                str6 = "v";
                switch (i4) {
                    case C0338e.MapAttrs_cameraBearing /*1*/:
                        try {
                            intent.putExtra(str3, jSONObject2.getBoolean(str6));
                            break;
                        } catch (JSONException e2) {
                            C0229g.m1842e("Warning: Could not parse extras from open GMSG: " + str7);
                            break;
                        }
                    case C0338e.MapAttrs_cameraTargetLat /*2*/:
                        intent.putExtra(str3, jSONObject2.getDouble(str6));
                        break;
                    case C0338e.MapAttrs_cameraTargetLng /*3*/:
                        intent.putExtra(str3, jSONObject2.getInt(str6));
                        break;
                    case C0338e.MapAttrs_cameraTilt /*4*/:
                        intent.putExtra(str3, jSONObject2.getLong(str6));
                        break;
                    case C0338e.MapAttrs_cameraZoom /*5*/:
                        intent.putExtra(str3, jSONObject2.getString(str6));
                        break;
                    default:
                        C0229g.m1842e("Warning: Unknown type in extras from open GMSG: " + str3 + " (type: " + i4 + ")");
                        break;
                }
                i++;
            }
        }
        if (intent.filterEquals(new Intent())) {
            m1336a("Tried to launch empty intent.");
            return;
        }
        try {
            C0229g.m1832a("Launching an intent from AdActivity: " + intent);
            startActivity(intent);
            m1352a(c0184w);
        } catch (Throwable e3) {
            m1337a(e3.getMessage(), e3);
        }
    }

    public void m1354a(boolean z) {
        if (this.f781i != null) {
            this.f781i.removeAllViews();
            if (!z) {
                View imageButton = new ImageButton(this);
                imageButton.setImageResource(17301527);
                imageButton.setBackgroundColor(0);
                imageButton.setOnClickListener(this);
                imageButton.setPadding(0, 0, 0, 0);
                this.f781i.addView(imageButton, new FrameLayout.LayoutParams(this.f782j, this.f782j, 17));
            }
        }
    }

    public void m1355b(int i, int i2, int i3, int i4) {
        if (this.f792t == null) {
            this.f792t = m1349a((Activity) this);
            this.f786n.addView(this.f792t, 0, m1340c(i, i2, i3, i4));
            synchronized (f774b) {
                if (f776d == null) {
                    C0229g.m1842e("currentAdManager was null while trying to get the opening AdWebView.");
                    return;
                }
                f776d.m1531l().m1426b(false);
            }
        }
    }

    public void onClick(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        boolean z = false;
        super.onCreate(bundle);
        this.f784l = false;
        synchronized (f774b) {
            if (f776d != null) {
                C0184w c0184w = f776d;
                if (f777e == null) {
                    f777e = this;
                    c0184w.m1539t();
                }
                if (this.f787o == null && f778f != null) {
                    this.f787o = f778f;
                }
                f778f = this;
                if ((c0184w.m1527h().m1725a() && f777e == this) || (c0184w.m1527h().m1726b() && this.f787o == f777e)) {
                    c0184w.m1541v();
                }
                boolean q = c0184w.m1536q();
                bs bsVar = (bs) ((br) c0184w.m1527h().f1097d.m1816a()).f1077b.m1816a();
                this.f791s = AdUtil.f1234a >= ((Integer) bsVar.f1080b.m1817a()).intValue();
                this.f790r = AdUtil.f1234a >= ((Integer) bsVar.f1082d.m1817a()).intValue();
                this.f786n = null;
                this.f788p = false;
                this.f789q = true;
                this.f792t = null;
                Bundle bundleExtra = getIntent().getBundleExtra("com.google.ads.AdOpener");
                if (bundleExtra == null) {
                    m1336a("Could not get the Bundle used to create AdActivity.");
                    return;
                }
                C0185x c0185x = new C0185x(bundleExtra);
                String b = c0185x.m1548b();
                HashMap c = c0185x.m1549c();
                if (b.equals("intent")) {
                    m1353a(c, c0184w);
                    return;
                }
                this.f786n = new RelativeLayout(getApplicationContext());
                int b2;
                boolean z2;
                if (b.equals("webapp")) {
                    this.f780h = new C0161e(c0184w.m1527h(), null);
                    WebViewClient a = ad.m1423a(c0184w, C0168h.f861d, true, !q);
                    a.m1428d(true);
                    if (q) {
                        a.m1424a(true);
                    }
                    this.f780h.setWebViewClient(a);
                    b = (String) c.get("u");
                    String str = (String) c.get("baseurl");
                    String str2 = (String) c.get("html");
                    if (b != null) {
                        this.f780h.loadUrl(b);
                    } else if (str2 != null) {
                        this.f780h.loadDataWithBaseURL(str, str2, "text/html", "utf-8", null);
                    } else {
                        m1336a("Could not get the URL or HTML parameter to show a web app.");
                        return;
                    }
                    b = (String) c.get("o");
                    b2 = "p".equals(b) ? AdUtil.m1801b() : "l".equals(b) ? AdUtil.m1783a() : this == f777e ? c0184w.m1533n() : -1;
                    C0161e c0161e = this.f780h;
                    z2 = c != null && "1".equals(c.get("custom_close"));
                    m1351a(c0161e, false, b2, q, z2);
                    return;
                } else if (b.equals("interstitial") || b.equals("expand")) {
                    this.f780h = c0184w.m1530k();
                    b2 = c0184w.m1533n();
                    if (b.equals("expand")) {
                        this.f780h.setIsExpandedMraid(true);
                        this.f789q = false;
                        if (c != null && "1".equals(c.get("custom_close"))) {
                            z = true;
                        }
                        if (!this.f790r || this.f791s) {
                            z2 = z;
                        } else {
                            C0229g.m1832a("Re-enabling hardware acceleration on expanding MRAID WebView.");
                            this.f780h.m1373h();
                            z2 = z;
                        }
                    } else {
                        z2 = this.f780h.m1375j();
                    }
                    m1351a(this.f780h, true, b2, q, z2);
                    return;
                } else {
                    m1336a("Unknown AdOpener, <action: " + b + ">");
                    return;
                }
            }
            m1336a("Could not get currentAdManager.");
        }
    }

    public void onDestroy() {
        if (this.f786n != null) {
            this.f786n.removeAllViews();
        }
        if (isFinishing()) {
            m1346h();
            if (this.f789q && this.f780h != null) {
                this.f780h.stopLoading();
                this.f780h.destroy();
                this.f780h = null;
            }
        }
        super.onDestroy();
    }

    public void onPause() {
        if (isFinishing()) {
            m1346h();
        }
        super.onPause();
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f788p && z && SystemClock.elapsedRealtime() - this.f785m > 250) {
            C0229g.m1840d("Launcher AdActivity got focus and is closing.");
            finish();
        }
        super.onWindowFocusChanged(z);
    }
}
