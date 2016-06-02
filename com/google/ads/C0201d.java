package com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.doubleclick.C0205a;
import com.google.ads.p009b.C0189j;
import com.google.ads.p009b.p010a.C0190a;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0229g;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.d */
public class C0201d {
    public static final String f1115a;
    private static final SimpleDateFormat f1116b;
    private static Method f1117c;
    private static Method f1118d;
    private C0207f f1119e;
    private Date f1120f;
    private Set f1121g;
    private Map f1122h;
    private final Map f1123i;
    private Location f1124j;
    private boolean f1125k;
    private boolean f1126l;
    private Set f1127m;

    static {
        f1116b = new SimpleDateFormat("yyyyMMdd");
        f1117c = null;
        f1118d = null;
        try {
            for (Method method : Class.forName("com.google.analytics.tracking.android.AdMobInfo").getMethods()) {
                if (method.getName().equals("getInstance") && method.getParameterTypes().length == 0) {
                    f1117c = method;
                } else if (method.getName().equals("getJoinIds") && method.getParameterTypes().length == 0) {
                    f1118d = method;
                }
            }
            if (f1117c == null || f1118d == null) {
                f1117c = null;
                f1118d = null;
                C0229g.m1842e("No Google Analytics: Library Incompatible.");
            }
        } catch (ClassNotFoundException e) {
            C0229g.m1832a("No Google Analytics: Library Not Found.");
        } catch (Throwable th) {
            C0229g.m1832a("No Google Analytics: Error Loading Library");
        }
        f1115a = AdUtil.m1803b("emulator");
    }

    public C0201d() {
        this.f1119e = null;
        this.f1120f = null;
        this.f1121g = null;
        this.f1122h = null;
        this.f1123i = new HashMap();
        this.f1124j = null;
        this.f1125k = false;
        this.f1126l = false;
        this.f1127m = null;
    }

    public C0201d m1733a(C0189j c0189j) {
        if (c0189j != null) {
            this.f1123i.put(c0189j.getClass(), c0189j);
        }
        return this;
    }

    public C0201d m1734a(Set set) {
        this.f1121g = set;
        return this;
    }

    public Object m1735a(Class cls) {
        return this.f1123i.get(cls);
    }

    public Map m1736a(Context context) {
        Map hashMap = new HashMap();
        if (this.f1121g != null) {
            hashMap.put("kw", this.f1121g);
        }
        if (this.f1119e != null) {
            hashMap.put("cust_gender", Integer.valueOf(this.f1119e.ordinal()));
        }
        if (this.f1120f != null) {
            hashMap.put("cust_age", f1116b.format(this.f1120f));
        }
        if (this.f1124j != null) {
            hashMap.put("uule", AdUtil.m1791a(this.f1124j));
        }
        if (this.f1125k) {
            hashMap.put("testing", Integer.valueOf(1));
        }
        if (m1738b(context)) {
            hashMap.put("adtest", "on");
        } else if (!this.f1126l) {
            C0229g.m1838c("To get test ads on this device, call adRequest.addTestDevice(" + (AdUtil.m1807c() ? "AdRequest.TEST_EMULATOR" : "\"" + AdUtil.m1788a(context) + "\"") + ");");
            this.f1126l = true;
        }
        C0190a c0190a = (C0190a) m1735a(C0190a.class);
        C0205a c0205a = (C0205a) m1735a(C0205a.class);
        if (c0205a != null && c0205a.m1659d() != null && !c0205a.m1659d().isEmpty()) {
            hashMap.put("extras", c0205a.m1659d());
        } else if (!(c0190a == null || c0190a.m1659d() == null || c0190a.m1659d().isEmpty())) {
            hashMap.put("extras", c0190a.m1659d());
        }
        if (c0205a != null) {
            CharSequence a = c0205a.m1755a();
            if (!TextUtils.isEmpty(a)) {
                hashMap.put("ppid", a);
            }
        }
        if (this.f1122h != null) {
            hashMap.put("mediation_extras", this.f1122h);
        }
        try {
            if (f1117c != null) {
                Map map = (Map) f1118d.invoke(f1117c.invoke(null, new Object[0]), new Object[0]);
                if (map != null && map.size() > 0) {
                    hashMap.put("analytics_join_id", map);
                }
            }
        } catch (Throwable th) {
            C0229g.m1839c("Internal Analytics Error:", th);
        }
        return hashMap;
    }

    public C0201d m1737b(Set set) {
        this.f1127m = set;
        return this;
    }

    public boolean m1738b(Context context) {
        if (this.f1127m == null) {
            return false;
        }
        String a = AdUtil.m1788a(context);
        return a != null && this.f1127m.contains(a);
    }
}
