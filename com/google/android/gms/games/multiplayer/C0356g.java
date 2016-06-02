package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.games.PlayerEntity;

/* renamed from: com.google.android.gms.games.multiplayer.g */
public class C0356g implements Creator {
    static void m2711a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2528a(parcel, 1, participantEntity.m2694i(), false);
        C0336c.m2522a(parcel, 1000, participantEntity.m2696k());
        C0336c.m2528a(parcel, 2, participantEntity.m2691f(), false);
        C0336c.m2527a(parcel, 3, participantEntity.m2692g(), i, false);
        C0336c.m2527a(parcel, 4, participantEntity.m2693h(), i, false);
        C0336c.m2522a(parcel, 5, participantEntity.m2687b());
        C0336c.m2528a(parcel, 6, participantEntity.m2688c(), false);
        C0336c.m2531a(parcel, 7, participantEntity.m2690e());
        C0336c.m2527a(parcel, 8, participantEntity.m2695j(), i, false);
        C0336c.m2522a(parcel, 9, participantEntity.m2689d());
        C0336c.m2518a(parcel, a);
    }

    public ParticipantEntity m2712a(Parcel parcel) {
        int i = 0;
        PlayerEntity playerEntity = null;
        int b = C0334a.m2489b(parcel);
        boolean z = false;
        String str = null;
        int i2 = 0;
        Uri uri = null;
        Uri uri2 = null;
        String str2 = null;
        String str3 = null;
        int i3 = 0;
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
                    uri2 = (Uri) C0334a.m2486a(parcel, a, Uri.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    uri = (Uri) C0334a.m2486a(parcel, a, Uri.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    z = C0334a.m2493c(parcel, a);
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    playerEntity = (PlayerEntity) C0334a.m2486a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
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
            return new ParticipantEntity(i3, str3, str2, uri2, uri, i2, str, z, playerEntity, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public ParticipantEntity[] m2713a(int i) {
        return new ParticipantEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2712a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2713a(i);
    }
}
