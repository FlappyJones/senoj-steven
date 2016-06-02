package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C0334a {
    public static int m2483a(int i) {
        return 65535 & i;
    }

    public static int m2484a(Parcel parcel) {
        return parcel.readInt();
    }

    public static int m2485a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static Parcelable m2486a(Parcel parcel, int i, Creator creator) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    private static void m2487a(Parcel parcel, int i, int i2) {
        int a = C0334a.m2485a(parcel, i);
        if (a != i2) {
            throw new C0335b("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }

    public static void m2488a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(a + dataPosition);
        }
    }

    public static int m2489b(Parcel parcel) {
        int a = C0334a.m2484a(parcel);
        int a2 = C0334a.m2485a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (C0334a.m2483a(a) != 20293) {
            throw new C0335b("Expected object header. Got 0x" + Integer.toHexString(a), parcel);
        }
        a = dataPosition + a2;
        if (a >= dataPosition && a <= parcel.dataSize()) {
            return a;
        }
        throw new C0335b("Size read is invalid start=" + dataPosition + " end=" + a, parcel);
    }

    public static void m2490b(Parcel parcel, int i) {
        parcel.setDataPosition(C0334a.m2485a(parcel, i) + parcel.dataPosition());
    }

    public static Object[] m2491b(Parcel parcel, int i, Creator creator) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static ArrayList m2492c(Parcel parcel, int i, Creator creator) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static boolean m2493c(Parcel parcel, int i) {
        C0334a.m2487a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte m2494d(Parcel parcel, int i) {
        C0334a.m2487a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static short m2495e(Parcel parcel, int i) {
        C0334a.m2487a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static int m2496f(Parcel parcel, int i) {
        C0334a.m2487a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long m2497g(Parcel parcel, int i) {
        C0334a.m2487a(parcel, i, 8);
        return parcel.readLong();
    }

    public static BigInteger m2498h(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return new BigInteger(createByteArray);
    }

    public static float m2499i(Parcel parcel, int i) {
        C0334a.m2487a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double m2500j(Parcel parcel, int i) {
        C0334a.m2487a(parcel, i, 8);
        return parcel.readDouble();
    }

    public static BigDecimal m2501k(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(a + dataPosition);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static String m2502l(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder m2503m(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Bundle m2504n(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] m2505o(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static boolean[] m2506p(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(a + dataPosition);
        return createBooleanArray;
    }

    public static int[] m2507q(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    public static long[] m2508r(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(a + dataPosition);
        return createLongArray;
    }

    public static BigInteger[] m2509s(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigIntegerArr;
    }

    public static float[] m2510t(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(a + dataPosition);
        return createFloatArray;
    }

    public static double[] m2511u(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(a + dataPosition);
        return createDoubleArray;
    }

    public static BigDecimal[] m2512v(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }

    public static String[] m2513w(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static ArrayList m2514x(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static Parcel m2515y(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(a + dataPosition);
        return obtain;
    }

    public static Parcel[] m2516z(Parcel parcel, int i) {
        int a = C0334a.m2485a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(readInt2 + dataPosition2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }
}
