package org.andengine.p003b.p039c.p040a;

import android.view.View.MeasureSpec;

/* renamed from: org.andengine.b.c.a.a */
public abstract class C0582a implements C0581c {
    protected static void m4958a(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            throw new IllegalStateException("This IResolutionPolicy requires MeasureSpec.EXACTLY ! That means ");
        }
    }
}
