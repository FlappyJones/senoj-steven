package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public class ao {
    static final ar f346a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f346a = new aq();
        } else {
            f346a = new ap();
        }
    }

    public static float m637a(VelocityTracker velocityTracker, int i) {
        return f346a.m639a(velocityTracker, i);
    }

    public static float m638b(VelocityTracker velocityTracker, int i) {
        return f346a.m640b(velocityTracker, i);
    }
}
