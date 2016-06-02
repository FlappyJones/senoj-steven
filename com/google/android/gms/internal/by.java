package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import java.util.ArrayList;

public class by implements Creator {
    static void m3389a(cq cqVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1000, cqVar.m3613f());
        C0336c.m2538b(parcel, 2, cqVar.m3608a(), false);
        C0336c.m2538b(parcel, 3, cqVar.m3609b(), false);
        C0336c.m2524a(parcel, 4, cqVar.m3610c(), false);
        C0336c.m2531a(parcel, 5, cqVar.m3611d());
        C0336c.m2522a(parcel, 6, cqVar.m3612e());
        C0336c.m2518a(parcel, a);
    }

    public cq m3390a(Parcel parcel) {
        Bundle bundle = null;
        int i = 0;
        int b = C0334a.m2489b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    arrayList2 = C0334a.m2492c(parcel, a, C0413x.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    arrayList = C0334a.m2492c(parcel, a, C0413x.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    bundle = C0334a.m2504n(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case 1000:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cq(i2, arrayList2, arrayList, bundle, z, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public cq[] m3391a(int i) {
        return new cq[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3390a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3391a(i);
    }
}
