package org.andengine.p005d;

import android.app.Activity;
import android.view.Window;

/* renamed from: org.andengine.d.a */
public class C0628a {
    public static void m5119a(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(1024);
        window.clearFlags(2048);
        window.requestFeature(1);
    }

    public static void m5120b(Activity activity) {
        activity.getWindow().addFlags(128);
    }
}
