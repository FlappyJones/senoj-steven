package android.support.v4.view;

import android.support.v4.view.ViewPager.LayoutParams;
import android.view.View;
import java.util.Comparator;

class cg implements Comparator {
    cg() {
    }

    public int m786a(View view, View view2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
        return layoutParams.f266a != layoutParams2.f266a ? layoutParams.f266a ? 1 : -1 : layoutParams.f270e - layoutParams2.f270e;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m786a((View) obj, (View) obj2);
    }
}
