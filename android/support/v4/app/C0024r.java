package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.r */
final class C0024r implements Creator {
    C0024r() {
    }

    public FragmentManagerState m171a(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    public FragmentManagerState[] m172a(int i) {
        return new FragmentManagerState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m171a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m172a(i);
    }
}
