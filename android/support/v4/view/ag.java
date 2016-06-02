package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

class ag implements OnClickListener {
    final /* synthetic */ PagerTabStrip f342a;

    ag(PagerTabStrip pagerTabStrip) {
        this.f342a = pagerTabStrip;
    }

    public void onClick(View view) {
        this.f342a.a.setCurrentItem(this.f342a.a.getCurrentItem() + 1);
    }
}
