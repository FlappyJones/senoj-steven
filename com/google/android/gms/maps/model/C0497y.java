package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.y */
public class C0497y {
    static void m4465a(Tile tile, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, tile.m4172a());
        C0336c.m2522a(parcel, 2, tile.f2113a);
        C0336c.m2522a(parcel, 3, tile.f2114b);
        C0336c.m2532a(parcel, 4, tile.f2115c, false);
        C0336c.m2518a(parcel, a);
    }
}
