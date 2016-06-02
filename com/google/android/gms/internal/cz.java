package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;

public class cz implements ServiceConnection {
    final /* synthetic */ cy f1960a;

    public cz(cy cyVar) {
        this.f1960a = cyVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1960a.f1952a.f1950d) {
            this.f1960a.f1958g = iBinder;
            this.f1960a.f1959h = componentName;
            Iterator it = this.f1960a.f1955d.iterator();
            while (it.hasNext()) {
                ((cv) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f1960a.f1956e = 1;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1960a.f1952a.f1950d) {
            this.f1960a.f1958g = null;
            this.f1960a.f1959h = componentName;
            Iterator it = this.f1960a.f1955d.iterator();
            while (it.hasNext()) {
                ((cv) it.next()).onServiceDisconnected(componentName);
            }
            this.f1960a.f1956e = 2;
        }
    }
}
