package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p024a.bk;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions implements SafeParcelable {
    public static final C0481i CREATOR;
    private final int f2097a;
    private final List f2098b;
    private final List f2099c;
    private float f2100d;
    private int f2101e;
    private int f2102f;
    private float f2103g;
    private boolean f2104h;
    private boolean f2105i;

    static {
        CREATOR = new C0481i();
    }

    public PolygonOptions() {
        this.f2100d = 10.0f;
        this.f2101e = -16777216;
        this.f2102f = 0;
        this.f2103g = 0.0f;
        this.f2104h = true;
        this.f2105i = false;
        this.f2097a = 1;
        this.f2098b = new ArrayList();
        this.f2099c = new ArrayList();
    }

    PolygonOptions(int i, List list, List list2, float f, int i2, int i3, float f2, boolean z, boolean z2) {
        this.f2100d = 10.0f;
        this.f2101e = -16777216;
        this.f2102f = 0;
        this.f2103g = 0.0f;
        this.f2104h = true;
        this.f2105i = false;
        this.f2097a = i;
        this.f2098b = list;
        this.f2099c = list2;
        this.f2100d = f;
        this.f2101e = i2;
        this.f2102f = i3;
        this.f2103g = f2;
        this.f2104h = z;
        this.f2105i = z2;
    }

    int m4156a() {
        return this.f2097a;
    }

    List m4157b() {
        return this.f2099c;
    }

    public List m4158c() {
        return this.f2098b;
    }

    public float m4159d() {
        return this.f2100d;
    }

    public int describeContents() {
        return 0;
    }

    public int m4160e() {
        return this.f2101e;
    }

    public int m4161f() {
        return this.f2102f;
    }

    public float m4162g() {
        return this.f2103g;
    }

    public boolean m4163h() {
        return this.f2104h;
    }

    public boolean m4164i() {
        return this.f2105i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0495w.m4463a(this, parcel, i);
        } else {
            C0481i.m4442a(this, parcel, i);
        }
    }
}
