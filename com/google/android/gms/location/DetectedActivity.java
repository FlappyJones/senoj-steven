package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity implements SafeParcelable {
    public static final C0416b CREATOR;
    int f1999a;
    int f2000b;
    private final int f2001c;

    static {
        CREATOR = new C0416b();
    }

    public DetectedActivity(int i, int i2, int i3) {
        this.f2001c = i;
        this.f1999a = i2;
        this.f2000b = i3;
    }

    private int m3823a(int i) {
        return i > 5 ? 4 : i;
    }

    public int m3824a() {
        return m3823a(this.f1999a);
    }

    public int m3825b() {
        return this.f2001c;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DetectedActivity [type=" + m3824a() + ", confidence=" + this.f2000b + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0416b.m3831a(this, parcel, i);
    }
}
