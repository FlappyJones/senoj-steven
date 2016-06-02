package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p019b.C0309e;
import com.google.android.gms.p019b.C0310f;

class dk implements di {
    private IBinder f1966a;

    dk(IBinder iBinder) {
        this.f1966a = iBinder;
    }

    public C0309e m3682a(C0309e c0309e, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            obtain.writeStrongBinder(c0309e != null ? c0309e.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f1966a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            C0309e a = C0310f.m2398a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1966a;
    }
}
