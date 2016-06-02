package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class PagerTitleStrip extends ViewGroup implements by {
    private static final int[] f233n;
    private static final int[] f234o;
    private static final aj f235q;
    ViewPager f236a;
    TextView f237b;
    TextView f238c;
    TextView f239d;
    int f240e;
    private int f241f;
    private float f242g;
    private int f243h;
    private int f244i;
    private boolean f245j;
    private boolean f246k;
    private final ai f247l;
    private WeakReference f248m;
    private int f249p;

    static {
        f233n = new int[]{16842804, 16842901, 16842904, 16842927};
        f234o = new int[]{16843660};
        if (VERSION.SDK_INT >= 14) {
            f235q = new al();
        } else {
            f235q = new ak();
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        boolean z = false;
        super(context, attributeSet);
        this.f241f = -1;
        this.f242g = -1.0f;
        this.f247l = new ai();
        View textView = new TextView(context);
        this.f237b = textView;
        addView(textView);
        textView = new TextView(context);
        this.f238c = textView;
        addView(textView);
        textView = new TextView(context);
        this.f239d = textView;
        addView(textView);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f233n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f237b.setTextAppearance(context, resourceId);
            this.f238c.setTextAppearance(context, resourceId);
            this.f239d.setTextAppearance(context, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            m268a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            dimensionPixelSize = obtainStyledAttributes.getColor(2, 0);
            this.f237b.setTextColor(dimensionPixelSize);
            this.f238c.setTextColor(dimensionPixelSize);
            this.f239d.setTextColor(dimensionPixelSize);
        }
        this.f244i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f240e = this.f238c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f237b.setEllipsize(TruncateAt.END);
        this.f238c.setEllipsize(TruncateAt.END);
        this.f239d.setEllipsize(TruncateAt.END);
        if (resourceId != 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(resourceId, f234o);
            z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f237b);
            setSingleLineAllCaps(this.f238c);
            setSingleLineAllCaps(this.f239d);
        } else {
            this.f237b.setSingleLine();
            this.f238c.setSingleLine();
            this.f239d.setSingleLine();
        }
        this.f243h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        f235q.m633a(textView);
    }

    public void m268a(int i, float f) {
        this.f237b.setTextSize(i, f);
        this.f238c.setTextSize(i, f);
        this.f239d.setTextSize(i, f);
    }

    void m269a(int i, float f, boolean z) {
        if (i != this.f241f) {
            m270a(i, this.f236a.getAdapter());
        } else if (!z && f == this.f242g) {
            return;
        }
        this.f246k = true;
        int measuredWidth = this.f237b.getMeasuredWidth();
        int measuredWidth2 = this.f238c.getMeasuredWidth();
        int measuredWidth3 = this.f239d.getMeasuredWidth();
        int i2 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = paddingRight + i2;
        int i4 = (width - (paddingLeft + i2)) - i3;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        i4 = ((width - i3) - ((int) (f2 * ((float) i4)))) - (measuredWidth2 / 2);
        i3 = i4 + measuredWidth2;
        i2 = this.f237b.getBaseline();
        measuredWidth2 = this.f238c.getBaseline();
        int baseline = this.f239d.getBaseline();
        int max = Math.max(Math.max(i2, measuredWidth2), baseline);
        i2 = max - i2;
        measuredWidth2 = max - measuredWidth2;
        baseline = max - baseline;
        max = this.f237b.getMeasuredHeight() + i2;
        int measuredHeight = this.f238c.getMeasuredHeight() + measuredWidth2;
        max = Math.max(Math.max(max, measuredHeight), this.f239d.getMeasuredHeight() + baseline);
        switch (this.f244i & 112) {
            case 16:
                paddingTop = (((height - paddingTop) - paddingBottom) - max) / 2;
                height = paddingTop + i2;
                measuredWidth2 += paddingTop;
                i2 = paddingTop + baseline;
                break;
            case 80:
                paddingTop = (height - paddingBottom) - max;
                height = paddingTop + i2;
                measuredWidth2 += paddingTop;
                i2 = paddingTop + baseline;
                break;
            default:
                height = paddingTop + i2;
                measuredWidth2 += paddingTop;
                i2 = paddingTop + baseline;
                break;
        }
        this.f238c.layout(i4, measuredWidth2, i3, this.f238c.getMeasuredHeight() + measuredWidth2);
        measuredWidth2 = Math.min(paddingLeft, (i4 - this.f243h) - measuredWidth);
        this.f237b.layout(measuredWidth2, height, measuredWidth + measuredWidth2, this.f237b.getMeasuredHeight() + height);
        measuredWidth2 = Math.max((width - paddingRight) - measuredWidth3, this.f243h + i3);
        this.f239d.layout(measuredWidth2, i2, measuredWidth2 + measuredWidth3, this.f239d.getMeasuredHeight() + i2);
        this.f242g = f;
        this.f246k = false;
    }

    void m270a(int i, ae aeVar) {
        CharSequence charSequence = null;
        int a = aeVar != null ? aeVar.m606a() : 0;
        this.f245j = true;
        CharSequence a2 = (i < 1 || aeVar == null) ? null : aeVar.m608a(i - 1);
        this.f237b.setText(a2);
        TextView textView = this.f238c;
        a2 = (aeVar == null || i >= a) ? null : aeVar.m608a(i);
        textView.setText(a2);
        if (i + 1 < a && aeVar != null) {
            charSequence = aeVar.m608a(i + 1);
        }
        this.f239d.setText(charSequence);
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        a = MeasureSpec.makeMeasureSpec((int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f), Integer.MIN_VALUE);
        height = MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
        this.f237b.measure(a, height);
        this.f238c.measure(a, height);
        this.f239d.measure(a, height);
        this.f241f = i;
        if (!this.f246k) {
            m269a(i, this.f242g, false);
        }
        this.f245j = false;
    }

    void m271a(ae aeVar, ae aeVar2) {
        if (aeVar != null) {
            aeVar.m620b(this.f247l);
            this.f248m = null;
        }
        if (aeVar2 != null) {
            aeVar2.m611a(this.f247l);
            this.f248m = new WeakReference(aeVar2);
        }
        if (this.f236a != null) {
            this.f241f = -1;
            this.f242g = -1.0f;
            m270a(this.f236a.getCurrentItem(), aeVar2);
            requestLayout();
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        return background != null ? background.getIntrinsicHeight() : 0;
    }

    public int getTextSpacing() {
        return this.f243h;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            ae adapter = viewPager.getAdapter();
            viewPager.m296a(this.f247l);
            viewPager.setOnAdapterChangeListener(this.f247l);
            this.f236a = viewPager;
            m271a(this.f248m != null ? (ae) this.f248m.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f236a != null) {
            m271a(this.f236a.getAdapter(), null);
            this.f236a.m296a(null);
            this.f236a.setOnAdapterChangeListener(null);
            this.f236a = null;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        if (this.f236a != null) {
            if (this.f242g >= 0.0f) {
                f = this.f242g;
            }
            m269a(this.f241f, f, true);
        }
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        mode = getMinHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = size2 - paddingTop;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) (((float) size) * 0.8f), Integer.MIN_VALUE);
        i3 = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        this.f237b.measure(makeMeasureSpec, i3);
        this.f238c.measure(makeMeasureSpec, i3);
        this.f239d.measure(makeMeasureSpec, i3);
        if (mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, Math.max(mode, this.f238c.getMeasuredHeight() + paddingTop));
        }
    }

    public void requestLayout() {
        if (!this.f245j) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f244i = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        this.f249p = ((int) (255.0f * f)) & 255;
        int i = (this.f249p << 24) | (this.f240e & 16777215);
        this.f237b.setTextColor(i);
        this.f239d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f240e = i;
        this.f238c.setTextColor(i);
        int i2 = (this.f249p << 24) | (this.f240e & 16777215);
        this.f237b.setTextColor(i2);
        this.f239d.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f243h = i;
        requestLayout();
    }
}
