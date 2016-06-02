package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: android.support.v4.app.q */
class C0023q implements AnimationListener {
    final /* synthetic */ Fragment f171a;
    final /* synthetic */ C0021o f172b;

    C0023q(C0021o c0021o, Fragment fragment) {
        this.f172b = c0021o;
        this.f171a = fragment;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f171a.f29b != null) {
            this.f171a.f29b = null;
            this.f172b.m131a(this.f171a, this.f171a.f30c, 0, 0, false);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
