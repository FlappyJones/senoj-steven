package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;

public final class LocationRequest implements SafeParcelable {
    public static final C0417c CREATOR;
    int f2002a;
    long f2003b;
    long f2004c;
    boolean f2005d;
    long f2006e;
    int f2007f;
    float f2008g;
    private final int f2009h;

    static {
        CREATOR = new C0417c();
    }

    public LocationRequest() {
        this.f2009h = 1;
        this.f2002a = 102;
        this.f2003b = 3600000;
        this.f2004c = 600000;
        this.f2005d = false;
        this.f2006e = Long.MAX_VALUE;
        this.f2007f = Integer.MAX_VALUE;
        this.f2008g = 0.0f;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f) {
        this.f2009h = i;
        this.f2002a = i2;
        this.f2003b = j;
        this.f2004c = j2;
        this.f2005d = z;
        this.f2006e = j3;
        this.f2007f = i3;
        this.f2008g = f;
    }

    public static String m3826a(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    int m3827a() {
        return this.f2009h;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f2002a == locationRequest.f2002a && this.f2003b == locationRequest.f2003b && this.f2004c == locationRequest.f2004c && this.f2005d == locationRequest.f2005d && this.f2006e == locationRequest.f2006e && this.f2007f == locationRequest.f2007f && this.f2008g == locationRequest.f2008g;
    }

    public int hashCode() {
        return dl.m3683a(Integer.valueOf(this.f2002a), Long.valueOf(this.f2003b), Long.valueOf(this.f2004c), Boolean.valueOf(this.f2005d), Long.valueOf(this.f2006e), Integer.valueOf(this.f2007f), Float.valueOf(this.f2008g));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[").append(m3826a(this.f2002a));
        if (this.f2002a != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.f2003b + "ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.f2004c + "ms");
        if (this.f2006e != Long.MAX_VALUE) {
            long elapsedRealtime = this.f2006e - SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(elapsedRealtime + "ms");
        }
        if (this.f2007f != Integer.MAX_VALUE) {
            stringBuilder.append(" num=").append(this.f2007f);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0417c.m3834a(this, parcel, i);
    }
}
