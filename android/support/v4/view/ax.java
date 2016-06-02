package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

class ax extends aw {
    ax() {
    }

    long m692a() {
        return bf.m740a();
    }

    public void m693a(View view, int i, Paint paint) {
        bf.m741a(view, i, paint);
    }

    public void m694a(View view, Paint paint) {
        m693a(view, m695d(view), paint);
        view.invalidate();
    }

    public int m695d(View view) {
        return bf.m739a(view);
    }
}
