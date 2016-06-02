package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0338e;
import java.util.List;

public abstract class bb extends Binder implements ba {
    public static ba m3193a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ba)) ? new bc(iBinder) : (ba) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        Uri uri = null;
        aq a;
        int readInt;
        String readString;
        String readString2;
        aq a2;
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3165a(ar.m3122a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3168a(ar.m3122a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3183b(ar.m3122a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3156a(parcel.readInt() != 0 ? ak.CREATOR.m3715a(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                String a3 = m3155a();
                parcel2.writeNoException();
                parcel2.writeString(a3);
                return true;
            case C0338e.MapAttrs_uiCompass /*6*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3181b();
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3185c(ar.m3122a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3157a(ar.m3122a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3163a(ar.m3122a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3187d(ar.m3122a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3180a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_useViewLifecycle /*12*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3169a(ar.m3122a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_zOrderOnTop /*13*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3182b(ar.m3122a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.m3122a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                m3162a(a, readInt, readString, uri, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3158a(ar.m3122a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3179a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3188e(ar.m3122a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3184c(ar.m3122a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3160a(ar.m3122a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.m3122a(parcel.readStrongBinder());
                readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                m3175a(a, readString2, z);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                aq a4 = ar.m3122a(parcel.readStrongBinder());
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                m3178a(a4, z2, z);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3173a(ar.m3122a(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3189f(ar.m3122a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 25:
                bv a5;
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a2 = ar.m3122a(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    a5 = bv.CREATOR.m3270a(parcel);
                }
                m3167a(a2, readString3, a5);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3190g(ar.m3122a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.m3122a(parcel.readStrongBinder());
                readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                m3176a(a, readString2, z, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3171a(ar.m3122a(parcel.readStrongBinder()), parcel.readString(), parcel.createTypedArrayList(C0413x.CREATOR));
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.m3122a(parcel.readStrongBinder());
                readString2 = parcel.readString();
                List createTypedArrayList = parcel.createTypedArrayList(C0413x.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                m3174a(a, readString2, createTypedArrayList, z);
                parcel2.writeNoException();
                return true;
            case 30:
                co a6;
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a2 = ar.m3122a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    a6 = co.CREATOR.m3333a(parcel);
                }
                m3164a(a2, a6);
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3172a(ar.m3122a(parcel.readStrongBinder()), parcel.readString(), parcel.createTypedArrayList(C0413x.CREATOR), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.m3122a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                m3161a(a, readInt, readString, uri, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3191h(ar.m3122a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3177a(ar.m3122a(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3192i(ar.m3122a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3166a(ar.m3122a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3170a(ar.m3122a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3186d(ar.m3122a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                m3159a(ar.m3122a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.plus.internal.IPlusService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
