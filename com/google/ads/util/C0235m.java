package com.google.ads.util;

import android.os.Build;

/* renamed from: com.google.ads.util.m */
class C0235m {
    static final C0235m f1276d;
    static final C0235m f1277e;
    static final C0235m f1278f;
    public final String f1279a;
    public final String f1280b;
    public final String f1281c;

    static {
        f1276d = new C0235m();
        f1277e = new C0235m("unknown", "generic", "generic");
        f1278f = new C0235m("unknown", "generic_x86", "Android");
    }

    C0235m() {
        this.f1279a = Build.BOARD;
        this.f1280b = Build.DEVICE;
        this.f1281c = Build.BRAND;
    }

    C0235m(String str, String str2, String str3) {
        this.f1279a = str;
        this.f1280b = str2;
        this.f1281c = str3;
    }

    private static boolean m1848a(String str, String str2) {
        return str != null ? str.equals(str2) : str == str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0235m)) {
            return false;
        }
        C0235m c0235m = (C0235m) obj;
        return C0235m.m1848a(this.f1279a, c0235m.f1279a) && C0235m.m1848a(this.f1280b, c0235m.f1280b) && C0235m.m1848a(this.f1281c, c0235m.f1281c);
    }

    public int hashCode() {
        int i = 0;
        if (this.f1279a != null) {
            i = 0 + this.f1279a.hashCode();
        }
        if (this.f1280b != null) {
            i += this.f1280b.hashCode();
        }
        return this.f1281c != null ? i + this.f1281c.hashCode() : i;
    }
}
