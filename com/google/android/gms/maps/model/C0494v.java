package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.v */
public class C0494v {
    static void m4462a(MarkerOptions markerOptions, Parcel parcel, int i) {
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
        C0336c.m2518a(parcel, a);
    }
}
