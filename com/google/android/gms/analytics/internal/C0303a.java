package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.analytics.internal.a */
final class C0303a implements Creator {
    C0303a() {
    }

    public Command m2388a(Parcel parcel) {
        return new Command(parcel);
    }

    public Command[] m2389a(int i) {
        return new Command[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2388a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2389a(i);
    }
}
