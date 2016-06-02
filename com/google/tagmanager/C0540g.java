package com.google.tagmanager;

import android.util.Log;

/* renamed from: com.google.tagmanager.g */
class C0540g implements C0539j {
    private C0543k f2368a;

    C0540g() {
        this.f2368a = C0543k.WARNING;
    }

    public void m4819a(String str) {
        if (this.f2368a.ordinal() <= C0543k.ERROR.ordinal()) {
            Log.e("GoogleTagManager", str);
        }
    }

    public void m4820b(String str) {
        if (this.f2368a.ordinal() <= C0543k.WARNING.ordinal()) {
            Log.w("GoogleTagManager", str);
        }
    }

    public void m4821c(String str) {
        if (this.f2368a.ordinal() <= C0543k.INFO.ordinal()) {
            Log.i("GoogleTagManager", str);
        }
    }

    public void m4822d(String str) {
        if (this.f2368a.ordinal() <= C0543k.VERBOSE.ordinal()) {
            Log.v("GoogleTagManager", str);
        }
    }
}
