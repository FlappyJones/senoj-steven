package com.google.ads.p008a;

import com.google.ads.util.C0229g;
import org.json.JSONObject;

/* renamed from: com.google.ads.a.af */
public class af {
    private final String f837a;

    public af(String str) {
        this.f837a = str;
    }

    public JSONObject m1431a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("debugHeader", this.f837a);
        } catch (Throwable e) {
            C0229g.m1837b("Could not build ReportAdJson from inputs.", e);
        }
        return jSONObject;
    }
}
