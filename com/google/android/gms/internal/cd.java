package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.C0324d;

class cd implements ca {
    private IBinder f1893a;

    cd(IBinder iBinder) {
        this.f1893a = iBinder;
    }

    public void m3562a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            this.f1893a.transact(5004, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3563a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            obtain.writeInt(i);
            this.f1893a.transact(5005, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3564a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f1893a.transact(5003, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3565a(int i, C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            obtain.writeInt(i);
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1893a.transact(5001, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3566a(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1893a.transact(5002, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1893a;
    }
}
