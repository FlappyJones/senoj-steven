package com.google.ads.util;

import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.google.ads.bt;

/* renamed from: com.google.ads.util.d */
public class C0226d extends C0225r {
    public C0226d(bt btVar) {
        super(btVar);
    }

    public void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
