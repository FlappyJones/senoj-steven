package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0336c;

public class aa {
    static void m4418a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, visibleRegion.m4178a());
        C0336c.m2527a(parcel, 2, visibleRegion.f2122a, i, false);
        C0336c.m2527a(parcel, 3, visibleRegion.f2123b, i, false);
        C0336c.m2527a(parcel, 4, visibleRegion.f2124c, i, false);
        C0336c.m2527a(parcel, 5, visibleRegion.f2125d, i, false);
        C0336c.m2527a(parcel, 6, visibleRegion.f2126e, i, false);
        C0336c.m2518a(parcel, a);
    }
}
