package com.google.ads.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: com.google.ads.util.t */
final class C0240t implements OnClickListener {
    final /* synthetic */ JsResult f1284a;

    C0240t(JsResult jsResult) {
        this.f1284a = jsResult;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1284a.cancel();
    }
}
