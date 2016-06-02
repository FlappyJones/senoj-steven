package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.ah.C0369a;
import com.google.android.gms.internal.ah.C0370b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.h */
public class C0398h implements Creator {
    static void m3711a(C0369a c0369a, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, c0369a.f1681a);
        C0336c.m2528a(parcel, 2, c0369a.f1682b, false);
        C0336c.m2538b(parcel, 3, c0369a.f1683c, false);
        C0336c.m2518a(parcel, a);
    }

    public C0369a m3712a(Parcel parcel) {
        ArrayList arrayList = null;
        int b = C0334a.m2489b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    arrayList = C0334a.m2492c(parcel, a, C0370b.CREATOR);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0369a(i, str, arrayList);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0369a[] m3713a(int i) {
        return new C0369a[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3712a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3713a(i);
    }
}
