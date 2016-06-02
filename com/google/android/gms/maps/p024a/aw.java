package com.google.android.gms.maps.p024a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p025a.C0461m;

/* renamed from: com.google.android.gms.maps.a.aw */
class aw implements au {
    private IBinder f2030a;

    aw(IBinder iBinder) {
        this.f2030a = iBinder;
    }

    public boolean m3905a(C0461m c0461m) {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            obtain.writeStrongBinder(c0461m != null ? c0461m.asBinder() : null);
            this.f2030a.transact(1, obtain, obtain2, 0);
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
        return this.f2030a;
    }
}
