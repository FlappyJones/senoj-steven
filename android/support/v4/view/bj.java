package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public class bj {
    static final bm f348a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f348a = new bl();
        } else {
            f348a = new bk();
        }
    }

    public static int m752a(ViewConfiguration viewConfiguration) {
        return f348a.m753a(viewConfiguration);
    }
}
