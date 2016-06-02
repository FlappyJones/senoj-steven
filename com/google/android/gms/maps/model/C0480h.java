package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.h */
public class C0480h implements Creator {
    static void m4439a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, markerOptions.m4143a());
        C0336c.m2527a(parcel, 2, markerOptions.m4145c(), i, false);
        C0336c.m2528a(parcel, 3, markerOptions.m4146d(), false);
        C0336c.m2528a(parcel, 4, markerOptions.m4147e(), false);
        C0336c.m2525a(parcel, 5, markerOptions.m4144b(), false);
        C0336c.m2521a(parcel, 6, markerOptions.m4148f());
        C0336c.m2521a(parcel, 7, markerOptions.m4149g());
        C0336c.m2531a(parcel, 8, markerOptions.m4150h());
        C0336c.m2531a(parcel, 9, markerOptions.m4151i());
        C0336c.m2531a(parcel, 10, markerOptions.m4152j());
        C0336c.m2521a(parcel, 11, markerOptions.m4153k());
        C0336c.m2521a(parcel, 12, markerOptions.m4154l());
        C0336c.m2521a(parcel, 13, markerOptions.m4155m());
        C0336c.m2518a(parcel, a);
    }

    public MarkerOptions m4440a(Parcel parcel) {
        int b = C0334a.m2489b(parcel);
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
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
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    str2 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    iBinder = C0334a.m2503m(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    f = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    f2 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    z2 = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    z3 = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiZoomGestures /*11*/:
                    f3 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_useViewLifecycle /*12*/:
                    f4 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_zOrderOnTop /*13*/:
                    f5 = C0334a.m2499i(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public MarkerOptions[] m4441a(int i) {
        return new MarkerOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4440a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4441a(i);
    }
}
