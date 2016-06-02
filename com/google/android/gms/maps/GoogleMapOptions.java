package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.p024a.C0440v;
import com.google.android.gms.maps.p024a.bk;

public final class GoogleMapOptions implements SafeParcelable {
    public static final C0445b CREATOR;
    private final int f2010a;
    private Boolean f2011b;
    private Boolean f2012c;
    private int f2013d;
    private CameraPosition f2014e;
    private Boolean f2015f;
    private Boolean f2016g;
    private Boolean f2017h;
    private Boolean f2018i;
    private Boolean f2019j;
    private Boolean f2020k;

    static {
        CREATOR = new C0445b();
    }

    public GoogleMapOptions() {
        this.f2013d = -1;
        this.f2010a = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        this.f2013d = -1;
        this.f2010a = i;
        this.f2011b = C0440v.m4106a(b);
        this.f2012c = C0440v.m4106a(b2);
        this.f2013d = i2;
        this.f2014e = cameraPosition;
        this.f2015f = C0440v.m4106a(b3);
        this.f2016g = C0440v.m4106a(b4);
        this.f2017h = C0440v.m4106a(b5);
        this.f2018i = C0440v.m4106a(b6);
        this.f2019j = C0440v.m4106a(b7);
        this.f2020k = C0440v.m4106a(b8);
    }

    public static GoogleMapOptions m3837a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0338e.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.m3839a(obtainAttributes.getInt(0, -1));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.m3841a(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.m3843b(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(6)) {
            googleMapOptions.m3847d(obtainAttributes.getBoolean(6, true));
        }
        if (obtainAttributes.hasValue(7)) {
            googleMapOptions.m3855h(obtainAttributes.getBoolean(7, true));
        }
        if (obtainAttributes.hasValue(8)) {
            googleMapOptions.m3849e(obtainAttributes.getBoolean(8, true));
        }
        if (obtainAttributes.hasValue(9)) {
            googleMapOptions.m3853g(obtainAttributes.getBoolean(9, true));
        }
        if (obtainAttributes.hasValue(11)) {
            googleMapOptions.m3851f(obtainAttributes.getBoolean(11, true));
        }
        if (obtainAttributes.hasValue(10)) {
            googleMapOptions.m3845c(obtainAttributes.getBoolean(10, true));
        }
        googleMapOptions.m3840a(CameraPosition.m4118a(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    int m3838a() {
        return this.f2010a;
    }

    public GoogleMapOptions m3839a(int i) {
        this.f2013d = i;
        return this;
    }

    public GoogleMapOptions m3840a(CameraPosition cameraPosition) {
        this.f2014e = cameraPosition;
        return this;
    }

    public GoogleMapOptions m3841a(boolean z) {
        this.f2011b = Boolean.valueOf(z);
        return this;
    }

    byte m3842b() {
        return C0440v.m4105a(this.f2011b);
    }

    public GoogleMapOptions m3843b(boolean z) {
        this.f2012c = Boolean.valueOf(z);
        return this;
    }

    byte m3844c() {
        return C0440v.m4105a(this.f2012c);
    }

    public GoogleMapOptions m3845c(boolean z) {
        this.f2015f = Boolean.valueOf(z);
        return this;
    }

    byte m3846d() {
        return C0440v.m4105a(this.f2015f);
    }

    public GoogleMapOptions m3847d(boolean z) {
        this.f2016g = Boolean.valueOf(z);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    byte m3848e() {
        return C0440v.m4105a(this.f2016g);
    }

    public GoogleMapOptions m3849e(boolean z) {
        this.f2017h = Boolean.valueOf(z);
        return this;
    }

    byte m3850f() {
        return C0440v.m4105a(this.f2017h);
    }

    public GoogleMapOptions m3851f(boolean z) {
        this.f2018i = Boolean.valueOf(z);
        return this;
    }

    byte m3852g() {
        return C0440v.m4105a(this.f2018i);
    }

    public GoogleMapOptions m3853g(boolean z) {
        this.f2019j = Boolean.valueOf(z);
        return this;
    }

    byte m3854h() {
        return C0440v.m4105a(this.f2019j);
    }

    public GoogleMapOptions m3855h(boolean z) {
        this.f2020k = Boolean.valueOf(z);
        return this;
    }

    byte m3856i() {
        return C0440v.m4105a(this.f2020k);
    }

    public int m3857j() {
        return this.f2013d;
    }

    public CameraPosition m3858k() {
        return this.f2014e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0448e.m4117a(this, parcel, i);
        } else {
            C0445b.m4112a(this, parcel, i);
        }
    }
}
