package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.location.b */
public class C0416b implements Creator {
    static void m3831a(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2522a(parcel, 1, detectedActivity.f1999a);
        C0336c.m2522a(parcel, 1000, detectedActivity.m3825b());
        C0336c.m2522a(parcel, 2, detectedActivity.f2000b);
        C0336c.m2518a(parcel, a);
    }

    public DetectedActivity m3832a(Parcel parcel) {
        int i = 0;
        int b = C0334a.m2489b(parcel);
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
                case 1000:
                    i3 = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DetectedActivity(i3, i2, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public DetectedActivity[] m3833a(int i) {
        return new DetectedActivity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3832a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3833a(i);
    }
}
