package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;
import com.google.android.gms.maps.p024a.bk;

public final class VisibleRegion implements SafeParcelable {
    public static final C0488p CREATOR;
    public final LatLng f2122a;
    public final LatLng f2123b;
    public final LatLng f2124c;
    public final LatLng f2125d;
    public final LatLngBounds f2126e;
    private final int f2127f;

    static {
        CREATOR = new C0488p();
    }

    VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f2127f = i;
        this.f2122a = latLng;
        this.f2123b = latLng2;
        this.f2124c = latLng3;
        this.f2125d = latLng4;
        this.f2126e = latLngBounds;
    }

    int m4178a() {
        return this.f2127f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f2122a.equals(visibleRegion.f2122a) && this.f2123b.equals(visibleRegion.f2123b) && this.f2124c.equals(visibleRegion.f2124c) && this.f2125d.equals(visibleRegion.f2125d) && this.f2126e.equals(visibleRegion.f2126e);
    }

    public int hashCode() {
        return dl.m3683a(this.f2122a, this.f2123b, this.f2124c, this.f2125d, this.f2126e);
    }

    public String toString() {
        return dl.m3684a((Object) this).m3686a("nearLeft", this.f2122a).m3686a("nearRight", this.f2123b).m3686a("farLeft", this.f2124c).m3686a("farRight", this.f2125d).m3686a("latLngBounds", this.f2126e).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            aa.m4418a(this, parcel, i);
        } else {
            C0488p.m4454a(this, parcel, i);
        }
    }
}
