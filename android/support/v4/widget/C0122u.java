package android.support.v4.widget;

import android.support.v4.view.at;
import android.view.View;

/* renamed from: android.support.v4.widget.u */
class C0122u implements Runnable {
    final View f468a;
    final /* synthetic */ SlidingPaneLayout f469b;

    C0122u(SlidingPaneLayout slidingPaneLayout, View view) {
        this.f469b = slidingPaneLayout;
        this.f468a = view;
    }

    public void run() {
        if (this.f468a.getParent() == this.f469b) {
            at.m649a(this.f468a, 0, null);
            this.f469b.m897g(this.f468a);
        }
        this.f469b.f426t.remove(this);
    }
}
