package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.e */
public class C0477e implements Creator {
    static void m4430a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, groundOverlayOptions.m4130b());
        C0336c.m2525a(parcel, 2, groundOverlayOptions.m4129a(), false);
        C0336c.m2527a(parcel, 3, groundOverlayOptions.m4131c(), i, false);
        C0336c.m2521a(parcel, 4, groundOverlayOptions.m4132d());
        C0336c.m2521a(parcel, 5, groundOverlayOptions.m4133e());
        C0336c.m2527a(parcel, 6, groundOverlayOptions.m4134f(), i, false);
        C0336c.m2521a(parcel, 7, groundOverlayOptions.m4135g());
        C0336c.m2521a(parcel, 8, groundOverlayOptions.m4136h());
        C0336c.m2531a(parcel, 9, groundOverlayOptions.m4140l());
        C0336c.m2521a(parcel, 10, groundOverlayOptions.m4137i());
        C0336c.m2521a(parcel, 11, groundOverlayOptions.m4138j());
        C0336c.m2521a(parcel, 12, groundOverlayOptions.m4139k());
        C0336c.m2518a(parcel, a);
    }

    public GroundOverlayOptions m4431a(Parcel parcel) {
        int b = C0334a.m2489b(parcel);
        int i = 0;
        IBinder iBinder = null;
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    iBinder = C0334a.m2503m(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    latLng = (LatLng) C0334a.m2486a(parcel, a, LatLng.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    f = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    f2 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    latLngBounds = (LatLngBounds) C0334a.m2486a(parcel, a, LatLngBounds.CREATOR);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    f3 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    f4 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    f5 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiZoomGestures /*11*/:
                    f6 = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_useViewLifecycle /*12*/:
                    f7 = C0334a.m2499i(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public GroundOverlayOptions[] m4432a(int i) {
        return new GroundOverlayOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4431a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4432a(i);
    }
}
