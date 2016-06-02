package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;

/* renamed from: com.google.android.gms.games.h */
public class C0343h implements Creator {
    static void m2608a(GameEntity gameEntity, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2528a(parcel, 1, gameEntity.m2569b(), false);
        C0336c.m2528a(parcel, 2, gameEntity.m2570c(), false);
        C0336c.m2528a(parcel, 3, gameEntity.m2571d(), false);
        C0336c.m2528a(parcel, 4, gameEntity.m2572e(), false);
        C0336c.m2528a(parcel, 5, gameEntity.m2573f(), false);
        C0336c.m2528a(parcel, 6, gameEntity.m2574g(), false);
        C0336c.m2527a(parcel, 7, gameEntity.m2575h(), i, false);
        C0336c.m2527a(parcel, 8, gameEntity.m2576i(), i, false);
        C0336c.m2527a(parcel, 9, gameEntity.m2577j(), i, false);
        C0336c.m2531a(parcel, 10, gameEntity.m2578k());
        C0336c.m2531a(parcel, 11, gameEntity.m2579l());
        C0336c.m2528a(parcel, 12, gameEntity.m2580m(), false);
        C0336c.m2522a(parcel, 13, gameEntity.m2581n());
        C0336c.m2522a(parcel, 14, gameEntity.m2582o());
        C0336c.m2522a(parcel, 15, gameEntity.m2583p());
        C0336c.m2522a(parcel, 1000, gameEntity.m2584q());
        C0336c.m2518a(parcel, a);
    }

    public GameEntity m2609a(Parcel parcel) {
        int b = C0334a.m2489b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean z = false;
        boolean z2 = false;
        String str7 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str2 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    str3 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    str4 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str5 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    str6 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    uri = (Uri) C0334a.m2486a(parcel, a, Uri.CREATOR);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    uri2 = (Uri) C0334a.m2486a(parcel, a, Uri.CREATOR);
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    uri3 = (Uri) C0334a.m2486a(parcel, a, Uri.CREATOR);
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiZoomGestures /*11*/:
                    z2 = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_useViewLifecycle /*12*/:
                    str7 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_zOrderOnTop /*13*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case 14:
                    i3 = C0334a.m2496f(parcel, a);
                    break;
                case 15:
                    i4 = C0334a.m2496f(parcel, a);
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
            return new GameEntity(i, str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i2, i3, i4);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public GameEntity[] m2610a(int i) {
        return new GameEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2609a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2610a(i);
    }
}
