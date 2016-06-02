package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

final class cy {
    final /* synthetic */ cx f1952a;
    private final String f1953b;
    private final cz f1954c;
    private final HashSet f1955d;
    private int f1956e;
    private boolean f1957f;
    private IBinder f1958g;
    private ComponentName f1959h;

    public cy(cx cxVar, String str) {
        this.f1952a = cxVar;
        this.f1953b = str;
        this.f1954c = new cz(this);
        this.f1955d = new HashSet();
        this.f1956e = 0;
    }

    public cz m3633a() {
        return this.f1954c;
    }

    public void m3634a(cv cvVar) {
        this.f1955d.add(cvVar);
    }

    public void m3635a(boolean z) {
        this.f1957f = z;
    }

    public String m3636b() {
        return this.f1953b;
    }

    public void m3637b(cv cvVar) {
        this.f1955d.remove(cvVar);
    }

    public boolean m3638c() {
        return this.f1957f;
    }

    public boolean m3639c(cv cvVar) {
        return this.f1955d.contains(cvVar);
    }

    public int m3640d() {
        return this.f1956e;
    }

    public boolean m3641e() {
        return this.f1955d.isEmpty();
    }

    public IBinder m3642f() {
        return this.f1958g;
    }

    public ComponentName m3643g() {
        return this.f1959h;
    }
}
