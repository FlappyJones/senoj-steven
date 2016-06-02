package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

class af implements OnClickListener {
    final /* synthetic */ PagerTabStrip f341a;

    af(PagerTabStrip pagerTabStrip) {
        this.f341a = pagerTabStrip;
    }

    public void onClick(View view) {
        this.f341a.a.setCurrentItem(this.f341a.a.getCurrentItem() - 1);
    }
}
