package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ActivityRecognitionResult implements SafeParcelable {
    public static final C0415a CREATOR;
    List f1995a;
    long f1996b;
    long f1997c;
    private final int f1998d;

    static {
        CREATOR = new C0415a();
    }

    public ActivityRecognitionResult(int i, List list, long j, long j2) {
        this.f1998d = 1;
        this.f1995a = list;
        this.f1996b = j;
        this.f1997c = j2;
    }

    public int m3822a() {
        return this.f1998d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.f1995a + ", timeMillis=" + this.f1996b + ", elapsedRealtimeMillis=" + this.f1997c + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0415a.m3828a(this, parcel, i);
    }
}
