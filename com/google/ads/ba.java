package com.google.ads;

import com.google.ads.p008a.ac;
import com.google.ads.util.C0227e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class ba {
    private static final Map f1005a;
    private final String f1006b;
    private final String f1007c;
    private final List f1008d;
    private final Integer f1009e;
    private final Integer f1010f;
    private final List f1011g;
    private final List f1012h;
    private final List f1013i;

    static {
        f1005a = Collections.unmodifiableMap(new bb());
    }

    private ba(String str, String str2, List list, Integer num, Integer num2, List list2, List list3, List list4) {
        C0227e.m1825a(str);
        this.f1006b = str;
        this.f1007c = str2;
        this.f1008d = list;
        this.f1009e = num;
        this.f1010f = num2;
        this.f1011g = list2;
        this.f1012h = list3;
        this.f1013i = list4;
    }

    public static ba m1672a(String str) {
        Integer valueOf;
        List a;
        List a2;
        List a3;
        Integer num;
        Integer num2 = null;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("qdata");
        String string2 = jSONObject.has("ad_type") ? jSONObject.getString("ad_type") : null;
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m1673a(jSONArray.getJSONObject(i)));
        }
        jSONObject = jSONObject.optJSONObject("settings");
        if (jSONObject != null) {
            valueOf = jSONObject.has("refresh") ? Integer.valueOf(jSONObject.getInt("refresh")) : null;
            if (jSONObject.has("ad_network_timeout_millis")) {
                num2 = Integer.valueOf(jSONObject.getInt("ad_network_timeout_millis"));
            }
            a = m1674a(jSONObject, "imp_urls");
            a2 = m1674a(jSONObject, "click_urls");
            a3 = m1674a(jSONObject, "nofill_urls");
            num = num2;
        } else {
            a3 = null;
            a = null;
            a2 = null;
            num = null;
            valueOf = null;
        }
        return new ba(string, string2, arrayList, valueOf, num, a, a2, a3);
    }

    private static C0212k m1673a(JSONObject jSONObject) {
        HashMap hashMap;
        String string = jSONObject.getString("id");
        String optString = jSONObject.optString("allocation_id", null);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        List a = m1674a(jSONObject, "imp_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        HashMap hashMap2 = new HashMap(0);
        if (optJSONObject != null) {
            hashMap = new HashMap(optJSONObject.length());
            Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, optJSONObject.getString(str));
            }
        } else {
            hashMap = hashMap2;
        }
        return new C0212k(optString, string, arrayList, a, hashMap);
    }

    private static List m1674a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return arrayList;
    }

    public boolean m1675a() {
        return this.f1010f != null;
    }

    public int m1676b() {
        return this.f1010f.intValue();
    }

    public String m1677c() {
        return this.f1006b;
    }

    public boolean m1678d() {
        return this.f1009e != null;
    }

    public int m1679e() {
        return this.f1009e.intValue();
    }

    public List m1680f() {
        return this.f1008d;
    }

    public List m1681g() {
        return this.f1011g;
    }

    public List m1682h() {
        return this.f1012h;
    }

    public List m1683i() {
        return this.f1013i;
    }

    public ac m1684j() {
        if (this.f1007c == null) {
            return null;
        }
        if ("interstitial".equals(this.f1007c)) {
            return ac.f822a;
        }
        C0208g c0208g = (C0208g) f1005a.get(this.f1007c);
        return c0208g != null ? ac.m1416a(c0208g) : null;
    }
}
