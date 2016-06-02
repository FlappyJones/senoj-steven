package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class cl extends ConstantState {
    int f1913a;
    int f1914b;

    cl(cl clVar) {
        if (clVar != null) {
            this.f1913a = clVar.f1913a;
            this.f1914b = clVar.f1914b;
        }
    }

    public int getChangingConfigurations() {
        return this.f1913a;
    }

    public Drawable newDrawable() {
        return new ch(this);
    }
}
