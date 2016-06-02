package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import com.google.android.gms.C0338e;

public final class ch extends Drawable implements Callback {
    private int f1895a;
    private long f1896b;
    private int f1897c;
    private int f1898d;
    private int f1899e;
    private int f1900f;
    private int f1901g;
    private boolean f1902h;
    private boolean f1903i;
    private cl f1904j;
    private Drawable f1905k;
    private Drawable f1906l;
    private boolean f1907m;
    private boolean f1908n;
    private boolean f1909o;
    private int f1910p;

    public ch(Drawable drawable, Drawable drawable2) {
        this(null);
        if (drawable == null) {
            drawable = cj.f1911a;
        }
        this.f1905k = drawable;
        drawable.setCallback(this);
        cl clVar = this.f1904j;
        clVar.f1914b |= drawable.getChangingConfigurations();
        if (drawable2 == null) {
            drawable2 = cj.f1911a;
        }
        this.f1906l = drawable2;
        drawable2.setCallback(this);
        clVar = this.f1904j;
        clVar.f1914b |= drawable2.getChangingConfigurations();
    }

    ch(cl clVar) {
        this.f1895a = 0;
        this.f1899e = 255;
        this.f1901g = 0;
        this.f1902h = true;
        this.f1904j = new cl(clVar);
    }

    public void m3586a(int i) {
        this.f1897c = 0;
        this.f1898d = this.f1899e;
        this.f1901g = 0;
        this.f1900f = i;
        this.f1895a = 1;
        invalidateSelf();
    }

    public boolean m3587a() {
        if (!this.f1907m) {
            boolean z = (this.f1905k.getConstantState() == null || this.f1906l.getConstantState() == null) ? false : true;
            this.f1908n = z;
            this.f1907m = true;
        }
        return this.f1908n;
    }

    public Drawable m3588b() {
        return this.f1906l;
    }

    public void draw(Canvas canvas) {
        int i = 1;
        int i2 = 0;
        switch (this.f1895a) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                this.f1896b = SystemClock.uptimeMillis();
                this.f1895a = 2;
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                if (this.f1896b >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f1896b)) / ((float) this.f1900f);
                    if (uptimeMillis < 1.0f) {
                        i = 0;
                    }
                    if (i != 0) {
                        this.f1895a = 0;
                    }
                    float min = Math.min(uptimeMillis, 1.0f);
                    this.f1901g = (int) ((min * ((float) (this.f1898d - this.f1897c))) + ((float) this.f1897c));
                    break;
                }
                break;
        }
        i2 = i;
        i = this.f1901g;
        boolean z = this.f1902h;
        Drawable drawable = this.f1905k;
        Drawable drawable2 = this.f1906l;
        if (i2 != 0) {
            if (!z || i == 0) {
                drawable.draw(canvas);
            }
            if (i == this.f1899e) {
                drawable2.setAlpha(this.f1899e);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z) {
            drawable.setAlpha(this.f1899e - i);
        }
        drawable.draw(canvas);
        if (z) {
            drawable.setAlpha(this.f1899e);
        }
        if (i > 0) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f1899e);
        }
        invalidateSelf();
    }

    public int getChangingConfigurations() {
        return (super.getChangingConfigurations() | this.f1904j.f1913a) | this.f1904j.f1914b;
    }

    public ConstantState getConstantState() {
        if (!m3587a()) {
            return null;
        }
        this.f1904j.f1913a = getChangingConfigurations();
        return this.f1904j;
    }

    public int getIntrinsicHeight() {
        return Math.max(this.f1905k.getIntrinsicHeight(), this.f1906l.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.f1905k.getIntrinsicWidth(), this.f1906l.getIntrinsicWidth());
    }

    public int getOpacity() {
        if (!this.f1909o) {
            this.f1910p = Drawable.resolveOpacity(this.f1905k.getOpacity(), this.f1906l.getOpacity());
            this.f1909o = true;
        }
        return this.f1910p;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (C0405p.m3729a()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public Drawable mutate() {
        if (!this.f1903i && super.mutate() == this) {
            if (m3587a()) {
                this.f1905k.mutate();
                this.f1906l.mutate();
                this.f1903i = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        this.f1905k.setBounds(rect);
        this.f1906l.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (C0405p.m3729a()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.scheduleDrawable(this, runnable, j);
            }
        }
    }

    public void setAlpha(int i) {
        if (this.f1901g == this.f1899e) {
            this.f1901g = i;
        }
        this.f1899e = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1905k.setColorFilter(colorFilter);
        this.f1906l.setColorFilter(colorFilter);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (C0405p.m3729a()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.unscheduleDrawable(this, runnable);
            }
        }
    }
}
