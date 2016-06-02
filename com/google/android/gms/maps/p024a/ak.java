package com.google.android.gms.maps.p024a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p025a.C0461m;

/* renamed from: com.google.android.gms.maps.a.ak */
class ak implements ai {
    private IBinder f2026a;

    ak(IBinder iBinder) {
        this.f2026a = iBinder;
    }

    public void m3893a(C0461m c0461m) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            obtain.writeStrongBinder(c0461m != null ? c0461m.asBinder() : null);
            this.f2026a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2026a;
    }
}
