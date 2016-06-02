package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.p002a.C0048a;
import android.support.v4.view.p002a.C0060k;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a */
public class C0074a {
    private static final C0075d f337b;
    private static final Object f338c;
    final Object f339a;

    static {
        if (VERSION.SDK_INT >= 16) {
            f337b = new C0080e();
        } else if (VERSION.SDK_INT >= 14) {
            f337b = new C0077b();
        } else {
            f337b = new C0076g();
        }
        f338c = f337b.m705a();
    }

    public C0074a() {
        this.f339a = f337b.m706a(this);
    }

    public C0060k m576a(View view) {
        return f337b.m704a(f338c, view);
    }

    Object m577a() {
        return this.f339a;
    }

    public void m578a(View view, int i) {
        f337b.m707a(f338c, view, i);
    }

    public void m579a(View view, C0048a c0048a) {
        f337b.m708a(f338c, view, c0048a);
    }

    public void m580a(View view, AccessibilityEvent accessibilityEvent) {
        f337b.m714d(f338c, view, accessibilityEvent);
    }

    public boolean m581a(View view, int i, Bundle bundle) {
        return f337b.m709a(f338c, view, i, bundle);
    }

    public boolean m582a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f337b.m711a(f338c, viewGroup, view, accessibilityEvent);
    }

    public boolean m583b(View view, AccessibilityEvent accessibilityEvent) {
        return f337b.m710a(f338c, view, accessibilityEvent);
    }

    public void m584c(View view, AccessibilityEvent accessibilityEvent) {
        f337b.m713c(f338c, view, accessibilityEvent);
    }

    public void m585d(View view, AccessibilityEvent accessibilityEvent) {
        f337b.m712b(f338c, view, accessibilityEvent);
    }
}
