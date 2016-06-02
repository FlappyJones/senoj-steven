package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import java.util.HashSet;
import java.util.Set;

public class bk implements Creator {
    static void m3294a(bz bzVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = bzVar.m3398e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, bzVar.m3399f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0336c.m2528a(parcel, 2, bzVar.m3400g(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0336c.m2527a(parcel, 4, bzVar.m3401h(), i, true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0336c.m2528a(parcel, 5, bzVar.m3402i(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0336c.m2527a(parcel, 6, bzVar.m3403j(), i, true);
        }
        if (e.contains(Integer.valueOf(7))) {
            C0336c.m2528a(parcel, 7, bzVar.m3404k(), true);
        }
        C0336c.m2518a(parcel, a);
    }

    public bz m3295a(Parcel parcel) {
        String str = null;
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        bx bxVar = null;
        String str2 = null;
        bx bxVar2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            bx bxVar3;
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str3 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    bxVar3 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    bxVar2 = bxVar3;
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str2 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    bxVar3 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(6));
                    bxVar = bxVar3;
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    str = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(7));
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bz(hashSet, i, str3, bxVar2, str2, bxVar, str);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public bz[] m3296a(int i) {
        return new bz[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3295a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3296a(i);
    }
}
