package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.x */
public final class C0413x implements SafeParcelable {
    public static final ds CREATOR;
    private final int f1986a;
    private final int f1987b;
    private final int f1988c;
    private final String f1989d;
    private final String f1990e;
    private final String f1991f;
    private final String f1992g;

    static {
        CREATOR = new ds();
    }

    public C0413x(int i, int i2, int i3, String str, String str2, String str3, String str4) {
        this.f1986a = i;
        this.f1987b = i2;
        this.f1988c = i3;
        this.f1989d = str;
        this.f1990e = str2;
        this.f1991f = str3;
        this.f1992g = str4;
    }

    public int m3809a() {
        return this.f1986a;
    }

    public int m3810b() {
        return this.f1987b;
    }

    public int m3811c() {
        return this.f1988c;
    }

    public String m3812d() {
        return this.f1989d;
    }

    public int describeContents() {
        return 0;
    }

    public String m3813e() {
        return this.f1990e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0413x)) {
            return false;
        }
        C0413x c0413x = (C0413x) obj;
        return this.f1986a == c0413x.f1986a && this.f1987b == c0413x.f1987b && this.f1988c == c0413x.f1988c && dl.m3685a(this.f1989d, c0413x.f1989d) && dl.m3685a(this.f1990e, c0413x.f1990e);
    }

    public String m3814f() {
        return this.f1991f;
    }

    public String m3815g() {
        return this.f1992g;
    }

    public boolean m3816h() {
        return this.f1987b == 1 && this.f1988c == -1;
    }

    public int hashCode() {
        return dl.m3683a(Integer.valueOf(this.f1986a), Integer.valueOf(this.f1987b), Integer.valueOf(this.f1988c), this.f1989d, this.f1990e);
    }

    public boolean m3817i() {
        return this.f1987b == 2;
    }

    public String toString() {
        if (m3817i()) {
            return String.format("Person [%s] %s", new Object[]{m3813e(), m3814f()});
        } else if (m3816h()) {
            return String.format("Circle [%s] %s", new Object[]{m3812d(), m3814f()});
        } else {
            return String.format("Group [%s] %s", new Object[]{m3812d(), m3814f()});
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        ds.m3699a(this, parcel, i);
    }
}
