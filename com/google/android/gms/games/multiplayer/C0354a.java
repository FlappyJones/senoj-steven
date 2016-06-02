package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.C0339j;
import com.google.android.gms.internal.av;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.a */
final class C0354a extends C0353f {
    C0354a() {
    }

    public InvitationEntity m2701a(Parcel parcel) {
        if (av.m2561b(C0339j.m2559u()) || C0339j.m2557b(InvitationEntity.class.getCanonicalName())) {
            return super.m2699a(parcel);
        }
        GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
        String readString = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
        int readInt2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt2);
        for (int i = 0; i < readInt2; i++) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new InvitationEntity(1, gameEntity, readString, readLong, readInt, participantEntity, arrayList, -1);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2701a(parcel);
    }
}
