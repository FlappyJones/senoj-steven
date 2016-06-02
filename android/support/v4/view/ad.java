package android.support.v4.view;

import android.view.MotionEvent;

class ad {
    public static int m601a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    public static int m602a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    public static int m603b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    public static float m604c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public static float m605d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }
}
