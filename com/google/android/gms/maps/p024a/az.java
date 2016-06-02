package com.google.android.gms.maps.p024a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p025a.C0461m;

/* renamed from: com.google.android.gms.maps.a.az */
class az implements ax {
    private IBinder f2031a;

    az(IBinder iBinder) {
        this.f2031a = iBinder;
    }

    public void m3910a(C0461m c0461m) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            obtain.writeStrongBinder(c0461m != null ? c0461m.asBinder() : null);
            this.f2031a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2031a;
    }

    public void m3911b(C0461m c0461m) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            obtain.writeStrongBinder(c0461m != null ? c0461m.asBinder() : null);
            this.f2031a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3912c(C0461m c0461m) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            obtain.writeStrongBinder(c0461m != null ? c0461m.asBinder() : null);
            this.f2031a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
