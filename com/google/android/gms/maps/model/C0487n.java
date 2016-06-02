package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.maps.model.n */
public class C0487n implements Creator {
    static void m4451a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, tileOverlayOptions.m4174a());
        C0336c.m2525a(parcel, 2, tileOverlayOptions.m4175b(), false);
        C0336c.m2531a(parcel, 3, tileOverlayOptions.m4177d());
        C0336c.m2521a(parcel, 4, tileOverlayOptions.m4176c());
        C0336c.m2518a(parcel, a);
    }

    public TileOverlayOptions m4452a(Parcel parcel) {
        boolean z = false;
        int b = C0334a.m2489b(parcel);
        IBinder iBinder = null;
        float f = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    iBinder = C0334a.m2503m(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    f = C0334a.m2499i(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TileOverlayOptions(i, iBinder, z, f);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public TileOverlayOptions[] m4453a(int i) {
        return new TileOverlayOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4452a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4453a(i);
    }
}
