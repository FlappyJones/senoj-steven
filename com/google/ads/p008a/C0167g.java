package com.google.ads.p008a;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.ads.a.g */
class C0167g implements OnTouchListener {
    final /* synthetic */ C0161e f857a;

    C0167g(C0161e c0161e) {
        this.f857a = c0161e;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() == 2;
    }
}
