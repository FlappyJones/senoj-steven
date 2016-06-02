package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p024a.bk;
import com.google.android.gms.p019b.C0310f;

public final class MarkerOptions implements SafeParcelable {
    public static final C0480h CREATOR;
    private final int f2084a;
    private LatLng f2085b;
    private String f2086c;
    private String f2087d;
    private C0473a f2088e;
    private float f2089f;
    private float f2090g;
    private boolean f2091h;
    private boolean f2092i;
    private boolean f2093j;
    private float f2094k;
    private float f2095l;
    private float f2096m;

    static {
        CREATOR = new C0480h();
    }

    public MarkerOptions() {
        this.f2089f = 0.5f;
        this.f2090g = 1.0f;
        this.f2092i = true;
        this.f2093j = false;
        this.f2094k = 0.0f;
        this.f2095l = 0.5f;
        this.f2096m = 0.0f;
        this.f2084a = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5) {
        this.f2089f = 0.5f;
        this.f2090g = 1.0f;
        this.f2092i = true;
        this.f2093j = false;
        this.f2094k = 0.0f;
        this.f2095l = 0.5f;
        this.f2096m = 0.0f;
        this.f2084a = i;
        this.f2085b = latLng;
        this.f2086c = str;
        this.f2087d = str2;
        this.f2088e = iBinder == null ? null : new C0473a(C0310f.m2398a(iBinder));
        this.f2089f = f;
        this.f2090g = f2;
        this.f2091h = z;
        this.f2092i = z2;
        this.f2093j = z3;
        this.f2094k = f3;
        this.f2095l = f4;
        this.f2096m = f5;
    }

    int m4143a() {
        return this.f2084a;
    }

    IBinder m4144b() {
        return this.f2088e == null ? null : this.f2088e.m4417a().asBinder();
    }

    public LatLng m4145c() {
        return this.f2085b;
    }

    public String m4146d() {
        return this.f2086c;
    }

    public int describeContents() {
        return 0;
    }

    public String m4147e() {
        return this.f2087d;
    }

    public float m4148f() {
        return this.f2089f;
    }

    public float m4149g() {
        return this.f2090g;
    }

    public boolean m4150h() {
        return this.f2091h;
    }

    public boolean m4151i() {
        return this.f2092i;
    }

    public boolean m4152j() {
        return this.f2093j;
    }

    public float m4153k() {
        return this.f2094k;
    }

    public float m4154l() {
        return this.f2095l;
    }

    public float m4155m() {
        return this.f2096m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0494v.m4462a(this, parcel, i);
        } else {
            C0480h.m4439a(this, parcel, i);
        }
    }
}
