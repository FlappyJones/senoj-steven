package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public class at {
    static final bc f347a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            f347a = new bb();
        } else if (i >= 17) {
            f347a = new ba();
        } else if (i >= 16) {
            f347a = new az();
        } else if (i >= 14) {
            f347a = new ay();
        } else if (i >= 11) {
            f347a = new ax();
        } else if (i >= 9) {
            f347a = new aw();
        } else {
            f347a = new au();
        }
    }

    public static int m647a(View view) {
        return f347a.m661a(view);
    }

    public static void m648a(View view, int i, int i2, int i3, int i4) {
        f347a.m662a(view, i, i2, i3, i4);
    }

    public static void m649a(View view, int i, Paint paint) {
        f347a.m663a(view, i, paint);
    }

    public static void m650a(View view, Paint paint) {
        f347a.m664a(view, paint);
    }

    public static void m651a(View view, C0074a c0074a) {
        f347a.m665a(view, c0074a);
    }

    public static void m652a(View view, Runnable runnable) {
        f347a.m666a(view, runnable);
    }

    public static boolean m653a(View view, int i) {
        return f347a.m667a(view, i);
    }

    public static void m654b(View view) {
        f347a.m668b(view);
    }

    public static void m655b(View view, int i) {
        f347a.m669b(view, i);
    }

    public static int m656c(View view) {
        return f347a.m670c(view);
    }

    public static int m657d(View view) {
        return f347a.m671d(view);
    }

    public static int m658e(View view) {
        return f347a.m672e(view);
    }

    public static ViewParent m659f(View view) {
        return f347a.m673f(view);
    }

    public static boolean m660g(View view) {
        return f347a.m674g(view);
    }
}
