package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.C0318c;
import com.google.android.gms.common.C0319d;

public final class bj extends cr {
    private final String f1741f;

    public bj(Context context, C0318c c0318c, C0319d c0319d, String str, String[] strArr) {
        super(context, c0318c, c0319d, strArr);
        this.f1741f = (String) C0394do.m3687a((Object) str);
    }

    protected ce m3288a(IBinder iBinder) {
        return cf.m3576a(iBinder);
    }

    protected void m3289a(df dfVar, cu cuVar) {
        dfVar.m3656a(cuVar, 3265100, m3255j().getPackageName(), this.f1741f, m3256k());
    }

    protected void m3290a(String... strArr) {
        boolean z = false;
        for (String equals : strArr) {
            if (equals.equals("https://www.googleapis.com/auth/appstate")) {
                z = true;
            }
        }
        C0394do.m3690a(z, String.format("AppStateClient requires %s to function.", new Object[]{"https://www.googleapis.com/auth/appstate"}));
    }

    protected /* synthetic */ IInterface m3291b(IBinder iBinder) {
        return m3288a(iBinder);
    }

    protected String m3292c() {
        return "com.google.android.gms.appstate.service.START";
    }

    protected String m3293d() {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }
}
