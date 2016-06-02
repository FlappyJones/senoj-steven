package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0394do;
import com.google.android.gms.internal.dl;
import com.google.android.gms.maps.p024a.bk;

public final class CameraPosition implements SafeParcelable {
    public static final C0475c CREATOR;
    public final LatLng f2053a;
    public final float f2054b;
    public final float f2055c;
    public final float f2056d;
    private final int f2057e;

    static {
        CREATOR = new C0475c();
    }

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        C0394do.m3688a((Object) latLng, (Object) "null camera target");
        boolean z = 0.0f <= f2 && f2 <= 90.0f;
        C0394do.m3693b(z, "Tilt needs to be between 0 and 90 inclusive");
        this.f2057e = i;
        this.f2053a = latLng;
        this.f2054b = f;
        this.f2055c = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.f2056d = f3 % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    public static CameraPosition m4118a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0338e.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(2) ? obtainAttributes.getFloat(2, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 0.0f) : 0.0f));
        C0474b b = m4119b();
        b.m4421a(latLng);
        if (obtainAttributes.hasValue(5)) {
            b.m4420a(obtainAttributes.getFloat(5, 0.0f));
        }
        if (obtainAttributes.hasValue(1)) {
            b.m4423c(obtainAttributes.getFloat(1, 0.0f));
        }
        if (obtainAttributes.hasValue(4)) {
            b.m4422b(obtainAttributes.getFloat(4, 0.0f));
        }
        return b.m4419a();
    }

    public static C0474b m4119b() {
        return new C0474b();
    }

    int m4120a() {
        return this.f2057e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f2053a.equals(cameraPosition.f2053a) && Float.floatToIntBits(this.f2054b) == Float.floatToIntBits(cameraPosition.f2054b) && Float.floatToIntBits(this.f2055c) == Float.floatToIntBits(cameraPosition.f2055c) && Float.floatToIntBits(this.f2056d) == Float.floatToIntBits(cameraPosition.f2056d);
    }

    public int hashCode() {
        return dl.m3683a(this.f2053a, Float.valueOf(this.f2054b), Float.valueOf(this.f2055c), Float.valueOf(this.f2056d));
    }

    public String toString() {
        return dl.m3684a((Object) this).m3686a("target", this.f2053a).m3686a("zoom", Float.valueOf(this.f2054b)).m3686a("tilt", Float.valueOf(this.f2055c)).m3686a("bearing", Float.valueOf(this.f2056d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0489q.m4457a(this, parcel, i);
        } else {
            C0475c.m4424a(this, parcel, i);
        }
    }
}
