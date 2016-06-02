package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.C0339j;
import com.google.android.gms.internal.av;

/* renamed from: com.google.android.gms.games.g */
final class C0351g extends C0350i {
    C0351g() {
    }

    public PlayerEntity m2647a(Parcel parcel) {
        Uri uri = null;
        if (av.m2561b(C0339j.m2559u()) || C0339j.m2557b(PlayerEntity.class.getCanonicalName())) {
            return super.m2645a(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        Uri parse = readString3 == null ? null : Uri.parse(readString3);
        if (readString4 != null) {
            uri = Uri.parse(readString4);
        }
        return new PlayerEntity(1, readString, readString2, parse, uri, parcel.readLong());
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2647a(parcel);
    }
}
