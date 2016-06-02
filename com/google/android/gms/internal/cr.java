package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C0298b;
import com.google.android.gms.common.C0317a;
import com.google.android.gms.common.C0318c;
import com.google.android.gms.common.C0319d;
import com.google.android.gms.common.C0327f;
import java.util.ArrayList;

public abstract class cr implements C0298b {
    public static final String[] f1714e;
    final Handler f1715a;
    final ArrayList f1716b;
    boolean f1717c;
    boolean f1718d;
    private final Context f1719f;
    private IInterface f1720g;
    private ArrayList f1721h;
    private boolean f1722i;
    private ArrayList f1723j;
    private boolean f1724k;
    private final ArrayList f1725l;
    private cv f1726m;
    private final String[] f1727n;
    private final Object f1728o;

    static {
        f1714e = new String[]{"service_esmobile", "service_googleme"};
    }

    protected cr(Context context, C0318c c0318c, C0319d c0319d, String... strArr) {
        this.f1716b = new ArrayList();
        this.f1722i = false;
        this.f1724k = false;
        this.f1725l = new ArrayList();
        this.f1717c = false;
        this.f1718d = false;
        this.f1728o = new Object();
        this.f1719f = (Context) C0394do.m3687a((Object) context);
        this.f1721h = new ArrayList();
        this.f1721h.add(C0394do.m3687a((Object) c0318c));
        this.f1723j = new ArrayList();
        this.f1723j.add(C0394do.m3687a((Object) c0319d));
        this.f1715a = new cs(this, context.getMainLooper());
        m3245a(strArr);
        this.f1727n = strArr;
    }

    public void m3240a() {
        this.f1717c = true;
        synchronized (this.f1728o) {
            this.f1718d = true;
        }
        int a = C0327f.m2439a(this.f1719f);
        if (a != 0) {
            this.f1715a.sendMessage(this.f1715a.obtainMessage(3, Integer.valueOf(a)));
            return;
        }
        if (this.f1726m != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
            this.f1720g = null;
            cx.m3625a(this.f1719f).m3628b(m3248c(), this.f1726m);
        }
        this.f1726m = new cv(this);
        if (!cx.m3625a(this.f1719f).m3627a(m3248c(), this.f1726m)) {
            Log.e("GmsClient", "unable to connect to service: " + m3248c());
            this.f1715a.sendMessage(this.f1715a.obtainMessage(3, Integer.valueOf(9)));
        }
    }

    protected void m3241a(int i, IBinder iBinder, Bundle bundle) {
        this.f1715a.sendMessage(this.f1715a.obtainMessage(1, new cw(this, i, iBinder, bundle)));
    }

    protected void m3242a(C0317a c0317a) {
        this.f1715a.removeMessages(4);
        synchronized (this.f1723j) {
            this.f1724k = true;
            ArrayList arrayList = this.f1723j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (this.f1717c) {
                    if (this.f1723j.contains(arrayList.get(i))) {
                        ((C0319d) arrayList.get(i)).m2412a(c0317a);
                    }
                    i++;
                } else {
                    return;
                }
            }
            this.f1724k = false;
        }
    }

    public final void m3243a(ct ctVar) {
        synchronized (this.f1725l) {
            this.f1725l.add(ctVar);
        }
        this.f1715a.sendMessage(this.f1715a.obtainMessage(2, ctVar));
    }

    protected abstract void m3244a(df dfVar, cu cuVar);

    protected void m3245a(String... strArr) {
    }

    protected abstract IInterface m3246b(IBinder iBinder);

    public void m3247b() {
        this.f1717c = false;
        synchronized (this.f1728o) {
            this.f1718d = false;
        }
        synchronized (this.f1725l) {
            int size = this.f1725l.size();
            for (int i = 0; i < size; i++) {
                ((ct) this.f1725l.get(i)).m3618d();
            }
            this.f1725l.clear();
        }
        this.f1720g = null;
        if (this.f1726m != null) {
            cx.m3625a(this.f1719f).m3628b(m3248c(), this.f1726m);
            this.f1726m = null;
        }
    }

    protected abstract String m3248c();

    protected final void m3249c(IBinder iBinder) {
        try {
            m3244a(dg.m3666a(iBinder), new cu(this));
        } catch (RemoteException e) {
            Log.w("GmsClient", "service died");
        }
    }

    protected abstract String m3250d();

    protected Bundle m3251e() {
        return null;
    }

    protected void m3252f() {
        boolean z = true;
        synchronized (this.f1721h) {
            C0394do.m3689a(!this.f1722i);
            this.f1715a.removeMessages(4);
            this.f1722i = true;
            if (this.f1716b.size() != 0) {
                z = false;
            }
            C0394do.m3689a(z);
            Bundle e = m3251e();
            ArrayList arrayList = this.f1721h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f1717c && m3253h(); i++) {
                this.f1716b.size();
                if (!this.f1716b.contains(arrayList.get(i))) {
                    ((C0318c) arrayList.get(i)).m2411a(e);
                }
            }
            this.f1716b.clear();
            this.f1722i = false;
        }
    }

    public boolean m3253h() {
        return this.f1720g != null;
    }

    public boolean m3254i() {
        boolean z;
        synchronized (this.f1728o) {
            z = this.f1718d;
        }
        return z;
    }

    public final Context m3255j() {
        return this.f1719f;
    }

    public final String[] m3256k() {
        return this.f1727n;
    }

    protected final void m3257l() {
        this.f1715a.removeMessages(4);
        synchronized (this.f1721h) {
            this.f1722i = true;
            ArrayList arrayList = this.f1721h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f1717c; i++) {
                if (this.f1721h.contains(arrayList.get(i))) {
                    ((C0318c) arrayList.get(i)).m2410a();
                }
            }
            this.f1722i = false;
        }
    }

    protected final void m3258m() {
        if (!m3253h()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected final IInterface m3259n() {
        m3258m();
        return this.f1720g;
    }
}
