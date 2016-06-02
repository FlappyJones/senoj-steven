package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.C0074a;
import android.support.v4.view.at;
import android.support.v4.view.p002a.C0048a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.C0338e;

/* renamed from: android.support.v4.widget.c */
class C0104c extends C0074a {
    final /* synthetic */ DrawerLayout f455b;
    private final Rect f456c;

    C0104c(DrawerLayout drawerLayout) {
        this.f455b = drawerLayout;
        this.f456c = new Rect();
    }

    private void m968a(C0048a c0048a, C0048a c0048a2) {
        Rect rect = this.f456c;
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
    }

    private void m969a(C0048a c0048a, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!m972b(childAt)) {
                switch (at.m656c(childAt)) {
                    case C0338e.MapAttrs_mapType /*0*/:
                        at.m655b(childAt, 1);
                        break;
                    case C0338e.MapAttrs_cameraBearing /*1*/:
                        break;
                    case C0338e.MapAttrs_cameraTargetLat /*2*/:
                        if (childAt instanceof ViewGroup) {
                            m969a(c0048a, (ViewGroup) childAt);
                            break;
                        }
                        continue;
                    case C0338e.MapAttrs_cameraTilt /*4*/:
                        break;
                    default:
                        continue;
                }
                c0048a.m325b(childAt);
            }
        }
    }

    public void m970a(View view, C0048a c0048a) {
        C0048a a = C0048a.m313a(c0048a);
        super.m579a(view, a);
        c0048a.m319a(view);
        ViewParent f = at.m659f(view);
        if (f instanceof View) {
            c0048a.m330c((View) f);
        }
        m968a(c0048a, a);
        a.m356t();
        m969a(c0048a, (ViewGroup) view);
    }

    public boolean m971a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return !m972b(view) ? super.m582a(viewGroup, view, accessibilityEvent) : false;
    }

    public boolean m972b(View view) {
        View a = this.f455b.m863a();
        return (a == null || a == view) ? false : true;
    }
}
