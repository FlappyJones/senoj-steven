package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.cc.C0384c;
import java.util.HashSet;
import java.util.Set;

public class bq implements Creator {
    static void m3312a(C0384c c0384c, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = c0384c.m3467e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, c0384c.m3468f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0336c.m2528a(parcel, 2, c0384c.m3469g(), true);
        }
        C0336c.m2518a(parcel, a);
    }

    public C0384c m3313a(Parcel parcel) {
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0384c(hashSet, i, str);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0384c[] m3314a(int i) {
        return new C0384c[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3313a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3314a(i);
    }
}
