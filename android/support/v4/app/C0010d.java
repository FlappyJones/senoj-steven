package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.d */
final class C0010d implements Creator {
    C0010d() {
    }

    public BackStackState m100a(Parcel parcel) {
        return new BackStackState(parcel);
    }

    public BackStackState[] m101a(int i) {
        return new BackStackState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m100a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m101a(i);
    }
}
