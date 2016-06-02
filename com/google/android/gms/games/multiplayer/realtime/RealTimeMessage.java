package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.C0394do;

public final class RealTimeMessage implements Parcelable {
    public static final Creator CREATOR;
    private final String f1647a;
    private final byte[] f1648b;
    private final int f1649c;

    static {
        CREATOR = new C0359a();
    }

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public RealTimeMessage(String str, byte[] bArr, int i) {
        this.f1647a = (String) C0394do.m3687a((Object) str);
        this.f1648b = (byte[]) ((byte[]) C0394do.m3687a((Object) bArr)).clone();
        this.f1649c = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1647a);
        parcel.writeByteArray(this.f1648b);
        parcel.writeInt(this.f1649c);
    }
}
