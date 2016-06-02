package com.google.ads.p008a;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.GestureStore;
import android.gesture.Prediction;
import com.google.ads.util.C0229g;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.ads.a.ah */
public class ah implements OnGesturePerformedListener {
    private final GestureStore f839a;
    private Activity f840b;
    private C0184w f841c;

    public ah(Activity activity, C0184w c0184w, GestureStore gestureStore) {
        this.f840b = activity;
        this.f841c = c0184w;
        this.f839a = gestureStore;
    }

    public void onGesturePerformed(GestureOverlayView gestureOverlayView, Gesture gesture) {
        ArrayList recognize = this.f839a.recognize(gesture);
        Iterator it = recognize.iterator();
        while (it.hasNext()) {
            Prediction prediction = (Prediction) it.next();
            C0229g.m1832a("Gesture: '" + prediction.name + "' = " + prediction.score);
        }
        if (recognize.size() == 0) {
            C0229g.m1832a("Gesture: No remotely reasonable predictions");
        } else if (((Prediction) recognize.get(0)).score > 2.0d && "debug".equals(((Prediction) recognize.get(0)).name) && this.f841c != null) {
            Object b = this.f841c.m1516b() == null ? "[No diagnostics available]" : this.f841c.m1516b();
            new Builder(this.f840b).setMessage(b).setTitle("Ad Information").setPositiveButton("Share", new ak(this, b)).setNeutralButton("Report", new aj(this)).setNegativeButton("Close", new ai(this)).create().show();
        }
    }
}
