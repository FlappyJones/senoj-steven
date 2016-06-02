package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.u */
public class C0493u {
    static void m4461a(LatLng latLng, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, latLng.m4141a());
        C0336c.m2520a(parcel, 2, latLng.f2078a);
        C0336c.m2520a(parcel, 3, latLng.f2079b);
        C0336c.m2518a(parcel, a);
    }
}
