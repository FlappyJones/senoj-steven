package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.u */
final class C0027u implements Creator {
    C0027u() {
    }

    public SavedState m175a(Parcel parcel) {
        return new SavedState(null);
    }

    public SavedState[] m176a(int i) {
        return new SavedState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m175a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m176a(i);
    }
}
