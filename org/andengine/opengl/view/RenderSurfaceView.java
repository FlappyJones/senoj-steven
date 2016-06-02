package org.andengine.opengl.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import org.andengine.p003b.C0575a;

public class RenderSurfaceView extends GLSurfaceView {
    private C0722g f2853a;
    private C0716a f2854b;

    public RenderSurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
    }

    public RenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEGLContextClientVersion(2);
    }

    public void m5439a(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    public void m5440a(C0575a c0575a, C0126h c0126h) {
        if (this.f2854b == null) {
            this.f2854b = new C0716a(c0575a.m4946d().m4970e().m4982a());
        }
        setEGLConfigChooser(this.f2854b);
        setOnTouchListener(c0575a);
        this.f2853a = new C0722g(c0575a, this.f2854b, c0126h);
        setRenderer(this.f2853a);
    }

    public C0716a getConfigChooser() {
        if (this.f2854b != null) {
            return this.f2854b;
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(C0716a.class.getSimpleName())).append(" not yet set.").toString());
    }

    protected void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
        } else {
            this.f2853a.f2873a.m4946d().m4973h().m4957a(this, i, i2);
        }
    }
}
