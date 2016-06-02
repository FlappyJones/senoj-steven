package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import java.util.List;

/* renamed from: com.google.android.gms.location.a */
public class C0415a implements Creator {
    static void m3828a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2538b(parcel, 1, activityRecognitionResult.f1995a, false);
        C0336c.m2522a(parcel, 1000, activityRecognitionResult.m3822a());
        C0336c.m2523a(parcel, 2, activityRecognitionResult.f1996b);
        C0336c.m2523a(parcel, 3, activityRecognitionResult.f1997c);
        C0336c.m2518a(parcel, a);
    }

    public ActivityRecognitionResult m3829a(Parcel parcel) {
        long j = 0;
        int b = C0334a.m2489b(parcel);
        int i = 0;
        List list = null;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    list = C0334a.m2492c(parcel, a, DetectedActivity.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    j2 = C0334a.m2497g(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    j = C0334a.m2497g(parcel, a);
                    break;
                case 1000:
                    i = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityRecognitionResult(i, list, j2, j);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public ActivityRecognitionResult[] m3830a(int i) {
        return new ActivityRecognitionResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3829a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3830a(i);
    }
}
