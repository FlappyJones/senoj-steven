package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.a */
final class C0359a implements Creator {
    C0359a() {
    }

    public RealTimeMessage m2752a(Parcel parcel) {
        return new RealTimeMessage(null);
    }

    public RealTimeMessage[] m2753a(int i) {
        return new RealTimeMessage[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2752a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2753a(i);
    }
}
