package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState implements Parcelable {
    public static final Creator CREATOR;
    final String f70a;
    final int f71b;
    final boolean f72c;
    final int f73d;
    final int f74e;
    final String f75f;
    final boolean f76g;
    final boolean f77h;
    final Bundle f78i;
    Bundle f79j;
    Fragment f80k;

    static {
        CREATOR = new C0025s();
    }

    public FragmentState(Parcel parcel) {
        boolean z = true;
        this.f70a = parcel.readString();
        this.f71b = parcel.readInt();
        this.f72c = parcel.readInt() != 0;
        this.f73d = parcel.readInt();
        this.f74e = parcel.readInt();
        this.f75f = parcel.readString();
        this.f76g = parcel.readInt() != 0;
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f77h = z;
        this.f78i = parcel.readBundle();
        this.f79j = parcel.readBundle();
    }

    public FragmentState(Fragment fragment) {
        this.f70a = fragment.getClass().getName();
        this.f71b = fragment.f33f;
        this.f72c = fragment.f42o;
        this.f73d = fragment.f50w;
        this.f74e = fragment.f51x;
        this.f75f = fragment.f52y;
        this.f76g = fragment.f14B;
        this.f77h = fragment.f13A;
        this.f78i = fragment.f35h;
    }

    public Fragment m71a(FragmentActivity fragmentActivity, Fragment fragment) {
        if (this.f80k != null) {
            return this.f80k;
        }
        if (this.f78i != null) {
            this.f78i.setClassLoader(fragmentActivity.getClassLoader());
        }
        this.f80k = Fragment.m6a((Context) fragmentActivity, this.f70a, this.f78i);
        if (this.f79j != null) {
            this.f79j.setClassLoader(fragmentActivity.getClassLoader());
            this.f80k.f31d = this.f79j;
        }
        this.f80k.m11a(this.f71b, fragment);
        this.f80k.f42o = this.f72c;
        this.f80k.f44q = true;
        this.f80k.f50w = this.f73d;
        this.f80k.f51x = this.f74e;
        this.f80k.f52y = this.f75f;
        this.f80k.f14B = this.f76g;
        this.f80k.f13A = this.f77h;
        this.f80k.f46s = fragmentActivity.f55b;
        if (C0021o.f144a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f80k);
        }
        return this.f80k;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.f70a);
        parcel.writeInt(this.f71b);
        parcel.writeInt(this.f72c ? 1 : 0);
        parcel.writeInt(this.f73d);
        parcel.writeInt(this.f74e);
        parcel.writeString(this.f75f);
        parcel.writeInt(this.f76g ? 1 : 0);
        if (!this.f77h) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.f78i);
        parcel.writeBundle(this.f79j);
    }
}
