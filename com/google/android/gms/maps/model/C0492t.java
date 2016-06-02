package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.t */
public class C0492t {
    static void m4460a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, latLngBounds.m4142a());
        C0336c.m2527a(parcel, 2, latLngBounds.f2081a, i, false);
        C0336c.m2527a(parcel, 3, latLngBounds.f2082b, i, false);
        C0336c.m2518a(parcel, a);
    }
}
