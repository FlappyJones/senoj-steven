package android.support.v4.view.p002a;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.ad */
class ad {
    public static Object m373a() {
        return AccessibilityRecord.obtain();
    }

    public static void m374a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    public static void m375a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    public static void m376b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    public static void m377c(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
