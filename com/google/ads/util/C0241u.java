package com.google.ads.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: com.google.ads.util.u */
final class C0241u implements OnClickListener {
    final /* synthetic */ JsResult f1285a;

    C0241u(JsResult jsResult) {
        this.f1285a = jsResult;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1285a.confirm();
    }
}
