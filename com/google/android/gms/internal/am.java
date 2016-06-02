package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

final class am extends ai implements OnAttachStateChangeListener, OnGlobalLayoutListener {
    private WeakReference f1707c;
    private boolean f1708d;

    protected am(C0407r c0407r, int i) {
        super(i, null);
        this.f1708d = false;
    }

    private void m3096b(View view) {
        int i = -1;
        if (C0405p.m3734e()) {
            Display display = view.getDisplay();
            if (display != null) {
                i = display.getDisplayId();
            }
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        this.b.f1702c = i;
        this.b.f1700a = windowToken;
        this.b.f1703d = iArr[0];
        this.b.f1704e = iArr[1];
        this.b.f1705f = iArr[0] + width;
        this.b.f1706g = iArr[1] + height;
        if (this.f1708d) {
            m3097a();
            this.f1708d = false;
        }
    }

    public void m3097a() {
        if (this.b.f1700a != null) {
            super.m3076a();
        } else {
            this.f1708d = this.f1707c != null;
        }
    }

    protected void m3098a(int i) {
        this.b = new al(null, null);
    }

    public void m3099a(View view) {
        View view2;
        Context j;
        this.a.m3795g();
        if (this.f1707c != null) {
            view2 = (View) this.f1707c.get();
            j = this.a.m3255j();
            if (view2 == null && (j instanceof Activity)) {
                view2 = ((Activity) j).getWindow().getDecorView();
            }
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (C0405p.m3733d()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.f1707c = null;
        j = this.a.m3255j();
        if (view == null && (j instanceof Activity)) {
            view2 = ((Activity) j).findViewById(16908290);
            if (view2 == null) {
                view2 = ((Activity) j).getWindow().getDecorView();
            }
            C0412w.m3806a("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
            view = view2;
        }
        if (view != null) {
            m3096b(view);
            this.f1707c = new WeakReference(view);
            view.addOnAttachStateChangeListener(this);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        }
        C0412w.m3808b("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
    }

    public void onGlobalLayout() {
        if (this.f1707c != null) {
            View view = (View) this.f1707c.get();
            if (view != null) {
                m3096b(view);
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        m3096b(view);
    }

    public void onViewDetachedFromWindow(View view) {
        this.a.m3795g();
        view.removeOnAttachStateChangeListener(this);
    }
}
