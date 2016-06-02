package com.google.android.gms.maps.p024a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.maps.a.bc */
class bc implements ba {
    private IBinder f2032a;

    bc(IBinder iBinder) {
        this.f2032a = iBinder;
    }

    public boolean m3916a() {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            this.f2032a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2032a;
    }
}
