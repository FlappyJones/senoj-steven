package com.google.ads.p008a;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.google.ads.a.x */
public class C0185x {
    private final String f944a;
    private HashMap f945b;

    public C0185x(Bundle bundle) {
        this.f944a = bundle.getString("action");
        this.f945b = m1546a(bundle.getSerializable("params"));
    }

    public C0185x(String str) {
        this.f944a = str;
    }

    public C0185x(String str, HashMap hashMap) {
        this(str);
        this.f945b = hashMap;
    }

    private HashMap m1546a(Serializable serializable) {
        return serializable instanceof HashMap ? (HashMap) serializable : null;
    }

    public Bundle m1547a() {
        Bundle bundle = new Bundle();
        bundle.putString("action", this.f944a);
        bundle.putSerializable("params", this.f945b);
        return bundle;
    }

    public String m1548b() {
        return this.f944a;
    }

    public HashMap m1549c() {
        return this.f945b;
    }
}
