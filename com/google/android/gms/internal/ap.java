package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

public class ap implements Creator {
    static void m3102a(bi biVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2528a(parcel, 1, biVar.m3285f(), false);
        C0336c.m2522a(parcel, 1000, biVar.m3280a());
        C0336c.m2523a(parcel, 2, biVar.m3286g());
        C0336c.m2530a(parcel, 3, biVar.m3281b());
        C0336c.m2520a(parcel, 4, biVar.m3282c());
        C0336c.m2520a(parcel, 5, biVar.m3283d());
        C0336c.m2521a(parcel, 6, biVar.m3284e());
        C0336c.m2522a(parcel, 7, biVar.m3287h());
        C0336c.m2518a(parcel, a);
    }

    public bi m3103a(Parcel parcel) {
        double d = 0.0d;
        short s = (short) 0;
        int b = C0334a.m2489b(parcel);
        String str = null;
        float f = 0.0f;
        long j = 0;
        double d2 = 0.0d;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    j = C0334a.m2497g(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    s = C0334a.m2495e(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    d2 = C0334a.m2500j(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    d = C0334a.m2500j(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    f = C0334a.m2499i(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case 1000:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bi(i2, str, i, s, d2, d, f, j);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public bi[] m3104a(int i) {
        return new bi[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3103a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3104a(i);
    }
}
