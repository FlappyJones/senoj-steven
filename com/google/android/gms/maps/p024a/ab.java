package com.google.android.gms.maps.p024a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.p025a.C0452d;
import com.google.android.gms.maps.model.p025a.C0453e;
import com.google.android.gms.p019b.C0309e;

/* renamed from: com.google.android.gms.maps.a.ab */
class ab implements C0419z {
    private IBinder f2023a;

    ab(IBinder iBinder) {
        this.f2023a = iBinder;
    }

    public C0418a m3877a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.f2023a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            C0418a a = C0420b.m3913a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public C0431m m3878a(C0309e c0309e, GoogleMapOptions googleMapOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0309e != null ? c0309e.asBinder() : null);
            if (googleMapOptions != null) {
                obtain.writeInt(1);
                googleMapOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2023a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            C0431m a = C0432n.m4058a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3879a(C0309e c0309e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0309e != null ? c0309e.asBinder() : null);
            this.f2023a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3880a(C0309e c0309e, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0309e != null ? c0309e.asBinder() : null);
            obtain.writeInt(i);
            this.f2023a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f2023a;
    }

    public C0428j m3881b(C0309e c0309e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0309e != null ? c0309e.asBinder() : null);
            this.f2023a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0428j a = C0429k.m4038a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public C0452d m3882b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.f2023a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            C0452d a = C0453e.m4219a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
