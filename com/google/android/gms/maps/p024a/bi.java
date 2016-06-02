package com.google.android.gms.maps.p024a;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.maps.a.bi */
class bi implements bg {
    private IBinder f2034a;

    bi(IBinder iBinder) {
        this.f2034a = iBinder;
    }

    public void m3922a(Bitmap bitmap) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            if (bitmap != null) {
                obtain.writeInt(1);
                bitmap.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2034a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2034a;
    }
}
