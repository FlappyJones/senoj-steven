package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.widget.x */
final class C0125x implements Creator {
    C0125x() {
    }

    public SavedState m1090a(Parcel parcel) {
        return new SavedState(null);
    }

    public SavedState[] m1091a(int i) {
        return new SavedState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m1090a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m1091a(i);
    }
}
