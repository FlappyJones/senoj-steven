package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.data.C0324d;

public abstract class ar extends Binder implements aq {
    public static aq m3122a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof aq)) ? new as(iBinder) : (aq) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        cq cqVar = null;
        C0324d a;
        int readInt;
        Bundle bundle;
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                m3107a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                m3108a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                m3118a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                if (parcel.readInt() != 0) {
                    a = C0324d.CREATOR.m2437a(parcel);
                }
                m3116a(a, parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                ak a2;
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                readInt = parcel.readInt();
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    a2 = ak.CREATOR.m3715a(parcel);
                }
                m3109a(readInt, bundle, a2);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiCompass /*6*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                if (parcel.readInt() != 0) {
                    a = C0324d.CREATOR.m2437a(parcel);
                }
                m3117a(a, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                m3105a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                if (parcel.readInt() != 0) {
                    a = C0324d.CREATOR.m2437a(parcel);
                }
                m3121b(a, parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                m3120b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                Bundle bundle2;
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                m3114a(readInt, bundle2, parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                bv a3;
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                readInt = parcel.readInt();
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    a3 = bv.CREATOR.m3270a(parcel);
                }
                m3113a(readInt, bundle, readString, a3);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_useViewLifecycle /*12*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                m3119b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_zOrderOnTop /*13*/:
                co a4;
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                readInt = parcel.readInt();
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    a4 = co.CREATOR.m3333a(parcel);
                }
                m3110a(readInt, bundle, a4);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                readInt = parcel.readInt();
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    cqVar = cq.CREATOR.m3390a(parcel);
                }
                m3111a(readInt, bundle, cqVar);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                m3112a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                m3115a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(C0413x.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                m3106a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
