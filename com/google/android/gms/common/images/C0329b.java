package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.dr;

/* renamed from: com.google.android.gms.common.images.b */
final class C0329b extends dr {
    protected int m2471a(C0333f c0333f, Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    protected /* synthetic */ int m2472a(Object obj, Object obj2) {
        return m2471a((C0333f) obj, (Bitmap) obj2);
    }

    protected void m2473a(boolean z, C0333f c0333f, Bitmap bitmap, Bitmap bitmap2) {
        super.m2469a(z, c0333f, bitmap, bitmap2);
    }

    protected /* synthetic */ void m2474a(boolean z, Object obj, Object obj2, Object obj3) {
        m2473a(z, (C0333f) obj, (Bitmap) obj2, (Bitmap) obj3);
    }
}
