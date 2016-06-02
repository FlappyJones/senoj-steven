package com.google.android.gms.internal;

import com.google.android.gms.common.data.C0324d;
import com.google.android.gms.games.p020a.C0340a;
import com.google.android.gms.games.p020a.C0341b;

/* renamed from: com.google.android.gms.internal.s */
final class C0408s extends C0406q {
    final /* synthetic */ C0407r f1981a;
    private final C0340a f1982b;

    public C0408s(C0407r c0407r, C0340a c0340a) {
        this.f1981a = c0407r;
        this.f1982b = (C0340a) C0394do.m3688a((Object) c0340a, (Object) "Listener must not be null");
    }

    public void m3796c(C0324d c0324d) {
        this.f1981a.m3243a(new C0409t(this.f1981a, this.f1982b, new C0341b(c0324d)));
    }
}
