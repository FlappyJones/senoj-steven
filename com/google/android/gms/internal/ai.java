package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.view.View;

public class ai {
    protected C0407r f1691a;
    protected al f1692b;

    private ai(C0407r c0407r, int i) {
        this.f1691a = c0407r;
        m3077a(i);
    }

    public static ai m3075a(C0407r c0407r, int i) {
        return C0405p.m3731b() ? new am(c0407r, i) : new ai(c0407r, i);
    }

    public void m3076a() {
        this.f1691a.m3783a(this.f1692b.f1700a, this.f1692b.m3095a());
    }

    protected void m3077a(int i) {
        this.f1692b = new al(new Binder(), null);
    }

    public void m3078a(View view) {
    }

    public IBinder m3079b() {
        return this.f1692b.f1700a;
    }
}
