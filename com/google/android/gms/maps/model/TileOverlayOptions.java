package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.p025a.C0470v;
import com.google.android.gms.maps.model.p025a.C0471w;
import com.google.android.gms.maps.p024a.bk;

public final class TileOverlayOptions implements SafeParcelable {
    public static final C0487n CREATOR;
    private final int f2117a;
    private C0470v f2118b;
    private C0485o f2119c;
    private boolean f2120d;
    private float f2121e;

    static {
        CREATOR = new C0487n();
    }

    public TileOverlayOptions() {
        this.f2120d = true;
        this.f2117a = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f) {
        this.f2120d = true;
        this.f2117a = i;
        this.f2118b = C0471w.m4415a(iBinder);
        this.f2119c = this.f2118b == null ? null : new C0486m(this);
        this.f2120d = z;
        this.f2121e = f;
    }

    int m4174a() {
        return this.f2117a;
    }

    IBinder m4175b() {
        return this.f2118b.asBinder();
    }

    public float m4176c() {
        return this.f2121e;
    }

    public boolean m4177d() {
        return this.f2120d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.m3931a()) {
            C0498z.m4466a(this, parcel, i);
        } else {
            C0487n.m4451a(this, parcel, i);
        }
    }
}
