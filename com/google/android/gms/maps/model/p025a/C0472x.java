package com.google.android.gms.maps.model.p025a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

/* renamed from: com.google.android.gms.maps.model.a.x */
class C0472x implements C0470v {
    private IBinder f2135a;

    C0472x(IBinder iBinder) {
        this.f2135a = iBinder;
    }

    public Tile m4416a(int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f2135a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            Tile a = obtain2.readInt() != 0 ? Tile.CREATOR.m4449a(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2135a;
    }
}
