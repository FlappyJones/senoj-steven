package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
    private long f367a;
    private boolean f368b;
    private boolean f369c;
    private boolean f370d;
    private final Runnable f371e;
    private final Runnable f372f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f367a = -1;
        this.f368b = false;
        this.f369c = false;
        this.f370d = false;
        this.f371e = new C0100a(this);
        this.f372f = new C0103b(this);
    }

    private void m852a() {
        removeCallbacks(this.f371e);
        removeCallbacks(this.f372f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m852a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m852a();
    }
}
