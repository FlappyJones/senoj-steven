package android.support.v4.view;

import android.view.MotionEvent;

class aa implements ac {
    aa() {
    }

    public int m591a(MotionEvent motionEvent) {
        return 1;
    }

    public int m592a(MotionEvent motionEvent, int i) {
        return i == 0 ? 0 : -1;
    }

    public int m593b(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return 0;
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    public float m594c(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getX();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    public float m595d(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getY();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
}
