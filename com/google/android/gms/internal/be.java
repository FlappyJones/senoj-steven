package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.C0327f;
import com.google.android.gms.p019b.C0312h;
import com.google.android.gms.plus.C0504f;

public final class be {
    private static Context f1731a;
    private static at f1732b;

    public static View m3266a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            return (View) C0312h.m2400a(m3268a(context).m3140a(C0312h.m2399a((Object) context), i, i2, str, i3));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new C0504f(context, i);
        }
    }

    public static View m3267a(Context context, int i, int i2, String str, String str2) {
        if (str != null) {
            return (View) C0312h.m2400a(m3268a(context).m3141a(C0312h.m2399a((Object) context), i, i2, str, str2));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new C0504f(context, i);
        }
    }

    private static at m3268a(Context context) {
        C0394do.m3687a((Object) context);
        if (f1732b == null) {
            if (f1731a == null) {
                f1731a = C0327f.m2451b(context);
                if (f1731a == null) {
                    throw new bf("Could not get remote context.");
                }
            }
            try {
                f1732b = au.m3142a((IBinder) f1731a.getClassLoader().loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e) {
                throw new bf("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new bf("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new bf("Could not access creator.");
            }
        }
        return f1732b;
    }
}
