package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.cc.C0386d;
import java.util.HashSet;
import java.util.Set;

public class br implements Creator {
    static void m3315a(C0386d c0386d, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = c0386d.m3477e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, c0386d.m3478f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0336c.m2528a(parcel, 2, c0386d.m3479g(), true);
        }
        if (e.contains(Integer.valueOf(3))) {
            C0336c.m2528a(parcel, 3, c0386d.m3480h(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0336c.m2528a(parcel, 4, c0386d.m3481i(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0336c.m2528a(parcel, 5, c0386d.m3482j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0336c.m2528a(parcel, 6, c0386d.m3483k(), true);
        }
        if (e.contains(Integer.valueOf(7))) {
            C0336c.m2528a(parcel, 7, c0386d.m3484l(), true);
        }
        C0336c.m2518a(parcel, a);
    }

    public C0386d m3316a(Parcel parcel) {
        String str = null;
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str6 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    str5 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    str4 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str3 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    str2 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(6));
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
            return new C0386d(hashSet, i, str6, str5, str4, str3, str2, str);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0386d[] m3317a(int i) {
        return new C0386d[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3316a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3317a(i);
    }
}
