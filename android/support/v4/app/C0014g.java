package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment.SavedState;

/* renamed from: android.support.v4.app.g */
final class C0014g implements Creator {
    C0014g() {
    }

    public SavedState m104a(Parcel parcel) {
        return new SavedState(parcel, null);
    }

    public SavedState[] m105a(int i) {
        return new SavedState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m104a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m105a(i);
    }
}
