package com.google.ads.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

/* renamed from: com.google.ads.util.v */
final class C0242v implements OnCancelListener {
    final /* synthetic */ JsPromptResult f1286a;

    C0242v(JsPromptResult jsPromptResult) {
        this.f1286a = jsPromptResult;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f1286a.cancel();
    }
}
