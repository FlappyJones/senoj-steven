package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

public class ds implements Creator {
    static void m3699a(C0413x c0413x, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, c0413x.m3810b());
        C0336c.m2522a(parcel, 1000, c0413x.m3809a());
        C0336c.m2522a(parcel, 2, c0413x.m3811c());
        C0336c.m2528a(parcel, 3, c0413x.m3812d(), false);
        C0336c.m2528a(parcel, 4, c0413x.m3813e(), false);
        C0336c.m2528a(parcel, 5, c0413x.m3814f(), false);
        C0336c.m2528a(parcel, 6, c0413x.m3815g(), false);
        C0336c.m2518a(parcel, a);
    }

    public C0413x m3700a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = C0334a.m2489b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    str4 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    str3 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str2 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case 1000:
                    i3 = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0413x(i3, i2, i, str4, str3, str2, str);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0413x[] m3701a(int i) {
        return new C0413x[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3700a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3701a(i);
    }
}
