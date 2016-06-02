package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.ab.C0366a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.b */
public class C0371b implements Creator {
    static void m3152a(ab abVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, abVar.m2820a());
        C0336c.m2538b(parcel, 2, abVar.m2824b(), false);
        C0336c.m2518a(parcel, a);
    }

    public ab m3153a(Parcel parcel) {
        int b = C0334a.m2489b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    arrayList = C0334a.m2492c(parcel, a, C0366a.CREATOR);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ab(i, arrayList);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public ab[] m3154a(int i) {
        return new ab[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3153a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3154a(i);
    }
}
