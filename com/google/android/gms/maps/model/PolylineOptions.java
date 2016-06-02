package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p024a.bk;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions implements SafeParcelable {
    public static final C0482j CREATOR;
    private final int f2106a;
    private final List f2107b;
    private float f2108c;
    private int f2109d;
    private float f2110e;
    private boolean f2111f;
    private boolean f2112g;

    static {
        CREATOR = new C0482j();
    }

    public PolylineOptions() {
        this.f2108c = 10.0f;
        this.f2109d = -16777216;
        this.f2110e = 0.0f;
        this.f2111f = true;
        this.f2112g = false;
        this.f2106a = 1;
        this.f2107b = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2) {
        this.f2108c = 10.0f;
        this.f2109d = -16777216;
        this.f2110e = 0.0f;
        this.f2111f = true;
        this.f2112g = false;
        this.f2106a = i;
        this.f2107b = list;
        this.f2108c = f;
        this.f2109d = i2;
        this.f2110e = f2;
        this.f2111f = z;
        this.f2112g = z2;
    }

    int m4165a() {
        return this.f2106a;
    }

    public List m4166b() {
        return this.f2107b;
    }

    public float m4167c() {
        return this.f2108c;
    }

    public int m4168d() {
        return this.f2109d;
    }

    public int describeContents() {
        return 0;
    }

    public float m4169e() {
        return this.f2110e;
    }

    public boolean m4170f() {
        return this.f2111f;
    }

    public boolean m4171g() {
        return this.f2112g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0496x.m4464a(this, parcel, i);
        } else {
            C0482j.m4445a(this, parcel, i);
        }
    }
}
