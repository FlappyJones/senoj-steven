package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

/* renamed from: android.support.v4.view.s */
public class C0092s {
    static final C0093w f365a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f365a = new C0096v();
        } else {
            f365a = new C0094t();
        }
    }

    public static boolean m825a(KeyEvent keyEvent) {
        return f365a.m830b(keyEvent.getMetaState());
    }

    public static boolean m826a(KeyEvent keyEvent, int i) {
        return f365a.m829a(keyEvent.getMetaState(), i);
    }

    public static void m827b(KeyEvent keyEvent) {
        f365a.m828a(keyEvent);
    }
}
