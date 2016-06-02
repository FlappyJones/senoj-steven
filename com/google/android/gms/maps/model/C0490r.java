package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.r */
public class C0490r {
    static void m4458a(CircleOptions circleOptions, Parcel parcel, int i) {
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
}
