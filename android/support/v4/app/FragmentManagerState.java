package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState implements Parcelable {
    public static final Creator CREATOR;
    FragmentState[] f67a;
    int[] f68b;
    BackStackState[] f69c;

    static {
        CREATOR = new C0024r();
    }

    public FragmentManagerState(Parcel parcel) {
        this.f67a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f68b = parcel.createIntArray();
        this.f69c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f67a, i);
        parcel.writeIntArray(this.f68b);
        parcel.writeTypedArray(this.f69c, i);
    }
}
