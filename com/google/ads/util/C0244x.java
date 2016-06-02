package com.google.ads.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.ads.util.x */
final class C0244x implements OnClickListener {
    final /* synthetic */ JsPromptResult f1288a;
    final /* synthetic */ EditText f1289b;

    C0244x(JsPromptResult jsPromptResult, EditText editText) {
        this.f1288a = jsPromptResult;
        this.f1289b = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1288a.confirm(this.f1289b.getText().toString());
    }
}
