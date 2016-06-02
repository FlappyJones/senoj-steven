package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.location.c */
public class C0417c implements Creator {
    static void m3834a(LocationRequest locationRequest, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, locationRequest.f2002a);
        C0336c.m2522a(parcel, 1000, locationRequest.m3827a());
        C0336c.m2523a(parcel, 2, locationRequest.f2003b);
        C0336c.m2523a(parcel, 3, locationRequest.f2004c);
        C0336c.m2531a(parcel, 4, locationRequest.f2005d);
        C0336c.m2523a(parcel, 5, locationRequest.f2006e);
        C0336c.m2522a(parcel, 6, locationRequest.f2007f);
        C0336c.m2521a(parcel, 7, locationRequest.f2008g);
        C0336c.m2518a(parcel, a);
    }

    public LocationRequest m3835a(Parcel parcel) {
        boolean z = false;
        int b = C0334a.m2489b(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    j = C0334a.m2497g(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    j2 = C0334a.m2497g(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    j3 = C0334a.m2497g(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    f = C0334a.m2499i(parcel, a);
                    break;
                case 1000:
                    i3 = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationRequest(i3, i, j, j2, z, j3, i2, f);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public LocationRequest[] m3836a(int i) {
        return new LocationRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3835a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3836a(i);
    }
}
