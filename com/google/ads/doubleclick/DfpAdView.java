package com.google.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import com.google.ads.AdView;
import com.google.ads.C0208g;
import com.google.ads.C0209h;

public class DfpAdView extends AdView {
    public DfpAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DfpAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAppEventListener(C0209h c0209h) {
        super.setAppEventListener(c0209h);
    }

    public void setSupportedAdSizes(C0208g... c0208gArr) {
        super.setSupportedAdSizes(c0208gArr);
    }
}
