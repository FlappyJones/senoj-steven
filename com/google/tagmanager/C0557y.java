package com.google.tagmanager;

import com.google.analytics.p015b.p016a.p017a.C0286c;
import com.google.analytics.p015b.p016a.p017a.C0289e;
import com.google.analytics.p015b.p016a.p017a.C0292h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.tagmanager.y */
class C0557y {
    private static final Object f2406a;
    private static Long f2407b;
    private static Double f2408c;
    private static C0556x f2409d;
    private static String f2410e;
    private static Boolean f2411f;
    private static List f2412g;
    private static Map f2413h;
    private static C0286c f2414i;

    static {
        f2406a = null;
        f2407b = new Long(0);
        f2408c = new Double(0.0d);
        f2409d = C0556x.m4844a(0);
        f2410e = new String("");
        f2411f = new Boolean(false);
        f2412g = new ArrayList(0);
        f2413h = new HashMap();
        f2414i = C0557y.m4852a(f2410e);
    }

    public static C0286c m4851a() {
        return f2414i;
    }

    public static C0286c m4852a(Object obj) {
        boolean z = false;
        C0289e F = C0286c.m2255F();
        if (obj instanceof C0286c) {
            return (C0286c) obj;
        }
        if (obj instanceof String) {
            F.m2339a(C0292h.STRING).m2341a((String) obj);
        } else if (obj instanceof List) {
            F.m2339a(C0292h.LIST);
            r0 = false;
            for (Object a : (List) obj) {
                C0286c a2 = C0557y.m4852a(a);
                if (a2 == f2414i) {
                    return f2414i;
                }
                r0 = r0 || a2.m2285E();
                F.m2346b(a2);
            }
            z = r0;
        } else if (obj instanceof Map) {
            F.m2339a(C0292h.MAP);
            boolean z2 = false;
            for (Entry entry : ((Map) obj).entrySet()) {
                C0286c a3 = C0557y.m4852a(entry.getKey());
                C0286c a4 = C0557y.m4852a(entry.getValue());
                if (a3 == f2414i || a4 == f2414i) {
                    return f2414i;
                }
                r0 = z2 || a3.m2285E() || a4.m2285E();
                F.m2351c(a3);
                F.m2355d(a4);
                z2 = r0;
            }
            z = z2;
        } else if (C0557y.m4853b(obj)) {
            F.m2339a(C0292h.STRING).m2341a(obj.toString());
        } else if (C0557y.m4854c(obj)) {
            F.m2339a(C0292h.INTEGER).m2337a(C0557y.m4855d(obj));
        } else if (obj instanceof Boolean) {
            F.m2339a(C0292h.BOOLEAN).m2342a(((Boolean) obj).booleanValue());
        } else {
            C0542i.m4827a("Converting to Value from unknown object type: " + (obj == null ? "null" : obj.getClass().toString()));
            return f2414i;
        }
        if (z) {
            F.m2347b(true);
        }
        return F.m2349c();
    }

    private static boolean m4853b(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof C0556x) && ((C0556x) obj).m4846a());
    }

    private static boolean m4854c(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof C0556x) && ((C0556x) obj).m4847b());
    }

    private static long m4855d(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        C0542i.m4827a("getInt64 received non-Number");
        return 0;
    }
}
