package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: android.support.v4.widget.r */
class C0119r {
    public static Object m1065a(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public static void m1066a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public static boolean m1067a(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    public static int m1068b(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    public static int m1069c(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    public static boolean m1070d(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    public static void m1071e(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    public static int m1072f(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    public static int m1073g(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }
}
