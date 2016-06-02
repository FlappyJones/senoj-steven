package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class cg implements ce {
    private IBinder f1894a;

    cg(IBinder iBinder) {
        this.f1894a = iBinder;
    }

    public int m3577a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            this.f1894a.transact(5001, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3578a(ca caVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            this.f1894a.transact(5005, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3579a(ca caVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            obtain.writeInt(i);
            this.f1894a.transact(5004, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3580a(ca caVar, int i, String str, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            this.f1894a.transact(5006, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3581a(ca caVar, int i, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeByteArray(bArr);
            this.f1894a.transact(5003, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1894a;
    }

    public int m3582b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            this.f1894a.transact(5002, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3583b(ca caVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            this.f1894a.transact(5008, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3584b(ca caVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            obtain.writeInt(i);
            this.f1894a.transact(5007, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3585c(ca caVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            this.f1894a.transact(5009, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
