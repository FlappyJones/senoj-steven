package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.C0324d;

class ag implements ad {
    private IBinder f1680a;

    ag(IBinder iBinder) {
        this.f1680a = iBinder;
    }

    public int m2986a(C0365y c0365y, byte[] bArr, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeByteArray(bArr);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f1680a.transact(5033, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int m2987a(byte[] bArr, String str, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeByteArray(bArr);
            obtain.writeString(str);
            obtain.writeStringArray(strArr);
            this.f1680a.transact(5034, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public ParcelFileDescriptor m2988a(Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1680a.transact(6507, obtain, obtain2, 0);
            obtain2.readException();
            ParcelFileDescriptor parcelFileDescriptor = obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return parcelFileDescriptor;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public String m2989a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1680a.transact(5003, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public String m2990a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            this.f1680a.transact(5064, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2991a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeInt(i);
            this.f1680a.transact(5036, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2992a(long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeLong(j);
            this.f1680a.transact(5001, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2993a(IBinder iBinder, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1680a.transact(5005, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2994a(C0365y c0365y) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            this.f1680a.transact(5002, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2995a(C0365y c0365y, int i, int i2, boolean z, boolean z2) {
        int i3 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i3 = 0;
            }
            obtain.writeInt(i3);
            this.f1680a.transact(5044, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2996a(C0365y c0365y, int i, boolean z, boolean z2) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.f1680a.transact(5015, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2997a(C0365y c0365y, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeLong(j);
            this.f1680a.transact(5058, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2998a(C0365y c0365y, Bundle bundle, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f1680a.transact(5021, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m2999a(C0365y c0365y, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!z) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.f1680a.transact(5030, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3000a(C0365y c0365y, IBinder iBinder, String str, boolean z, long j) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.f1680a.transact(5031, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3001a(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5008, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3002a(C0365y c0365y, String str, int i, int i2, int i3, boolean z) {
        int i4 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            if (z) {
                i4 = 1;
            }
            obtain.writeInt(i4);
            this.f1680a.transact(5019, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3003a(C0365y c0365y, String str, int i, IBinder iBinder, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1680a.transact(5025, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3004a(C0365y c0365y, String str, int i, boolean z, boolean z2) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.f1680a.transact(5045, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3005a(C0365y c0365y, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(z3 ? 1 : 0);
            if (!z4) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.f1680a.transact(6501, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3006a(C0365y c0365y, String str, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeLong(j);
            this.f1680a.transact(5016, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3007a(C0365y c0365y, String str, IBinder iBinder, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1680a.transact(5023, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3008a(C0365y c0365y, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f1680a.transact(5009, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3009a(C0365y c0365y, String str, String str2, int i, int i2, int i3, boolean z) {
        int i4 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            if (z) {
                i4 = 1;
            }
            obtain.writeInt(i4);
            this.f1680a.transact(5039, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3010a(C0365y c0365y, String str, String str2, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(6002, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3011a(C0365y c0365y, String str, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(5054, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3012a(C0365y c0365y, String str, boolean z, long[] jArr) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            obtain.writeLongArray(jArr);
            this.f1680a.transact(5011, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3013a(C0365y c0365y, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(5063, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3014a(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f1680a.transact(5028, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3015a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f1680a.transact(5065, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3016a(String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f1680a.transact(5051, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3017a(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(5068, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f1680a;
    }

    public Bundle m3018b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1680a.transact(5004, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public String m3019b(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            this.f1680a.transact(5035, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3020b(long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeLong(j);
            this.f1680a.transact(5059, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3021b(C0365y c0365y) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            this.f1680a.transact(5017, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3022b(C0365y c0365y, int i, boolean z, boolean z2) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.f1680a.transact(5046, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3023b(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5010, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3024b(C0365y c0365y, String str, int i, int i2, int i3, boolean z) {
        int i4 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            if (z) {
                i4 = 1;
            }
            obtain.writeInt(i4);
            this.f1680a.transact(5020, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3025b(C0365y c0365y, String str, int i, boolean z, boolean z2) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.f1680a.transact(5501, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3026b(C0365y c0365y, String str, IBinder iBinder, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1680a.transact(5024, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3027b(C0365y c0365y, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f1680a.transact(5038, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3028b(C0365y c0365y, String str, String str2, int i, int i2, int i3, boolean z) {
        int i4 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            if (z) {
                i4 = 1;
            }
            obtain.writeInt(i4);
            this.f1680a.transact(5040, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3029b(C0365y c0365y, String str, String str2, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(6506, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3030b(C0365y c0365y, String str, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(6502, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3031b(C0365y c0365y, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(6001, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3032b(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f1680a.transact(5029, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3033c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1680a.transact(5006, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3034c(C0365y c0365y) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            this.f1680a.transact(5022, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3035c(C0365y c0365y, int i, boolean z, boolean z2) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.f1680a.transact(5048, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3036c(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5014, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3037c(C0365y c0365y, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f1680a.transact(5041, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3038c(C0365y c0365y, String str, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(6504, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3039c(C0365y c0365y, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(6503, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3040c(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            this.f1680a.transact(5050, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3041c(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f1680a.transact(5055, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int m3042d(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            this.f1680a.transact(5060, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public String m3043d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1680a.transact(5007, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3044d(C0365y c0365y) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            this.f1680a.transact(5026, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3045d(C0365y c0365y, int i, boolean z, boolean z2) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.f1680a.transact(6003, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3046d(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5018, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3047d(C0365y c0365y, String str, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f1680a.transact(6505, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public Uri m3048e(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeString(str);
            this.f1680a.transact(5066, obtain, obtain2, 0);
            obtain2.readException();
            Uri uri = obtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return uri;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public String m3049e() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1680a.transact(5012, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3050e(C0365y c0365y) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            this.f1680a.transact(5027, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3051e(C0365y c0365y, int i, boolean z, boolean z2) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.f1680a.transact(6004, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3052e(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5032, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public C0324d m3053f() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1680a.transact(5013, obtain, obtain2, 0);
            obtain2.readException();
            C0324d a = obtain2.readInt() != 0 ? C0324d.CREATOR.m2437a(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3054f(C0365y c0365y) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            this.f1680a.transact(5047, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3055f(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5037, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3056g(C0365y c0365y) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            this.f1680a.transact(5049, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3057g(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5042, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean m3058g() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1680a.transact(5067, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public C0324d m3059h() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1680a.transact(5502, obtain, obtain2, 0);
            obtain2.readException();
            C0324d a = obtain2.readInt() != 0 ? C0324d.CREATOR.m2437a(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3060h(C0365y c0365y) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            this.f1680a.transact(5056, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3061h(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5043, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3062i(C0365y c0365y) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            this.f1680a.transact(5062, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3063i(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5052, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int m3064j(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5053, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3065k(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5061, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void m3066l(C0365y c0365y, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            obtain.writeStrongBinder(c0365y != null ? c0365y.asBinder() : null);
            obtain.writeString(str);
            this.f1680a.transact(5057, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
