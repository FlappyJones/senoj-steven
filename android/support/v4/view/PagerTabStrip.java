package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.C0338e;

public class PagerTabStrip extends PagerTitleStrip {
    private int f250f;
    private int f251g;
    private int f252h;
    private int f253i;
    private int f254j;
    private int f255k;
    private final Paint f256l;
    private final Rect f257m;
    private int f258n;
    private boolean f259o;
    private boolean f260p;
    private int f261q;
    private boolean f262r;
    private float f263s;
    private float f264t;
    private int f265u;

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f256l = new Paint();
        this.f257m = new Rect();
        this.f258n = 255;
        this.f259o = false;
        this.f260p = false;
        this.f250f = this.e;
        this.f256l.setColor(this.f250f);
        float f = context.getResources().getDisplayMetrics().density;
        this.f251g = (int) ((3.0f * f) + 0.5f);
        this.f252h = (int) ((6.0f * f) + 0.5f);
        this.f253i = (int) (64.0f * f);
        this.f255k = (int) ((16.0f * f) + 0.5f);
        this.f261q = (int) ((1.0f * f) + 0.5f);
        this.f254j = (int) ((f * 32.0f) + 0.5f);
        this.f265u = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new af(this));
        this.d.setFocusable(true);
        this.d.setOnClickListener(new ag(this));
        if (getBackground() == null) {
            this.f259o = true;
        }
    }

    void m272a(int i, float f, boolean z) {
        Rect rect = this.f257m;
        int height = getHeight();
        int i2 = height - this.f251g;
        rect.set(this.c.getLeft() - this.f255k, i2, this.c.getRight() + this.f255k, height);
        super.m269a(i, f, z);
        this.f258n = (int) ((Math.abs(f - 0.5f) * 2.0f) * 255.0f);
        rect.union(this.c.getLeft() - this.f255k, i2, this.c.getRight() + this.f255k, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f259o;
    }

    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f254j);
    }

    public int getTabIndicatorColor() {
        return this.f250f;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.c.getLeft() - this.f255k;
        int right = this.c.getRight() + this.f255k;
        int i = height - this.f251g;
        this.f256l.setColor((this.f258n << 24) | (this.f250f & 16777215));
        canvas.drawRect((float) left, (float) i, (float) right, (float) height, this.f256l);
        if (this.f259o) {
            this.f256l.setColor(-16777216 | (this.f250f & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f261q), (float) (getWidth() - getPaddingRight()), (float) height, this.f256l);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f262r) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case C0338e.MapAttrs_mapType /*0*/:
                this.f263s = x;
                this.f264t = y;
                this.f262r = false;
                break;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                if (x >= ((float) (this.c.getLeft() - this.f255k))) {
                    if (x > ((float) (this.c.getRight() + this.f255k))) {
                        this.a.setCurrentItem(this.a.getCurrentItem() + 1);
                        break;
                    }
                }
                this.a.setCurrentItem(this.a.getCurrentItem() - 1);
                break;
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                if (Math.abs(x - this.f263s) > ((float) this.f265u) || Math.abs(y - this.f264t) > ((float) this.f265u)) {
                    this.f262r = true;
                    break;
                }
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f260p) {
            this.f259o = (-16777216 & i) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f260p) {
            this.f259o = drawable == null;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f260p) {
            this.f259o = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f259o = z;
        this.f260p = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f252h) {
            i4 = this.f252h;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f250f = i;
        this.f256l.setColor(this.f250f);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(getContext().getResources().getColor(i));
    }

    public void setTextSpacing(int i) {
        if (i < this.f253i) {
            i = this.f253i;
        }
        super.setTextSpacing(i);
    }
}
