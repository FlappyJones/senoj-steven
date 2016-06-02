package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.C0317a;

public final class cw extends ct {
    public final int f1943a;
    public final Bundle f1944c;
    public final IBinder f1945d;
    final /* synthetic */ cr f1946e;

    public cw(cr crVar, int i, IBinder iBinder, Bundle bundle) {
        this.f1946e = crVar;
        super(crVar, Boolean.valueOf(true));
        this.f1943a = i;
        this.f1945d = iBinder;
        this.f1944c = bundle;
    }

    protected void m3622a() {
    }

    protected void m3623a(Boolean bool) {
        if (bool != null) {
            switch (this.f1943a) {
                case C0338e.MapAttrs_mapType /*0*/:
                    try {
                        if (this.f1946e.m3250d().equals(this.f1945d.getInterfaceDescriptor())) {
                            this.f1946e.f1720g = this.f1946e.m3246b(this.f1945d);
                            if (this.f1946e.f1720g != null) {
                                this.f1946e.m3252f();
                                return;
                            }
                        }
                    } catch (RemoteException e) {
                    }
                    cx.m3625a(this.f1946e.f1719f).m3628b(this.f1946e.m3248c(), this.f1946e.f1726m);
                    this.f1946e.f1726m = null;
                    this.f1946e.f1720g = null;
                    this.f1946e.m3242a(new C0317a(8, null));
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                default:
                    PendingIntent pendingIntent = this.f1944c != null ? (PendingIntent) this.f1944c.getParcelable("pendingIntent") : null;
                    if (this.f1946e.f1726m != null) {
                        cx.m3625a(this.f1946e.f1719f).m3628b(this.f1946e.m3248c(), this.f1946e.f1726m);
                        this.f1946e.f1726m = null;
                    }
                    this.f1946e.f1720g = null;
                    this.f1946e.m3242a(new C0317a(this.f1943a, pendingIntent));
            }
        }
    }
}
