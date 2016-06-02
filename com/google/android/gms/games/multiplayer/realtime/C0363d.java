package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.C0339j;
import com.google.android.gms.internal.av;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.d */
final class C0363d extends C0362e {
    C0363d() {
    }

    public RoomEntity m2769a(Parcel parcel) {
        if (av.m2561b(C0339j.m2559u()) || C0339j.m2557b(RoomEntity.class.getCanonicalName())) {
            return super.m2767a(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        String readString3 = parcel.readString();
        int readInt2 = parcel.readInt();
        Bundle readBundle = parcel.readBundle();
        int readInt3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2769a(parcel);
    }
}
