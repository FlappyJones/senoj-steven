package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class bf {
    public static int m739a(View view) {
        return view.getLayerType();
    }

    static long m740a() {
        return ValueAnimator.getFrameDelay();
    }

    public static void m741a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }
}
