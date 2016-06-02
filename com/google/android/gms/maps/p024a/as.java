package com.google.android.gms.maps.p024a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0338e;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.a.as */
public abstract class as extends Binder implements ar {
    public static ar m3901a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ar)) ? new at(iBinder) : (ar) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                m3900a(parcel.readInt() != 0 ? LatLng.CREATOR.m4437a(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
