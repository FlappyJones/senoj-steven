package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.ae.C0368a;

/* renamed from: com.google.android.gms.internal.e */
public class C0395e implements Creator {
    static void m3702a(C0368a c0368a, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, c0368a.m2959a());
        C0336c.m2522a(parcel, 2, c0368a.m2962b());
        C0336c.m2531a(parcel, 3, c0368a.m2963c());
        C0336c.m2522a(parcel, 4, c0368a.m2964d());
        C0336c.m2531a(parcel, 5, c0368a.m2965e());
        C0336c.m2528a(parcel, 6, c0368a.m2966f(), false);
        C0336c.m2522a(parcel, 7, c0368a.m2967g());
        C0336c.m2528a(parcel, 8, c0368a.m2969i(), false);
        C0336c.m2527a(parcel, 9, c0368a.m2971k(), i, false);
        C0336c.m2518a(parcel, a);
    }

    public C0368a m3703a(Parcel parcel) {
        C0414z c0414z = null;
        int i = 0;
        int b = C0334a.m2489b(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i4 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    i3 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    z2 = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    str2 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    c0414z = (C0414z) C0334a.m2486a(parcel, a, C0414z.CREATOR);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0368a(i4, i3, z2, i2, z, str2, i, str, c0414z);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0368a[] m3704a(int i) {
        return new C0368a[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3703a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3704a(i);
    }
}
