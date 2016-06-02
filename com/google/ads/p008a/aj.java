package com.google.ads.p008a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.ads.a.aj */
class aj implements OnClickListener {
    final /* synthetic */ ah f843a;

    aj(ah ahVar) {
        this.f843a = ahVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        new Thread(new ae(this.f843a.f841c.m1521c(), this.f843a.f840b.getApplicationContext())).start();
    }
}
