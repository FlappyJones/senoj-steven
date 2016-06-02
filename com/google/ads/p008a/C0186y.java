package com.google.ads.p008a;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.C0206e;
import com.google.ads.C0208g;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.ads.a.y */
public final class C0186y implements Runnable {
    private final bq f946a;
    private final aa f947b;
    private volatile boolean f948c;
    private boolean f949d;
    private String f950e;
    private Thread f951f;

    C0186y(bq bqVar) {
        this(bqVar, new C0187z());
    }

    C0186y(bq bqVar, aa aaVar) {
        this.f951f = null;
        this.f946a = bqVar;
        this.f947b = aaVar;
    }

    private void m1550a(Context context, HttpURLConnection httpURLConnection) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("drt", "");
        if (this.f949d && !TextUtils.isEmpty(string)) {
            if (AdUtil.f1234a == 8) {
                httpURLConnection.addRequestProperty("X-Afma-drt-Cookie", string);
            } else {
                httpURLConnection.addRequestProperty("Cookie", string);
            }
        }
    }

    private void m1551a(HttpURLConnection httpURLConnection) {
        m1554b(httpURLConnection);
        m1558f(httpURLConnection);
        m1559g(httpURLConnection);
        m1560h(httpURLConnection);
        m1561i(httpURLConnection);
        m1557e(httpURLConnection);
        m1562j(httpURLConnection);
        m1563k(httpURLConnection);
        m1564l(httpURLConnection);
        m1556d(httpURLConnection);
        m1555c(httpURLConnection);
        m1565m(httpURLConnection);
        m1566n(httpURLConnection);
    }

    private void m1552a(HttpURLConnection httpURLConnection, int i) {
        if (300 <= i && i < 400) {
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                C0229g.m1838c("Could not get redirect location from a " + i + " redirect.");
                ((C0175n) this.f946a.f1073b.m1817a()).m1481a(C0206e.INTERNAL_ERROR);
                m1567a();
                return;
            }
            m1551a(httpURLConnection);
            this.f950e = headerField;
        } else if (i == 200) {
            m1551a(httpURLConnection);
            String trim = AdUtil.m1789a(new InputStreamReader(httpURLConnection.getInputStream())).trim();
            C0229g.m1832a("Response content is: " + trim);
            if (TextUtils.isEmpty(trim)) {
                C0229g.m1832a("Response message is null or zero length: " + trim);
                ((C0175n) this.f946a.f1073b.m1817a()).m1481a(C0206e.NO_FILL);
                m1567a();
                return;
            }
            ((C0175n) this.f946a.f1073b.m1817a()).m1485a(trim, this.f950e);
            m1567a();
        } else if (i == 400) {
            C0229g.m1838c("Bad request");
            ((C0175n) this.f946a.f1073b.m1817a()).m1481a(C0206e.INVALID_REQUEST);
            m1567a();
        } else {
            C0229g.m1838c("Invalid response code: " + i);
            ((C0175n) this.f946a.f1073b.m1817a()).m1481a(C0206e.INTERNAL_ERROR);
            m1567a();
        }
    }

    private void m1553b() {
        while (!this.f948c) {
            HttpURLConnection a = this.f947b.m1382a(new URL(this.f950e));
            try {
                m1550a((Context) ((bt) this.f946a.f1072a.m1816a()).f1099f.m1816a(), a);
                AdUtil.m1794a(a, (Context) ((bt) this.f946a.f1072a.m1816a()).f1099f.m1816a());
                a.setInstanceFollowRedirects(false);
                a.connect();
                m1552a(a, a.getResponseCode());
                a.disconnect();
            } catch (Throwable th) {
                a.disconnect();
            }
        }
    }

    private void m1554b(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Debug-Dialog");
        if (!TextUtils.isEmpty(headerField)) {
            ((C0175n) this.f946a.f1073b.m1817a()).m1496f(headerField);
        }
    }

    private void m1555c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Type");
        if (!TextUtils.isEmpty(headerField)) {
            ((C0175n) this.f946a.f1073b.m1817a()).m1488b(headerField);
        }
    }

    private void m1556d(HttpURLConnection httpURLConnection) {
        Object headerField = httpURLConnection.getHeaderField("X-Afma-Mediation");
        if (!TextUtils.isEmpty(headerField)) {
            ((C0175n) this.f946a.f1073b.m1817a()).m1489b(Boolean.valueOf(headerField).booleanValue());
        }
    }

    private void m1557e(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
        if (!TextUtils.isEmpty(headerField)) {
            try {
                ((C0184w) ((bt) this.f946a.f1072a.m1816a()).f1095b.m1816a()).m1505a((long) (Float.parseFloat(headerField) * 1000.0f));
            } catch (Throwable e) {
                C0229g.m1841d("Could not get timeout value: " + headerField, e);
            }
        }
    }

    private void m1558f(HttpURLConnection httpURLConnection) {
        Object headerField = httpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField)) {
            for (String b : headerField.trim().split("\\s+")) {
                ((C0184w) ((bt) this.f946a.f1072a.m1816a()).f1095b.m1816a()).m1519b(b);
            }
        }
    }

    private void m1559g(HttpURLConnection httpURLConnection) {
        Object headerField = httpURLConnection.getHeaderField("X-Afma-Manual-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField)) {
            for (String c : headerField.trim().split("\\s+")) {
                ((C0184w) ((bt) this.f946a.f1072a.m1816a()).f1095b.m1816a()).m1522c(c);
            }
        }
    }

    private void m1560h(HttpURLConnection httpURLConnection) {
        Object headerField = httpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField)) {
            for (String a : headerField.trim().split("\\s+")) {
                ((C0175n) this.f946a.f1073b.m1817a()).m1484a(a);
            }
        }
    }

    private void m1561i(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
        if (!TextUtils.isEmpty(headerField)) {
            try {
                float parseFloat = Float.parseFloat(headerField);
                C0184w c0184w = (C0184w) ((bt) this.f946a.f1072a.m1816a()).f1095b.m1816a();
                if (parseFloat > 0.0f) {
                    c0184w.m1502a(parseFloat);
                    if (!c0184w.m1537r()) {
                        c0184w.m1525f();
                    }
                } else if (c0184w.m1537r()) {
                    c0184w.m1524e();
                }
            } catch (Throwable e) {
                C0229g.m1841d("Could not get refresh value: " + headerField, e);
            }
        }
    }

    private void m1562j(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Orientation");
        if (!TextUtils.isEmpty(headerField)) {
            if (headerField.equals("portrait")) {
                ((C0175n) this.f946a.f1073b.m1817a()).m1478a(AdUtil.m1801b());
            } else if (headerField.equals("landscape")) {
                ((C0175n) this.f946a.f1073b.m1817a()).m1478a(AdUtil.m1783a());
            }
        }
    }

    private void m1563k(HttpURLConnection httpURLConnection) {
        if (!TextUtils.isEmpty(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {
            try {
                ((C0184w) ((bt) this.f946a.f1072a.m1816a()).f1095b.m1816a()).m1517b(Long.parseLong(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life")));
            } catch (NumberFormatException e) {
                C0229g.m1842e("Got bad value of Doritos cookie cache life from header: " + httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
            }
        }
    }

    private void m1564l(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Cache-Control");
        if (!TextUtils.isEmpty(headerField)) {
            ((C0175n) this.f946a.f1073b.m1817a()).m1490c(headerField);
        }
    }

    private void m1565m(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Ad-Size");
        if (!TextUtils.isEmpty(headerField)) {
            try {
                String[] split = headerField.split("x", 2);
                if (split.length != 2) {
                    C0229g.m1842e("Could not parse size header: " + headerField);
                    return;
                }
                ((C0175n) this.f946a.f1073b.m1817a()).m1483a(new C0208g(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
            } catch (NumberFormatException e) {
                C0229g.m1842e("Could not parse size header: " + headerField);
            }
        }
    }

    private void m1566n(HttpURLConnection httpURLConnection) {
        Object headerField = httpURLConnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
        if (!TextUtils.isEmpty(headerField)) {
            ((C0175n) this.f946a.f1073b.m1817a()).m1486a(headerField.equals("1"));
        }
    }

    void m1567a() {
        this.f948c = true;
    }

    synchronized void m1568a(String str) {
        if (this.f951f == null) {
            this.f950e = str;
            this.f948c = false;
            this.f951f = new Thread(this);
            this.f951f.start();
        }
    }

    public void m1569a(boolean z) {
        this.f949d = z;
    }

    public void run() {
        try {
            m1553b();
        } catch (Throwable e) {
            C0229g.m1837b("Received malformed ad url from javascript.", e);
            ((C0175n) this.f946a.f1073b.m1817a()).m1481a(C0206e.INTERNAL_ERROR);
        } catch (Throwable e2) {
            C0229g.m1837b("IOException connecting to ad url.", e2);
            ((C0175n) this.f946a.f1073b.m1817a()).m1481a(C0206e.NETWORK_ERROR);
        } catch (Throwable e22) {
            C0229g.m1837b("An unknown error occurred in AdResponseLoader.", e22);
            ((C0175n) this.f946a.f1073b.m1817a()).m1481a(C0206e.INTERNAL_ERROR);
        }
    }
}
