package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p024a.bk;

public final class CircleOptions implements SafeParcelable {
    public static final C0476d CREATOR;
    private final int f2058a;
    private LatLng f2059b;
    private double f2060c;
    private float f2061d;
    private int f2062e;
    private int f2063f;
    private float f2064g;
    private boolean f2065h;

    static {
        CREATOR = new C0476d();
    }

    public CircleOptions() {
        this.f2059b = null;
        this.f2060c = 0.0d;
        this.f2061d = 10.0f;
        this.f2062e = -16777216;
        this.f2063f = 0;
        this.f2064g = 0.0f;
        this.f2065h = true;
        this.f2058a = 1;
    }

    CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z) {
        this.f2059b = null;
        this.f2060c = 0.0d;
        this.f2061d = 10.0f;
        this.f2062e = -16777216;
        this.f2063f = 0;
        this.f2064g = 0.0f;
        this.f2065h = true;
        this.f2058a = i;
        this.f2059b = latLng;
        this.f2060c = d;
        this.f2061d = f;
        this.f2062e = i2;
        this.f2063f = i3;
        this.f2064g = f2;
        this.f2065h = z;
    }

    int m4121a() {
        return this.f2058a;
    }

    public LatLng m4122b() {
        return this.f2059b;
    }

    public double m4123c() {
        return this.f2060c;
    }

    public float m4124d() {
        return this.f2061d;
    }

    public int describeContents() {
        return 0;
    }

    public int m4125e() {
        return this.f2062e;
    }

    public int m4126f() {
        return this.f2063f;
    }

    public float m4127g() {
        return this.f2064g;
    }

    public boolean m4128h() {
        return this.f2065h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0490r.m4458a(this, parcel, i);
        } else {
            C0476d.m4427a(this, parcel, i);
        }
    }
}
