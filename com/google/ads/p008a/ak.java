package com.google.ads.p008a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* renamed from: com.google.ads.a.ak */
class ak implements OnClickListener {
    final /* synthetic */ String f844a;
    final /* synthetic */ ah f845b;

    ak(ah ahVar, String str) {
        this.f845b = ahVar;
        this.f844a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f845b.f840b.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f844a), "Share via"));
    }
}
