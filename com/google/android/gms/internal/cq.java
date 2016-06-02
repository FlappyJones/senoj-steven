package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class cq implements SafeParcelable {
    public static final by CREATOR;
    private final int f1931a;
    private final ArrayList f1932b;
    private final ArrayList f1933c;
    private final Bundle f1934d;
    private final boolean f1935e;
    private final int f1936f;

    static {
        CREATOR = new by();
    }

    public cq(int i, ArrayList arrayList, ArrayList arrayList2, Bundle bundle, boolean z, int i2) {
        this.f1931a = i;
        this.f1932b = arrayList;
        this.f1933c = arrayList2;
        this.f1934d = bundle;
        this.f1935e = z;
        this.f1936f = i2;
    }

    public ArrayList m3608a() {
        return this.f1932b;
    }

    public ArrayList m3609b() {
        return this.f1933c;
    }

    public Bundle m3610c() {
        return this.f1934d;
    }

    public boolean m3611d() {
        return this.f1935e;
    }

    public int describeContents() {
        return 0;
    }

    public int m3612e() {
        return this.f1936f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return this.f1931a == cqVar.f1931a && dl.m3685a(this.f1932b, cqVar.f1932b) && dl.m3685a(this.f1933c, cqVar.f1933c) && dl.m3685a(this.f1934d, cqVar.f1934d) && dl.m3685a(Integer.valueOf(this.f1936f), Integer.valueOf(cqVar.f1936f));
    }

    public int m3613f() {
        return this.f1931a;
    }

    public int hashCode() {
        return dl.m3683a(Integer.valueOf(this.f1931a), this.f1932b, this.f1933c, this.f1934d, Integer.valueOf(this.f1936f));
    }

    public void writeToParcel(Parcel parcel, int i) {
        by.m3389a(this, parcel, i);
    }
}
