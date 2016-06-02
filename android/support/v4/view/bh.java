package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class bh {
    public static void m744a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void m745a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static void m746a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    public static void m747a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static int m748b(View view) {
        return view.getImportantForAccessibility();
    }

    public static ViewParent m749c(View view) {
        return view.getParentForAccessibility();
    }
}
