package com.google.ads.p008a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.C0208g;
import com.google.ads.ai;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0225r;
import com.google.ads.util.C0226d;
import com.google.ads.util.C0229g;
import com.google.ads.util.C0237p;
import com.google.ads.util.C0246z;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.a.e */
public class C0161e extends WebView {
    protected final bt f795a;
    private WeakReference f796b;
    private C0208g f797c;
    private boolean f798d;
    private boolean f799e;
    private boolean f800f;

    public C0161e(bt btVar, C0208g c0208g) {
        super((Context) btVar.f1099f.m1816a());
        this.f795a = btVar;
        this.f797c = c0208g;
        this.f796b = null;
        this.f798d = false;
        this.f799e = false;
        this.f800f = false;
        setBackgroundColor(0);
        AdUtil.m1793a((WebView) this);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        setDownloadListener(new C0166f(this));
        if (AdUtil.f1234a >= 17) {
            C0246z.m1858a(settings, btVar);
        } else if (AdUtil.f1234a >= 11) {
            C0237p.m1855a(settings, btVar);
        }
        setScrollBarStyle(33554432);
        if (AdUtil.f1234a >= 14) {
            setWebChromeClient(new C0226d(btVar));
        } else if (AdUtil.f1234a >= 11) {
            setWebChromeClient(new C0225r(btVar));
        }
    }

    public void m1370a(boolean z) {
        if (z) {
            setOnTouchListener(new C0167g(this));
        } else {
            setOnTouchListener(null);
        }
    }

    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable th) {
            C0229g.m1841d("An error occurred while destroying an AdWebView:", th);
        }
        try {
            setWebViewClient(new WebViewClient());
        } catch (Throwable th2) {
        }
    }

    public void m1371f() {
        AdActivity i = m1374i();
        if (i != null) {
            i.finish();
        }
    }

    public void m1372g() {
        if (AdUtil.f1234a >= 11) {
            C0237p.m1853a((View) this);
        }
        this.f799e = true;
    }

    public void m1373h() {
        if (this.f799e && AdUtil.f1234a >= 11) {
            C0237p.m1856b(this);
        }
        this.f799e = false;
    }

    public AdActivity m1374i() {
        return this.f796b != null ? (AdActivity) this.f796b.get() : null;
    }

    public boolean m1375j() {
        return this.f800f;
    }

    public boolean m1376k() {
        return this.f799e;
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            C0229g.m1841d("An error occurred while loading data in AdWebView:", th);
        }
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            C0229g.m1841d("An error occurred while loading a URL in AdWebView:", th);
        }
    }

    protected synchronized void onMeasure(int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        synchronized (this) {
            if (isInEditMode()) {
                super.onMeasure(i, i2);
            } else if (this.f797c == null || this.f798d) {
                super.onMeasure(i, i2);
            } else {
                int mode = MeasureSpec.getMode(i);
                int size = MeasureSpec.getSize(i);
                int mode2 = MeasureSpec.getMode(i2);
                int size2 = MeasureSpec.getSize(i2);
                float f = getContext().getResources().getDisplayMetrics().density;
                int a = (int) (((float) this.f797c.m1762a()) * f);
                int b = (int) (((float) this.f797c.m1763b()) * f);
                mode = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
                if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                    i3 = size2;
                }
                if (((float) a) - (f * 6.0f) > ((float) mode) || b > r0) {
                    C0229g.m1836b("Not enough space to show ad! Wants: <" + a + ", " + b + ">, Has: <" + size + ", " + size2 + ">");
                    setVisibility(8);
                    setMeasuredDimension(size, size2);
                } else {
                    setMeasuredDimension(a, b);
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ai aiVar = (ai) this.f795a.f1111r.m1817a();
        if (aiVar != null) {
            aiVar.m1588a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdActivity(AdActivity adActivity) {
        this.f796b = new WeakReference(adActivity);
    }

    public synchronized void setAdSize(C0208g c0208g) {
        this.f797c = c0208g;
        requestLayout();
    }

    public void setCustomClose(boolean z) {
        this.f800f = z;
        if (this.f796b != null) {
            AdActivity adActivity = (AdActivity) this.f796b.get();
            if (adActivity != null) {
                adActivity.m1354a(z);
            }
        }
    }

    public void setIsExpandedMraid(boolean z) {
        this.f798d = z;
    }

    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Throwable th) {
            C0229g.m1841d("An error occurred while stopping loading in AdWebView:", th);
        }
    }
}
