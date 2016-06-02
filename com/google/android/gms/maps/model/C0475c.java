package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.c */
public class C0475c implements Creator {
    static void m4424a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, cameraPosition.m4120a());
        C0336c.m2527a(parcel, 2, cameraPosition.f2053a, i, false);
        C0336c.m2521a(parcel, 3, cameraPosition.f2054b);
        C0336c.m2521a(parcel, 4, cameraPosition.f2055c);
        C0336c.m2521a(parcel, 5, cameraPosition.f2056d);
        C0336c.m2518a(parcel, a);
    }

    public CameraPosition m4425a(Parcel parcel) {
        float f = 0.0f;
        int b = C0334a.m2489b(parcel);
        int i = 0;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    latLng = (LatLng) C0334a.m2486a(parcel, a, LatLng.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    f3 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    f2 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    f = C0334a.m2499i(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CameraPosition(i, latLng, f3, f2, f);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public CameraPosition[] m4426a(int i) {
        return new CameraPosition[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4425a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4426a(i);
    }
}
