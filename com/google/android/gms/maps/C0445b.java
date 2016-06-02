package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: com.google.android.gms.maps.b */
public class C0445b implements Creator {
    static void m4112a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, googleMapOptions.m3838a());
        C0336c.m2519a(parcel, 2, googleMapOptions.m3842b());
        C0336c.m2519a(parcel, 3, googleMapOptions.m3844c());
        C0336c.m2522a(parcel, 4, googleMapOptions.m3857j());
        C0336c.m2527a(parcel, 5, googleMapOptions.m3858k(), i, false);
        C0336c.m2519a(parcel, 6, googleMapOptions.m3846d());
        C0336c.m2519a(parcel, 7, googleMapOptions.m3848e());
        C0336c.m2519a(parcel, 8, googleMapOptions.m3850f());
        C0336c.m2519a(parcel, 9, googleMapOptions.m3852g());
        C0336c.m2519a(parcel, 10, googleMapOptions.m3854h());
        C0336c.m2519a(parcel, 11, googleMapOptions.m3856i());
        C0336c.m2518a(parcel, a);
    }

    public GoogleMapOptions m4113a(Parcel parcel) {
        byte b = (byte) 0;
        int b2 = C0334a.m2489b(parcel);
        CameraPosition cameraPosition = null;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        byte b5 = (byte) 0;
        byte b6 = (byte) 0;
        byte b7 = (byte) 0;
        int i = 0;
        byte b8 = (byte) 0;
        byte b9 = (byte) 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    b9 = C0334a.m2494d(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    b8 = C0334a.m2494d(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    cameraPosition = (CameraPosition) C0334a.m2486a(parcel, a, CameraPosition.CREATOR);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    b7 = C0334a.m2494d(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    b6 = C0334a.m2494d(parcel, a);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    b5 = C0334a.m2494d(parcel, a);
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    b4 = C0334a.m2494d(parcel, a);
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    b3 = C0334a.m2494d(parcel, a);
                    break;
                case C0338e.MapAttrs_uiZoomGestures /*11*/:
                    b = C0334a.m2494d(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new GoogleMapOptions(i2, b9, b8, i, cameraPosition, b7, b6, b5, b4, b3, b);
        }
        throw new C0335b("Overread allowed size end=" + b2, parcel);
    }

    public GoogleMapOptions[] m4114a(int i) {
        return new GoogleMapOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4113a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4114a(i);
    }
}
