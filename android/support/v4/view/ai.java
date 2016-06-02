package android.support.v4.view;

import android.database.DataSetObserver;

class ai extends DataSetObserver implements cb, cc {
    final /* synthetic */ PagerTitleStrip f343a;
    private int f344b;

    private ai(PagerTitleStrip pagerTitleStrip) {
        this.f343a = pagerTitleStrip;
    }

    public void m629a(int i) {
        float f = 0.0f;
        if (this.f344b == 0) {
            this.f343a.m270a(this.f343a.f236a.getCurrentItem(), this.f343a.f236a.getAdapter());
            if (this.f343a.f242g >= 0.0f) {
                f = this.f343a.f242g;
            }
            this.f343a.m269a(this.f343a.f236a.getCurrentItem(), f, true);
        }
    }

    public void m630a(int i, float f, int i2) {
        if (f > 0.5f) {
            i++;
        }
        this.f343a.m269a(i, f, false);
    }

    public void m631a(ae aeVar, ae aeVar2) {
        this.f343a.m271a(aeVar, aeVar2);
    }

    public void m632b(int i) {
        this.f344b = i;
    }

    public void onChanged() {
        float f = 0.0f;
        this.f343a.m270a(this.f343a.f236a.getCurrentItem(), this.f343a.f236a.getAdapter());
        if (this.f343a.f242g >= 0.0f) {
            f = this.f343a.f242g;
        }
        this.f343a.m269a(this.f343a.f236a.getCurrentItem(), f, true);
    }
}
