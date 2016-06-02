package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.C0074a;
import android.support.v4.view.at;
import android.support.v4.view.p002a.C0048a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.widget.t */
class C0121t extends C0074a {
    final /* synthetic */ SlidingPaneLayout f466b;
    private final Rect f467c;

    C0121t(SlidingPaneLayout slidingPaneLayout) {
        this.f466b = slidingPaneLayout;
        this.f467c = new Rect();
    }

    private void m1074a(C0048a c0048a, C0048a c0048a2) {
        Rect rect = this.f467c;
        c0048a2.m318a(rect);
        c0048a.m324b(rect);
        c0048a2.m329c(rect);
        c0048a.m333d(rect);
        c0048a.m332c(c0048a2.m343h());
        c0048a.m320a(c0048a2.m352p());
        c0048a.m326b(c0048a2.m353q());
        c0048a.m331c(c0048a2.m355s());
        c0048a.m342h(c0048a2.m349m());
        c0048a.m338f(c0048a2.m347k());
        c0048a.m321a(c0048a2.m339f());
        c0048a.m327b(c0048a2.m341g());
        c0048a.m334d(c0048a2.m345i());
        c0048a.m336e(c0048a2.m346j());
        c0048a.m340g(c0048a2.m348l());
        c0048a.m317a(c0048a2.m322b());
        c0048a.m323b(c0048a2.m328c());
    }

    public void m1075a(View view, C0048a c0048a) {
        C0048a a = C0048a.m313a(c0048a);
        super.m579a(view, a);
        m1074a(c0048a, a);
        a.m356t();
        c0048a.m326b(SlidingPaneLayout.class.getName());
        c0048a.m319a(view);
        ViewParent f = at.m659f(view);
        if (f instanceof View) {
            c0048a.m330c((View) f);
        }
        int childCount = this.f466b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f466b.getChildAt(i);
            if (!m1077b(childAt) && childAt.getVisibility() == 0) {
                at.m655b(childAt, 1);
                c0048a.m325b(childAt);
            }
        }
    }

    public boolean m1076a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return !m1077b(view) ? super.m582a(viewGroup, view, accessibilityEvent) : false;
    }

    public boolean m1077b(View view) {
        return this.f466b.m908e(view);
    }

    public void m1078d(View view, AccessibilityEvent accessibilityEvent) {
        super.m585d(view, accessibilityEvent);
        accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
}
