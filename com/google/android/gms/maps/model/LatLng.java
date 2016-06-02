package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p024a.bk;

public final class LatLng implements SafeParcelable {
    public static final C0479g CREATOR;
    public final double f2078a;
    public final double f2079b;
    private final int f2080c;

    static {
        CREATOR = new C0479g();
    }

    public LatLng(double d, double d2) {
        this(1, d, d2);
    }

    LatLng(int i, double d, double d2) {
        this.f2080c = i;
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.f2079b = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f2079b = d2;
        }
        this.f2078a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    int m4141a() {
        return this.f2080c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f2078a) == Double.doubleToLongBits(latLng.f2078a) && Double.doubleToLongBits(this.f2079b) == Double.doubleToLongBits(latLng.f2079b);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2078a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f2079b);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f2078a + "," + this.f2079b + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0493u.m4461a(this, parcel, i);
        } else {
            C0479g.m4436a(this, parcel, i);
        }
    }
}
