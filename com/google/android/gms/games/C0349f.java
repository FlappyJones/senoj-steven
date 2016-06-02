package com.google.android.gms.games;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.C0318c;
import com.google.android.gms.common.C0319d;

/* renamed from: com.google.android.gms.games.f */
public final class C0349f {
    private final Context f1617a;
    private String f1618b;
    private String f1619c;
    private final C0318c f1620d;
    private final C0319d f1621e;
    private String[] f1622f;
    private int f1623g;
    private View f1624h;

    public C0349f(Context context, C0318c c0318c, C0319d c0319d) {
        this.f1619c = "<<default account>>";
        this.f1622f = new String[]{"https://www.googleapis.com/auth/games"};
        this.f1623g = 49;
        this.f1617a = context;
        this.f1618b = context.getPackageName();
        this.f1620d = c0318c;
        this.f1621e = c0319d;
    }

    public C0346c m2641a() {
        return new C0346c(this.f1618b, this.f1619c, this.f1620d, this.f1621e, this.f1622f, this.f1623g, this.f1624h, null);
    }

    public C0349f m2642a(int i) {
        this.f1623g = i;
        return this;
    }

    public C0349f m2643a(String... strArr) {
        this.f1622f = strArr;
        return this;
    }
}
