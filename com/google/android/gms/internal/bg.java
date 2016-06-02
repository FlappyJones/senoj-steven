package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import java.util.ArrayList;

public class bg implements Creator {
    static void m3269a(bv bvVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2528a(parcel, 1, bvVar.m3328b(), false);
        C0336c.m2522a(parcel, 1000, bvVar.m3327a());
        C0336c.m2538b(parcel, 2, bvVar.m3329c(), false);
        C0336c.m2538b(parcel, 3, bvVar.m3330d(), false);
        C0336c.m2531a(parcel, 4, bvVar.m3331e());
        C0336c.m2518a(parcel, a);
    }

    public bv m3270a(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int b = C0334a.m2489b(parcel);
        ArrayList arrayList2 = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    arrayList2 = C0334a.m2492c(parcel, a, C0413x.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    arrayList = C0334a.m2492c(parcel, a, C0413x.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                case 1000:
                    i = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bv(i, str, arrayList2, arrayList, z);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public bv[] m3271a(int i) {
        return new bv[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3270a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3271a(i);
    }
}
