package android.support.v4.widget;

import android.support.v4.widget.DrawerLayout.LayoutParams;
import android.view.View;

/* renamed from: android.support.v4.widget.f */
class C0107f extends af {
    final /* synthetic */ DrawerLayout f457a;
    private final int f458b;
    private ac f459c;
    private final Runnable f460d;

    public C0107f(DrawerLayout drawerLayout, int i) {
        this.f457a = drawerLayout;
        this.f460d = new C0108g(this);
        this.f458b = i;
    }

    private void m980b() {
        int i = 3;
        if (this.f458b == 3) {
            i = 5;
        }
        View a = this.f457a.m864a(i);
        if (a != null) {
            this.f457a.m880i(a);
        }
    }

    private void m981c() {
        View view;
        int i;
        int i2 = 0;
        int b = this.f459c.m941b();
        boolean z = this.f458b == 3;
        if (z) {
            View a = this.f457a.m864a(3);
            if (a != null) {
                i2 = -a.getWidth();
            }
            i2 += b;
            view = a;
            i = i2;
        } else {
            i2 = this.f457a.getWidth() - b;
            view = this.f457a.m864a(5);
            i = i2;
        }
        if (view == null) {
            return;
        }
        if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && this.f457a.m862a(view) == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f459c.m939a(view, i, view.getTop());
            layoutParams.f375c = true;
            this.f457a.invalidate();
            m980b();
            this.f457a.m873c();
        }
    }

    public int m982a(View view) {
        return view.getWidth();
    }

    public int m983a(View view, int i, int i2) {
        if (this.f457a.m869a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f457a.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    public void m984a() {
        this.f457a.removeCallbacks(this.f460d);
    }

    public void m985a(int i) {
        this.f457a.m866a(this.f458b, i, this.f459c.m947c());
    }

    public void m986a(int i, int i2) {
        this.f457a.postDelayed(this.f460d, 160);
    }

    public void m987a(ac acVar) {
        this.f459c = acVar;
    }

    public void m988a(View view, float f, float f2) {
        int i;
        float d = this.f457a.m875d(view);
        int width = view.getWidth();
        if (this.f457a.m869a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width;
        } else {
            i = this.f457a.getWidth();
            if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                i -= width;
            }
        }
        this.f459c.m937a(i, view.getTop());
        this.f457a.invalidate();
    }

    public void m989a(View view, int i, int i2, int i3, int i4) {
        int width = view.getWidth();
        float width2 = this.f457a.m869a(view, 3) ? ((float) (width + i)) / ((float) width) : ((float) (this.f457a.getWidth() - i)) / ((float) width);
        this.f457a.m872b(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        this.f457a.invalidate();
    }

    public boolean m990a(View view, int i) {
        return this.f457a.m878g(view) && this.f457a.m869a(view, this.f458b) && this.f457a.m862a(view) == 0;
    }

    public int m991b(View view, int i, int i2) {
        return view.getTop();
    }

    public void m992b(int i, int i2) {
        View a = (i & 1) == 1 ? this.f457a.m864a(3) : this.f457a.m864a(5);
        if (a != null && this.f457a.m862a(a) == 0) {
            this.f459c.m936a(a, i2);
        }
    }

    public void m993b(View view, int i) {
        ((LayoutParams) view.getLayoutParams()).f375c = false;
        m980b();
    }

    public boolean m994b(int i) {
        return false;
    }
}
