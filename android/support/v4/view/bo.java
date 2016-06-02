package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public class bo {
    static final br f349a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            f349a = new bs();
        } else if (i >= 14) {
            f349a = new bq();
        } else if (i >= 11) {
            f349a = new bp();
        } else {
            f349a = new bt();
        }
    }

    public static void m757a(ViewGroup viewGroup, boolean z) {
        f349a.m758a(viewGroup, z);
    }
}
