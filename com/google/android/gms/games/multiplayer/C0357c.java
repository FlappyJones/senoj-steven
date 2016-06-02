package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C0339j;
import com.google.android.gms.internal.av;

/* renamed from: com.google.android.gms.games.multiplayer.c */
final class C0357c extends C0356g {
    C0357c() {
    }

    public ParticipantEntity m2714a(Parcel parcel) {
        int i = 0;
        if (av.m2561b(C0339j.m2559u()) || C0339j.m2557b(ParticipantEntity.class.getCanonicalName())) {
            return super.m2712a(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Uri parse = readString3 == null ? null : Uri.parse(readString3);
        String readString4 = parcel.readString();
        Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
        int readInt = parcel.readInt();
        String readString5 = parcel.readString();
        boolean z = parcel.readInt() > 0;
        if (parcel.readInt() > 0) {
            i = 1;
        }
        return new ParticipantEntity(1, readString, readString2, parse, parse2, readInt, readString5, z, i != 0 ? (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2714a(parcel);
    }
}
