package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.C0324d;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public abstract class aa extends Binder implements C0365y {
    public aa() {
        attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
    }

    public static C0365y m2815a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0365y)) ? new ac(iBinder) : (C0365y) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C0324d c0324d = null;
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2776a(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2778a(c0324d);
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2784b(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2785b(c0324d);
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                C0324d a = parcel.readInt() != 0 ? C0324d.CREATOR.m2437a(parcel) : null;
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2779a(a, c0324d);
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2790c(c0324d);
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2793d(c0324d);
                parcel2.writeNoException();
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2795e(c0324d);
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2797f(c0324d);
                parcel2.writeNoException();
                return true;
            case 5010:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2799g(c0324d);
                parcel2.writeNoException();
                return true;
            case 5011:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2800h(c0324d);
                parcel2.writeNoException();
                return true;
            case 5012:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2803k(c0324d);
                parcel2.writeNoException();
                return true;
            case 5013:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2774a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5014:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2804l(c0324d);
                parcel2.writeNoException();
                return true;
            case 5015:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2783b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5016:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2773a();
                parcel2.writeNoException();
                return true;
            case 5017:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2801i(c0324d);
                parcel2.writeNoException();
                return true;
            case 5018:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2805m(c0324d);
                parcel2.writeNoException();
                return true;
            case 5019:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2806n(c0324d);
                parcel2.writeNoException();
                return true;
            case 5020:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2789c(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5021:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2807o(c0324d);
                parcel2.writeNoException();
                return true;
            case 5022:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2808p(c0324d);
                parcel2.writeNoException();
                return true;
            case 5023:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2809q(c0324d);
                parcel2.writeNoException();
                return true;
            case 5024:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2810r(c0324d);
                parcel2.writeNoException();
                return true;
            case 5025:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2811s(c0324d);
                parcel2.writeNoException();
                return true;
            case 5026:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2780a(c0324d, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5027:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2786b(c0324d, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5028:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2791c(c0324d, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5029:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2794d(c0324d, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5030:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2796e(c0324d, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5031:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2798f(c0324d, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5032:
                RealTimeMessage realTimeMessage;
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    realTimeMessage = (RealTimeMessage) RealTimeMessage.CREATOR.createFromParcel(parcel);
                }
                m2781a(realTimeMessage);
                parcel2.writeNoException();
                return true;
            case 5033:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2775a(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5034:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2777a(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5035:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2813u(c0324d);
                parcel2.writeNoException();
                return true;
            case 5036:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2788c(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5037:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2802j(c0324d);
                parcel2.writeNoException();
                return true;
            case 5038:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2812t(c0324d);
                parcel2.writeNoException();
                return true;
            case 5039:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    c0324d = C0324d.CREATOR.m2437a(parcel);
                }
                m2814v(c0324d);
                parcel2.writeNoException();
                return true;
            case 5040:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2792d(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2782a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m2787b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
