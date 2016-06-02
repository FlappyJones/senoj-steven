package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.ah.C0369a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.g */
public class C0397g implements Creator {
    static void m3708a(ah ahVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, ahVar.m3072b());
        C0336c.m2538b(parcel, 2, ahVar.m3073c(), false);
        C0336c.m2528a(parcel, 3, ahVar.m3074d(), false);
        C0336c.m2518a(parcel, a);
    }

    public ah m3709a(Parcel parcel) {
        String str = null;
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
                    arrayList = C0334a.m2492c(parcel, a, C0369a.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ah(i, arrayList, str);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public ah[] m3710a(int i) {
        return new ah[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3709a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3710a(i);
    }
}
