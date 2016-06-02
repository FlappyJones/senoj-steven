package android.support.v4.widget;

import android.support.v4.widget.SlidingPaneLayout.LayoutParams;
import android.view.View;

/* renamed from: android.support.v4.widget.v */
class C0123v extends af {
    final /* synthetic */ SlidingPaneLayout f470a;

    private C0123v(SlidingPaneLayout slidingPaneLayout) {
        this.f470a = slidingPaneLayout;
    }

    public int m1079a(View view) {
        return this.f470a.f416j;
    }

    public int m1080a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f470a.f413g.getLayoutParams();
        int paddingLeft = layoutParams.leftMargin + this.f470a.getPaddingLeft();
        return Math.min(Math.max(i, paddingLeft), this.f470a.f416j + paddingLeft);
    }

    public void m1081a(int i) {
        if (this.f470a.f422p.m933a() != 0) {
            return;
        }
        if (this.f470a.f414h == 0.0f) {
            this.f470a.m905d(this.f470a.f413g);
            this.f470a.m903c(this.f470a.f413g);
            this.f470a.f423q = false;
            return;
        }
        this.f470a.m901b(this.f470a.f413g);
        this.f470a.f423q = true;
    }

    public void m1082a(View view, float f, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int paddingLeft = layoutParams.leftMargin + this.f470a.getPaddingLeft();
        if (f > 0.0f || (f == 0.0f && this.f470a.f414h > 0.5f)) {
            paddingLeft += this.f470a.f416j;
        }
        this.f470a.f422p.m937a(paddingLeft, view.getTop());
        this.f470a.invalidate();
    }

    public void m1083a(View view, int i, int i2, int i3, int i4) {
        this.f470a.m883a(i);
        this.f470a.invalidate();
    }

    public boolean m1084a(View view, int i) {
        return this.f470a.f417k ? false : ((LayoutParams) view.getLayoutParams()).f403b;
    }

    public void m1085b(int i, int i2) {
        this.f470a.f422p.m936a(this.f470a.f413g, i2);
    }

    public void m1086b(View view, int i) {
        this.f470a.m898a();
    }
}
