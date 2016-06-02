package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.j */
public abstract class C0339j implements SafeParcelable {
    private static final Object f1582a;
    private static ClassLoader f1583b;
    private static Integer f1584c;
    private boolean f1585d;

    static {
        f1582a = new Object();
        f1583b = null;
        f1584c = null;
    }

    public C0339j() {
        this.f1585d = false;
    }

    private static boolean m2556a(Class cls) {
        boolean z = false;
        try {
            z = SafeParcelable.NULL.equals(cls.getField("NULL").get(null));
        } catch (NoSuchFieldException e) {
        } catch (IllegalAccessException e2) {
        }
        return z;
    }

    protected static boolean m2557b(String str) {
        ClassLoader t = C0339j.m2558t();
        if (t == null) {
            return true;
        }
        try {
            return C0339j.m2556a(t.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    protected static ClassLoader m2558t() {
        ClassLoader classLoader;
        synchronized (f1582a) {
            classLoader = f1583b;
        }
        return classLoader;
    }

    protected static Integer m2559u() {
        Integer num;
        synchronized (f1582a) {
            num = f1584c;
        }
        return num;
    }

    protected boolean m2560v() {
        return this.f1585d;
    }
}
