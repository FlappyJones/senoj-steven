package com.google.ads.util;

import android.webkit.ConsoleMessage.MessageLevel;

/* renamed from: com.google.ads.util.q */
/* synthetic */ class C0238q {
    static final /* synthetic */ int[] f1282a;

    static {
        f1282a = new int[MessageLevel.values().length];
        try {
            f1282a[MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f1282a[MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f1282a[MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f1282a[MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f1282a[MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
