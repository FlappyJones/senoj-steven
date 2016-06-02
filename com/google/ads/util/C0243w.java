package com.google.ads.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

/* renamed from: com.google.ads.util.w */
final class C0243w implements OnClickListener {
    final /* synthetic */ JsPromptResult f1287a;

    C0243w(JsPromptResult jsPromptResult) {
        this.f1287a = jsPromptResult;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1287a.cancel();
    }
}
