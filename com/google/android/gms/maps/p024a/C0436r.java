package com.google.android.gms.maps.p024a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.p019b.C0309e;
import com.google.android.gms.p019b.C0310f;

/* renamed from: com.google.android.gms.maps.a.r */
class C0436r implements C0434p {
    private IBinder f2043a;

    C0436r(IBinder iBinder) {
        this.f2043a = iBinder;
    }

    public C0309e m4071a(LatLng latLng) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2043a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0309e a = C0310f.m2398a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public LatLng m4072a(C0309e c0309e) {
        LatLng latLng = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            obtain.writeStrongBinder(c0309e != null ? c0309e.asBinder() : null);
            this.f2043a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                latLng = LatLng.CREATOR.m4437a(obtain2);
            }
            obtain2.recycle();
            obtain.recycle();
            return latLng;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public VisibleRegion m4073a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            this.f2043a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            VisibleRegion a = obtain2.readInt() != 0 ? VisibleRegion.CREATOR.m4455a(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2043a;
    }
}
