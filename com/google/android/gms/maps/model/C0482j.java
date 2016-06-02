package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.j */
public class C0482j implements Creator {
    static void m4445a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, polylineOptions.m4165a());
        C0336c.m2538b(parcel, 2, polylineOptions.m4166b(), false);
        C0336c.m2521a(parcel, 3, polylineOptions.m4167c());
        C0336c.m2522a(parcel, 4, polylineOptions.m4168d());
        C0336c.m2521a(parcel, 5, polylineOptions.m4169e());
        C0336c.m2531a(parcel, 6, polylineOptions.m4170f());
        C0336c.m2531a(parcel, 7, polylineOptions.m4171g());
        C0336c.m2518a(parcel, a);
    }

    public PolylineOptions m4446a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = C0334a.m2489b(parcel);
        List list = null;
        boolean z2 = false;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    list = C0334a.m2492c(parcel, a, LatLng.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    f2 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    f = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    z2 = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PolylineOptions(i2, list, f2, i, f, z2, z);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public PolylineOptions[] m4447a(int i) {
        return new PolylineOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4446a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4447a(i);
    }
}
