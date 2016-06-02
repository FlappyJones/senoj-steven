package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.l */
public class C0484l implements Creator {
    static void m4448a(Tile tile, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, tile.m4172a());
        C0336c.m2522a(parcel, 2, tile.f2113a);
        C0336c.m2522a(parcel, 3, tile.f2114b);
        C0336c.m2532a(parcel, 4, tile.f2115c, false);
        C0336c.m2518a(parcel, a);
    }

    public Tile m4449a(Parcel parcel) {
        int i = 0;
        int b = C0334a.m2489b(parcel);
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i3 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    bArr = C0334a.m2505o(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Tile(i3, i2, i, bArr);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public Tile[] m4450a(int i) {
        return new Tile[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4449a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4450a(i);
    }
}
