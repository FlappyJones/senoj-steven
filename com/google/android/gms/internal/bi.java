package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class bi implements SafeParcelable {
    public static final ap CREATOR;
    private final int f1733a;
    private final String f1734b;
    private final long f1735c;
    private final short f1736d;
    private final double f1737e;
    private final double f1738f;
    private final float f1739g;
    private final int f1740h;

    static {
        CREATOR = new ap();
    }

    public bi(int i, String str, int i2, short s, double d, double d2, float f, long j) {
        m3278a(str);
        m3277a(f);
        m3276a(d, d2);
        int a = m3275a(i2);
        this.f1733a = i;
        this.f1736d = s;
        this.f1734b = str;
        this.f1737e = d;
        this.f1738f = d2;
        this.f1739g = f;
        this.f1735c = j;
        this.f1740h = a;
    }

    private static int m3275a(int i) {
        int i2 = i & 3;
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException("No supported transition specified: " + i);
    }

    private static void m3276a(double d, double d2) {
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
    }

    private static void m3277a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
    }

    private static void m3278a(String str) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + str);
        }
    }

    private static String m3279b(int i) {
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return "CIRCLE";
            default:
                return null;
        }
    }

    public int m3280a() {
        return this.f1733a;
    }

    public short m3281b() {
        return this.f1736d;
    }

    public double m3282c() {
        return this.f1737e;
    }

    public double m3283d() {
        return this.f1738f;
    }

    public int describeContents() {
        ap apVar = CREATOR;
        return 0;
    }

    public float m3284e() {
        return this.f1739g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return this.f1739g != biVar.f1739g ? false : this.f1737e != biVar.f1737e ? false : this.f1738f != biVar.f1738f ? false : this.f1736d == biVar.f1736d;
    }

    public String m3285f() {
        return this.f1734b;
    }

    public long m3286g() {
        return this.f1735c;
    }

    public int m3287h() {
        return this.f1740h;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f1737e);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f1738f);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f1739g)) * 31) + this.f1736d) * 31) + this.f1740h;
    }

    public String toString() {
        return String.format("Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, @%d]", new Object[]{m3279b(this.f1736d), this.f1734b, Integer.valueOf(this.f1740h), Double.valueOf(this.f1737e), Double.valueOf(this.f1738f), Float.valueOf(this.f1739g), Long.valueOf(this.f1735c)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ap apVar = CREATOR;
        ap.m3102a(this, parcel, i);
    }
}
