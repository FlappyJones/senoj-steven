package android.support.v4.view;

import android.view.KeyEvent;

/* renamed from: android.support.v4.view.y */
class C0098y {
    public static int m841a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    public static boolean m842a(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    public static boolean m843b(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
