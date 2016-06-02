package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.ab.C0366a;

/* renamed from: com.google.android.gms.internal.c */
public class C0374c implements Creator {
    static void m3406a(C0366a c0366a, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, c0366a.f1661a);
        C0336c.m2528a(parcel, 2, c0366a.f1662b, false);
        C0336c.m2522a(parcel, 3, c0366a.f1663c);
        C0336c.m2518a(parcel, a);
    }

    public C0366a m3407a(Parcel parcel) {
        int i = 0;
        int b = C0334a.m2489b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0366a(i2, str, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0366a[] m3408a(int i) {
        return new C0366a[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3407a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3408a(i);
    }
}
