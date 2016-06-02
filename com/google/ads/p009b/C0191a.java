package com.google.ads.p009b;

import android.content.Context;
import com.google.ads.C0201d;

/* renamed from: com.google.ads.b.a */
public class C0191a {
    private C0201d f1002a;
    private boolean f1003b;
    private boolean f1004c;

    public C0191a(C0201d c0201d, Context context, boolean z) {
        this.f1002a = c0201d;
        this.f1004c = z;
        if (context == null) {
            this.f1003b = true;
        } else {
            this.f1003b = c0201d.m1738b(context);
        }
    }
}
