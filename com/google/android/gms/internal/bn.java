package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.cc.C0382b;
import com.google.android.gms.internal.cc.C0382b.C0378a;
import com.google.android.gms.internal.cc.C0382b.C0380b;
import java.util.HashSet;
import java.util.Set;

public class bn implements Creator {
    static void m3303a(C0382b c0382b, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = c0382b.m3455e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, c0382b.m3456f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0336c.m2527a(parcel, 2, c0382b.m3457g(), i, true);
        }
        if (e.contains(Integer.valueOf(3))) {
            C0336c.m2527a(parcel, 3, c0382b.m3458h(), i, true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0336c.m2522a(parcel, 4, c0382b.m3459i());
        }
        C0336c.m2518a(parcel, a);
    }

    public C0382b m3304a(Parcel parcel) {
        C0380b c0380b = null;
        int i = 0;
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        C0378a c0378a = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i2 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    C0378a c0378a2 = (C0378a) C0334a.m2486a(parcel, a, C0378a.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    c0378a = c0378a2;
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    C0380b c0380b2 = (C0380b) C0334a.m2486a(parcel, a, C0380b.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    c0380b = c0380b2;
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
            return new C0382b(hashSet, i2, c0378a, c0380b, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0382b[] m3305a(int i) {
        return new C0382b[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3304a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3305a(i);
    }
}
