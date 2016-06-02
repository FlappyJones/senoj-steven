package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0394do;
import com.google.android.gms.internal.dl;
import com.google.android.gms.maps.p024a.bk;

public final class LatLngBounds implements SafeParcelable {
    public static final C0478f CREATOR;
    public final LatLng f2081a;
    public final LatLng f2082b;
    private final int f2083c;

    static {
        CREATOR = new C0478f();
    }

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        C0394do.m3688a((Object) latLng, (Object) "null southwest");
        C0394do.m3688a((Object) latLng2, (Object) "null northeast");
        C0394do.m3691a(latLng2.f2078a >= latLng.f2078a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f2078a), Double.valueOf(latLng2.f2078a));
        this.f2083c = i;
        this.f2081a = latLng;
        this.f2082b = latLng2;
    }

    int m4142a() {
        return this.f2083c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f2081a.equals(latLngBounds.f2081a) && this.f2082b.equals(latLngBounds.f2082b);
    }

    public int hashCode() {
        return dl.m3683a(this.f2081a, this.f2082b);
    }

    public String toString() {
        return dl.m3684a((Object) this).m3686a("southwest", this.f2081a).m3686a("northeast", this.f2082b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0492t.m4460a(this, parcel, i);
        } else {
            C0478f.m4433a(this, parcel, i);
        }
    }
}
