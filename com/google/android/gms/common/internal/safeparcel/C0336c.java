package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.c */
public class C0336c {
    public static int m2517a(Parcel parcel) {
        return C0336c.m2536b(parcel, 20293);
    }

    public static void m2518a(Parcel parcel, int i) {
        C0336c.m2539c(parcel, i);
    }

    public static void m2519a(Parcel parcel, int i, byte b) {
        C0336c.m2537b(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void m2520a(Parcel parcel, int i, double d) {
        C0336c.m2537b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void m2521a(Parcel parcel, int i, float f) {
        C0336c.m2537b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void m2522a(Parcel parcel, int i, int i2) {
        C0336c.m2537b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m2523a(Parcel parcel, int i, long j) {
        C0336c.m2537b(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void m2524a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int b = C0336c.m2536b(parcel, i);
            parcel.writeBundle(bundle);
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    public static void m2525a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int b = C0336c.m2536b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    public static void m2526a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int b = C0336c.m2536b(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    public static void m2527a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int b = C0336c.m2536b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    public static void m2528a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int b = C0336c.m2536b(parcel, i);
            parcel.writeString(str);
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    public static void m2529a(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int b = C0336c.m2536b(parcel, i);
            parcel.writeStringList(list);
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    public static void m2530a(Parcel parcel, int i, short s) {
        C0336c.m2537b(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void m2531a(Parcel parcel, int i, boolean z) {
        C0336c.m2537b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void m2532a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int b = C0336c.m2536b(parcel, i);
            parcel.writeByteArray(bArr);
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    public static void m2533a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2, boolean z) {
        if (parcelableArr != null) {
            int b = C0336c.m2536b(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C0336c.m2535a(parcel, parcelable, i2);
                }
            }
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    public static void m2534a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int b = C0336c.m2536b(parcel, i);
            parcel.writeStringArray(strArr);
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    private static void m2535a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static int m2536b(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void m2537b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static void m2538b(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int b = C0336c.m2536b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C0336c.m2535a(parcel, parcelable, 0);
                }
            }
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }

    private static void m2539c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void m2540c(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int b = C0336c.m2536b(parcel, i);
            parcel.writeList(list);
            C0336c.m2539c(parcel, b);
        } else if (z) {
            C0336c.m2537b(parcel, i, 0);
        }
    }
}
