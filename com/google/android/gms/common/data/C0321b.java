package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.C0394do;
import com.google.android.gms.internal.dl;

/* renamed from: com.google.android.gms.common.data.b */
public abstract class C0321b {
    protected final C0324d f1510a;
    protected final int f1511b;
    private final int f1512c;

    public C0321b(C0324d c0324d, int i) {
        this.f1510a = (C0324d) C0394do.m3687a((Object) c0324d);
        boolean z = i >= 0 && i < c0324d.m2434g();
        C0394do.m3689a(z);
        this.f1511b = i;
        this.f1512c = c0324d.m2421a(this.f1511b);
    }

    protected long m2414a(String str) {
        return this.f1510a.m2422a(str, this.f1511b, this.f1512c);
    }

    protected int m2415b(String str) {
        return this.f1510a.m2425b(str, this.f1511b, this.f1512c);
    }

    protected boolean m2416c(String str) {
        return this.f1510a.m2428d(str, this.f1511b, this.f1512c);
    }

    protected String m2417d(String str) {
        return this.f1510a.m2426c(str, this.f1511b, this.f1512c);
    }

    protected Uri m2418e(String str) {
        return this.f1510a.m2431e(str, this.f1511b, this.f1512c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0321b)) {
            return false;
        }
        C0321b c0321b = (C0321b) obj;
        return dl.m3685a(Integer.valueOf(c0321b.f1511b), Integer.valueOf(this.f1511b)) && dl.m3685a(Integer.valueOf(c0321b.f1512c), Integer.valueOf(this.f1512c)) && c0321b.f1510a == this.f1510a;
    }

    protected boolean m2419f(String str) {
        return this.f1510a.m2433f(str, this.f1511b, this.f1512c);
    }

    public int hashCode() {
        return dl.m3683a(Integer.valueOf(this.f1511b), Integer.valueOf(this.f1512c), this.f1510a);
    }
}
