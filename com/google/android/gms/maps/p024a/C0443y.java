package com.google.android.gms.maps.p024a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.maps.a.y */
class C0443y implements C0441w {
    private IBinder f2045a;

    C0443y(IBinder iBinder) {
        this.f2045a = iBinder;
    }

    public void m4110a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
            this.f2045a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2045a;
    }

    public void m4111b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
            this.f2045a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
