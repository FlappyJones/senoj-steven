package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class cv implements ServiceConnection {
    final /* synthetic */ cr f1942a;

    cv(cr crVar) {
        this.f1942a = crVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1942a.m3249c(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f1942a.f1720g = null;
        this.f1942a.m3257l();
    }
}
