package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.C0338e;

/* renamed from: com.google.android.gms.plus.f */
public class C0504f extends FrameLayout {
    public C0504f(Context context, int i) {
        super(context);
        View button = new Button(context);
        button.setEnabled(false);
        button.setBackgroundDrawable(m4491a().m4492a(i));
        Point a = m4490a(i);
        addView(button, new LayoutParams(a.x, a.y, 17));
    }

    private Point m4490a(int i) {
        int i2 = 24;
        int i3 = 20;
        Point point = new Point();
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
                i3 = 14;
                break;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                i2 = 32;
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                i2 = 50;
                break;
            default:
                i2 = 38;
                i3 = 24;
                break;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        point.x = (int) (((double) applyDimension) + 0.5d);
        point.y = (int) (((double) applyDimension2) + 0.5d);
        return point;
    }

    private C0506k m4491a() {
        C0506k c0508i = new C0508i(null);
        if (!c0508i.m4493a()) {
            c0508i = new C0509j(null);
        }
        return !c0508i.m4493a() ? new C0507h(null) : c0508i;
    }
}
