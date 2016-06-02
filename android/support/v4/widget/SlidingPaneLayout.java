package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.C0338e;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    static final C0101y f407a;
    private int f408b;
    private int f409c;
    private Drawable f410d;
    private final int f411e;
    private boolean f412f;
    private View f413g;
    private float f414h;
    private float f415i;
    private int f416j;
    private boolean f417k;
    private int f418l;
    private float f419m;
    private float f420n;
    private C0124w f421o;
    private final ac f422p;
    private boolean f423q;
    private boolean f424r;
    private final Rect f425s;
    private final ArrayList f426t;

    public class LayoutParams extends MarginLayoutParams {
        private static final int[] f401e;
        public float f402a;
        boolean f403b;
        boolean f404c;
        Paint f405d;

        static {
            f401e = new int[]{16843137};
        }

        public LayoutParams() {
            super(-1, -1);
            this.f402a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f402a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f401e);
            this.f402a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f402a = 0.0f;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f402a = 0.0f;
        }
    }

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        boolean f406a;

        static {
            CREATOR = new C0125x();
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f406a = parcel.readInt() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f406a ? 1 : 0);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            f407a = new ab();
        } else if (i >= 16) {
            f407a = new aa();
        } else {
            f407a = new C0102z();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f408b = -858993460;
        this.f424r = true;
        this.f425s = new Rect();
        this.f426t = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.f411e = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        at.m651a((View) this, new C0121t(this));
        at.m655b(this, 1);
        this.f422p = ac.m916a((ViewGroup) this, 0.5f, new C0123v());
        this.f422p.m935a(1);
        this.f422p.m934a(f * 400.0f);
    }

    private void m882a(float f) {
        int i = 0;
        LayoutParams layoutParams = (LayoutParams) this.f413g.getLayoutParams();
        int i2 = (!layoutParams.f404c || layoutParams.leftMargin > 0) ? 0 : 1;
        int childCount = getChildCount();
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt != this.f413g) {
                int i3 = (int) ((1.0f - this.f415i) * ((float) this.f418l));
                this.f415i = f;
                childAt.offsetLeftAndRight(i3 - ((int) ((1.0f - f) * ((float) this.f418l))));
                if (i2 != 0) {
                    m886a(childAt, 1.0f - this.f415i, this.f409c);
                }
            }
            i++;
        }
    }

    private void m883a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f413g.getLayoutParams();
        this.f414h = ((float) (i - (getPaddingLeft() + layoutParams.leftMargin))) / ((float) this.f416j);
        if (this.f418l != 0) {
            m882a(this.f414h);
        }
        if (layoutParams.f404c) {
            m886a(this.f413g, this.f414h, this.f408b);
        }
        m899a(this.f413g);
    }

    private void m886a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (16777215 & i);
            if (layoutParams.f405d == null) {
                layoutParams.f405d = new Paint();
            }
            layoutParams.f405d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
            if (at.m657d(view) != 2) {
                at.m649a(view, 2, layoutParams.f405d);
            }
            m897g(view);
        } else if (at.m657d(view) != 0) {
            if (layoutParams.f405d != null) {
                layoutParams.f405d.setColorFilter(null);
            }
            Runnable c0122u = new C0122u(this, view);
            this.f426t.add(c0122u);
            at.m652a((View) this, c0122u);
        }
    }

    private boolean m889a(View view, int i) {
        if (!this.f424r && !m900a(0.0f, i)) {
            return false;
        }
        this.f423q = false;
        return true;
    }

    private boolean m891b(View view, int i) {
        if (!this.f424r && !m900a(1.0f, i)) {
            return false;
        }
        this.f423q = true;
        return true;
    }

    private static boolean m896f(View view) {
        if (at.m660g(view)) {
            return true;
        }
        if (VERSION.SDK_INT >= 18) {
            return false;
        }
        Drawable background = view.getBackground();
        return background != null ? background.getOpacity() == -1 : false;
    }

    private void m897g(View view) {
        f407a.m909a(this, view);
    }

    void m898a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    void m899a(View view) {
        if (this.f421o != null) {
            this.f421o.m1088a(view, this.f414h);
        }
    }

    boolean m900a(float f, int i) {
        if (!this.f412f) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.f413g.getLayoutParams();
        if (!this.f422p.m939a(this.f413g, (int) (((float) (layoutParams.leftMargin + getPaddingLeft())) + (((float) this.f416j) * f)), this.f413g.getTop())) {
            return false;
        }
        m898a();
        at.m654b(this);
        return true;
    }

    void m901b(View view) {
        if (this.f421o != null) {
            this.f421o.m1087a(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean m902b() {
        return m891b(this.f413g, 0);
    }

    void m903c(View view) {
        if (this.f421o != null) {
            this.f421o.m1089b(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean m904c() {
        return m889a(this.f413g, 0);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f422p.m940a(true)) {
            return;
        }
        if (this.f412f) {
            at.m654b(this);
        } else {
            this.f422p.m954f();
        }
    }

    void m905d(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view == null || !m896f(view)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                int i6 = (Math.max(paddingLeft, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(width, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4;
                childAt.setVisibility(i6);
                i5++;
            } else {
                return;
            }
        }
    }

    public boolean m906d() {
        return !this.f412f || this.f414h == 1.0f;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && this.f410d != null) {
            int intrinsicWidth = this.f410d.getIntrinsicWidth();
            int left = childAt.getLeft();
            this.f410d.setBounds(left - intrinsicWidth, childAt.getTop(), left, childAt.getBottom());
            this.f410d.draw(canvas);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save(2);
        if (!(!this.f412f || layoutParams.f403b || this.f413g == null)) {
            canvas.getClipBounds(this.f425s);
            this.f425s.right = Math.min(this.f425s.right, this.f413g.getLeft());
            canvas.clipRect(this.f425s);
        }
        if (VERSION.SDK_INT >= 11) {
            drawChild = super.drawChild(canvas, view, j);
        } else if (!layoutParams.f404c || this.f414h <= 0.0f) {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            drawChild = super.drawChild(canvas, view, j);
        } else {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, (float) view.getLeft(), (float) view.getTop(), layoutParams.f405d);
                drawChild = false;
            } else {
                Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                drawChild = super.drawChild(canvas, view, j);
            }
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public boolean m907e() {
        return this.f412f;
    }

    boolean m908e(View view) {
        if (view == null) {
            return false;
        }
        boolean z = this.f412f && ((LayoutParams) view.getLayoutParams()).f404c && this.f414h > 0.0f;
        return z;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f409c;
    }

    public int getParallaxDistance() {
        return this.f418l;
    }

    public int getSliderFadeColor() {
        return this.f408b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f424r = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f424r = true;
        int size = this.f426t.size();
        for (int i = 0; i < size; i++) {
            ((C0122u) this.f426t.get(i)).run();
        }
        this.f426t.clear();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r2 = 0;
        r1 = 1;
        r3 = android.support.v4.view.C0099z.m844a(r8);
        r0 = r7.f412f;
        if (r0 != 0) goto L_0x002d;
    L_0x000a:
        if (r3 != 0) goto L_0x002d;
    L_0x000c:
        r0 = r7.getChildCount();
        if (r0 <= r1) goto L_0x002d;
    L_0x0012:
        r0 = r7.getChildAt(r1);
        if (r0 == 0) goto L_0x002d;
    L_0x0018:
        r4 = r7.f422p;
        r5 = r8.getX();
        r5 = (int) r5;
        r6 = r8.getY();
        r6 = (int) r6;
        r0 = r4.m946b(r0, r5, r6);
        if (r0 != 0) goto L_0x0041;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r7.f423q = r0;
    L_0x002d:
        r0 = r7.f412f;
        if (r0 == 0) goto L_0x0037;
    L_0x0031:
        r0 = r7.f417k;
        if (r0 == 0) goto L_0x0043;
    L_0x0035:
        if (r3 == 0) goto L_0x0043;
    L_0x0037:
        r0 = r7.f422p;
        r0.m953e();
        r2 = super.onInterceptTouchEvent(r8);
    L_0x0040:
        return r2;
    L_0x0041:
        r0 = r2;
        goto L_0x002b;
    L_0x0043:
        r0 = 3;
        if (r3 == r0) goto L_0x0048;
    L_0x0046:
        if (r3 != r1) goto L_0x004e;
    L_0x0048:
        r0 = r7.f422p;
        r0.m953e();
        goto L_0x0040;
    L_0x004e:
        switch(r3) {
            case 0: goto L_0x005e;
            case 1: goto L_0x0051;
            case 2: goto L_0x0082;
            default: goto L_0x0051;
        };
    L_0x0051:
        r0 = r2;
    L_0x0052:
        r3 = r7.f422p;
        r3 = r3.m938a(r8);
        if (r3 != 0) goto L_0x005c;
    L_0x005a:
        if (r0 == 0) goto L_0x0040;
    L_0x005c:
        r2 = r1;
        goto L_0x0040;
    L_0x005e:
        r7.f417k = r2;
        r0 = r8.getX();
        r3 = r8.getY();
        r7.f419m = r0;
        r7.f420n = r3;
        r4 = r7.f422p;
        r5 = r7.f413g;
        r0 = (int) r0;
        r3 = (int) r3;
        r0 = r4.m946b(r5, r0, r3);
        if (r0 == 0) goto L_0x0051;
    L_0x0078:
        r0 = r7.f413g;
        r0 = r7.m908e(r0);
        if (r0 == 0) goto L_0x0051;
    L_0x0080:
        r0 = r1;
        goto L_0x0052;
    L_0x0082:
        r0 = r8.getX();
        r3 = r8.getY();
        r4 = r7.f419m;
        r0 = r0 - r4;
        r0 = java.lang.Math.abs(r0);
        r4 = r7.f420n;
        r3 = r3 - r4;
        r3 = java.lang.Math.abs(r3);
        r4 = r7.f422p;
        r4 = r4.m950d();
        r4 = (float) r4;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0051;
    L_0x00a3:
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0051;
    L_0x00a7:
        r0 = r7.f422p;
        r0.m953e();
        r7.f417k = r1;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f424r) {
            float f = (this.f412f && this.f423q) ? 1.0f : 0.0f;
            this.f414h = f;
        }
        int i7 = 0;
        int i8 = paddingLeft;
        while (i7 < childCount) {
            int i9;
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                i9 = i8;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f403b) {
                    int min = (Math.min(paddingLeft, (i6 - paddingRight) - this.f411e) - i8) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f416j = min;
                    layoutParams.f404c = ((layoutParams.leftMargin + i8) + min) + (measuredWidth / 2) > i6 - paddingRight;
                    i9 = (layoutParams.leftMargin + ((int) (((float) min) * this.f414h))) + i8;
                    i5 = 0;
                } else if (!this.f412f || this.f418l == 0) {
                    i5 = 0;
                    i9 = paddingLeft;
                } else {
                    i5 = (int) ((1.0f - this.f414h) * ((float) this.f418l));
                    i9 = paddingLeft;
                }
                i5 = i9 - i5;
                childAt.layout(i5, paddingTop, i5 + measuredWidth, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
            i7++;
            i8 = i9;
        }
        if (this.f424r) {
            if (this.f412f) {
                if (this.f418l != 0) {
                    m882a(this.f414h);
                }
                if (((LayoutParams) this.f413g.getLayoutParams()).f404c) {
                    m886a(this.f413g, this.f414h, this.f408b);
                }
            } else {
                for (i5 = 0; i5 < childCount; i5++) {
                    m886a(getChildAt(i5), 0.0f, this.f408b);
                }
            }
            m905d(this.f413g);
        }
        this.f424r = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 == 0) {
                if (!isInEditMode()) {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                } else if (mode2 == 0) {
                    i3 = Integer.MIN_VALUE;
                    i4 = size;
                    size = 300;
                }
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        } else if (!isInEditMode()) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        } else if (mode == Integer.MIN_VALUE) {
            i3 = mode2;
            i4 = size;
            size = size2;
        } else {
            if (mode == 0) {
                i3 = mode2;
                i4 = 300;
                size = size2;
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                size2 = 0;
                mode2 = (size - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                size2 = (size - getPaddingTop()) - getPaddingBottom();
                mode2 = size2;
                break;
            default:
                size2 = 0;
                mode2 = -1;
                break;
        }
        boolean z = false;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f413g = null;
        int i5 = 0;
        int i6 = size2;
        float f = 0.0f;
        while (i5 < childCount) {
            float f2;
            int i7;
            boolean z2;
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f404c = false;
                size2 = paddingLeft;
                f2 = f;
                i7 = i6;
                z2 = z;
            } else {
                if (layoutParams.f402a > 0.0f) {
                    f += layoutParams.f402a;
                    if (layoutParams.width == 0) {
                        size2 = paddingLeft;
                        f2 = f;
                        i7 = i6;
                        z2 = z;
                    }
                }
                mode = layoutParams.leftMargin + layoutParams.rightMargin;
                mode = layoutParams.width == -2 ? MeasureSpec.makeMeasureSpec(i4 - mode, Integer.MIN_VALUE) : layoutParams.width == -1 ? MeasureSpec.makeMeasureSpec(i4 - mode, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                i7 = layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                childAt.measure(mode, i7);
                mode = childAt.getMeasuredWidth();
                i7 = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE && i7 > i6) {
                    i6 = Math.min(i7, mode2);
                }
                i7 = paddingLeft - mode;
                boolean z3 = i7 < 0;
                layoutParams.f403b = z3;
                z3 |= z;
                if (layoutParams.f403b) {
                    this.f413g = childAt;
                }
                size2 = i7;
                i7 = i6;
                float f3 = f;
                z2 = z3;
                f2 = f3;
            }
            i5++;
            z = z2;
            i6 = i7;
            f = f2;
            paddingLeft = size2;
        }
        if (z || f > 0.0f) {
            int i8 = i4 - this.f411e;
            for (i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getVisibility() != 8) {
                    layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        Object obj = (layoutParams.width != 0 || layoutParams.f402a <= 0.0f) ? null : 1;
                        i7 = obj != null ? 0 : childAt2.getMeasuredWidth();
                        if (!z || childAt2 == this.f413g) {
                            if (layoutParams.f402a > 0.0f) {
                                mode = layoutParams.width == 0 ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                if (z) {
                                    size2 = i4 - (layoutParams.rightMargin + layoutParams.leftMargin);
                                    i5 = MeasureSpec.makeMeasureSpec(size2, 1073741824);
                                    if (i7 != size2) {
                                        childAt2.measure(i5, mode);
                                    }
                                } else {
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(((int) ((layoutParams.f402a * ((float) Math.max(0, paddingLeft))) / f)) + i7, 1073741824), mode);
                                }
                            }
                        } else if (layoutParams.width < 0 && (i7 > i8 || layoutParams.f402a > 0.0f)) {
                            size2 = obj != null ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            childAt2.measure(MeasureSpec.makeMeasureSpec(i8, 1073741824), size2);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, i6);
        this.f412f = z;
        if (this.f422p.m933a() != 0 && !z) {
            this.f422p.m954f();
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f406a) {
            m902b();
        } else {
            m904c();
        }
        this.f423q = savedState.f406a;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f406a = m907e() ? m906d() : this.f423q;
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f424r = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f412f) {
            return super.onTouchEvent(motionEvent);
        }
        this.f422p.m942b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case C0338e.MapAttrs_mapType /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f419m = x;
                this.f420n = y;
                return true;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                if (!m908e(this.f413g)) {
                    return true;
                }
                x = motionEvent.getX();
                y = motionEvent.getY();
                float f = x - this.f419m;
                float f2 = y - this.f420n;
                int d = this.f422p.m950d();
                if ((f * f) + (f2 * f2) >= ((float) (d * d)) || !this.f422p.m946b(this.f413g, (int) x, (int) y)) {
                    return true;
                }
                m889a(this.f413g, 0);
                return true;
            default:
                return true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f412f) {
            this.f423q = view == this.f413g;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f409c = i;
    }

    public void setPanelSlideListener(C0124w c0124w) {
        this.f421o = c0124w;
    }

    public void setParallaxDistance(int i) {
        this.f418l = i;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f410d = drawable;
    }

    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i) {
        this.f408b = i;
    }
}
