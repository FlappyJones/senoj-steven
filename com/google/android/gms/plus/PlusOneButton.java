package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.dq;

public final class PlusOneButton extends FrameLayout {
    private View f2144a;
    private int f2145b;
    private int f2146c;
    private String f2147d;
    private int f2148e;
    private C0502e f2149f;

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2145b = m4467a(context, attributeSet);
        this.f2146c = m4470b(context, attributeSet);
        this.f2148e = -1;
        m4469a(getContext());
        if (!isInEditMode()) {
        }
    }

    protected static int m4467a(Context context, AttributeSet attributeSet) {
        String a = dq.m3698a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        return "SMALL".equalsIgnoreCase(a) ? 0 : "MEDIUM".equalsIgnoreCase(a) ? 1 : "TALL".equalsIgnoreCase(a) ? 2 : 3;
    }

    private void m4469a(Context context) {
        if (this.f2144a != null) {
            removeView(this.f2144a);
        }
        this.f2144a = be.m3266a(context, this.f2145b, this.f2146c, this.f2147d, this.f2148e);
        setOnPlusOneClickListener(this.f2149f);
        addView(this.f2144a);
    }

    protected static int m4470b(Context context, AttributeSet attributeSet) {
        String a = dq.m3698a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        return "INLINE".equalsIgnoreCase(a) ? 2 : !"NONE".equalsIgnoreCase(a) ? 1 : 0;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2144a.layout(0, 0, i3 - i, i4 - i2);
    }

    protected void onMeasure(int i, int i2) {
        View view = this.f2144a;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.f2146c = i;
        m4469a(getContext());
    }

    public void setOnPlusOneClickListener(C0502e c0502e) {
        this.f2149f = c0502e;
        this.f2144a.setOnClickListener(new C0503d(this, c0502e));
    }

    public void setSize(int i) {
        this.f2145b = i;
        m4469a(getContext());
    }
}
