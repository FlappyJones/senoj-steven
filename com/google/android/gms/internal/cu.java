package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class cu extends dd {
    private cr f1941a;

    public cu(cr crVar) {
        this.f1941a = crVar;
    }

    public void m3621a(int i, IBinder iBinder, Bundle bundle) {
        C0394do.m3688a((Object) "onPostInitComplete can be called only once per call to getServiceFromBroker", this.f1941a);
        this.f1941a.m3241a(i, iBinder, bundle);
        this.f1941a = null;
    }
}
