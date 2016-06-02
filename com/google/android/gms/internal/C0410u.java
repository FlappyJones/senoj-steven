package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.C0315b;
import com.google.android.gms.C0316c;
import com.google.android.gms.C0337d;
import com.google.android.gms.C0338e;

/* renamed from: com.google.android.gms.internal.u */
public final class C0410u extends Button {
    public C0410u(Context context) {
        this(context, null);
    }

    public C0410u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    private int m3800a(int i, int i2, int i3) {
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
                return i2;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    private void m3801a(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
    }

    private void m3802b(Resources resources, int i, int i2) {
        int a;
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
            case C0338e.MapAttrs_cameraBearing /*1*/:
                a = m3800a(i2, C0316c.common_signin_btn_text_dark, C0316c.common_signin_btn_text_light);
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                a = m3800a(i2, C0316c.common_signin_btn_icon_dark, C0316c.common_signin_btn_icon_light);
                break;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
        if (a == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        setBackgroundDrawable(resources.getDrawable(a));
    }

    private void m3803c(Resources resources, int i, int i2) {
        setTextColor(resources.getColorStateList(m3800a(i2, C0315b.common_signin_btn_text_dark, C0315b.common_signin_btn_text_light)));
        switch (i) {
            case C0338e.MapAttrs_mapType /*0*/:
                setText(resources.getString(C0337d.common_signin_button_text));
            case C0338e.MapAttrs_cameraBearing /*1*/:
                setText(resources.getString(C0337d.common_signin_button_text_long));
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                setText(null);
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
    }

    public void m3804a(Resources resources, int i, int i2) {
        boolean z = true;
        boolean z2 = i >= 0 && i < 3;
        C0394do.m3690a(z2, "Unknown button size " + i);
        if (i2 < 0 || i2 >= 2) {
            z = false;
        }
        C0394do.m3690a(z, "Unknown color scheme " + i2);
        m3801a(resources);
        m3802b(resources, i, i2);
        m3803c(resources, i, i2);
    }
}
