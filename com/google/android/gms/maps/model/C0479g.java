package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.g */
public class C0479g implements Creator {
    static void m4436a(LatLng latLng, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, latLng.m4141a());
        C0336c.m2520a(parcel, 2, latLng.f2078a);
        C0336c.m2520a(parcel, 3, latLng.f2079b);
        C0336c.m2518a(parcel, a);
    }

    public LatLng m4437a(Parcel parcel) {
        double d = 0.0d;
        int b = C0334a.m2489b(parcel);
        int i = 0;
        double d2 = 0.0d;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    d2 = C0334a.m2500j(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    d = C0334a.m2500j(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LatLng(i, d2, d);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public LatLng[] m4438a(int i) {
        return new LatLng[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4437a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4438a(i);
    }
}
