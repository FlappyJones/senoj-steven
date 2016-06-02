package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.widget.DrawerLayout.SavedState;

/* renamed from: android.support.v4.widget.e */
final class C0106e implements Creator {
    C0106e() {
    }

    public SavedState m977a(Parcel parcel) {
        return new SavedState(parcel);
    }

    public SavedState[] m978a(int i) {
        return new SavedState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m977a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m978a(i);
    }
}
