package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.p */
public class C0488p implements Creator {
    static void m4454a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, visibleRegion.m4178a());
        C0336c.m2527a(parcel, 2, visibleRegion.f2122a, i, false);
        C0336c.m2527a(parcel, 3, visibleRegion.f2123b, i, false);
        C0336c.m2527a(parcel, 4, visibleRegion.f2124c, i, false);
        C0336c.m2527a(parcel, 5, visibleRegion.f2125d, i, false);
        C0336c.m2527a(parcel, 6, visibleRegion.f2126e, i, false);
        C0336c.m2518a(parcel, a);
    }

    public VisibleRegion m4455a(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int b = C0334a.m2489b(parcel);
        int i = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    latLng4 = (LatLng) C0334a.m2486a(parcel, a, LatLng.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    latLng3 = (LatLng) C0334a.m2486a(parcel, a, LatLng.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    latLng2 = (LatLng) C0334a.m2486a(parcel, a, LatLng.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    latLng = (LatLng) C0334a.m2486a(parcel, a, LatLng.CREATOR);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    latLngBounds = (LatLngBounds) C0334a.m2486a(parcel, a, LatLngBounds.CREATOR);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VisibleRegion(i, latLng4, latLng3, latLng2, latLng, latLngBounds);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public VisibleRegion[] m4456a(int i) {
        return new VisibleRegion[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4455a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4456a(i);
    }
}
