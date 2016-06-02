package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.C0338e;
import com.google.android.gms.internal.C0405p;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.e */
public final class C0332e {
    final C0333f f1571a;
    int f1572b;
    private int f1573c;
    private int f1574d;
    private WeakReference f1575e;
    private WeakReference f1576f;
    private WeakReference f1577g;
    private int f1578h;
    private boolean f1579i;
    private boolean f1580j;

    private ch m2476a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof ch) {
            drawable = ((ch) drawable).m3588b();
        }
        return new ch(drawable, drawable2);
    }

    private void m2477a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        switch (this.f1572b) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                if (!z2) {
                    C0328a c0328a = (C0328a) this.f1575e.get();
                    if (c0328a != null) {
                        c0328a.m2464a(this.f1571a.f1581a, drawable);
                    }
                }
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                ImageView imageView = (ImageView) this.f1576f.get();
                if (imageView != null) {
                    m2478a(imageView, drawable, z, z2, z3);
                }
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                TextView textView = (TextView) this.f1577g.get();
                if (textView != null) {
                    m2479a(textView, this.f1578h, drawable, z, z2);
                }
            default:
        }
    }

    private void m2478a(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
        Object obj = (z2 || z3) ? null : 1;
        if (obj != null && (imageView instanceof cm)) {
            int a = ((cm) imageView).m3590a();
            if (this.f1573c != 0 && a == this.f1573c) {
                return;
            }
        }
        boolean a2 = m2480a(z, z2);
        Drawable a3 = a2 ? m2476a(imageView.getDrawable(), drawable) : drawable;
        imageView.setImageDrawable(a3);
        if (imageView instanceof cm) {
            cm cmVar = (cm) imageView;
            cmVar.m3592a(z3 ? this.f1571a.f1581a : null);
            cmVar.m3591a(obj != null ? this.f1573c : 0);
        }
        if (a2) {
            ((ch) a3).m3586a(250);
        }
    }

    private void m2479a(TextView textView, int i, Drawable drawable, boolean z, boolean z2) {
        boolean a = m2480a(z, z2);
        Drawable[] compoundDrawablesRelative = C0405p.m3734e() ? textView.getCompoundDrawablesRelative() : textView.getCompoundDrawables();
        Drawable a2 = a ? m2476a(compoundDrawablesRelative[i], drawable) : drawable;
        Drawable drawable2 = i == 0 ? a2 : compoundDrawablesRelative[0];
        Drawable drawable3 = i == 1 ? a2 : compoundDrawablesRelative[1];
        Drawable drawable4 = i == 2 ? a2 : compoundDrawablesRelative[2];
        Drawable drawable5 = i == 3 ? a2 : compoundDrawablesRelative[3];
        if (C0405p.m3734e()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        }
        if (a) {
            ((ch) a2).m3586a(250);
        }
    }

    private boolean m2480a(boolean z, boolean z2) {
        return this.f1579i && !z2 && (!z || this.f1580j);
    }

    void m2481a(Context context, Bitmap bitmap, boolean z) {
        cn.m3593a((Object) bitmap);
        m2477a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    void m2482a(Context context, boolean z) {
        Drawable drawable = null;
        if (this.f1573c != 0) {
            drawable = context.getResources().getDrawable(this.f1573c);
        }
        m2477a(drawable, z, false, false);
    }

    public boolean equals(Object obj) {
        return !(obj instanceof C0332e) ? false : this == obj || ((C0332e) obj).hashCode() == hashCode();
    }

    public int hashCode() {
        return this.f1574d;
    }
}
