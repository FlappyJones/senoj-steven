package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.internal.cc.C0376a;
import com.google.android.gms.internal.cc.C0382b;
import com.google.android.gms.internal.cc.C0384c;
import com.google.android.gms.internal.cc.C0386d;
import com.google.android.gms.internal.cc.C0388f;
import com.google.android.gms.internal.cc.C0390g;
import com.google.android.gms.internal.cc.C0392h;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bl implements Creator {
    static void m3297a(cc ccVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = ccVar.m3540e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, ccVar.m3541f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0336c.m2528a(parcel, 2, ccVar.m3542g(), true);
        }
        if (e.contains(Integer.valueOf(3))) {
            C0336c.m2527a(parcel, 3, ccVar.m3543h(), i, true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0336c.m2528a(parcel, 4, ccVar.m3544i(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0336c.m2528a(parcel, 5, ccVar.m3545j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0336c.m2522a(parcel, 6, ccVar.m3546k());
        }
        if (e.contains(Integer.valueOf(7))) {
            C0336c.m2527a(parcel, 7, ccVar.m3547l(), i, true);
        }
        if (e.contains(Integer.valueOf(8))) {
            C0336c.m2528a(parcel, 8, ccVar.m3548m(), true);
        }
        if (e.contains(Integer.valueOf(9))) {
            C0336c.m2528a(parcel, 9, ccVar.m3549n(), true);
        }
        if (e.contains(Integer.valueOf(12))) {
            C0336c.m2522a(parcel, 12, ccVar.m3550o());
        }
        if (e.contains(Integer.valueOf(14))) {
            C0336c.m2528a(parcel, 14, ccVar.m3551p(), true);
        }
        if (e.contains(Integer.valueOf(15))) {
            C0336c.m2527a(parcel, 15, ccVar.m3552q(), i, true);
        }
        if (e.contains(Integer.valueOf(16))) {
            C0336c.m2531a(parcel, 16, ccVar.m3553r());
        }
        if (e.contains(Integer.valueOf(19))) {
            C0336c.m2527a(parcel, 19, ccVar.m3555t(), i, true);
        }
        if (e.contains(Integer.valueOf(18))) {
            C0336c.m2528a(parcel, 18, ccVar.m3554s(), true);
        }
        if (e.contains(Integer.valueOf(21))) {
            C0336c.m2522a(parcel, 21, ccVar.m3557v());
        }
        if (e.contains(Integer.valueOf(20))) {
            C0336c.m2528a(parcel, 20, ccVar.m3556u(), true);
        }
        if (e.contains(Integer.valueOf(23))) {
            C0336c.m2538b(parcel, 23, ccVar.m3559x(), true);
        }
        if (e.contains(Integer.valueOf(22))) {
            C0336c.m2538b(parcel, 22, ccVar.m3558w(), true);
        }
        if (e.contains(Integer.valueOf(25))) {
            C0336c.m2522a(parcel, 25, ccVar.m3561z());
        }
        if (e.contains(Integer.valueOf(24))) {
            C0336c.m2522a(parcel, 24, ccVar.m3560y());
        }
        if (e.contains(Integer.valueOf(27))) {
            C0336c.m2528a(parcel, 27, ccVar.m3530B(), true);
        }
        if (e.contains(Integer.valueOf(26))) {
            C0336c.m2528a(parcel, 26, ccVar.m3529A(), true);
        }
        if (e.contains(Integer.valueOf(29))) {
            C0336c.m2531a(parcel, 29, ccVar.m3532D());
        }
        if (e.contains(Integer.valueOf(28))) {
            C0336c.m2538b(parcel, 28, ccVar.m3531C(), true);
        }
        C0336c.m2518a(parcel, a);
    }

    public cc m3298a(Parcel parcel) {
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str = null;
        C0376a c0376a = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        C0382b c0382b = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        C0384c c0384c = null;
        boolean z = false;
        String str7 = null;
        C0386d c0386d = null;
        String str8 = null;
        int i4 = 0;
        List list = null;
        List list2 = null;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        String str10 = null;
        List list3 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    C0376a c0376a2 = (C0376a) C0334a.m2486a(parcel, a, C0376a.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    c0376a = c0376a2;
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    str2 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str3 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    i2 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    C0382b c0382b2 = (C0382b) C0334a.m2486a(parcel, a, C0382b.CREATOR);
                    hashSet.add(Integer.valueOf(7));
                    c0382b = c0382b2;
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    str4 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    str5 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case C0338e.MapAttrs_useViewLifecycle /*12*/:
                    i3 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(12));
                    break;
                case 14:
                    str6 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(14));
                    break;
                case 15:
                    C0384c c0384c2 = (C0384c) C0334a.m2486a(parcel, a, C0384c.CREATOR);
                    hashSet.add(Integer.valueOf(15));
                    c0384c = c0384c2;
                    break;
                case 16:
                    z = C0334a.m2493c(parcel, a);
                    hashSet.add(Integer.valueOf(16));
                    break;
                case 18:
                    str7 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(18));
                    break;
                case 19:
                    C0386d c0386d2 = (C0386d) C0334a.m2486a(parcel, a, C0386d.CREATOR);
                    hashSet.add(Integer.valueOf(19));
                    c0386d = c0386d2;
                    break;
                case 20:
                    str8 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(20));
                    break;
                case 21:
                    i4 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(21));
                    break;
                case 22:
                    list = C0334a.m2492c(parcel, a, C0388f.CREATOR);
                    hashSet.add(Integer.valueOf(22));
                    break;
                case 23:
                    list2 = C0334a.m2492c(parcel, a, C0390g.CREATOR);
                    hashSet.add(Integer.valueOf(23));
                    break;
                case 24:
                    i5 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(24));
                    break;
                case 25:
                    i6 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(25));
                    break;
                case 26:
                    str9 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(26));
                    break;
                case 27:
                    str10 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(27));
                    break;
                case 28:
                    list3 = C0334a.m2492c(parcel, a, C0392h.CREATOR);
                    hashSet.add(Integer.valueOf(28));
                    break;
                case 29:
                    z2 = C0334a.m2493c(parcel, a);
                    hashSet.add(Integer.valueOf(29));
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cc(hashSet, i, str, c0376a, str2, str3, i2, c0382b, str4, str5, i3, str6, c0384c, z, str7, c0386d, str8, i4, list, list2, i5, i6, str9, str10, list3, z2);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public cc[] m3299a(int i) {
        return new cc[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3298a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3299a(i);
    }
}
