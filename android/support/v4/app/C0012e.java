package android.support.v4.app;

import android.view.View;

/* renamed from: android.support.v4.app.e */
class C0012e implements C0011l {
    final /* synthetic */ Fragment f132a;

    C0012e(Fragment fragment) {
        this.f132a = fragment;
    }

    public View m103a(int i) {
        if (this.f132a.f21I != null) {
            return this.f132a.f21I.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }
}
