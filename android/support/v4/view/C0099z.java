package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

/* renamed from: android.support.v4.view.z */
public class C0099z {
    static final ac f366a;

    static {
        if (VERSION.SDK_INT >= 5) {
            f366a = new ab();
        } else {
            f366a = new aa();
        }
    }

    public static int m844a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int m845a(MotionEvent motionEvent, int i) {
        return f366a.m587a(motionEvent, i);
    }

    public static int m846b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int m847b(MotionEvent motionEvent, int i) {
        return f366a.m588b(motionEvent, i);
    }

    public static float m848c(MotionEvent motionEvent, int i) {
        return f366a.m589c(motionEvent, i);
    }

    public static int m849c(MotionEvent motionEvent) {
        return f366a.m586a(motionEvent);
    }

    public static float m850d(MotionEvent motionEvent, int i) {
        return f366a.m590d(motionEvent, i);
    }
}
