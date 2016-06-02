package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class bg {
    public static void m742a(View view, Object obj) {
        view.setAccessibilityDelegate((AccessibilityDelegate) obj);
    }

    public static boolean m743a(View view, int i) {
        return view.canScrollHorizontally(i);
    }
}
