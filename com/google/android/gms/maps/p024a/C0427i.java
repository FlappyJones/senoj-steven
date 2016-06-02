package com.google.android.gms.maps.p024a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.maps.a.i */
class C0427i implements C0425g {
    private IBinder f2040a;

    C0427i(IBinder iBinder) {
        this.f2040a = iBinder;
    }

    public void m4025a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            this.f2040a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m4026a(al alVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            obtain.writeStrongBinder(alVar != null ? alVar.asBinder() : null);
            this.f2040a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2040a;
    }
}
