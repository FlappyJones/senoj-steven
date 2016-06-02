package org.andengine.input.p034a.p035a;

import android.view.MotionEvent;
import com.google.android.gms.C0338e;

/* renamed from: org.andengine.input.a.a.f */
public class C0648f extends C0645a {
    private void m5182a(int i, MotionEvent motionEvent) {
        int c = C0648f.m5184c(motionEvent);
        int pointerId = motionEvent.getPointerId(c);
        m5176a(motionEvent.getX(c), motionEvent.getY(c), i, pointerId, motionEvent);
    }

    private void m5183b(MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount() - 1; pointerCount >= 0; pointerCount--) {
            m5176a(motionEvent.getX(pointerCount), motionEvent.getY(pointerCount), 2, motionEvent.getPointerId(pointerCount), motionEvent);
        }
    }

    private static int m5184c(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public void m5185a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case C0338e.MapAttrs_mapType /*0*/:
            case C0338e.MapAttrs_cameraZoom /*5*/:
                m5182a(0, motionEvent);
            case C0338e.MapAttrs_cameraBearing /*1*/:
            case C0338e.MapAttrs_uiCompass /*6*/:
                m5182a(1, motionEvent);
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                m5183b(motionEvent);
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
            case C0338e.MapAttrs_cameraTilt /*4*/:
                m5182a(action, motionEvent);
            default:
                throw new IllegalArgumentException("Invalid Action detected: " + action);
        }
    }
}
