package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.C0099z;
import android.support.v4.view.ao;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.gms.C0338e;
import java.util.Arrays;

public class ac {
    private static final Interpolator f430v;
    private int f431a;
    private int f432b;
    private int f433c;
    private float[] f434d;
    private float[] f435e;
    private float[] f436f;
    private float[] f437g;
    private int[] f438h;
    private int[] f439i;
    private int[] f440j;
    private int f441k;
    private VelocityTracker f442l;
    private float f443m;
    private float f444n;
    private int f445o;
    private int f446p;
    private C0114m f447q;
    private final af f448r;
    private View f449s;
    private boolean f450t;
    private final ViewGroup f451u;
    private final Runnable f452w;

    static {
        f430v = new ad();
    }

    private ac(Context context, ViewGroup viewGroup, af afVar) {
        this.f433c = -1;
        this.f452w = new ae(this);
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (afVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f451u = viewGroup;
            this.f448r = afVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f445o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f432b = viewConfiguration.getScaledTouchSlop();
            this.f443m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f444n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f447q = C0114m.m1029a(context, f430v);
        }
    }

    private float m913a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        return abs < f2 ? 0.0f : abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    private int m914a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f451u.getWidth();
        int i4 = width / 2;
        float b = (m923b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * ((float) i4)) + ((float) i4);
        i4 = Math.abs(i2);
        return Math.min(i4 > 0 ? Math.round(Math.abs(b / ((float) i4)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    private int m915a(View view, int i, int i2, int i3, int i4) {
        int b = m924b(i3, (int) this.f444n, (int) this.f443m);
        int b2 = m924b(i4, (int) this.f444n, (int) this.f443m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        return (int) (((b2 != 0 ? ((float) abs4) / ((float) i5) : ((float) abs2) / ((float) i6)) * ((float) m914a(i2, b2, this.f448r.m962b(view)))) + ((b != 0 ? ((float) abs3) / ((float) i5) : ((float) abs) / ((float) i6)) * ((float) m914a(i, b, this.f448r.m955a(view)))));
    }

    public static ac m916a(ViewGroup viewGroup, float f, af afVar) {
        ac a = m917a(viewGroup, afVar);
        a.f432b = (int) (((float) a.f432b) * (1.0f / f));
        return a;
    }

    public static ac m917a(ViewGroup viewGroup, af afVar) {
        return new ac(viewGroup.getContext(), viewGroup, afVar);
    }

    private void m918a(float f, float f2) {
        this.f450t = true;
        this.f448r.m959a(this.f449s, f, f2);
        this.f450t = false;
        if (this.f431a == 1) {
            m948c(0);
        }
    }

    private void m919a(float f, float f2, int i) {
        m930f(i);
        float[] fArr = this.f434d;
        this.f436f[i] = f;
        fArr[i] = f;
        fArr = this.f435e;
        this.f437g[i] = f2;
        fArr[i] = f2;
        this.f438h[i] = m928e((int) f, (int) f2);
        this.f441k |= 1 << i;
    }

    private boolean m920a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f438h[i] & i2) != i2 || (this.f446p & i2) == 0 || (this.f440j[i] & i2) == i2 || (this.f439i[i] & i2) == i2) {
            return false;
        }
        if (abs <= ((float) this.f432b) && abs2 <= ((float) this.f432b)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f448r.m966b(i2)) {
            return (this.f439i[i] & i2) == 0 && abs > ((float) this.f432b);
        } else {
            int[] iArr = this.f440j;
            iArr[i] = iArr[i] | i2;
            return false;
        }
    }

    private boolean m921a(int i, int i2, int i3, int i4) {
        int left = this.f449s.getLeft();
        int top = this.f449s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f447q.m1037g();
            m948c(0);
            return false;
        }
        this.f447q.m1030a(left, top, i5, i6, m915a(this.f449s, i5, i6, i3, i4));
        m948c(2);
        return true;
    }

    private boolean m922a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f448r.m955a(view) > 0;
        boolean z2 = this.f448r.m962b(view) > 0;
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f432b * this.f432b)) : z ? Math.abs(f) > ((float) this.f432b) : z2 ? Math.abs(f2) > ((float) this.f432b) : false;
    }

    private float m923b(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    private int m924b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        return abs < i2 ? 0 : abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    private void m925b(float f, float f2, int i) {
        int i2 = 1;
        if (!m920a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m920a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m920a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m920a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f439i;
            iArr[i] = iArr[i] | i2;
            this.f448r.m964b(i2, i);
        }
    }

    private void m926b(int i, int i2, int i3, int i4) {
        int a;
        int b;
        int left = this.f449s.getLeft();
        int top = this.f449s.getTop();
        if (i3 != 0) {
            a = this.f448r.m956a(this.f449s, i, i3);
            this.f449s.offsetLeftAndRight(a - left);
        } else {
            a = i;
        }
        if (i4 != 0) {
            b = this.f448r.m963b(this.f449s, i2, i4);
            this.f449s.offsetTopAndBottom(b - top);
        } else {
            b = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.f448r.m960a(this.f449s, a, b, a - left, b - top);
        }
    }

    private void m927c(MotionEvent motionEvent) {
        int c = C0099z.m849c(motionEvent);
        for (int i = 0; i < c; i++) {
            int b = C0099z.m847b(motionEvent, i);
            float c2 = C0099z.m848c(motionEvent, i);
            float d = C0099z.m850d(motionEvent, i);
            this.f436f[b] = c2;
            this.f437g[b] = d;
        }
    }

    private int m928e(int i, int i2) {
        int i3 = 0;
        if (i < this.f451u.getLeft() + this.f445o) {
            i3 = 1;
        }
        if (i2 < this.f451u.getTop() + this.f445o) {
            i3 |= 4;
        }
        if (i > this.f451u.getRight() - this.f445o) {
            i3 |= 2;
        }
        return i2 > this.f451u.getBottom() - this.f445o ? i3 | 8 : i3;
    }

    private void m929e(int i) {
        if (this.f434d != null) {
            this.f434d[i] = 0.0f;
            this.f435e[i] = 0.0f;
            this.f436f[i] = 0.0f;
            this.f437g[i] = 0.0f;
            this.f438h[i] = 0;
            this.f439i[i] = 0;
            this.f440j[i] = 0;
            this.f441k &= (1 << i) ^ -1;
        }
    }

    private void m930f(int i) {
        if (this.f434d == null || this.f434d.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.f434d != null) {
                System.arraycopy(this.f434d, 0, obj, 0, this.f434d.length);
                System.arraycopy(this.f435e, 0, obj2, 0, this.f435e.length);
                System.arraycopy(this.f436f, 0, obj3, 0, this.f436f.length);
                System.arraycopy(this.f437g, 0, obj4, 0, this.f437g.length);
                System.arraycopy(this.f438h, 0, obj5, 0, this.f438h.length);
                System.arraycopy(this.f439i, 0, obj6, 0, this.f439i.length);
                System.arraycopy(this.f440j, 0, obj7, 0, this.f440j.length);
            }
            this.f434d = obj;
            this.f435e = obj2;
            this.f436f = obj3;
            this.f437g = obj4;
            this.f438h = obj5;
            this.f439i = obj6;
            this.f440j = obj7;
        }
    }

    private void m931g() {
        if (this.f434d != null) {
            Arrays.fill(this.f434d, 0.0f);
            Arrays.fill(this.f435e, 0.0f);
            Arrays.fill(this.f436f, 0.0f);
            Arrays.fill(this.f437g, 0.0f);
            Arrays.fill(this.f438h, 0);
            Arrays.fill(this.f439i, 0);
            Arrays.fill(this.f440j, 0);
            this.f441k = 0;
        }
    }

    private void m932h() {
        this.f442l.computeCurrentVelocity(1000, this.f443m);
        m918a(m913a(ao.m637a(this.f442l, this.f433c), this.f444n, this.f443m), m913a(ao.m638b(this.f442l, this.f433c), this.f444n, this.f443m));
    }

    public int m933a() {
        return this.f431a;
    }

    public void m934a(float f) {
        this.f444n = f;
    }

    public void m935a(int i) {
        this.f446p = i;
    }

    public void m936a(View view, int i) {
        if (view.getParent() != this.f451u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f451u + ")");
        }
        this.f449s = view;
        this.f433c = i;
        this.f448r.m965b(view, i);
        m948c(1);
    }

    public boolean m937a(int i, int i2) {
        if (this.f450t) {
            return m921a(i, i2, (int) ao.m637a(this.f442l, this.f433c), (int) ao.m638b(this.f442l, this.f433c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean m938a(MotionEvent motionEvent) {
        int a = C0099z.m844a(motionEvent);
        int b = C0099z.m846b(motionEvent);
        if (a == 0) {
            m953e();
        }
        if (this.f442l == null) {
            this.f442l = VelocityTracker.obtain();
        }
        this.f442l.addMovement(motionEvent);
        float y;
        int b2;
        switch (a) {
            case C0338e.MapAttrs_mapType /*0*/:
                float x = motionEvent.getX();
                y = motionEvent.getY();
                b2 = C0099z.m847b(motionEvent, 0);
                m919a(x, y, b2);
                View d = m951d((int) x, (int) y);
                if (d == this.f449s && this.f431a == 2) {
                    m945b(d, b2);
                }
                a = this.f438h[b2];
                if ((this.f446p & a) != 0) {
                    this.f448r.m958a(a & this.f446p, b2);
                    break;
                }
                break;
            case C0338e.MapAttrs_cameraBearing /*1*/:
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                m953e();
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                b = C0099z.m849c(motionEvent);
                a = 0;
                while (a < b) {
                    b2 = C0099z.m847b(motionEvent, a);
                    float c = C0099z.m848c(motionEvent, a);
                    float d2 = C0099z.m850d(motionEvent, a);
                    float f = c - this.f434d[b2];
                    float f2 = d2 - this.f435e[b2];
                    m925b(f, f2, b2);
                    if (this.f431a != 1) {
                        View d3 = m951d((int) c, (int) d2);
                        if (d3 == null || !m922a(d3, f, f2) || !m945b(d3, b2)) {
                            a++;
                        }
                    }
                    m927c(motionEvent);
                    break;
                }
                m927c(motionEvent);
                break;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                a = C0099z.m847b(motionEvent, b);
                float c2 = C0099z.m848c(motionEvent, b);
                y = C0099z.m850d(motionEvent, b);
                m919a(c2, y, a);
                if (this.f431a != 0) {
                    if (this.f431a == 2) {
                        View d4 = m951d((int) c2, (int) y);
                        if (d4 == this.f449s) {
                            m945b(d4, a);
                            break;
                        }
                    }
                }
                b = this.f438h[a];
                if ((this.f446p & b) != 0) {
                    this.f448r.m958a(b & this.f446p, a);
                    break;
                }
                break;
            case C0338e.MapAttrs_uiCompass /*6*/:
                m929e(C0099z.m847b(motionEvent, b));
                break;
        }
        return this.f431a == 1;
    }

    public boolean m939a(View view, int i, int i2) {
        this.f449s = view;
        this.f433c = -1;
        return m921a(i, i2, 0, 0);
    }

    public boolean m940a(boolean z) {
        if (this.f431a == 2) {
            boolean a;
            boolean f = this.f447q.m1036f();
            int b = this.f447q.m1032b();
            int c = this.f447q.m1033c();
            int left = b - this.f449s.getLeft();
            int top = c - this.f449s.getTop();
            if (left != 0) {
                this.f449s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.f449s.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f448r.m960a(this.f449s, b, c, left, top);
            }
            if (f && b == this.f447q.m1034d() && c == this.f447q.m1035e()) {
                this.f447q.m1037g();
                a = this.f447q.m1031a();
            } else {
                a = f;
            }
            if (!a) {
                if (z) {
                    this.f451u.post(this.f452w);
                } else {
                    m948c(0);
                }
            }
        }
        return this.f431a == 2;
    }

    public int m941b() {
        return this.f445o;
    }

    public void m942b(MotionEvent motionEvent) {
        int i = 0;
        int a = C0099z.m844a(motionEvent);
        int b = C0099z.m846b(motionEvent);
        if (a == 0) {
            m953e();
        }
        if (this.f442l == null) {
            this.f442l = VelocityTracker.obtain();
        }
        this.f442l.addMovement(motionEvent);
        float x;
        float y;
        View d;
        int i2;
        switch (a) {
            case C0338e.MapAttrs_mapType /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = C0099z.m847b(motionEvent, 0);
                d = m951d((int) x, (int) y);
                m919a(x, y, i);
                m945b(d, i);
                i2 = this.f438h[i];
                if ((this.f446p & i2) != 0) {
                    this.f448r.m958a(i2 & this.f446p, i);
                }
            case C0338e.MapAttrs_cameraBearing /*1*/:
                if (this.f431a == 1) {
                    m932h();
                }
                m953e();
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                if (this.f431a == 1) {
                    i = C0099z.m845a(motionEvent, this.f433c);
                    x = C0099z.m848c(motionEvent, i);
                    i2 = (int) (x - this.f436f[this.f433c]);
                    i = (int) (C0099z.m850d(motionEvent, i) - this.f437g[this.f433c]);
                    m926b(this.f449s.getLeft() + i2, this.f449s.getTop() + i, i2, i);
                    m927c(motionEvent);
                    return;
                }
                i2 = C0099z.m849c(motionEvent);
                while (i < i2) {
                    a = C0099z.m847b(motionEvent, i);
                    float c = C0099z.m848c(motionEvent, i);
                    float d2 = C0099z.m850d(motionEvent, i);
                    float f = c - this.f434d[a];
                    float f2 = d2 - this.f435e[a];
                    m925b(f, f2, a);
                    if (this.f431a != 1) {
                        d = m951d((int) c, (int) d2);
                        if (!m922a(d, f, f2) || !m945b(d, a)) {
                            i++;
                        }
                    }
                    m927c(motionEvent);
                }
                m927c(motionEvent);
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                if (this.f431a == 1) {
                    m918a(0.0f, 0.0f);
                }
                m953e();
            case C0338e.MapAttrs_cameraZoom /*5*/:
                i = C0099z.m847b(motionEvent, b);
                x = C0099z.m848c(motionEvent, b);
                y = C0099z.m850d(motionEvent, b);
                m919a(x, y, i);
                if (this.f431a == 0) {
                    m945b(m951d((int) x, (int) y), i);
                    i2 = this.f438h[i];
                    if ((this.f446p & i2) != 0) {
                        this.f448r.m958a(i2 & this.f446p, i);
                    }
                } else if (m949c((int) x, (int) y)) {
                    m945b(this.f449s, i);
                }
            case C0338e.MapAttrs_uiCompass /*6*/:
                a = C0099z.m847b(motionEvent, b);
                if (this.f431a == 1 && a == this.f433c) {
                    b = C0099z.m849c(motionEvent);
                    while (i < b) {
                        int b2 = C0099z.m847b(motionEvent, i);
                        if (b2 != this.f433c) {
                            if (m951d((int) C0099z.m848c(motionEvent, i), (int) C0099z.m850d(motionEvent, i)) == this.f449s && m945b(this.f449s, b2)) {
                                i = this.f433c;
                                if (i == -1) {
                                    m932h();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        m932h();
                    }
                }
                m929e(a);
            default:
        }
    }

    public boolean m943b(int i) {
        return (this.f441k & (1 << i)) != 0;
    }

    public boolean m944b(int i, int i2) {
        if (!m943b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f436f[i2] - this.f434d[i2];
        float f2 = this.f437g[i2] - this.f435e[i2];
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f432b * this.f432b)) : z ? Math.abs(f) > ((float) this.f432b) : z2 ? Math.abs(f2) > ((float) this.f432b) : false;
    }

    boolean m945b(View view, int i) {
        if (view == this.f449s && this.f433c == i) {
            return true;
        }
        if (view == null || !this.f448r.m961a(view, i)) {
            return false;
        }
        this.f433c = i;
        m936a(view, i);
        return true;
    }

    public boolean m946b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public View m947c() {
        return this.f449s;
    }

    void m948c(int i) {
        if (this.f431a != i) {
            this.f431a = i;
            this.f448r.m957a(i);
            if (i == 0) {
                this.f449s = null;
            }
        }
    }

    public boolean m949c(int i, int i2) {
        return m946b(this.f449s, i, i2);
    }

    public int m950d() {
        return this.f432b;
    }

    public View m951d(int i, int i2) {
        for (int childCount = this.f451u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f451u.getChildAt(this.f448r.m967c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean m952d(int i) {
        int length = this.f434d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m944b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public void m953e() {
        this.f433c = -1;
        m931g();
        if (this.f442l != null) {
            this.f442l.recycle();
            this.f442l = null;
        }
    }

    public void m954f() {
        m953e();
        if (this.f431a == 2) {
            int b = this.f447q.m1032b();
            int c = this.f447q.m1033c();
            this.f447q.m1037g();
            int b2 = this.f447q.m1032b();
            int c2 = this.f447q.m1033c();
            this.f448r.m960a(this.f449s, b2, c2, b2 - b, c2 - c);
        }
        m948c(0);
    }
}
