package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.z */
public class C0414z implements SafeParcelable {
    public static final C0364a CREATOR;
    private final int f1993a;
    private final ab f1994b;

    static {
        CREATOR = new C0364a();
    }

    C0414z(int i, ab abVar) {
        this.f1993a = i;
        this.f1994b = abVar;
    }

    private C0414z(ab abVar) {
        this.f1993a = 1;
        this.f1994b = abVar;
    }

    public static C0414z m3818a(C0367d c0367d) {
        if (c0367d instanceof ab) {
            return new C0414z((ab) c0367d);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    int m3819a() {
        return this.f1993a;
    }

    ab m3820b() {
        return this.f1994b;
    }

    public C0367d m3821c() {
        if (this.f1994b != null) {
            return this.f1994b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public int describeContents() {
        C0364a c0364a = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0364a c0364a = CREATOR;
        C0364a.m2770a(this, parcel, i);
    }
}
