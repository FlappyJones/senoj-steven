package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p019b.C0309e;
import com.google.android.gms.p019b.C0310f;

class aw implements at {
    private IBinder f1711a;

    aw(IBinder iBinder) {
        this.f1711a = iBinder;
    }

    public C0309e m3143a(C0309e c0309e, int i, int i2, String str, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            obtain.writeStrongBinder(c0309e != null ? c0309e.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            obtain.writeInt(i3);
            this.f1711a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            C0309e a = C0310f.m2398a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public C0309e m3144a(C0309e c0309e, int i, int i2, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            obtain.writeStrongBinder(c0309e != null ? c0309e.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f1711a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0309e a = C0310f.m2398a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1711a;
    }
}
