package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.p008a.C0161e;
import com.google.ads.p008a.C0168h;
import com.google.ads.p008a.C0174m;
import com.google.ads.p008a.C0184w;
import com.google.ads.p008a.ac;
import com.google.ads.p008a.ag;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import java.util.HashSet;
import java.util.Set;

public class AdView extends RelativeLayout implements C0160a {
    private static final C0168h f793b;
    protected C0184w f794a;

    static {
        f793b = (C0168h) C0168h.f858a.m1455b();
    }

    public AdView(Activity activity, C0208g c0208g, String str) {
        super(activity.getApplicationContext());
        try {
            m1360a((Context) activity, c0208g, null);
            m1364b(activity, c0208g, null);
            m1356a(activity, c0208g, str);
        } catch (C0174m e) {
            m1358a((Context) activity, e.m1460c("Could not initialize AdView"), c0208g, null);
            e.m1458a("Could not initialize AdView");
        }
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1357a(context, attributeSet);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    private void m1356a(Activity activity, C0208g c0208g, String str) {
        View frameLayout = new FrameLayout(activity);
        frameLayout.setFocusable(false);
        this.f794a = new C0184w(this, activity, c0208g, str, frameLayout, false);
        setGravity(17);
        try {
            View a = ag.m1432a(activity, this.f794a);
            if (a != null) {
                a.addView(frameLayout, -2, -2);
                addView(a, -2, -2);
                return;
            }
            addView(frameLayout, -2, -2);
        } catch (Throwable e) {
            C0229g.m1833a("Gestures disabled: Not supported on this version of Android.", e);
            addView(frameLayout, -2, -2);
        }
    }

    private void m1357a(Context context, AttributeSet attributeSet) {
        C0174m c0174m;
        C0208g[] c0208gArr;
        String c;
        C0208g c0208g;
        if (attributeSet != null) {
            try {
                String b = m1363b("adSize", context, attributeSet, true);
                C0208g[] a = m1369a(b);
                if (a != null) {
                    try {
                        if (a.length != 0) {
                            if (!m1362a("adUnitId", attributeSet)) {
                                throw new C0174m("Required XML attribute \"adUnitId\" missing", true);
                            } else if (isInEditMode()) {
                                m1366a(context, "Ads by Google", -1, a[0], attributeSet);
                                return;
                            } else {
                                String b2 = m1363b("adUnitId", context, attributeSet, true);
                                boolean a2 = m1361a("loadAdOnCreate", context, attributeSet, false);
                                if (context instanceof Activity) {
                                    Activity activity = (Activity) context;
                                    m1360a((Context) activity, a[0], attributeSet);
                                    m1364b(activity, a[0], attributeSet);
                                    if (a.length == 1) {
                                        m1356a(activity, a[0], b2);
                                    } else {
                                        m1356a(activity, new C0208g(0, 0), b2);
                                        m1359a(a);
                                    }
                                    if (a2) {
                                        Set c2 = m1365c("testDevices", context, attributeSet, false);
                                        if (c2.contains("TEST_EMULATOR")) {
                                            c2.remove("TEST_EMULATOR");
                                            c2.add(C0201d.f1115a);
                                        }
                                        m1367a(new C0201d().m1737b(c2).m1734a(m1365c("keywords", context, attributeSet, false)));
                                        return;
                                    }
                                    return;
                                }
                                throw new C0174m("AdView was initialized with a Context that wasn't an Activity.", true);
                            }
                        }
                    } catch (C0174m e) {
                        c0174m = e;
                        c0208gArr = a;
                        c = c0174m.m1460c("Could not initialize AdView");
                        if (c0208gArr != null) {
                        }
                        m1358a(context, c, c0208g, attributeSet);
                        c0174m.m1458a("Could not initialize AdView");
                        if (!isInEditMode()) {
                            c0174m.m1459b("Could not initialize AdView");
                        }
                    }
                }
                throw new C0174m("Attribute \"adSize\" invalid: " + b, true);
            } catch (C0174m e2) {
                C0174m c0174m2 = e2;
                c0208gArr = null;
                c0174m = c0174m2;
                c = c0174m.m1460c("Could not initialize AdView");
                c0208g = (c0208gArr != null || c0208gArr.length <= 0) ? C0208g.f1160b : c0208gArr[0];
                m1358a(context, c, c0208g, attributeSet);
                c0174m.m1458a("Could not initialize AdView");
                if (!isInEditMode()) {
                    c0174m.m1459b("Could not initialize AdView");
                }
            }
        }
    }

    private void m1358a(Context context, String str, C0208g c0208g, AttributeSet attributeSet) {
        C0229g.m1836b(str);
        m1366a(context, str, -65536, c0208g, attributeSet);
    }

    private void m1359a(C0208g... c0208gArr) {
        Object obj = new C0208g[c0208gArr.length];
        for (int i = 0; i < c0208gArr.length; i++) {
            obj[i] = C0208g.m1759a(c0208gArr[i], getContext());
        }
        this.f794a.m1527h().f1107n.m1818a(obj);
    }

    private boolean m1360a(Context context, C0208g c0208g, AttributeSet attributeSet) {
        if (AdUtil.m1808c(context)) {
            return true;
        }
        m1358a(context, "You must have AdActivity declared in AndroidManifest.xml with configChanges.", c0208g, attributeSet);
        return false;
    }

    private boolean m1361a(String str, Context context, AttributeSet attributeSet, boolean z) {
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", str);
        boolean attributeBooleanValue = attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/lib/com.google.ads", str, z);
        if (attributeValue != null) {
            String packageName = context.getPackageName();
            if (attributeValue.matches("^@([^:]+)\\:(.*)$")) {
                packageName = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
                attributeValue = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
            }
            if (attributeValue.startsWith("@bool/")) {
                String substring = attributeValue.substring("@bool/".length());
                TypedValue typedValue = new TypedValue();
                try {
                    getResources().getValue(packageName + ":bool/" + substring, typedValue, true);
                    if (typedValue.type == 18) {
                        return typedValue.data != 0;
                    } else {
                        throw new C0174m("Resource " + str + " was not a boolean: " + typedValue, true);
                    }
                } catch (Throwable e) {
                    throw new C0174m("Could not find resource for " + str + ": " + attributeValue, true, e);
                }
            }
        }
        return attributeBooleanValue;
    }

    private boolean m1362a(String str, AttributeSet attributeSet) {
        return attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", str) != null;
    }

    private String m1363b(String str, Context context, AttributeSet attributeSet, boolean z) {
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", str);
        if (attributeValue != null) {
            String packageName = context.getPackageName();
            if (attributeValue.matches("^@([^:]+)\\:(.*)$")) {
                packageName = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
                attributeValue = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
            }
            if (attributeValue.startsWith("@string/")) {
                String substring = attributeValue.substring("@string/".length());
                TypedValue typedValue = new TypedValue();
                try {
                    getResources().getValue(packageName + ":string/" + substring, typedValue, true);
                    if (typedValue.string != null) {
                        attributeValue = typedValue.string.toString();
                    } else {
                        throw new C0174m("Resource " + str + " was not a string: " + typedValue, true);
                    }
                } catch (Throwable e) {
                    throw new C0174m("Could not find resource for " + str + ": " + attributeValue, true, e);
                }
            }
        }
        if (!z || attributeValue != null) {
            return attributeValue;
        }
        throw new C0174m("Required XML attribute \"" + str + "\" missing", true);
    }

    private boolean m1364b(Context context, C0208g c0208g, AttributeSet attributeSet) {
        if (AdUtil.m1806b(context)) {
            return true;
        }
        m1358a(context, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", c0208g, attributeSet);
        return false;
    }

    private Set m1365c(String str, Context context, AttributeSet attributeSet, boolean z) {
        String b = m1363b(str, context, attributeSet, z);
        Set hashSet = new HashSet();
        if (b != null) {
            for (String trim : b.split(",")) {
                String trim2 = trim2.trim();
                if (trim2.length() != 0) {
                    hashSet.add(trim2);
                }
            }
        }
        return hashSet;
    }

    void m1366a(Context context, String str, int i, C0208g c0208g, AttributeSet attributeSet) {
        if (c0208g == null) {
            c0208g = C0208g.f1160b;
        }
        C0208g a = C0208g.m1759a(c0208g, context.getApplicationContext());
        if (getChildCount() == 0) {
            View textView = attributeSet == null ? new TextView(context) : new TextView(context, attributeSet);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(-16777216);
            View linearLayout = attributeSet == null ? new LinearLayout(context) : new LinearLayout(context, attributeSet);
            linearLayout.setGravity(17);
            View linearLayout2 = attributeSet == null ? new LinearLayout(context) : new LinearLayout(context, attributeSet);
            linearLayout2.setGravity(17);
            linearLayout2.setBackgroundColor(i);
            int a2 = AdUtil.m1784a(context, a.m1762a());
            int a3 = AdUtil.m1784a(context, a.m1763b());
            linearLayout.addView(textView, a2 - 2, a3 - 2);
            linearLayout2.addView(linearLayout);
            addView(linearLayout2, a2, a3);
        }
    }

    public void m1367a(C0201d c0201d) {
        if (this.f794a != null) {
            if (m1368a()) {
                this.f794a.m1524e();
            }
            this.f794a.m1510a(c0201d);
        }
    }

    public boolean m1368a() {
        return this.f794a == null ? false : this.f794a.m1537r();
    }

    C0208g[] m1369a(String str) {
        String[] split = str.split(",");
        C0208g[] c0208gArr = new C0208g[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    C0208g c0208g = new C0208g("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException e) {
                    return null;
                }
            }
            c0208g = "BANNER".equals(trim) ? C0208g.f1160b : "SMART_BANNER".equals(trim) ? C0208g.f1159a : "IAB_MRECT".equals(trim) ? C0208g.f1161c : "IAB_BANNER".equals(trim) ? C0208g.f1162d : "IAB_LEADERBOARD".equals(trim) ? C0208g.f1163e : "IAB_WIDE_SKYSCRAPER".equals(trim) ? C0208g.f1164f : null;
            if (c0208g == null) {
                return null;
            }
            c0208gArr[i] = c0208g;
        }
        return c0208gArr;
    }

    protected void onMeasure(int i, int i2) {
        if (!isInEditMode()) {
            C0161e k = this.f794a.m1530k();
            if (k != null) {
                k.setVisibility(0);
            }
        }
        super.onMeasure(i, i2);
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!isInEditMode() && ((ac) this.f794a.m1527h().f1100g.m1816a()).m1421b() && i != 0 && this.f794a.m1527h().f1105l.m1817a() != null && this.f794a.m1527h().f1098e.m1816a() != null) {
            if (!AdActivity.m1339b() || AdActivity.m1341c()) {
                f793b.m1448a((WebView) this.f794a.m1527h().f1098e.m1816a(), "onleaveapp", null);
            } else {
                f793b.m1448a((WebView) this.f794a.m1527h().f1098e.m1816a(), "onopeninapp", null);
            }
        }
    }

    public void setAdListener(C0204c c0204c) {
        this.f794a.m1527h().f1108o.m1818a(c0204c);
    }

    protected void setAppEventListener(C0209h c0209h) {
        this.f794a.m1527h().f1109p.m1818a(c0209h);
    }

    protected void setSupportedAdSizes(C0208g... c0208gArr) {
        if (this.f794a.m1527h().f1107n.m1817a() == null) {
            C0229g.m1842e("Warning: Tried to set supported ad sizes on a single-size AdView. AdSizes ignored. To create a multi-sized AdView, use an AdView constructor that takes in an AdSize[] array.");
        } else {
            m1359a(c0208gArr);
        }
    }

    protected void setSwipeableEventListener(C0211j c0211j) {
        this.f794a.m1527h().f1110q.m1818a(c0211j);
    }
}
