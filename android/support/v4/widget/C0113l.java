package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.l */
class C0113l {
    public static Object m1022a(Context context) {
        return new EdgeEffect(context);
    }

    public static void m1023a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    public static boolean m1024a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    public static boolean m1025a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    public static boolean m1026a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }

    public static void m1027b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    public static boolean m1028c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
