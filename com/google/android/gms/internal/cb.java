package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.C0324d;

public abstract class cb extends Binder implements ca {
    public static ca m3414a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ca)) ? new cd(iBinder) : (ca) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C0324d c0324d = null;
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m3412a(readInt, c0324d);
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m3413a(c0324d);
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                m3411a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                m3409a();
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                m3410a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
