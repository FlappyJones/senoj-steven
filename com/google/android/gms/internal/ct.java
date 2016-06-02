package com.google.android.gms.internal;

import android.util.Log;

public abstract class ct {
    private Object f1938a;
    final /* synthetic */ cr f1939b;
    private boolean f1940c;

    public ct(cr crVar, Object obj) {
        this.f1939b = crVar;
        this.f1938a = obj;
        this.f1940c = false;
    }

    protected abstract void m3614a();

    protected abstract void m3615a(Object obj);

    public void m3616b() {
        synchronized (this) {
            Object obj = this.f1938a;
            if (this.f1940c) {
                Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                m3615a(obj);
            } catch (RuntimeException e) {
                m3614a();
                throw e;
            }
        }
        m3614a();
        synchronized (this) {
            this.f1940c = true;
        }
        m3617c();
    }

    public void m3617c() {
        m3618d();
        synchronized (this.f1939b.f1725l) {
            this.f1939b.f1725l.remove(this);
        }
    }

    public void m3618d() {
        synchronized (this) {
            this.f1938a = null;
        }
    }
}
