package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p002a.C0048a;
import android.support.v4.view.p002a.C0073x;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class ca extends C0074a {
    final /* synthetic */ ViewPager f358b;

    ca(ViewPager viewPager) {
        this.f358b = viewPager;
    }

    private boolean m777b() {
        return this.f358b.f306h != null && this.f358b.f306h.m606a() > 1;
    }

    public void m778a(View view, C0048a c0048a) {
        super.m579a(view, c0048a);
        c0048a.m326b(ViewPager.class.getName());
        c0048a.m344i(m777b());
        if (this.f358b.canScrollHorizontally(1)) {
            c0048a.m317a(4096);
        }
        if (this.f358b.canScrollHorizontally(-1)) {
            c0048a.m317a(8192);
        }
    }

    public boolean m779a(View view, int i, Bundle bundle) {
        if (super.m581a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.f358b.canScrollHorizontally(1)) {
                    return false;
                }
                this.f358b.setCurrentItem(this.f358b.f307i + 1);
                return true;
            case 8192:
                if (!this.f358b.canScrollHorizontally(-1)) {
                    return false;
                }
                this.f358b.setCurrentItem(this.f358b.f307i - 1);
                return true;
            default:
                return false;
        }
    }

    public void m780d(View view, AccessibilityEvent accessibilityEvent) {
        super.m585d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        C0073x a = C0073x.m571a();
        a.m573a(m777b());
        if (accessibilityEvent.getEventType() == 4096 && this.f358b.f306h != null) {
            a.m572a(this.f358b.f306h.m606a());
            a.m574b(this.f358b.f307i);
            a.m575c(this.f358b.f307i);
        }
    }
}
