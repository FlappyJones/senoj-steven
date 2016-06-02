package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.cc.C0388f;
import java.util.HashSet;
import java.util.Set;

public class bs implements Creator {
    static void m3318a(C0388f c0388f, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = c0388f.m3492e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, c0388f.m3493f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0336c.m2528a(parcel, 2, c0388f.m3494g(), true);
        }
        if (e.contains(Integer.valueOf(3))) {
            C0336c.m2528a(parcel, 3, c0388f.m3495h(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0336c.m2528a(parcel, 4, c0388f.m3496i(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0336c.m2528a(parcel, 5, c0388f.m3497j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0336c.m2528a(parcel, 6, c0388f.m3498k(), true);
        }
        if (e.contains(Integer.valueOf(7))) {
            C0336c.m2531a(parcel, 7, c0388f.m3499l());
        }
        if (e.contains(Integer.valueOf(8))) {
            C0336c.m2528a(parcel, 8, c0388f.m3500m(), true);
        }
        if (e.contains(Integer.valueOf(9))) {
            C0336c.m2528a(parcel, 9, c0388f.m3501n(), true);
        }
        if (e.contains(Integer.valueOf(10))) {
            C0336c.m2522a(parcel, 10, c0388f.m3502o());
        }
        C0336c.m2518a(parcel, a);
    }

    public C0388f m3319a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i2 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str7 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    str6 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    str5 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str4 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    str3 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    z = C0334a.m2493c(parcel, a);
                    hashSet.add(Integer.valueOf(7));
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    str2 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    str = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    i = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(10));
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new C0388f(hashSet, i2, str7, str6, str5, str4, str3, z, str2, str, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public C0388f[] m3320a(int i) {
        return new C0388f[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3319a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3320a(i);
    }
}
