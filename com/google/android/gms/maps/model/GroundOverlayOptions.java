package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p024a.bk;
import com.google.android.gms.p019b.C0310f;

public final class GroundOverlayOptions implements SafeParcelable {
    public static final C0477e CREATOR;
    private final int f2066a;
    private C0473a f2067b;
    private LatLng f2068c;
    private float f2069d;
    private float f2070e;
    private LatLngBounds f2071f;
    private float f2072g;
    private float f2073h;
    private boolean f2074i;
    private float f2075j;
    private float f2076k;
    private float f2077l;

    static {
        CREATOR = new C0477e();
    }

    public GroundOverlayOptions() {
        this.f2074i = true;
        this.f2075j = 0.0f;
        this.f2076k = 0.5f;
        this.f2077l = 0.5f;
        this.f2066a = 1;
    }

    GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7) {
        this.f2074i = true;
        this.f2075j = 0.0f;
        this.f2076k = 0.5f;
        this.f2077l = 0.5f;
        this.f2066a = i;
        this.f2067b = new C0473a(C0310f.m2398a(iBinder));
        this.f2068c = latLng;
        this.f2069d = f;
        this.f2070e = f2;
        this.f2071f = latLngBounds;
        this.f2072g = f3;
        this.f2073h = f4;
        this.f2074i = z;
        this.f2075j = f5;
        this.f2076k = f6;
        this.f2077l = f7;
    }

    IBinder m4129a() {
        return this.f2067b.m4417a().asBinder();
    }

    int m4130b() {
        return this.f2066a;
    }

    public LatLng m4131c() {
        return this.f2068c;
    }

    public float m4132d() {
        return this.f2069d;
    }

    public int describeContents() {
        return 0;
    }

    public float m4133e() {
        return this.f2070e;
    }

    public LatLngBounds m4134f() {
        return this.f2071f;
    }

    public float m4135g() {
        return this.f2072g;
    }

    public float m4136h() {
        return this.f2073h;
    }

    public float m4137i() {
        return this.f2075j;
    }

    public float m4138j() {
        return this.f2076k;
    }

    public float m4139k() {
        return this.f2077l;
    }

    public boolean m4140l() {
        return this.f2074i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0491s.m4459a(this, parcel, i);
        } else {
            C0477e.m4430a(this, parcel, i);
        }
    }
}
