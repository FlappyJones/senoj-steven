package android.support.v4.widget;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class aa extends C0102z {
    private Method f428a;
    private Field f429b;

    aa() {
        try {
            this.f428a = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
        } catch (Throwable e) {
            Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
        }
        try {
            this.f429b = View.class.getDeclaredField("mRecreateDisplayList");
            this.f429b.setAccessible(true);
        } catch (Throwable e2) {
            Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
        }
    }

    public void m911a(SlidingPaneLayout slidingPaneLayout, View view) {
        if (this.f428a == null || this.f429b == null) {
            view.invalidate();
            return;
        }
        try {
            this.f429b.setBoolean(view, true);
            this.f428a.invoke(view, (Object[]) null);
        } catch (Throwable e) {
            Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
        }
        super.m910a(slidingPaneLayout, view);
    }
}
