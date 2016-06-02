package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.C0339j;
import com.google.android.gms.internal.av;

/* renamed from: com.google.android.gms.games.a */
final class C0344a extends C0343h {
    C0344a() {
    }

    public GameEntity m2611a(Parcel parcel) {
        if (av.m2561b(C0339j.m2559u()) || C0339j.m2557b(GameEntity.class.getCanonicalName())) {
            return super.m2609a(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        Uri parse = readString7 == null ? null : Uri.parse(readString7);
        readString7 = parcel.readString();
        Uri parse2 = readString7 == null ? null : Uri.parse(readString7);
        readString7 = parcel.readString();
        return new GameEntity(1, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString7 == null ? null : Uri.parse(readString7), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2611a(parcel);
    }
}
