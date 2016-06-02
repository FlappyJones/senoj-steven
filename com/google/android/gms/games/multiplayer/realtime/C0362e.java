package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.e */
public class C0362e implements Creator {
    static void m2766a(RoomEntity roomEntity, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2528a(parcel, 1, roomEntity.m2741b(), false);
        C0336c.m2522a(parcel, 1000, roomEntity.m2750k());
        C0336c.m2528a(parcel, 2, roomEntity.m2742c(), false);
        C0336c.m2523a(parcel, 3, roomEntity.m2743d());
        C0336c.m2522a(parcel, 4, roomEntity.m2744e());
        C0336c.m2528a(parcel, 5, roomEntity.m2745f(), false);
        C0336c.m2522a(parcel, 6, roomEntity.m2746g());
        C0336c.m2524a(parcel, 7, roomEntity.m2747h(), false);
        C0336c.m2538b(parcel, 8, roomEntity.m2748i(), false);
        C0336c.m2522a(parcel, 9, roomEntity.m2749j());
        C0336c.m2518a(parcel, a);
    }

    public RoomEntity m2767a(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int b = C0334a.m2489b(parcel);
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    str3 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str2 = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    j = C0334a.m2497g(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    i3 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    bundle = C0334a.m2504n(parcel, a);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    arrayList = C0334a.m2492c(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    i = C0334a.m2496f(parcel, a);
                    break;
                case 1000:
                    i4 = C0334a.m2496f(parcel, a);
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RoomEntity(i4, str3, str2, j, i3, str, i2, bundle, arrayList, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public RoomEntity[] m2768a(int i) {
        return new RoomEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2767a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2768a(i);
    }
}
