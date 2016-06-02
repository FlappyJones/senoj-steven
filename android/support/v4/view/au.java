package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

class au implements bc {
    au() {
    }

    public int m675a(View view) {
        return 2;
    }

    long m676a() {
        return 10;
    }

    public void m677a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateDelayed(m676a(), i, i2, i3, i4);
    }

    public void m678a(View view, int i, Paint paint) {
    }

    public void m679a(View view, Paint paint) {
    }

    public void m680a(View view, C0074a c0074a) {
    }

    public void m681a(View view, Runnable runnable) {
        view.postDelayed(runnable, m676a());
    }

    public boolean m682a(View view, int i) {
        return false;
    }

    public void m683b(View view) {
        view.postInvalidateDelayed(m676a());
    }

    public void m684b(View view, int i) {
    }

    public int m685c(View view) {
        return 0;
    }

    public int m686d(View view) {
        return 0;
    }

    public int m687e(View view) {
        return 0;
    }

    public ViewParent m688f(View view) {
        return view.getParent();
    }

    public boolean m689g(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }
}
