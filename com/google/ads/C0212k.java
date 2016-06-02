package com.google.ads;

import com.google.ads.util.C0227e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.ads.k */
public class C0212k {
    private final String f1171a;
    private final String f1172b;
    private final List f1173c;
    private final List f1174d;
    private final HashMap f1175e;

    public C0212k(String str, String str2, List list, List list2, HashMap hashMap) {
        C0227e.m1825a(str2);
        if (str != null) {
            C0227e.m1825a(str);
        }
        this.f1171a = str;
        this.f1172b = str2;
        this.f1173c = list;
        this.f1175e = hashMap;
        this.f1174d = list2;
    }

    public String m1770a() {
        return this.f1171a;
    }

    public String m1771b() {
        return this.f1172b;
    }

    public List m1772c() {
        return this.f1173c;
    }

    public List m1773d() {
        return this.f1174d;
    }

    public HashMap m1774e() {
        return this.f1175e;
    }
}
