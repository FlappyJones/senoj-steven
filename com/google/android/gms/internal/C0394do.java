package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.do */
public final class C0394do {
    public static Object m3687a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object m3688a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void m3689a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m3690a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void m3691a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void m3692b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m3693b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
