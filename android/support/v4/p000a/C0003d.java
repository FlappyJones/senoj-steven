package android.support.v4.p000a;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: android.support.v4.a.d */
class C0003d implements ClassLoaderCreator {
    private final C0002c f1a;

    public C0003d(C0002c c0002c) {
        this.f1a = c0002c;
    }

    public Object createFromParcel(Parcel parcel) {
        return this.f1a.m1a(parcel, null);
    }

    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f1a.m1a(parcel, classLoader);
    }

    public Object[] newArray(int i) {
        return this.f1a.m2a(i);
    }
}
