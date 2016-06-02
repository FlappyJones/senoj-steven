package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.f */
public class C0353f implements Creator {
    static void m2698a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        C0336c.m2527a(parcel, 1, invitationEntity.m2662b(), i, false);
        C0336c.m2522a(parcel, 1000, invitationEntity.m2668h());
        C0336c.m2528a(parcel, 2, invitationEntity.m2663c(), false);
        C0336c.m2523a(parcel, 3, invitationEntity.m2665e());
        C0336c.m2522a(parcel, 4, invitationEntity.m2666f());
        C0336c.m2527a(parcel, 5, invitationEntity.m2664d(), i, false);
        C0336c.m2538b(parcel, 6, invitationEntity.m2669i(), false);
        C0336c.m2522a(parcel, 7, invitationEntity.m2667g());
        C0336c.m2518a(parcel, a);
    }

    public InvitationEntity m2699a(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int b = C0334a.m2489b(parcel);
        long j = 0;
        ParticipantEntity participantEntity = null;
        int i2 = 0;
        String str = null;
        GameEntity gameEntity = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    gameEntity = (GameEntity) C0334a.m2486a(parcel, a, GameEntity.CREATOR);
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    str = C0334a.m2502l(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    j = C0334a.m2497g(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    i2 = C0334a.m2496f(parcel, a);
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    participantEntity = (ParticipantEntity) C0334a.m2486a(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    arrayList = C0334a.m2492c(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
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
            return new InvitationEntity(i3, gameEntity, str, j, i2, participantEntity, arrayList, i);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public InvitationEntity[] m2700a(int i) {
        return new InvitationEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2699a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2700a(i);
    }
}
