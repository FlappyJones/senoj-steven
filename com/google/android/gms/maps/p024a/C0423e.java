package com.google.android.gms.maps.p024a;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0338e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.p025a.C0449a;
import com.google.android.gms.maps.model.p025a.C0455g;
import com.google.android.gms.maps.model.p025a.C0458j;
import com.google.android.gms.maps.model.p025a.C0461m;
import com.google.android.gms.maps.model.p025a.C0464p;
import com.google.android.gms.maps.model.p025a.C0467s;
import com.google.android.gms.p019b.C0309e;
import com.google.android.gms.p019b.C0310f;

/* renamed from: com.google.android.gms.maps.a.e */
public abstract class C0423e extends Binder implements C0422d {
    public static C0422d m3982a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0422d)) ? new C0424f(iBinder) : (C0422d) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        IBinder iBinder = null;
        float b;
        int f;
        boolean g;
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                CameraPosition a = m3943a();
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                b = m3967b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                return true;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                b = m3970c();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                return true;
            case C0338e.MapAttrs_cameraTilt /*4*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3952a(C0310f.m2398a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3968b(C0310f.m2398a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiCompass /*6*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3954a(C0310f.m2398a(parcel.readStrongBinder()), C0442x.m4109a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiRotateGestures /*7*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3953a(C0310f.m2398a(parcel.readStrongBinder()), parcel.readInt(), C0442x.m4109a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiScrollGestures /*8*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3972d();
                parcel2.writeNoException();
                return true;
            case C0338e.MapAttrs_uiTiltGestures /*9*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0449a a2 = m3944a(parcel.readInt() != 0 ? PolylineOptions.CREATOR.m4446a(parcel) : null);
                parcel2.writeNoException();
                if (a2 != null) {
                    iBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case C0338e.MapAttrs_uiZoomControls /*10*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0464p a3 = m3948a(parcel.readInt() != 0 ? PolygonOptions.CREATOR.m4443a(parcel) : null);
                parcel2.writeNoException();
                if (a3 != null) {
                    iBinder = a3.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case C0338e.MapAttrs_uiZoomGestures /*11*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0461m a4 = m3947a(parcel.readInt() != 0 ? MarkerOptions.CREATOR.m4440a(parcel) : null);
                parcel2.writeNoException();
                if (a4 != null) {
                    iBinder = a4.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case C0338e.MapAttrs_useViewLifecycle /*12*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0458j a5 = m3946a(parcel.readInt() != 0 ? GroundOverlayOptions.CREATOR.m4431a(parcel) : null);
                parcel2.writeNoException();
                if (a5 != null) {
                    iBinder = a5.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case C0338e.MapAttrs_zOrderOnTop /*13*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0467s a6 = m3949a(parcel.readInt() != 0 ? TileOverlayOptions.CREATOR.m4452a(parcel) : null);
                parcel2.writeNoException();
                if (a6 != null) {
                    iBinder = a6.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3973e();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                f = m3974f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3950a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = m3975g();
                parcel2.writeNoException();
                if (g) {
                    f = 1;
                }
                parcel2.writeInt(f);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                m3966a(z);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = m3976h();
                parcel2.writeNoException();
                if (g) {
                    f = 1;
                }
                parcel2.writeInt(f);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = m3969b(parcel.readInt() != 0);
                parcel2.writeNoException();
                if (g) {
                    f = 1;
                }
                parcel2.writeInt(f);
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = m3977i();
                parcel2.writeNoException();
                if (g) {
                    f = 1;
                }
                parcel2.writeInt(f);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                m3971c(z);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                Location j = m3978j();
                parcel2.writeNoException();
                if (j != null) {
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3965a(C0426h.m4024a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0437s k = m3979k();
                parcel2.writeNoException();
                if (k != null) {
                    iBinder = k.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0434p l = m3980l();
                parcel2.writeNoException();
                if (l != null) {
                    iBinder = l.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3956a(ag.m3889a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3958a(ap.m3898a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3959a(as.m3901a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3960a(av.m3904a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3961a(ay.m3909a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3957a(aj.m3892a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3955a(ad.m3885a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0309e m = m3981m();
                parcel2.writeNoException();
                if (m != null) {
                    iBinder = m.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0455g a7 = m3945a(parcel.readInt() != 0 ? CircleOptions.CREATOR.m4428a(parcel) : null);
                parcel2.writeNoException();
                if (a7 != null) {
                    iBinder = a7.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 36:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3963a(be.m3918a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3962a(bb.m3915a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3964a(bh.m3921a(parcel.readStrongBinder()), C0310f.m2398a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m3951a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
