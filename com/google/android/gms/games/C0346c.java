package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.C0298b;
import com.google.android.gms.common.C0318c;
import com.google.android.gms.common.C0319d;
import com.google.android.gms.internal.C0407r;

/* renamed from: com.google.android.gms.games.c */
public final class C0346c implements C0298b {
    private final C0407r f1616a;

    private C0346c(Context context, String str, String str2, C0318c c0318c, C0319d c0319d, String[] strArr, int i, View view) {
        this.f1616a = new C0407r(context, str, str2, c0318c, c0319d, strArr, i, view, false);
    }

    public Intent m2629a(String str) {
        return this.f1616a.m3779a(str);
    }

    public void m2630a() {
        this.f1616a.m3781a();
    }

    public void m2631a(String str, long j) {
        this.f1616a.m3786a(null, str, j);
    }

    public boolean m2632b() {
        return this.f1616a.m3253h();
    }

    public void m2633c() {
        this.f1616a.m3790b();
    }
}
