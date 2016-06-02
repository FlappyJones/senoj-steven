package com.google.android.gms.p018a;

import android.content.Context;
import com.google.android.gms.common.C0318c;
import com.google.android.gms.common.C0319d;

/* renamed from: com.google.android.gms.a.c */
public final class C0301c {
    private static final String[] f1485a;
    private Context f1486b;
    private C0318c f1487c;
    private C0319d f1488d;
    private String[] f1489e;
    private String f1490f;

    static {
        f1485a = new String[]{"https://www.googleapis.com/auth/appstate"};
    }

    public C0301c(Context context, C0318c c0318c, C0319d c0319d) {
        this.f1486b = context;
        this.f1487c = c0318c;
        this.f1488d = c0319d;
        this.f1489e = f1485a;
        this.f1490f = "<<default account>>";
    }

    public C0299a m2385a() {
        return new C0299a(this.f1487c, this.f1488d, this.f1490f, this.f1489e, null);
    }

    public C0301c m2386a(String... strArr) {
        this.f1489e = strArr;
        return this;
    }
}
