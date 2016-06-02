package com.google.android.gms.maps.model.p025a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0338e;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.model.a.h */
public abstract class C0456h extends Binder implements C0455g {
    public static C0455g m4245a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0455g)) ? new C0457i(iBinder) : (C0455g) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        float e;
        boolean i4;
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                m4227a();
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                String b = m4234b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                m4231a(parcel.readInt() != 0 ? LatLng.CREATOR.m4437a(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                LatLng c = m4237c();
                parcel2.writeNoException();
                if (c != null) {
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                m4228a(parcel.readDouble());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiCompass /*6*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                double d = m4238d();
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                m4229a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                e = m4239e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                m4230a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i3 = m4240f();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                m4236b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_useViewLifecycle /*12*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i3 = m4241g();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case C0338e.MapAttrs_zOrderOnTop /*13*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                m4235b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                e = m4242h();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 15:
                boolean z;
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                m4232a(z);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i4 = m4243i();
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i4 = m4233a(C0456h.m4245a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i3 = m4244j();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
