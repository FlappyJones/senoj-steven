package org.andengine.ui.activity;

import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.C0338e;
import org.andengine.opengl.p067c.C0701e;
import org.andengine.opengl.util.C0714e;
import org.andengine.opengl.view.C0126h;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.p003b.C0575a;
import org.andengine.p003b.p039c.C0585b;
import org.andengine.p003b.p039c.C0588e;
import org.andengine.p003b.p039c.C0591h;
import org.andengine.p005d.C0628a;
import org.andengine.p005d.p057e.C0637a;
import org.andengine.p005d.p059i.C0643a;
import org.andengine.p027a.p029b.C0565b;
import org.andengine.p027a.p030c.C0570c;
import org.andengine.ui.C0127a;
import org.andengine.ui.C0727b;

public abstract class BaseGameActivity extends BaseActivity implements C0126h, C0127a {
    private static /* synthetic */ int[] f471f;
    private WakeLock f472a;
    private boolean f473b;
    private boolean f474c;
    private boolean f475d;
    private boolean f476e;
    protected C0575a f477k;
    protected RenderSurfaceView f478l;

    protected static LayoutParams m1098B() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    static /* synthetic */ int[] m1099C() {
        int[] iArr = f471f;
        if (iArr == null) {
            iArr = new int[C0588e.values().length];
            try {
                iArr[C0588e.LANDSCAPE_FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[C0588e.LANDSCAPE_SENSOR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[C0588e.PORTRAIT_FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[C0588e.PORTRAIT_SENSOR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            f471f = iArr;
        }
        return iArr;
    }

    private void m1100a(C0591h c0591h) {
        if (c0591h == C0591h.SCREEN_ON) {
            C0628a.m5120b(this);
            return;
        }
        this.f472a = ((PowerManager) getSystemService("power")).newWakeLock(c0591h.m4990a() | 536870912, "AndEngine");
        try {
            this.f472a.acquire();
        } catch (Throwable e) {
            C0637a.m5156b("You have to add\n\t<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\nto your AndroidManifest.xml !", e);
        }
    }

    private void m1102c() {
        runOnUiThread(new C0729d(this));
    }

    private void m1103d() {
        m1100a(this.f477k.m4946d().m4978m());
    }

    private void m1104e() {
        if (this.f472a != null && this.f472a.isHeld()) {
            this.f472a.release();
        }
    }

    private void m1105f() {
        C0585b d = this.f477k.m4946d();
        if (d.m4971f()) {
            C0628a.m5119a(this);
        }
        if (d.m4969d().m4964c() || d.m4969d().m4963b()) {
            setVolumeControlStream(3);
        }
        switch (m1099C()[d.m4972g().ordinal()]) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                setRequestedOrientation(0);
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                if (C0643a.f2631c) {
                    setRequestedOrientation(6);
                    return;
                }
                C0637a.m5157c(new StringBuilder(String.valueOf(C0588e.class.getSimpleName())).append(".").append(C0588e.LANDSCAPE_SENSOR).append(" is not supported on this device. Falling back to ").append(C0588e.class.getSimpleName()).append(".").append(C0588e.LANDSCAPE_FIXED).toString());
                setRequestedOrientation(0);
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                setRequestedOrientation(1);
            case C0338e.MapAttrs_cameraTilt /*4*/:
                if (C0643a.f2631c) {
                    setRequestedOrientation(7);
                    return;
                }
                C0637a.m5157c(new StringBuilder(String.valueOf(C0588e.class.getSimpleName())).append(".").append(C0588e.PORTRAIT_SENSOR).append(" is not supported on this device. Falling back to ").append(C0588e.class.getSimpleName()).append(".").append(C0588e.PORTRAIT_FIXED).toString());
                setRequestedOrientation(1);
            default:
        }
    }

    public C0565b m1106A() {
        return this.f477k.m4952j();
    }

    public C0575a m1107a(C0585b c0585b) {
        return new C0575a(c0585b);
    }

    public synchronized void m1108a(C0714e c0714e) {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onSurfaceCreated").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        if (this.f474c) {
            m1114t();
            if (this.f473b && this.f474c) {
                m1113s();
            }
        } else if (this.f475d) {
            this.f476e = true;
        } else {
            this.f475d = true;
            m1111q();
        }
    }

    public synchronized void m1109a(C0714e c0714e, int i, int i2) {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onSurfaceChanged(Width=").append(i).append(",  Height=").append(i2).append(")").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
    }

    protected void m1110b() {
        this.f478l = new RenderSurfaceView(this);
        this.f478l.m5440a(this.f477k, (C0126h) this);
        setContentView(this.f478l, m1098B());
    }

    protected void onCreate(Bundle bundle) {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onCreate").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onCreate(bundle);
        this.f473b = true;
        this.f477k = m1107a(m1094a());
        this.f477k.m4928a();
        m1105f();
        m1110b();
    }

    protected void onDestroy() {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onDestroy").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onDestroy();
        this.f477k.m4953k();
        try {
            m1116v();
        } catch (Throwable th) {
            C0637a.m5156b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onDestroyResources failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
        m1117w();
        this.f477k = null;
    }

    protected void onPause() {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onPause").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onPause();
        this.f478l.onPause();
        m1104e();
        if (!this.f473b) {
            m1115u();
        }
    }

    protected synchronized void onResume() {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onResume").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onResume();
        m1103d();
        this.f478l.onResume();
    }

    public synchronized void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f473b && this.f474c) {
            m1113s();
        }
    }

    protected synchronized void m1111q() {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onCreateGame").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        C0727b c0728c = new C0728c(this, new C0726b(this, new C0724a(this)));
        try {
            C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onCreateResources").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            m1096a(c0728c);
        } catch (Throwable th) {
            C0637a.m5156b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onCreateGame failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
    }

    public synchronized void m1112r() {
        this.f474c = true;
        if (this.f476e) {
            this.f476e = false;
            try {
                m1114t();
            } catch (Throwable th) {
                C0637a.m5156b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onReloadResources failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
            }
        }
    }

    public synchronized void m1113s() {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onResumeGame").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        this.f477k.m4940b();
        this.f473b = false;
    }

    public void m1114t() {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onReloadResources").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        this.f477k.m4954l();
    }

    public synchronized void m1115u() {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onPauseGame").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        this.f473b = true;
        this.f477k.m4945c();
    }

    public void m1116v() {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onDestroyResources").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        if (this.f477k.m4946d().m4969d().m4964c()) {
            m1106A().m4870b();
        }
        if (this.f477k.m4946d().m4969d().m4963b()) {
            m1120z().m4886b();
        }
    }

    public synchronized void m1117w() {
        C0637a.m5154b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onGameDestroyed").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        this.f474c = false;
    }

    public C0575a m1118x() {
        return this.f477k;
    }

    public C0701e m1119y() {
        return this.f477k.m4950h();
    }

    public C0570c m1120z() {
        return this.f477k.m4951i();
    }
}
