package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.dl;

/* renamed from: com.google.android.gms.common.images.f */
public final class C0333f {
    public final Uri f1581a;

    public C0333f(Uri uri) {
        this.f1581a = uri;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof C0333f) ? false : this == obj || ((C0333f) obj).hashCode() == hashCode();
    }

    public int hashCode() {
        return dl.m3683a(this.f1581a);
    }
}
