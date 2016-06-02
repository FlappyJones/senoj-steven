package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.cc.C0392h;
import java.util.HashSet;
import java.util.Set;

public class bu implements Creator {
    static void m3324a(C0392h c0392h, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = c0392h.m3521e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, c0392h.m3522f());
        }
        if (e.contains(Integer.valueOf(3))) {
            C0336c.m2522a(parcel, 3, c0392h.m3524h());
        }
        if (e.contains(Integer.valueOf(4))) {
            C0336c.m2528a(parcel, 4, c0392h.m3526j(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0336c.m2528a(parcel, 5, c0392h.m3523g(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0336c.m2522a(parcel, 6, c0392h.m3525i());
        }
        C0336c.m2518a(parcel, a);
    }

    public C0392h m3325a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i3 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    i = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    str = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str2 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    i2 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0392h(hashSet, i3, str2, i2, str, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0392h[] m3326a(int i) {
        return new C0392h[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3325a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3326a(i);
    }
}
