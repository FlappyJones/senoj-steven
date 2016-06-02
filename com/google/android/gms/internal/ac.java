package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.C0324d;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

class ac implements C0365y {
    private IBinder f1668a;

    ac(IBinder iBinder) {
        this.f1668a = iBinder;
    }

    public void m2827a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            this.f1668a.transact(5016, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2828a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeInt(i);
            this.f1668a.transact(5013, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2829a(int i, int i2, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            this.f1668a.transact(5033, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2830a(int i, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeInt(i);
            obtain.writeString(str);
            this.f1668a.transact(5001, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2831a(int i, String str, boolean z) {
        int i2 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeInt(i);
            obtain.writeString(str);
            if (z) {
                i2 = 1;
            }
            obtain.writeInt(i2);
            this.f1668a.transact(5034, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2832a(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5002, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2833a(C0324d c0324d, C0324d c0324d2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (c0324d2 != null) {
                obtain.writeInt(1);
                c0324d2.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5005, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2834a(C0324d c0324d, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringArray(strArr);
            this.f1668a.transact(5026, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2835a(RealTimeMessage realTimeMessage) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (realTimeMessage != null) {
                obtain.writeInt(1);
                realTimeMessage.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5032, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2836a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeString(str);
            this.f1668a.transact(6001, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1668a;
    }

    public void m2837b(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeInt(i);
            this.f1668a.transact(5015, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2838b(int i, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeInt(i);
            obtain.writeString(str);
            this.f1668a.transact(5003, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2839b(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5004, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2840b(C0324d c0324d, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringArray(strArr);
            this.f1668a.transact(5027, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2841b(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeString(str);
            this.f1668a.transact(6002, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2842c(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeInt(i);
            this.f1668a.transact(5036, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2843c(int i, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeInt(i);
            obtain.writeString(str);
            this.f1668a.transact(5020, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2844c(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5006, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2845c(C0324d c0324d, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringArray(strArr);
            this.f1668a.transact(5028, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2846d(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            obtain.writeInt(i);
            this.f1668a.transact(5040, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2847d(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5007, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2848d(C0324d c0324d, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringArray(strArr);
            this.f1668a.transact(5029, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2849e(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5008, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2850e(C0324d c0324d, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringArray(strArr);
            this.f1668a.transact(5030, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2851f(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5009, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2852f(C0324d c0324d, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringArray(strArr);
            this.f1668a.transact(5031, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2853g(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5010, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2854h(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5011, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2855i(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5017, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2856j(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5037, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2857k(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5012, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2858l(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5014, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2859m(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5018, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2860n(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5019, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2861o(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5021, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2862p(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5022, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2863q(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5023, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2864r(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5024, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2865s(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5025, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2866t(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5038, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2867u(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5035, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2868v(C0324d c0324d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0324d != null) {
                obtain.writeInt(1);
                c0324d.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1668a.transact(5039, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
