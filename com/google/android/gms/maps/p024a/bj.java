package com.google.android.gms.maps.p024a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C0326e;
import com.google.android.gms.common.C0327f;
import com.google.android.gms.internal.C0394do;
import com.google.android.gms.maps.model.C0483k;
import com.google.android.gms.p019b.C0312h;

/* renamed from: com.google.android.gms.maps.a.bj */
public class bj {
    private static Context f2035a;
    private static C0419z f2036b;

    public static C0419z m3923a(Context context) {
        C0394do.m3687a((Object) context);
        bj.m3927b(context);
        if (f2036b == null) {
            bj.m3929d(context);
        }
        if (f2036b != null) {
            return f2036b;
        }
        f2036b = aa.m3876a((IBinder) bj.m3926a(bj.m3930e(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        bj.m3928c(context);
        return f2036b;
    }

    private static Class m3924a() {
        try {
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    private static Object m3925a(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        }
    }

    private static Object m3926a(ClassLoader classLoader, String str) {
        try {
            return bj.m3925a(((ClassLoader) C0394do.m3687a((Object) classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    public static void m3927b(Context context) {
        int a = C0327f.m2439a(context);
        if (a != 0) {
            throw new C0326e(a);
        }
    }

    private static void m3928c(Context context) {
        try {
            f2036b.m3873a(C0312h.m2399a(bj.m3930e(context).getResources()), 3265100);
        } catch (RemoteException e) {
            throw new C0483k(e);
        }
    }

    private static void m3929d(Context context) {
        Class a = bj.m3924a();
        if (a != null) {
            Log.i(bj.class.getSimpleName(), "Making Creator statically");
            f2036b = (C0419z) bj.m3925a(a);
            bj.m3928c(context);
        }
    }

    private static Context m3930e(Context context) {
        if (f2035a == null) {
            if (bj.m3924a() != null) {
                f2035a = context;
            } else {
                f2035a = C0327f.m2451b(context);
            }
        }
        return f2035a;
    }
}
