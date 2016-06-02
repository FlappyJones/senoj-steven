package android.support.v4.view;

import android.database.DataSetObserver;

class ce extends DataSetObserver {
    final /* synthetic */ ViewPager f359a;

    private ce(ViewPager viewPager) {
        this.f359a = viewPager;
    }

    public void onChanged() {
        this.f359a.m308b();
    }

    public void onInvalidated() {
        this.f359a.m308b();
    }
}
