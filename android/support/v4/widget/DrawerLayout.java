package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.C0087n;
import android.support.v4.view.C0092s;
import android.support.v4.view.at;
import android.support.v4.view.bo;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.C0338e;

public class DrawerLayout extends ViewGroup {
    private static final int[] f380a;
    private int f381b;
    private int f382c;
    private float f383d;
    private Paint f384e;
    private final ac f385f;
    private final ac f386g;
    private final C0107f f387h;
    private final C0107f f388i;
    private int f389j;
    private boolean f390k;
    private boolean f391l;
    private int f392m;
    private int f393n;
    private boolean f394o;
    private boolean f395p;
    private C0105d f396q;
    private float f397r;
    private float f398s;
    private Drawable f399t;
    private Drawable f400u;

    public class LayoutParams extends MarginLayoutParams {
        public int f373a;
        float f374b;
        boolean f375c;
        boolean f376d;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f373a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f373a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f380a);
            this.f373a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f373a = 0;
            this.f373a = layoutParams.f373a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f373a = 0;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f373a = 0;
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int f377a;
        int f378b;
        int f379c;

        static {
            CREATOR = new C0106e();
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f377a = 0;
            this.f378b = 0;
            this.f379c = 0;
            this.f377a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f377a = 0;
            this.f378b = 0;
            this.f379c = 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f377a);
        }
    }

    static {
        f380a = new int[]{16842931};
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f382c = -1728053248;
        this.f384e = new Paint();
        this.f391l = true;
        float f = getResources().getDisplayMetrics().density;
        this.f381b = (int) ((64.0f * f) + 0.5f);
        f *= 400.0f;
        this.f387h = new C0107f(this, 3);
        this.f388i = new C0107f(this, 5);
        this.f385f = ac.m916a((ViewGroup) this, 1.0f, this.f387h);
        this.f385f.m935a(1);
        this.f385f.m934a(f);
        this.f387h.m987a(this.f385f);
        this.f386g = ac.m916a((ViewGroup) this, 1.0f, this.f388i);
        this.f386g.m935a(2);
        this.f386g.m934a(f);
        this.f388i.m987a(this.f386g);
        setFocusableInTouchMode(true);
        at.m651a((View) this, new C0104c(this));
        bo.m757a(this, false);
    }

    static String m856b(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private boolean m858e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f375c) {
                return true;
            }
        }
        return false;
    }

    private boolean m859f() {
        return m860g() != null;
    }

    private View m860g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m878g(childAt) && m881j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    private static boolean m861k(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public int m862a(View view) {
        int e = m876e(view);
        return e == 3 ? this.f392m : e == 5 ? this.f393n : 0;
    }

    View m863a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((LayoutParams) childAt.getLayoutParams()).f376d) {
                return childAt;
            }
        }
        return null;
    }

    View m864a(int i) {
        int a = C0087n.m820a(i, at.m658e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m876e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    public void m865a(int i, int i2) {
        int a = C0087n.m820a(i2, at.m658e(this));
        if (a == 3) {
            this.f392m = i;
        } else if (a == 5) {
            this.f393n = i;
        }
        if (i != 0) {
            (a == 3 ? this.f385f : this.f386g).m953e();
        }
        View a2;
        switch (i) {
            case C0338e.MapAttrs_cameraBearing /*1*/:
                a2 = m864a(a);
                if (a2 != null) {
                    m880i(a2);
                }
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                a2 = m864a(a);
                if (a2 != null) {
                    m879h(a2);
                }
            default:
        }
    }

    void m866a(int i, int i2, View view) {
        int i3 = 1;
        int a = this.f385f.m933a();
        int a2 = this.f386g.m933a();
        if (!(a == 1 || a2 == 1)) {
            i3 = (a == 2 || a2 == 2) ? 2 : 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.f374b == 0.0f) {
                m871b(view);
            } else if (layoutParams.f374b == 1.0f) {
                m874c(view);
            }
        }
        if (i3 != this.f389j) {
            this.f389j = i3;
            if (this.f396q != null) {
                this.f396q.m973a(i3);
            }
        }
    }

    void m867a(View view, float f) {
        if (this.f396q != null) {
            this.f396q.m975a(view, f);
        }
    }

    void m868a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m878g(childAt) && (!z || layoutParams.f375c)) {
                i = m869a(childAt, 3) ? i | this.f385f.m939a(childAt, -childAt.getWidth(), childAt.getTop()) : i | this.f386g.m939a(childAt, getWidth(), childAt.getTop());
                layoutParams.f375c = false;
            }
        }
        this.f387h.m984a();
        this.f388i.m984a();
        if (i != 0) {
            invalidate();
        }
    }

    boolean m869a(View view, int i) {
        return (m876e(view) & i) == i;
    }

    public void m870b() {
        m868a(false);
    }

    void m871b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f376d) {
            layoutParams.f376d = false;
            if (this.f396q != null) {
                this.f396q.m976b(view);
            }
            sendAccessibilityEvent(32);
        }
    }

    void m872b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f374b) {
            layoutParams.f374b = f;
            m867a(view, f);
        }
    }

    void m873c() {
        int i = 0;
        if (!this.f395p) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            while (i < childCount) {
                getChildAt(i).dispatchTouchEvent(obtain);
                i++;
            }
            obtain.recycle();
            this.f395p = true;
        }
    }

    void m874c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f376d) {
            layoutParams.f376d = true;
            if (this.f396q != null) {
                this.f396q.m974a(view);
            }
            view.sendAccessibilityEvent(32);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f374b);
        }
        this.f383d = f;
        if ((this.f385f.m940a(true) | this.f386g.m940a(true)) != 0) {
            at.m654b(this);
        }
    }

    float m875d(View view) {
        return ((LayoutParams) view.getLayoutParams()).f374b;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean f = m877f(view);
        int i2 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (f) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m861k(childAt) && m878g(childAt)) {
                    if (childAt.getHeight() < height) {
                        i = width;
                    } else if (m869a(childAt, 3)) {
                        i = childAt.getRight();
                        if (i <= i2) {
                            i = i2;
                        }
                        i2 = i;
                        i = width;
                    } else {
                        i = childAt.getLeft();
                        if (i < width) {
                        }
                    }
                    i3++;
                    width = i;
                }
                i = width;
                i3++;
                width = i;
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        i = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f383d > 0.0f && f) {
            this.f384e.setColor((((int) (((float) ((this.f382c & -16777216) >>> 24)) * this.f383d)) << 24) | (this.f382c & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f384e);
        } else if (this.f399t != null && m869a(view, 3)) {
            i = this.f399t.getIntrinsicWidth();
            i2 = view.getRight();
            r2 = Math.max(0.0f, Math.min(((float) i2) / ((float) this.f385f.m941b()), 1.0f));
            this.f399t.setBounds(i2, view.getTop(), i + i2, view.getBottom());
            this.f399t.setAlpha((int) (255.0f * r2));
            this.f399t.draw(canvas);
        } else if (this.f400u != null && m869a(view, 5)) {
            i = this.f400u.getIntrinsicWidth();
            i2 = view.getLeft();
            r2 = Math.max(0.0f, Math.min(((float) (getWidth() - i2)) / ((float) this.f386g.m941b()), 1.0f));
            this.f400u.setBounds(i2 - i, view.getTop(), i2, view.getBottom());
            this.f400u.setAlpha((int) (255.0f * r2));
            this.f400u.draw(canvas);
        }
        return drawChild;
    }

    int m876e(View view) {
        return C0087n.m820a(((LayoutParams) view.getLayoutParams()).f373a, at.m658e(this));
    }

    boolean m877f(View view) {
        return ((LayoutParams) view.getLayoutParams()).f373a == 0;
    }

    boolean m878g(View view) {
        return (C0087n.m820a(((LayoutParams) view.getLayoutParams()).f373a, at.m658e(view)) & 7) != 0;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void m879h(View view) {
        if (m878g(view)) {
            if (this.f391l) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.f374b = 1.0f;
                layoutParams.f376d = true;
            } else if (m869a(view, 3)) {
                this.f385f.m939a(view, 0, view.getTop());
            } else {
                this.f386g.m939a(view, getWidth() - view.getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void m880i(View view) {
        if (m878g(view)) {
            if (this.f391l) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.f374b = 0.0f;
                layoutParams.f376d = false;
            } else if (m869a(view, 3)) {
                this.f385f.m939a(view, -view.getWidth(), view.getTop());
            } else {
                this.f386g.m939a(view, getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public boolean m881j(View view) {
        if (m878g(view)) {
            return ((LayoutParams) view.getLayoutParams()).f374b > 0.0f;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f391l = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f391l = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r0 = android.support.v4.view.C0099z.m844a(r8);
        r3 = r7.f385f;
        r3 = r3.m938a(r8);
        r4 = r7.f386g;
        r4 = r4.m938a(r8);
        r3 = r3 | r4;
        switch(r0) {
            case 0: goto L_0x0027;
            case 1: goto L_0x0063;
            case 2: goto L_0x004e;
            case 3: goto L_0x0063;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r3 != 0) goto L_0x0025;
    L_0x0019:
        if (r0 != 0) goto L_0x0025;
    L_0x001b:
        r0 = r7.m858e();
        if (r0 != 0) goto L_0x0025;
    L_0x0021:
        r0 = r7.f395p;
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        r2 = r1;
    L_0x0026:
        return r2;
    L_0x0027:
        r0 = r8.getX();
        r4 = r8.getY();
        r7.f397r = r0;
        r7.f398s = r4;
        r5 = r7.f383d;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x006b;
    L_0x003a:
        r5 = r7.f385f;
        r0 = (int) r0;
        r4 = (int) r4;
        r0 = r5.m951d(r0, r4);
        r0 = r7.m877f(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x0048:
        r0 = r1;
    L_0x0049:
        r7.f394o = r2;
        r7.f395p = r2;
        goto L_0x0017;
    L_0x004e:
        r0 = r7.f385f;
        r4 = 3;
        r0 = r0.m952d(r4);
        if (r0 == 0) goto L_0x0016;
    L_0x0057:
        r0 = r7.f387h;
        r0.m984a();
        r0 = r7.f388i;
        r0.m984a();
        r0 = r2;
        goto L_0x0017;
    L_0x0063:
        r7.m868a(r1);
        r7.f394o = r2;
        r7.f395p = r2;
        goto L_0x0016;
    L_0x006b:
        r0 = r2;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m859f()) {
            return super.onKeyDown(i, keyEvent);
        }
        C0092s.m827b(keyEvent);
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View g = m860g();
        if (g != null && m862a(g) == 0) {
            m870b();
        }
        return g != null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f390k = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m877f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m869a(childAt, 3)) {
                        i7 = ((int) (((float) measuredWidth) * layoutParams.f374b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i7)) / ((float) measuredWidth);
                    } else {
                        i7 = i5 - ((int) (((float) measuredWidth) * layoutParams.f374b));
                        f = ((float) (i5 - i7)) / ((float) measuredWidth);
                    }
                    Object obj = f != layoutParams.f374b ? 1 : null;
                    int i8;
                    switch (layoutParams.f373a & 112) {
                        case 16:
                            int i9 = i4 - i2;
                            i8 = (i9 - measuredHeight) / 2;
                            if (i8 < layoutParams.topMargin) {
                                i8 = layoutParams.topMargin;
                            } else if (i8 + measuredHeight > i9 - layoutParams.bottomMargin) {
                                i8 = (i9 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
                            break;
                        case 80:
                            i8 = i4 - i2;
                            childAt.layout(i7, (i8 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i8 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, layoutParams.topMargin, measuredWidth + i7, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (obj != null) {
                        m872b(childAt, f);
                    }
                    int i10 = layoutParams.f374b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i10) {
                        childAt.setVisibility(i10);
                    }
                }
            }
        }
        this.f390k = false;
        this.f391l = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r12, int r13) {
        /*
        r11 = this;
        r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r4 = 0;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.getMode(r12);
        r5 = android.view.View.MeasureSpec.getMode(r13);
        r2 = android.view.View.MeasureSpec.getSize(r12);
        r0 = android.view.View.MeasureSpec.getSize(r13);
        if (r3 != r10) goto L_0x001b;
    L_0x0019:
        if (r5 == r10) goto L_0x0046;
    L_0x001b:
        r6 = r11.isInEditMode();
        if (r6 == 0) goto L_0x0048;
    L_0x0021:
        if (r3 != r7) goto L_0x0040;
    L_0x0023:
        if (r5 != r7) goto L_0x0044;
    L_0x0025:
        r1 = r0;
    L_0x0026:
        r11.setMeasuredDimension(r2, r1);
        r5 = r11.getChildCount();
        r3 = r4;
    L_0x002e:
        if (r3 >= r5) goto L_0x0109;
    L_0x0030:
        r6 = r11.getChildAt(r3);
        r0 = r6.getVisibility();
        r7 = 8;
        if (r0 != r7) goto L_0x0050;
    L_0x003c:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x002e;
    L_0x0040:
        if (r3 != 0) goto L_0x0023;
    L_0x0042:
        r2 = r1;
        goto L_0x0023;
    L_0x0044:
        if (r5 == 0) goto L_0x0026;
    L_0x0046:
        r1 = r0;
        goto L_0x0026;
    L_0x0048:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "DrawerLayout must be measured with MeasureSpec.EXACTLY.";
        r0.<init>(r1);
        throw r0;
    L_0x0050:
        r0 = r6.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r7 = r11.m877f(r6);
        if (r7 == 0) goto L_0x0077;
    L_0x005c:
        r7 = r0.leftMargin;
        r7 = r2 - r7;
        r8 = r0.rightMargin;
        r7 = r7 - r8;
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10);
        r8 = r0.topMargin;
        r8 = r1 - r8;
        r0 = r0.bottomMargin;
        r0 = r8 - r0;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10);
        r6.measure(r7, r0);
        goto L_0x003c;
    L_0x0077:
        r7 = r11.m878g(r6);
        if (r7 == 0) goto L_0x00da;
    L_0x007d:
        r7 = r11.m876e(r6);
        r7 = r7 & 7;
        r8 = r4 & r7;
        if (r8 == 0) goto L_0x00bc;
    L_0x0087:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Child drawer has absolute gravity ";
        r1 = r1.append(r2);
        r2 = m856b(r7);
        r1 = r1.append(r2);
        r2 = " but this ";
        r1 = r1.append(r2);
        r2 = "DrawerLayout";
        r1 = r1.append(r2);
        r2 = " already has a ";
        r1 = r1.append(r2);
        r2 = "drawer view along that edge";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00bc:
        r7 = r11.f381b;
        r8 = r0.leftMargin;
        r7 = r7 + r8;
        r8 = r0.rightMargin;
        r7 = r7 + r8;
        r8 = r0.width;
        r7 = getChildMeasureSpec(r12, r7, r8);
        r8 = r0.topMargin;
        r9 = r0.bottomMargin;
        r8 = r8 + r9;
        r0 = r0.height;
        r0 = getChildMeasureSpec(r13, r8, r0);
        r6.measure(r7, r0);
        goto L_0x003c;
    L_0x00da:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Child ";
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r2 = " at index ";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, ";
        r1 = r1.append(r2);
        r2 = "Gravity.RIGHT or Gravity.NO_GRAVITY";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0109:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f377a != 0) {
            View a = m864a(savedState.f377a);
            if (a != null) {
                m879h(a);
            }
        }
        m865a(savedState.f378b, 3);
        m865a(savedState.f379c, 5);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m878g(childAt)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f376d) {
                    savedState.f377a = layoutParams.f373a;
                    break;
                }
            }
        }
        savedState.f378b = this.f392m;
        savedState.f379c = this.f393n;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f385f.m942b(motionEvent);
        this.f386g.m942b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case C0338e.MapAttrs_mapType /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f397r = x;
                this.f398s = y;
                this.f394o = false;
                this.f395p = false;
                break;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                boolean z;
                x = motionEvent.getX();
                y = motionEvent.getY();
                View d = this.f385f.m951d((int) x, (int) y);
                if (d != null && m877f(d)) {
                    x -= this.f397r;
                    y -= this.f398s;
                    int d2 = this.f385f.m950d();
                    if ((x * x) + (y * y) < ((float) (d2 * d2))) {
                        View a = m863a();
                        if (a != null) {
                            z = m862a(a) == 2;
                            m868a(z);
                            this.f394o = false;
                            break;
                        }
                    }
                }
                z = true;
                m868a(z);
                this.f394o = false;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                m868a(true);
                this.f394o = false;
                this.f395p = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f394o = z;
        if (z) {
            m868a(true);
        }
    }

    public void requestLayout() {
        if (!this.f390k) {
            super.requestLayout();
        }
    }

    public void setDrawerListener(C0105d c0105d) {
        this.f396q = c0105d;
    }

    public void setDrawerLockMode(int i) {
        m865a(i, 3);
        m865a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f382c = i;
        invalidate();
    }
}
