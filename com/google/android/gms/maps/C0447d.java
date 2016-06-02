package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.C0326e;
import com.google.android.gms.maps.model.C0483k;
import com.google.android.gms.maps.p024a.bj;
import com.google.android.gms.p019b.C0305b;
import com.google.android.gms.p019b.C0306i;
import com.google.android.gms.p019b.C0312h;

/* renamed from: com.google.android.gms.maps.d */
class C0447d extends C0305b {
    protected C0306i f2049a;
    private final ViewGroup f2050b;
    private final Context f2051c;
    private final GoogleMapOptions f2052d;

    C0447d(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f2050b = viewGroup;
        this.f2051c = context;
        this.f2052d = googleMapOptions;
    }

    public void m4116b() {
        if (this.f2049a != null && m2394a() == null) {
            try {
                this.f2049a.m2395a(new C0446c(this.f2050b, bj.m3923a(this.f2051c).m3871a(C0312h.m2399a(this.f2051c), this.f2052d)));
            } catch (RemoteException e) {
                throw new C0483k(e);
            } catch (C0326e e2) {
            }
        }
    }
}
