package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.x */
public class C0496x {
    static void m4464a(PolylineOptions polylineOptions, Parcel parcel, int i) {
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
}
