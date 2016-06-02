package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: com.google.ads.g */
public class C0208g {
    public static final C0208g f1159a;
    public static final C0208g f1160b;
    public static final C0208g f1161c;
    public static final C0208g f1162d;
    public static final C0208g f1163e;
    public static final C0208g f1164f;
    private final int f1165g;
    private final int f1166h;
    private boolean f1167i;
    private boolean f1168j;
    private boolean f1169k;
    private String f1170l;

    static {
        f1159a = new C0208g(-1, -2, "mb");
        f1160b = new C0208g(320, 50, "mb");
        f1161c = new C0208g(300, 250, "as");
        f1162d = new C0208g(468, 60, "as");
        f1163e = new C0208g(728, 90, "as");
        f1164f = new C0208g(160, 600, "as");
    }

    public C0208g(int i, int i2) {
        this(i, i2, null);
        if (m1761f()) {
            this.f1169k = false;
            this.f1170l = "mb";
            return;
        }
        this.f1169k = true;
    }

    private C0208g(int i, int i2, String str) {
        boolean z = true;
        this.f1165g = i;
        this.f1166h = i2;
        this.f1170l = str;
        this.f1167i = i == -1;
        if (i2 != -2) {
            z = false;
        }
        this.f1168j = z;
        this.f1169k = false;
    }

    private static int m1758a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static C0208g m1759a(C0208g c0208g, Context context) {
        if (context == null || !c0208g.m1761f()) {
            return c0208g.m1761f() ? f1160b : c0208g;
        } else {
            C0208g c0208g2 = new C0208g(c0208g.f1167i ? C0208g.m1758a(context) : c0208g.m1762a(), c0208g.f1168j ? C0208g.m1760b(context) : c0208g.m1763b(), c0208g.f1170l);
            c0208g2.f1168j = c0208g.f1168j;
            c0208g2.f1167i = c0208g.f1167i;
            c0208g2.f1169k = c0208g.f1169k;
            return c0208g2;
        }
    }

    private static int m1760b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    private boolean m1761f() {
        return this.f1165g < 0 || this.f1166h < 0;
    }

    public int m1762a() {
        if (this.f1165g >= 0) {
            return this.f1165g;
        }
        throw new UnsupportedOperationException("Ad size was not set before getWidth() was called.");
    }

    public int m1763b() {
        if (this.f1166h >= 0) {
            return this.f1166h;
        }
        throw new UnsupportedOperationException("Ad size was not set before getHeight() was called.");
    }

    public boolean m1764c() {
        return this.f1167i;
    }

    public boolean m1765d() {
        return this.f1168j;
    }

    public boolean m1766e() {
        return this.f1169k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0208g)) {
            return false;
        }
        C0208g c0208g = (C0208g) obj;
        return this.f1165g == c0208g.f1165g && this.f1166h == c0208g.f1166h;
    }

    public int hashCode() {
        return (Integer.valueOf(this.f1165g).hashCode() << 16) | (Integer.valueOf(this.f1166h).hashCode() & 65535);
    }

    public String toString() {
        return m1762a() + "x" + m1763b() + (this.f1170l == null ? "" : "_" + this.f1170l);
    }
}
