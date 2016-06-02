package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.q */
public class C0489q {
    static void m4457a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, cameraPosition.m4120a());
        C0336c.m2527a(parcel, 2, cameraPosition.f2053a, i, false);
        C0336c.m2521a(parcel, 3, cameraPosition.f2054b);
        C0336c.m2521a(parcel, 4, cameraPosition.f2055c);
        C0336c.m2521a(parcel, 5, cameraPosition.f2056d);
        C0336c.m2518a(parcel, a);
    }
}
