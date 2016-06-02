package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.internal.a */
public class C0364a implements Creator {
    static void m2770a(C0414z c0414z, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, c0414z.m3819a());
        C0336c.m2527a(parcel, 2, c0414z.m3820b(), i, false);
        C0336c.m2518a(parcel, a);
    }

    public C0414z m2771a(Parcel parcel) {
        int b = C0334a.m2489b(parcel);
        int i = 0;
        ab abVar = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    abVar = (ab) C0334a.m2486a(parcel, a, ab.CREATOR);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0414z(i, abVar);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0414z[] m2772a(int i) {
        return new C0414z[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2771a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2772a(i);
    }
}
