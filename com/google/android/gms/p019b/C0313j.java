package com.google.android.gms.p019b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C0327f;
import com.google.android.gms.internal.C0394do;

/* renamed from: com.google.android.gms.b.j */
public abstract class C0313j {
    private final String f1501a;
    private Object f1502b;

    protected C0313j(String str) {
        this.f1501a = str;
    }

    protected final Object m2401a(Context context) {
        if (this.f1502b == null) {
            C0394do.m3687a((Object) context);
            Context b = C0327f.m2451b(context);
            if (b == null) {
                throw new C0314k("Could not get remote context.");
            }
            try {
                this.f1502b = m2402a((IBinder) b.getClassLoader().loadClass(this.f1501a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C0314k("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new C0314k("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new C0314k("Could not access creator.");
            }
        }
        return this.f1502b;
    }

    protected abstract Object m2402a(IBinder iBinder);
}
