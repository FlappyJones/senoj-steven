package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class cf extends Binder implements ce {
    public static ce m3576a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ce)) ? new cg(iBinder) : (ce) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int a;
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a = m3567a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a = m3572b();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                m3571a(cb.m3414a(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                m3569a(cb.m3414a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                m3568a(cb.m3414a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                m3570a(cb.m3414a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                m3574b(cb.m3414a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                m3573b(cb.m3414a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                m3575c(cb.m3414a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
