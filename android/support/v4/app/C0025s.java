package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.s */
final class C0025s implements Creator {
    C0025s() {
    }

    public FragmentState m173a(Parcel parcel) {
        return new FragmentState(parcel);
    }

    public FragmentState[] m174a(int i) {
        return new FragmentState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m173a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m174a(i);
    }
}
