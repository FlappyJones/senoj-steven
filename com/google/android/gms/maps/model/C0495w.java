package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.w */
public class C0495w {
    static void m4463a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, polygonOptions.m4156a());
        C0336c.m2538b(parcel, 2, polygonOptions.m4158c(), false);
        C0336c.m2540c(parcel, 3, polygonOptions.m4157b(), false);
        C0336c.m2521a(parcel, 4, polygonOptions.m4159d());
        C0336c.m2522a(parcel, 5, polygonOptions.m4160e());
        C0336c.m2522a(parcel, 6, polygonOptions.m4161f());
        C0336c.m2521a(parcel, 7, polygonOptions.m4162g());
        C0336c.m2531a(parcel, 8, polygonOptions.m4163h());
        C0336c.m2531a(parcel, 9, polygonOptions.m4164i());
        C0336c.m2518a(parcel, a);
    }
}
