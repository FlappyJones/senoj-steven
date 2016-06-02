package android.support.v4.p000a;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.a.a */
public class C0000a {
    public static Creator m0a(C0002c c0002c) {
        if (VERSION.SDK_INT >= 13) {
            C0004e.m3a(c0002c);
        }
        return new C0001b(c0002c);
    }
}
