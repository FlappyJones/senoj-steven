package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.p000a.C0002c;
import android.support.v4.view.ViewPager.SavedState;

final class cf implements C0002c {
    cf() {
    }

    public /* synthetic */ Object m782a(Parcel parcel, ClassLoader classLoader) {
        return m784b(parcel, classLoader);
    }

    public /* synthetic */ Object[] m783a(int i) {
        return m785b(i);
    }

    public SavedState m784b(Parcel parcel, ClassLoader classLoader) {
        return new SavedState(parcel, classLoader);
    }

    public SavedState[] m785b(int i) {
        return new SavedState[i];
    }
}
