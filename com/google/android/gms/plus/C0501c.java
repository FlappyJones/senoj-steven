package com.google.android.gms.plus;

import android.content.Context;
import com.google.android.gms.common.C0318c;
import com.google.android.gms.common.C0319d;
import com.google.android.gms.internal.bd;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.plus.c */
public class C0501c {
    private Context f2165a;
    private String f2166b;
    private C0318c f2167c;
    private C0319d f2168d;
    private ArrayList f2169e;
    private String[] f2170f;
    private String[] f2171g;
    private String f2172h;
    private String f2173i;
    private String f2174j;

    public C0501c(Context context, C0318c c0318c, C0319d c0319d) {
        this.f2165a = context;
        this.f2167c = c0318c;
        this.f2168d = c0319d;
        this.f2169e = new ArrayList();
        this.f2173i = this.f2165a.getPackageName();
        this.f2172h = this.f2165a.getPackageName();
        this.f2169e.add("https://www.googleapis.com/auth/plus.login");
    }

    public C0500b m4486a() {
        if (this.f2166b == null) {
            this.f2166b = "<<default account>>";
        }
        return new C0500b(new bd(this.f2165a, new C0499a(this.f2166b, (String[]) this.f2169e.toArray(new String[this.f2169e.size()]), this.f2170f, this.f2171g, this.f2172h, this.f2173i, this.f2174j), this.f2167c, this.f2168d));
    }

    public C0501c m4487a(String... strArr) {
        this.f2169e.clear();
        this.f2169e.addAll(Arrays.asList(strArr));
        return this;
    }
}
