package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.google.android.gms.C0338e;
import java.util.HashMap;

public final class cx implements Callback {
    private static final Object f1947a;
    private static cx f1948b;
    private final Context f1949c;
    private final HashMap f1950d;
    private final Handler f1951e;

    static {
        f1947a = new Object();
    }

    private cx(Context context) {
        this.f1951e = new Handler(context.getMainLooper(), this);
        this.f1950d = new HashMap();
        this.f1949c = context.getApplicationContext();
    }

    public static cx m3625a(Context context) {
        synchronized (f1947a) {
            if (f1948b == null) {
                f1948b = new cx(context.getApplicationContext());
            }
        }
        return f1948b;
    }

    public boolean m3627a(String str, cv cvVar) {
        boolean c;
        synchronized (this.f1950d) {
            cy cyVar = (cy) this.f1950d.get(str);
            if (cyVar != null) {
                this.f1951e.removeMessages(0, cyVar);
                if (!cyVar.m3639c(cvVar)) {
                    cyVar.m3634a(cvVar);
                    switch (cyVar.m3640d()) {
                        case C0338e.MapAttrs_cameraBearing /*1*/:
                            cvVar.onServiceConnected(cyVar.m3643g(), cyVar.m3642f());
                            break;
                        case C0338e.MapAttrs_cameraTargetLat /*2*/:
                            cyVar.m3635a(this.f1949c.bindService(new Intent(str).setPackage("com.google.android.gms"), cyVar.m3633a(), 129));
                            break;
                        default:
                            break;
                    }
                }
                throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
            }
            cyVar = new cy(this, str);
            cyVar.m3634a(cvVar);
            cyVar.m3635a(this.f1949c.bindService(new Intent(str).setPackage("com.google.android.gms"), cyVar.m3633a(), 129));
            this.f1950d.put(str, cyVar);
            c = cyVar.m3638c();
        }
        return c;
    }

    public void m3628b(String str, cv cvVar) {
        synchronized (this.f1950d) {
            cy cyVar = (cy) this.f1950d.get(str);
            if (cyVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + str);
            } else if (cyVar.m3639c(cvVar)) {
                cyVar.m3637b(cvVar);
                if (cyVar.m3641e()) {
                    this.f1951e.sendMessageDelayed(this.f1951e.obtainMessage(0, cyVar), 5000);
                }
            } else {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case C0338e.MapAttrs_mapType /*0*/:
                cy cyVar = (cy) message.obj;
                synchronized (this.f1950d) {
                    if (cyVar.m3641e()) {
                        this.f1949c.unbindService(cyVar.m3633a());
                        this.f1950d.remove(cyVar.m3636b());
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
