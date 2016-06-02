package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: android.support.v4.widget.o */
class C0116o implements C0115n {
    C0116o() {
    }

    public Object m1047a(Context context, Interpolator interpolator) {
        return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
    }

    public void m1048a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public boolean m1049a(Object obj) {
        return ((Scroller) obj).isFinished();
    }

    public int m1050b(Object obj) {
        return ((Scroller) obj).getCurrX();
    }

    public int m1051c(Object obj) {
        return ((Scroller) obj).getCurrY();
    }

    public boolean m1052d(Object obj) {
        return ((Scroller) obj).computeScrollOffset();
    }

    public void m1053e(Object obj) {
        ((Scroller) obj).abortAnimation();
    }

    public int m1054f(Object obj) {
        return ((Scroller) obj).getFinalX();
    }

    public int m1055g(Object obj) {
        return ((Scroller) obj).getFinalY();
    }
}
