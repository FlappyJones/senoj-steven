package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.z */
public class C0498z {
    static void m4466a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, tileOverlayOptions.m4174a());
        C0336c.m2525a(parcel, 2, tileOverlayOptions.m4175b(), false);
        C0336c.m2531a(parcel, 3, tileOverlayOptions.m4177d());
        C0336c.m2521a(parcel, 4, tileOverlayOptions.m4176c());
        C0336c.m2518a(parcel, a);
    }
}
