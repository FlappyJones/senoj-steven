package android.support.v4.view;

import android.support.v4.view.p002a.C0048a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.c */
class C0079c implements C0078j {
    final /* synthetic */ C0074a f356a;
    final /* synthetic */ C0077b f357b;

    C0079c(C0077b c0077b, C0074a c0074a) {
        this.f357b = c0077b;
        this.f356a = c0074a;
    }

    public void m770a(View view, int i) {
        this.f356a.m578a(view, i);
    }

    public void m771a(View view, Object obj) {
        this.f356a.m579a(view, new C0048a(obj));
    }

    public boolean m772a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f356a.m583b(view, accessibilityEvent);
    }

    public boolean m773a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f356a.m582a(viewGroup, view, accessibilityEvent);
    }

    public void m774b(View view, AccessibilityEvent accessibilityEvent) {
        this.f356a.m585d(view, accessibilityEvent);
    }

    public void m775c(View view, AccessibilityEvent accessibilityEvent) {
        this.f356a.m584c(view, accessibilityEvent);
    }

    public void m776d(View view, AccessibilityEvent accessibilityEvent) {
        this.f356a.m580a(view, accessibilityEvent);
    }
}
