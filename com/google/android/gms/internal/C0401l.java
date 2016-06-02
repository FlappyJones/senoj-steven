package com.google.android.gms.internal;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.l */
public final class C0401l {
    public static String m3724a(byte[] bArr) {
        return bArr == null ? null : Base64.encodeToString(bArr, 0);
    }

    public static String m3725b(byte[] bArr) {
        return bArr == null ? null : Base64.encodeToString(bArr, 10);
    }
}
