package com.google.android.gms.plus;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.be;

public final class PlusOneButtonWithPopup extends ViewGroup {
    private View f2150a;
    private int f2151b;
    private int f2152c;
    private OnClickListener f2153d;
    private String f2154e;
    private String f2155f;

    public PlusOneButtonWithPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2151b = PlusOneButton.m4467a(context, attributeSet);
        this.f2152c = PlusOneButton.m4470b(context, attributeSet);
        this.f2150a = new C0504f(context, this.f2151b);
        addView(this.f2150a);
    }

    private int m4472a(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        switch (mode) {
            case Integer.MIN_VALUE:
            case 1073741824:
                return MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i) - i2, mode);
            default:
                return i;
        }
    }

    private void m4473a() {
        if (this.f2150a != null) {
            removeView(this.f2150a);
        }
        this.f2150a = be.m3267a(getContext(), this.f2151b, this.f2152c, this.f2154e, this.f2155f);
        if (this.f2153d != null) {
            setOnClickListener(this.f2153d);
        }
        addView(this.f2150a);
    }

    private ax m4474b() {
        ax a = ay.m3148a((IBinder) this.f2150a.getTag());
        if (a != null) {
            return a;
        }
        if (Log.isLoggable("PlusOneButtonWithPopup", 5)) {
            Log.w("PlusOneButtonWithPopup", "Failed to get PlusOneDelegate");
        }
        throw new RemoteException();
    }

    public PendingIntent getResolution() {
        if (this.f2150a != null) {
            try {
                return m4474b().m3145a();
            } catch (RemoteException e) {
            }
        }
        return null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2150a.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
    }

    protected void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        this.f2150a.measure(m4472a(i, paddingLeft), m4472a(i2, paddingTop));
        setMeasuredDimension(paddingLeft + this.f2150a.getMeasuredWidth(), paddingTop + this.f2150a.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.f2152c = i;
        m4473a();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f2153d = onClickListener;
        this.f2150a.setOnClickListener(onClickListener);
    }

    public void setSize(int i) {
        this.f2151b = i;
        m4473a();
    }
}
