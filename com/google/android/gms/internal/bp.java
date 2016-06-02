package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.cc.C0382b.C0380b;
import java.util.HashSet;
import java.util.Set;

public class bp implements Creator {
    static void m3309a(C0380b c0380b, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = c0380b.m3443e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, c0380b.m3444f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0336c.m2522a(parcel, 2, c0380b.m3445g());
        }
        if (e.contains(Integer.valueOf(3))) {
            C0336c.m2528a(parcel, 3, c0380b.m3446h(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0336c.m2522a(parcel, 4, c0380b.m3447i());
        }
        C0336c.m2518a(parcel, a);
    }

    public C0380b m3310a(Parcel parcel) {
        int i = 0;
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i3 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    i2 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    str = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    i = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0380b(hashSet, i3, i2, str, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0380b[] m3311a(int i) {
        return new C0380b[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3310a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3311a(i);
    }
}
