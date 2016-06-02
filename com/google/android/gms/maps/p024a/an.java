package com.google.android.gms.maps.p024a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p019b.C0309e;

/* renamed from: com.google.android.gms.maps.a.an */
class an implements al {
    private IBinder f2027a;

    an(IBinder iBinder) {
        this.f2027a = iBinder;
    }

    public void m3896a(C0309e c0309e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            obtain.writeStrongBinder(c0309e != null ? c0309e.asBinder() : null);
            this.f2027a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2027a;
    }
}
