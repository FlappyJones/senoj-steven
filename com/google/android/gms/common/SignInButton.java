package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.internal.C0394do;
import com.google.android.gms.internal.C0410u;
import com.google.android.gms.internal.dp;
import com.google.android.gms.p019b.C0314k;

public final class SignInButton extends FrameLayout implements OnClickListener {
    private int f1503a;
    private int f1504b;
    private View f1505c;
    private OnClickListener f1506d;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1506d = null;
        m2405a(0, 0);
    }

    private static Button m2403a(Context context, int i, int i2) {
        Button c0410u = new C0410u(context);
        c0410u.m3804a(context.getResources(), i, i2);
        return c0410u;
    }

    private void m2404a(Context context) {
        if (this.f1505c != null) {
            removeView(this.f1505c);
        }
        try {
            this.f1505c = dp.m3694a(context, this.f1503a, this.f1504b);
        } catch (C0314k e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.f1505c = m2403a(context, this.f1503a, this.f1504b);
        }
        addView(this.f1505c);
        this.f1505c.setEnabled(isEnabled());
        this.f1505c.setOnClickListener(this);
    }

    public void m2405a(int i, int i2) {
        boolean z = true;
        boolean z2 = i >= 0 && i < 3;
        C0394do.m3690a(z2, "Unknown button size " + i);
        if (i2 < 0 || i2 >= 2) {
            z = false;
        }
        C0394do.m3690a(z, "Unknown color scheme " + i2);
        this.f1503a = i;
        this.f1504b = i2;
        m2404a(getContext());
    }

    public void onClick(View view) {
        if (this.f1506d != null && view == this.f1505c) {
            this.f1506d.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        m2405a(this.f1503a, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f1505c.setEnabled(z);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f1506d = onClickListener;
        if (this.f1505c != null) {
            this.f1505c.setOnClickListener(this);
        }
    }

    public void setSize(int i) {
        m2405a(i, this.f1504b);
    }
}
