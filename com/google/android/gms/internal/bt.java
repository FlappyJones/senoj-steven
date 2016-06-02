package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.cc.C0390g;
import java.util.HashSet;
import java.util.Set;

public class bt implements Creator {
    static void m3321a(C0390g c0390g, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = c0390g.m3510e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, c0390g.m3511f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0336c.m2531a(parcel, 2, c0390g.m3512g());
        }
        if (e.contains(Integer.valueOf(3))) {
            C0336c.m2528a(parcel, 3, c0390g.m3513h(), true);
        }
        C0336c.m2518a(parcel, a);
    }

    public C0390g m3322a(Parcel parcel) {
        boolean z = false;
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    z = C0334a.m2493c(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    str = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0390g(hashSet, i, z, str);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0390g[] m3323a(int i) {
        return new C0390g[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3322a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3323a(i);
    }
}
