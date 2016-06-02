package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.ae.C0368a;
import com.google.android.gms.internal.ah.C0370b;

/* renamed from: com.google.android.gms.internal.f */
public class C0396f implements Creator {
    static void m3705a(C0370b c0370b, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, c0370b.f1684a);
        C0336c.m2528a(parcel, 2, c0370b.f1685b, false);
        C0336c.m2527a(parcel, 3, c0370b.f1686c, i, false);
        C0336c.m2518a(parcel, a);
    }

    public C0370b m3706a(Parcel parcel) {
        C0368a c0368a = null;
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
                    c0368a = (C0368a) C0334a.m2486a(parcel, a, C0368a.CREATOR);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0370b(i, str, c0368a);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0370b[] m3707a(int i) {
        return new C0370b[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3706a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3707a(i);
    }
}
