package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.internal.i */
public class C0399i implements Creator {
    static void m3714a(ak akVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, akVar.m3089a());
        C0336c.m2526a(parcel, 2, akVar.m3093e(), false);
        C0336c.m2527a(parcel, 3, akVar.m3094f(), i, false);
        C0336c.m2518a(parcel, a);
    }

    public ak m3715a(Parcel parcel) {
        ah ahVar = null;
        int b = C0334a.m2489b(parcel);
        int i = 0;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    parcel2 = C0334a.m2515y(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    ahVar = (ah) C0334a.m2486a(parcel, a, ah.CREATOR);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ak(i, parcel2, ahVar);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public ak[] m3716a(int i) {
        return new ak[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3715a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3716a(i);
    }
}
