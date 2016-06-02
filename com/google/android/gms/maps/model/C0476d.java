package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.d */
public class C0476d implements Creator {
    static void m4427a(CircleOptions circleOptions, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, circleOptions.m4121a());
        C0336c.m2527a(parcel, 2, circleOptions.m4122b(), i, false);
        C0336c.m2520a(parcel, 3, circleOptions.m4123c());
        C0336c.m2521a(parcel, 4, circleOptions.m4124d());
        C0336c.m2522a(parcel, 5, circleOptions.m4125e());
        C0336c.m2522a(parcel, 6, circleOptions.m4126f());
        C0336c.m2521a(parcel, 7, circleOptions.m4127g());
        C0336c.m2531a(parcel, 8, circleOptions.m4128h());
        C0336c.m2518a(parcel, a);
    }

    public CircleOptions m4428a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = C0334a.m2489b(parcel);
        LatLng latLng = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i3 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    latLng = (LatLng) C0334a.m2486a(parcel, a, LatLng.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    d = C0334a.m2500j(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    f2 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    f = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CircleOptions(i3, latLng, d, f2, i2, i, f, z);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public CircleOptions[] m4429a(int i) {
        return new CircleOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4428a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4429a(i);
    }
}
