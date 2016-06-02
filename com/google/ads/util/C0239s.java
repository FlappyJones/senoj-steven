package com.google.ads.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

/* renamed from: com.google.ads.util.s */
final class C0239s implements OnCancelListener {
    final /* synthetic */ JsResult f1283a;

    C0239s(JsResult jsResult) {
        this.f1283a = jsResult;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f1283a.cancel();
    }
}
