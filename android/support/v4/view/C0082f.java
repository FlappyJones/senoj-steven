package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p002a.C0048a;
import android.support.v4.view.p002a.C0060k;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.f */
class C0082f implements C0081m {
    final /* synthetic */ C0074a f360a;
    final /* synthetic */ C0080e f361b;

    C0082f(C0080e c0080e, C0074a c0074a) {
        this.f361b = c0080e;
        this.f360a = c0074a;
    }

    public Object m799a(View view) {
        C0060k a = this.f360a.m576a(view);
        return a != null ? a.m547a() : null;
    }

    public void m800a(View view, int i) {
        this.f360a.m578a(view, i);
    }

    public void m801a(View view, Object obj) {
        this.f360a.m579a(view, new C0048a(obj));
    }

    public boolean m802a(View view, int i, Bundle bundle) {
        return this.f360a.m581a(view, i, bundle);
    }

    public boolean m803a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f360a.m583b(view, accessibilityEvent);
    }

    public boolean m804a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f360a.m582a(viewGroup, view, accessibilityEvent);
    }

    public void m805b(View view, AccessibilityEvent accessibilityEvent) {
        this.f360a.m585d(view, accessibilityEvent);
    }

    public void m806c(View view, AccessibilityEvent accessibilityEvent) {
        this.f360a.m584c(view, accessibilityEvent);
    }

    public void m807d(View view, AccessibilityEvent accessibilityEvent) {
        this.f360a.m580a(view, accessibilityEvent);
    }
}
