package com.google.android.gms.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.plus.l */
public class C0510l implements Creator {
    static void m4500a(C0499a c0499a, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2528a(parcel, 1, c0499a.m4476b(), false);
        C0336c.m2522a(parcel, 1000, c0499a.m4475a());
        C0336c.m2534a(parcel, 2, c0499a.m4477c(), false);
        C0336c.m2534a(parcel, 3, c0499a.m4478d(), false);
        C0336c.m2534a(parcel, 4, c0499a.m4479e(), false);
        C0336c.m2528a(parcel, 5, c0499a.m4480f(), false);
        C0336c.m2528a(parcel, 6, c0499a.m4481g(), false);
        C0336c.m2528a(parcel, 7, c0499a.m4482h(), false);
        C0336c.m2518a(parcel, a);
    }

    public C0499a m4501a(Parcel parcel) {
        String str = null;
        int b = C0334a.m2489b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    str4 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    strArr3 = C0334a.m2513w(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    strArr2 = C0334a.m2513w(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    strArr = C0334a.m2513w(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str3 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    str2 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    str = C0334a.m2502l(parcel, a);
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
            return new C0499a(i, str4, strArr3, strArr2, strArr, str3, str2, str);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0499a[] m4502a(int i) {
        return new C0499a[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4501a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m4502a(i);
    }
}
