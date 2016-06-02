package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p024a.bk;

public final class Tile implements SafeParcelable {
    public static final C0484l CREATOR;
    public final int f2113a;
    public final int f2114b;
    public final byte[] f2115c;
    private final int f2116d;

    static {
        CREATOR = new C0484l();
    }

    Tile(int i, int i2, int i3, byte[] bArr) {
        this.f2116d = i;
        this.f2113a = i2;
        this.f2114b = i3;
        this.f2115c = bArr;
    }

    public Tile(int i, int i2, byte[] bArr) {
        this(1, i, i2, bArr);
    }

    int m4172a() {
        return this.f2116d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0497y.m4465a(this, parcel, i);
        } else {
            C0484l.m4448a(this, parcel, i);
        }
    }
}
