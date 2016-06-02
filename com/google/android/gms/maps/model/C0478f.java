package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.f */
public class C0478f implements Creator {
    static void m4433a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, latLngBounds.m4142a());
        C0336c.m2527a(parcel, 2, latLngBounds.f2081a, i, false);
        C0336c.m2527a(parcel, 3, latLngBounds.f2082b, i, false);
        C0336c.m2518a(parcel, a);
    }

    public LatLngBounds m4434a(Parcel parcel) {
        LatLng latLng = null;
        int b = C0334a.m2489b(parcel);
        int i = 0;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            int f;
            LatLng latLng3;
            int a = C0334a.m2484a(parcel);
            LatLng latLng4;
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    latLng4 = latLng;
                    latLng = latLng2;
                    f = C0334a.m2496f(parcel, a);
                    latLng3 = latLng4;
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    f = i;
                    latLng4 = (LatLng) C0334a.m2486a(parcel, a, LatLng.CREATOR);
                    latLng3 = latLng;
                    latLng = latLng4;
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    latLng3 = (LatLng) C0334a.m2486a(parcel, a, LatLng.CREATOR);
                    latLng = latLng2;
                    f = i;
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    latLng3 = latLng;
                    latLng = latLng2;
                    f = i;
                    break;
            }
            i = f;
            latLng2 = latLng;
            latLng = latLng3;
        }
        if (parcel.dataPosition() == b) {
            return new LatLngBounds(i, latLng2, latLng);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public LatLngBounds[] m4435a(int i) {
        return new LatLngBounds[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4434a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4435a(i);
    }
}
