package com.google.android.gms.games.p020a;

import com.google.android.gms.internal.dl;

/* renamed from: com.google.android.gms.games.a.c */
public final class C0342c {
    public final long f1613a;
    public final String f1614b;
    public final boolean f1615c;

    public C0342c(long j, String str, boolean z) {
        this.f1613a = j;
        this.f1614b = str;
        this.f1615c = z;
    }

    public String toString() {
        return dl.m3684a((Object) this).m3686a("RawScore", Long.valueOf(this.f1613a)).m3686a("FormattedScore", this.f1614b).m3686a("NewBest", Boolean.valueOf(this.f1615c)).toString();
    }
}
