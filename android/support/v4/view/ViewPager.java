package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p000a.C0000a;
import android.support.v4.widget.C0109h;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.google.android.gms.C0338e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup {
    private static final int[] f275a;
    private static final cg af;
    private static final Comparator f276c;
    private static final Interpolator f277d;
    private boolean f278A;
    private boolean f279B;
    private int f280C;
    private int f281D;
    private int f282E;
    private float f283F;
    private float f284G;
    private float f285H;
    private float f286I;
    private int f287J;
    private VelocityTracker f288K;
    private int f289L;
    private int f290M;
    private int f291N;
    private int f292O;
    private boolean f293P;
    private C0109h f294Q;
    private C0109h f295R;
    private boolean f296S;
    private boolean f297T;
    private boolean f298U;
    private int f299V;
    private cc f300W;
    private cc f301Z;
    private cb aa;
    private cd ab;
    private Method ac;
    private int ad;
    private ArrayList ae;
    private final Runnable ag;
    private int ah;
    private int f302b;
    private final ArrayList f303e;
    private final bz f304f;
    private final Rect f305g;
    private ae f306h;
    private int f307i;
    private int f308j;
    private Parcelable f309k;
    private ClassLoader f310l;
    private Scroller f311m;
    private ce f312n;
    private int f313o;
    private Drawable f314p;
    private int f315q;
    private int f316r;
    private float f317s;
    private float f318t;
    private int f319u;
    private int f320v;
    private boolean f321w;
    private boolean f322x;
    private boolean f323y;
    private int f324z;

    public class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public boolean f266a;
        public int f267b;
        float f268c;
        boolean f269d;
        int f270e;
        int f271f;

        public LayoutParams() {
            super(-1, -1);
            this.f268c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f268c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f275a);
            this.f267b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int f272a;
        Parcelable f273b;
        ClassLoader f274c;

        static {
            CREATOR = C0000a.m0a(new cf());
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f272a = parcel.readInt();
            this.f273b = parcel.readParcelable(classLoader);
            this.f274c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f272a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f272a);
            parcel.writeParcelable(this.f273b, i);
        }
    }

    static {
        f275a = new int[]{16842931};
        f276c = new bv();
        f277d = new bw();
        af = new cg();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f303e = new ArrayList();
        this.f304f = new bz();
        this.f305g = new Rect();
        this.f308j = -1;
        this.f309k = null;
        this.f310l = null;
        this.f317s = -3.4028235E38f;
        this.f318t = Float.MAX_VALUE;
        this.f324z = 1;
        this.f287J = -1;
        this.f296S = true;
        this.f297T = false;
        this.ag = new bx(this);
        this.ah = 0;
        m297a();
    }

    private int m273a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f291N || Math.abs(i2) <= this.f289L) {
            i = (int) ((i >= this.f307i ? 0.4f : 0.6f) + (((float) i) + f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f303e.size() <= 0) {
            return i;
        }
        return Math.max(((bz) this.f303e.get(0)).f352b, Math.min(i, ((bz) this.f303e.get(this.f303e.size() - 1)).f352b));
    }

    private Rect m274a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private void m276a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f303e.isEmpty()) {
            bz b = m306b(this.f307i);
            int min = (int) ((b != null ? Math.min(b.f355e, this.f318t) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m281a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))));
        scrollTo(paddingLeft, getScrollY());
        if (!this.f311m.isFinished()) {
            this.f311m.startScroll(paddingLeft, 0, (int) (m306b(this.f307i).f355e * ((float) i)), 0, this.f311m.getDuration() - this.f311m.timePassed());
        }
    }

    private void m277a(int i, boolean z, int i2, boolean z2) {
        int max;
        bz b = m306b(i);
        if (b != null) {
            max = (int) (Math.max(this.f317s, Math.min(b.f355e, this.f318t)) * ((float) getClientWidth()));
        } else {
            max = 0;
        }
        if (z) {
            m300a(max, 0, i2);
            if (z2 && this.f300W != null) {
                this.f300W.m626a(i);
            }
            if (z2 && this.f301Z != null) {
                this.f301Z.m626a(i);
                return;
            }
            return;
        }
        if (z2 && this.f300W != null) {
            this.f300W.m626a(i);
        }
        if (z2 && this.f301Z != null) {
            this.f301Z.m626a(i);
        }
        m281a(false);
        scrollTo(max, 0);
        m287d(max);
    }

    private void m279a(bz bzVar, int i, bz bzVar2) {
        float f;
        int i2;
        bz bzVar3;
        int i3;
        int a = this.f306h.m606a();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.f313o) / ((float) clientWidth) : 0.0f;
        if (bzVar2 != null) {
            clientWidth = bzVar2.f352b;
            int i4;
            if (clientWidth < bzVar.f352b) {
                f = (bzVar2.f355e + bzVar2.f354d) + f2;
                i4 = clientWidth + 1;
                i2 = 0;
                while (i4 <= bzVar.f352b && i2 < this.f303e.size()) {
                    bzVar3 = (bz) this.f303e.get(i2);
                    while (i4 > bzVar3.f352b && i2 < this.f303e.size() - 1) {
                        i2++;
                        bzVar3 = (bz) this.f303e.get(i2);
                    }
                    while (i4 < bzVar3.f352b) {
                        f += this.f306h.m618b(i4) + f2;
                        i4++;
                    }
                    bzVar3.f355e = f;
                    f += bzVar3.f354d + f2;
                    i4++;
                }
            } else if (clientWidth > bzVar.f352b) {
                i2 = this.f303e.size() - 1;
                f = bzVar2.f355e;
                i4 = clientWidth - 1;
                while (i4 >= bzVar.f352b && i2 >= 0) {
                    bzVar3 = (bz) this.f303e.get(i2);
                    while (i4 < bzVar3.f352b && i2 > 0) {
                        i2--;
                        bzVar3 = (bz) this.f303e.get(i2);
                    }
                    while (i4 > bzVar3.f352b) {
                        f -= this.f306h.m618b(i4) + f2;
                        i4--;
                    }
                    f -= bzVar3.f354d + f2;
                    bzVar3.f355e = f;
                    i4--;
                }
            }
        }
        int size = this.f303e.size();
        float f3 = bzVar.f355e;
        i2 = bzVar.f352b - 1;
        this.f317s = bzVar.f352b == 0 ? bzVar.f355e : -3.4028235E38f;
        this.f318t = bzVar.f352b == a + -1 ? (bzVar.f355e + bzVar.f354d) - 1.0f : Float.MAX_VALUE;
        for (i3 = i - 1; i3 >= 0; i3--) {
            bzVar3 = (bz) this.f303e.get(i3);
            f = f3;
            while (i2 > bzVar3.f352b) {
                f -= this.f306h.m618b(i2) + f2;
                i2--;
            }
            f3 = f - (bzVar3.f354d + f2);
            bzVar3.f355e = f3;
            if (bzVar3.f352b == 0) {
                this.f317s = f3;
            }
            i2--;
        }
        f3 = (bzVar.f355e + bzVar.f354d) + f2;
        i2 = bzVar.f352b + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            bzVar3 = (bz) this.f303e.get(i3);
            f = f3;
            while (i2 < bzVar3.f352b) {
                f = (this.f306h.m618b(i2) + f2) + f;
                i2++;
            }
            if (bzVar3.f352b == a - 1) {
                this.f318t = (bzVar3.f354d + f) - 1.0f;
            }
            bzVar3.f355e = f;
            f3 = f + (bzVar3.f354d + f2);
            i2++;
        }
        this.f297T = false;
    }

    private void m280a(MotionEvent motionEvent) {
        int b = C0099z.m846b(motionEvent);
        if (C0099z.m847b(motionEvent, b) == this.f287J) {
            b = b == 0 ? 1 : 0;
            this.f283F = C0099z.m848c(motionEvent, b);
            this.f287J = C0099z.m847b(motionEvent, b);
            if (this.f288K != null) {
                this.f288K.clear();
            }
        }
    }

    private void m281a(boolean z) {
        int scrollX;
        boolean z2 = this.ah == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f311m.abortAnimation();
            scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f311m.getCurrX();
            int currY = this.f311m.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f323y = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.f303e.size(); scrollX++) {
            bz bzVar = (bz) this.f303e.get(scrollX);
            if (bzVar.f353c) {
                bzVar.f353c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            at.m652a((View) this, this.ag);
        } else {
            this.ag.run();
        }
    }

    private boolean m282a(float f, float f2) {
        return (f < ((float) this.f281D) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f281D)) && f2 < 0.0f);
    }

    private void m284b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            at.m649a(getChildAt(i), z ? 2 : 0, null);
        }
    }

    private boolean m285b(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.f283F - f;
        this.f283F = f;
        float scrollX = ((float) getScrollX()) + f3;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.f317s;
        float f5 = ((float) clientWidth) * this.f318t;
        bz bzVar = (bz) this.f303e.get(0);
        bz bzVar2 = (bz) this.f303e.get(this.f303e.size() - 1);
        if (bzVar.f352b != 0) {
            f4 = bzVar.f355e * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (bzVar2.f352b != this.f306h.m606a() - 1) {
            f2 = bzVar2.f355e * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.f294Q.m997a(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.f295R.m997a(Math.abs(scrollX - f2) / ((float) clientWidth));
            }
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.f283F += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        m287d((int) f4);
        return z3;
    }

    private void m286c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean m287d(int i) {
        if (this.f303e.size() == 0) {
            this.f298U = false;
            m299a(0, 0.0f, 0);
            if (this.f298U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        bz i2 = m291i();
        int clientWidth = getClientWidth();
        int i3 = this.f313o + clientWidth;
        float f = ((float) this.f313o) / ((float) clientWidth);
        int i4 = i2.f352b;
        float f2 = ((((float) i) / ((float) clientWidth)) - i2.f355e) / (i2.f354d + f);
        clientWidth = (int) (((float) i3) * f2);
        this.f298U = false;
        m299a(i4, f2, clientWidth);
        if (this.f298U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void m289g() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f266a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void m290h() {
        if (this.ad != 0) {
            if (this.ae == null) {
                this.ae = new ArrayList();
            } else {
                this.ae.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ae.add(getChildAt(i));
            }
            Collections.sort(this.ae, af);
        }
    }

    private bz m291i() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f313o) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        bz bzVar = null;
        while (i2 < this.f303e.size()) {
            int i3;
            bz bzVar2;
            bz bzVar3 = (bz) this.f303e.get(i2);
            bz bzVar4;
            if (obj != null || bzVar3.f352b == i + 1) {
                bzVar4 = bzVar3;
                i3 = i2;
                bzVar2 = bzVar4;
            } else {
                bzVar3 = this.f304f;
                bzVar3.f355e = (f2 + f3) + f;
                bzVar3.f352b = i + 1;
                bzVar3.f354d = this.f306h.m618b(bzVar3.f352b);
                bzVar4 = bzVar3;
                i3 = i2 - 1;
                bzVar2 = bzVar4;
            }
            f2 = bzVar2.f355e;
            f3 = (bzVar2.f354d + f2) + f;
            if (obj == null && scrollX < f2) {
                return bzVar;
            }
            if (scrollX < f3 || i3 == this.f303e.size() - 1) {
                return bzVar2;
            }
            f3 = f2;
            i = bzVar2.f352b;
            obj = null;
            f2 = bzVar2.f354d;
            bzVar = bzVar2;
            i2 = i3 + 1;
        }
        return bzVar;
    }

    private void m292j() {
        this.f278A = false;
        this.f279B = false;
        if (this.f288K != null) {
            this.f288K.recycle();
            this.f288K = null;
        }
    }

    private void setScrollState(int i) {
        if (this.ah != i) {
            this.ah = i;
            if (this.ab != null) {
                m284b(i != 0);
            }
            if (this.f300W != null) {
                this.f300W.m628b(i);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f322x != z) {
            this.f322x = z;
        }
    }

    float m293a(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    bz m294a(int i, int i2) {
        bz bzVar = new bz();
        bzVar.f352b = i;
        bzVar.f351a = this.f306h.m610a((ViewGroup) this, i);
        bzVar.f354d = this.f306h.m618b(i);
        if (i2 < 0 || i2 >= this.f303e.size()) {
            this.f303e.add(bzVar);
        } else {
            this.f303e.add(i2, bzVar);
        }
        return bzVar;
    }

    bz m295a(View view) {
        for (int i = 0; i < this.f303e.size(); i++) {
            bz bzVar = (bz) this.f303e.get(i);
            if (this.f306h.m617a(view, bzVar.f351a)) {
                return bzVar;
            }
        }
        return null;
    }

    cc m296a(cc ccVar) {
        cc ccVar2 = this.f301Z;
        this.f301Z = ccVar;
        return ccVar2;
    }

    void m297a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f311m = new Scroller(context, f277d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f282E = bj.m752a(viewConfiguration);
        this.f289L = (int) (400.0f * f);
        this.f290M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f294Q = new C0109h(context);
        this.f295R = new C0109h(context);
        this.f291N = (int) (25.0f * f);
        this.f292O = (int) (2.0f * f);
        this.f280C = (int) (16.0f * f);
        at.m651a((View) this, new ca(this));
        if (at.m656c(this) == 0) {
            at.m655b(this, 1);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m298a(int r19) {
        /*
        r18 = this;
        r3 = 0;
        r2 = 2;
        r0 = r18;
        r4 = r0.f307i;
        r0 = r19;
        if (r4 == r0) goto L_0x033f;
    L_0x000a:
        r0 = r18;
        r2 = r0.f307i;
        r0 = r19;
        if (r2 >= r0) goto L_0x0030;
    L_0x0012:
        r2 = 66;
    L_0x0014:
        r0 = r18;
        r3 = r0.f307i;
        r0 = r18;
        r3 = r0.m306b(r3);
        r0 = r19;
        r1 = r18;
        r1.f307i = r0;
        r4 = r3;
        r3 = r2;
    L_0x0026:
        r0 = r18;
        r2 = r0.f306h;
        if (r2 != 0) goto L_0x0033;
    L_0x002c:
        r18.m290h();
    L_0x002f:
        return;
    L_0x0030:
        r2 = 17;
        goto L_0x0014;
    L_0x0033:
        r0 = r18;
        r2 = r0.f323y;
        if (r2 == 0) goto L_0x003d;
    L_0x0039:
        r18.m290h();
        goto L_0x002f;
    L_0x003d:
        r2 = r18.getWindowToken();
        if (r2 == 0) goto L_0x002f;
    L_0x0043:
        r0 = r18;
        r2 = r0.f306h;
        r0 = r18;
        r2.m615a(r0);
        r0 = r18;
        r2 = r0.f324z;
        r5 = 0;
        r0 = r18;
        r6 = r0.f307i;
        r6 = r6 - r2;
        r11 = java.lang.Math.max(r5, r6);
        r0 = r18;
        r5 = r0.f306h;
        r12 = r5.m606a();
        r5 = r12 + -1;
        r0 = r18;
        r6 = r0.f307i;
        r2 = r2 + r6;
        r13 = java.lang.Math.min(r5, r2);
        r0 = r18;
        r2 = r0.f302b;
        if (r12 == r2) goto L_0x00da;
    L_0x0073:
        r2 = r18.getResources();	 Catch:{ NotFoundException -> 0x00d0 }
        r3 = r18.getId();	 Catch:{ NotFoundException -> 0x00d0 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00d0 }
    L_0x007f:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4 = r4.append(r5);
        r0 = r18;
        r5 = r0.f302b;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r18.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r18;
        r4 = r0.f306h;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00d0:
        r2 = move-exception;
        r2 = r18.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x007f;
    L_0x00da:
        r6 = 0;
        r2 = 0;
        r5 = r2;
    L_0x00dd:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.size();
        if (r5 >= r2) goto L_0x033c;
    L_0x00e7:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bz) r2;
        r7 = r2.f352b;
        r0 = r18;
        r8 = r0.f307i;
        if (r7 < r8) goto L_0x01cf;
    L_0x00f9:
        r7 = r2.f352b;
        r0 = r18;
        r8 = r0.f307i;
        if (r7 != r8) goto L_0x033c;
    L_0x0101:
        if (r2 != 0) goto L_0x0339;
    L_0x0103:
        if (r12 <= 0) goto L_0x0339;
    L_0x0105:
        r0 = r18;
        r2 = r0.f307i;
        r0 = r18;
        r2 = r0.m294a(r2, r5);
        r10 = r2;
    L_0x0110:
        if (r10 == 0) goto L_0x0180;
    L_0x0112:
        r9 = 0;
        r8 = r5 + -1;
        if (r8 < 0) goto L_0x01d4;
    L_0x0117:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.get(r8);
        r2 = (android.support.v4.view.bz) r2;
    L_0x0121:
        r14 = r18.getClientWidth();
        if (r14 > 0) goto L_0x01d7;
    L_0x0127:
        r6 = 0;
    L_0x0128:
        r0 = r18;
        r7 = r0.f307i;
        r7 = r7 + -1;
        r16 = r7;
        r7 = r9;
        r9 = r16;
        r17 = r8;
        r8 = r5;
        r5 = r17;
    L_0x0138:
        if (r9 < 0) goto L_0x0142;
    L_0x013a:
        r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r15 < 0) goto L_0x0216;
    L_0x013e:
        if (r9 >= r11) goto L_0x0216;
    L_0x0140:
        if (r2 != 0) goto L_0x01e6;
    L_0x0142:
        r6 = r10.f354d;
        r9 = r8 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x017b;
    L_0x014c:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.size();
        if (r9 >= r2) goto L_0x024c;
    L_0x0156:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.get(r9);
        r2 = (android.support.v4.view.bz) r2;
        r7 = r2;
    L_0x0161:
        if (r14 > 0) goto L_0x024f;
    L_0x0163:
        r2 = 0;
        r5 = r2;
    L_0x0165:
        r0 = r18;
        r2 = r0.f307i;
        r2 = r2 + 1;
        r16 = r2;
        r2 = r7;
        r7 = r9;
        r9 = r16;
    L_0x0171:
        if (r9 >= r12) goto L_0x017b;
    L_0x0173:
        r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r11 < 0) goto L_0x029a;
    L_0x0177:
        if (r9 <= r13) goto L_0x029a;
    L_0x0179:
        if (r2 != 0) goto L_0x025c;
    L_0x017b:
        r0 = r18;
        r0.m279a(r10, r8, r4);
    L_0x0180:
        r0 = r18;
        r4 = r0.f306h;
        r0 = r18;
        r5 = r0.f307i;
        if (r10 == 0) goto L_0x02e8;
    L_0x018a:
        r2 = r10.f351a;
    L_0x018c:
        r0 = r18;
        r4.m624b(r0, r5, r2);
        r0 = r18;
        r2 = r0.f306h;
        r0 = r18;
        r2.m623b(r0);
        r5 = r18.getChildCount();
        r2 = 0;
        r4 = r2;
    L_0x01a0:
        if (r4 >= r5) goto L_0x02eb;
    L_0x01a2:
        r0 = r18;
        r6 = r0.getChildAt(r4);
        r2 = r6.getLayoutParams();
        r2 = (android.support.v4.view.ViewPager.LayoutParams) r2;
        r2.f271f = r4;
        r7 = r2.f266a;
        if (r7 != 0) goto L_0x01cb;
    L_0x01b4:
        r7 = r2.f268c;
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x01cb;
    L_0x01bb:
        r0 = r18;
        r6 = r0.m295a(r6);
        if (r6 == 0) goto L_0x01cb;
    L_0x01c3:
        r7 = r6.f354d;
        r2.f268c = r7;
        r6 = r6.f352b;
        r2.f270e = r6;
    L_0x01cb:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x01a0;
    L_0x01cf:
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x00dd;
    L_0x01d4:
        r2 = 0;
        goto L_0x0121;
    L_0x01d7:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r10.f354d;
        r6 = r6 - r7;
        r7 = r18.getPaddingLeft();
        r7 = (float) r7;
        r15 = (float) r14;
        r7 = r7 / r15;
        r6 = r6 + r7;
        goto L_0x0128;
    L_0x01e6:
        r15 = r2.f352b;
        if (r9 != r15) goto L_0x0210;
    L_0x01ea:
        r15 = r2.f353c;
        if (r15 != 0) goto L_0x0210;
    L_0x01ee:
        r0 = r18;
        r15 = r0.f303e;
        r15.remove(r5);
        r0 = r18;
        r15 = r0.f306h;
        r2 = r2.f351a;
        r0 = r18;
        r15.m616a(r0, r9, r2);
        r5 = r5 + -1;
        r8 = r8 + -1;
        if (r5 < 0) goto L_0x0214;
    L_0x0206:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bz) r2;
    L_0x0210:
        r9 = r9 + -1;
        goto L_0x0138;
    L_0x0214:
        r2 = 0;
        goto L_0x0210;
    L_0x0216:
        if (r2 == 0) goto L_0x0230;
    L_0x0218:
        r15 = r2.f352b;
        if (r9 != r15) goto L_0x0230;
    L_0x021c:
        r2 = r2.f354d;
        r7 = r7 + r2;
        r5 = r5 + -1;
        if (r5 < 0) goto L_0x022e;
    L_0x0223:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bz) r2;
        goto L_0x0210;
    L_0x022e:
        r2 = 0;
        goto L_0x0210;
    L_0x0230:
        r2 = r5 + 1;
        r0 = r18;
        r2 = r0.m294a(r9, r2);
        r2 = r2.f354d;
        r7 = r7 + r2;
        r8 = r8 + 1;
        if (r5 < 0) goto L_0x024a;
    L_0x023f:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bz) r2;
        goto L_0x0210;
    L_0x024a:
        r2 = 0;
        goto L_0x0210;
    L_0x024c:
        r7 = 0;
        goto L_0x0161;
    L_0x024f:
        r2 = r18.getPaddingRight();
        r2 = (float) r2;
        r5 = (float) r14;
        r2 = r2 / r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r5;
        r5 = r2;
        goto L_0x0165;
    L_0x025c:
        r11 = r2.f352b;
        if (r9 != r11) goto L_0x0332;
    L_0x0260:
        r11 = r2.f353c;
        if (r11 != 0) goto L_0x0332;
    L_0x0264:
        r0 = r18;
        r11 = r0.f303e;
        r11.remove(r7);
        r0 = r18;
        r11 = r0.f306h;
        r2 = r2.f351a;
        r0 = r18;
        r11.m616a(r0, r9, r2);
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x0298;
    L_0x0280:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.bz) r2;
    L_0x028a:
        r16 = r6;
        r6 = r2;
        r2 = r16;
    L_0x028f:
        r9 = r9 + 1;
        r16 = r2;
        r2 = r6;
        r6 = r16;
        goto L_0x0171;
    L_0x0298:
        r2 = 0;
        goto L_0x028a;
    L_0x029a:
        if (r2 == 0) goto L_0x02c1;
    L_0x029c:
        r11 = r2.f352b;
        if (r9 != r11) goto L_0x02c1;
    L_0x02a0:
        r2 = r2.f354d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02bf;
    L_0x02af:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.bz) r2;
    L_0x02b9:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02bf:
        r2 = 0;
        goto L_0x02b9;
    L_0x02c1:
        r0 = r18;
        r2 = r0.m294a(r9, r7);
        r7 = r7 + 1;
        r2 = r2.f354d;
        r6 = r6 + r2;
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02e6;
    L_0x02d6:
        r0 = r18;
        r2 = r0.f303e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.bz) r2;
    L_0x02e0:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02e6:
        r2 = 0;
        goto L_0x02e0;
    L_0x02e8:
        r2 = 0;
        goto L_0x018c;
    L_0x02eb:
        r18.m290h();
        r2 = r18.hasFocus();
        if (r2 == 0) goto L_0x002f;
    L_0x02f4:
        r2 = r18.findFocus();
        if (r2 == 0) goto L_0x0330;
    L_0x02fa:
        r0 = r18;
        r2 = r0.m307b(r2);
    L_0x0300:
        if (r2 == 0) goto L_0x030a;
    L_0x0302:
        r2 = r2.f352b;
        r0 = r18;
        r4 = r0.f307i;
        if (r2 == r4) goto L_0x002f;
    L_0x030a:
        r2 = 0;
    L_0x030b:
        r4 = r18.getChildCount();
        if (r2 >= r4) goto L_0x002f;
    L_0x0311:
        r0 = r18;
        r4 = r0.getChildAt(r2);
        r0 = r18;
        r5 = r0.m295a(r4);
        if (r5 == 0) goto L_0x032d;
    L_0x031f:
        r5 = r5.f352b;
        r0 = r18;
        r6 = r0.f307i;
        if (r5 != r6) goto L_0x032d;
    L_0x0327:
        r4 = r4.requestFocus(r3);
        if (r4 != 0) goto L_0x002f;
    L_0x032d:
        r2 = r2 + 1;
        goto L_0x030b;
    L_0x0330:
        r2 = 0;
        goto L_0x0300;
    L_0x0332:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x0339:
        r10 = r2;
        goto L_0x0110;
    L_0x033c:
        r2 = r6;
        goto L_0x0101;
    L_0x033f:
        r4 = r3;
        r3 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    protected void m299a(int i, float f, int i2) {
        int paddingLeft;
        int paddingRight;
        int i3;
        if (this.f299V > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f266a) {
                    int max;
                    switch (layoutParams.f267b & 7) {
                        case C0338e.MapAttrs_cameraBearing /*1*/:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        case C0338e.MapAttrs_cameraTargetLng /*3*/:
                            max = childAt.getWidth() + paddingLeft;
                            i4 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i4;
                            break;
                        case C0338e.MapAttrs_cameraZoom /*5*/:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i4 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        default:
                            max = paddingLeft;
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i4 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i4;
                }
                i3++;
                i4 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i4;
            }
        }
        if (this.f300W != null) {
            this.f300W.m627a(i, f, i2);
        }
        if (this.f301Z != null) {
            this.f301Z.m627a(i, f, i2);
        }
        if (this.ab != null) {
            paddingRight = getScrollX();
            i3 = getChildCount();
            for (paddingLeft = 0; paddingLeft < i3; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((LayoutParams) childAt2.getLayoutParams()).f266a) {
                    this.ab.m781a(childAt2, ((float) (childAt2.getLeft() - paddingRight)) / ((float) getClientWidth()));
                }
            }
        }
        this.f298U = true;
    }

    void m300a(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m281a(false);
            m309c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float a = (((float) i6) * m293a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / ((float) clientWidth)))) + ((float) i6);
        int abs = Math.abs(i3);
        if (abs > 0) {
            clientWidth = Math.round(1000.0f * Math.abs(a / ((float) abs))) * 4;
        } else {
            clientWidth = (int) (((((float) Math.abs(i4)) / ((((float) clientWidth) * this.f306h.m618b(this.f307i)) + ((float) this.f313o))) + 1.0f) * 100.0f);
        }
        this.f311m.startScroll(scrollX, scrollY, i4, i5, Math.min(clientWidth, 600));
        at.m654b(this);
    }

    public void m301a(int i, boolean z) {
        this.f323y = false;
        m302a(i, z, false);
    }

    void m302a(int i, boolean z, boolean z2) {
        m303a(i, z, z2, 0);
    }

    void m303a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.f306h == null || this.f306h.m606a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f307i != i || this.f303e.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f306h.m606a()) {
                i = this.f306h.m606a() - 1;
            }
            int i3 = this.f324z;
            if (i > this.f307i + i3 || i < this.f307i - i3) {
                for (int i4 = 0; i4 < this.f303e.size(); i4++) {
                    ((bz) this.f303e.get(i4)).f353c = true;
                }
            }
            if (this.f307i != i) {
                z3 = true;
            }
            if (this.f296S) {
                this.f307i = i;
                if (z3 && this.f300W != null) {
                    this.f300W.m626a(i);
                }
                if (z3 && this.f301Z != null) {
                    this.f301Z.m626a(i);
                }
                requestLayout();
                return;
            }
            m298a(i);
            m277a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public boolean m304a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return m310c(17);
            case 22:
                return m310c(66);
            case 61:
                return VERSION.SDK_INT >= 11 ? C0092s.m825a(keyEvent) ? m310c(2) : C0092s.m826a(keyEvent, 1) ? m310c(1) : false : false;
            default:
                return false;
        }
    }

    protected boolean m305a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (m305a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && at.m653a(view, -i);
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    bz a = m295a(childAt);
                    if (a != null && a.f352b == this.f307i) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                bz a = m295a(childAt);
                if (a != null && a.f352b == this.f307i) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.f266a |= view instanceof by;
        if (!this.f321w) {
            super.addView(view, i, generateLayoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f266a) {
            layoutParams2.f269d = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    bz m306b(int i) {
        for (int i2 = 0; i2 < this.f303e.size(); i2++) {
            bz bzVar = (bz) this.f303e.get(i2);
            if (bzVar.f352b == i) {
                return bzVar;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.support.v4.view.bz m307b(android.view.View r3) {
        /*
        r2 = this;
    L_0x0000:
        r0 = r3.getParent();
        if (r0 == r2) goto L_0x0012;
    L_0x0006:
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r1 = r0 instanceof android.view.View;
        if (r1 != 0) goto L_0x000e;
    L_0x000c:
        r0 = 0;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = (android.view.View) r0;
        r3 = r0;
        goto L_0x0000;
    L_0x0012:
        r0 = r2.m295a(r3);
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.b(android.view.View):android.support.v4.view.bz");
    }

    void m308b() {
        int a = this.f306h.m606a();
        this.f302b = a;
        boolean z = this.f303e.size() < (this.f324z * 2) + 1 && this.f303e.size() < a;
        boolean z2 = false;
        int i = this.f307i;
        boolean z3 = z;
        int i2 = 0;
        while (i2 < this.f303e.size()) {
            int i3;
            boolean z4;
            int i4;
            boolean z5;
            bz bzVar = (bz) this.f303e.get(i2);
            int a2 = this.f306h.m607a(bzVar.f351a);
            if (a2 == -1) {
                i3 = i2;
                z4 = z2;
                i4 = i;
                z5 = z3;
            } else if (a2 == -2) {
                this.f303e.remove(i2);
                i2--;
                if (!z2) {
                    this.f306h.m615a((ViewGroup) this);
                    z2 = true;
                }
                this.f306h.m616a((ViewGroup) this, bzVar.f352b, bzVar.f351a);
                if (this.f307i == bzVar.f352b) {
                    i3 = i2;
                    z4 = z2;
                    i4 = Math.max(0, Math.min(this.f307i, a - 1));
                    z5 = true;
                } else {
                    i3 = i2;
                    z4 = z2;
                    i4 = i;
                    z5 = true;
                }
            } else if (bzVar.f352b != a2) {
                if (bzVar.f352b == this.f307i) {
                    i = a2;
                }
                bzVar.f352b = a2;
                i3 = i2;
                z4 = z2;
                i4 = i;
                z5 = true;
            } else {
                i3 = i2;
                z4 = z2;
                i4 = i;
                z5 = z3;
            }
            z3 = z5;
            i = i4;
            z2 = z4;
            i2 = i3 + 1;
        }
        if (z2) {
            this.f306h.m623b((ViewGroup) this);
        }
        Collections.sort(this.f303e, f276c);
        if (z3) {
            i4 = getChildCount();
            for (i2 = 0; i2 < i4; i2++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                if (!layoutParams.f266a) {
                    layoutParams.f268c = 0.0f;
                }
            }
            m302a(i, false, true);
            requestLayout();
        }
    }

    void m309c() {
        m298a(this.f307i);
    }

    public boolean m310c(int i) {
        View view;
        boolean d;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                Object obj;
                for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        stringBuilder.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            if (i == 17 || i == 1) {
                d = m311d();
            } else {
                if (i == 66 || i == 2) {
                    d = m312e();
                }
                d = false;
            }
        } else if (i == 17) {
            d = (view == null || m274a(this.f305g, findNextFocus).left < m274a(this.f305g, view).left) ? findNextFocus.requestFocus() : m311d();
        } else {
            if (i == 66) {
                d = (view == null || m274a(this.f305g, findNextFocus).left > m274a(this.f305g, view).left) ? findNextFocus.requestFocus() : m312e();
            }
            d = false;
        }
        if (d) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return d;
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = true;
        if (this.f306h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (((float) clientWidth) * this.f317s))) {
                z = false;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX >= ((int) (((float) clientWidth) * this.f318t))) {
                z = false;
            }
            return z;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.f311m.isFinished() || !this.f311m.computeScrollOffset()) {
            m281a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f311m.getCurrX();
        int currY = this.f311m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m287d(currX)) {
                this.f311m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        at.m654b(this);
    }

    boolean m311d() {
        if (this.f307i <= 0) {
            return false;
        }
        m301a(this.f307i - 1, true);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m304a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                bz a = m295a(childAt);
                if (a != null && a.f352b == this.f307i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int a = at.m647a(this);
        if (a == 0 || (a == 1 && this.f306h != null && this.f306h.m606a() > 1)) {
            int height;
            int width;
            if (!this.f294Q.m996a()) {
                a = canvas.save();
                height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f317s * ((float) width));
                this.f294Q.m995a(height, width);
                i = 0 | this.f294Q.m998a(canvas);
                canvas.restoreToCount(a);
            }
            if (!this.f295R.m996a()) {
                a = canvas.save();
                height = getWidth();
                width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f318t + 1.0f)) * ((float) height));
                this.f295R.m995a(width, height);
                i |= this.f295R.m998a(canvas);
                canvas.restoreToCount(a);
            }
        } else {
            this.f294Q.m999b();
            this.f295R.m999b();
        }
        if (i != 0) {
            at.m654b(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f314p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    boolean m312e() {
        if (this.f306h == null || this.f307i >= this.f306h.m606a() - 1) {
            return false;
        }
        m301a(this.f307i + 1, true);
        return true;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public ae getAdapter() {
        return this.f306h;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ad == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.ae.get(i2)).getLayoutParams()).f271f;
    }

    public int getCurrentItem() {
        return this.f307i;
    }

    public int getOffscreenPageLimit() {
        return this.f324z;
    }

    public int getPageMargin() {
        return this.f313o;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f296S = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.ag);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f313o > 0 && this.f314p != null && this.f303e.size() > 0 && this.f306h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.f313o) / ((float) width);
            bz bzVar = (bz) this.f303e.get(0);
            float f2 = bzVar.f355e;
            int size = this.f303e.size();
            int i = bzVar.f352b;
            int i2 = ((bz) this.f303e.get(size - 1)).f352b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > bzVar.f352b && i3 < size) {
                    i3++;
                    bzVar = (bz) this.f303e.get(i3);
                }
                if (i4 == bzVar.f352b) {
                    f3 = (bzVar.f355e + bzVar.f354d) * ((float) width);
                    f2 = (bzVar.f355e + bzVar.f354d) + f;
                } else {
                    float b = this.f306h.m618b(i4);
                    f3 = (f2 + b) * ((float) width);
                    f2 += b + f;
                }
                if (((float) this.f313o) + f3 > ((float) scrollX)) {
                    this.f314p.setBounds((int) f3, this.f315q, (int) ((((float) this.f313o) + f3) + 0.5f), this.f316r);
                    this.f314p.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f278A = false;
            this.f279B = false;
            this.f287J = -1;
            if (this.f288K == null) {
                return false;
            }
            this.f288K.recycle();
            this.f288K = null;
            return false;
        }
        if (action != 0) {
            if (this.f278A) {
                return true;
            }
            if (this.f279B) {
                return false;
            }
        }
        switch (action) {
            case C0338e.MapAttrs_mapType /*0*/:
                float x = motionEvent.getX();
                this.f285H = x;
                this.f283F = x;
                x = motionEvent.getY();
                this.f286I = x;
                this.f284G = x;
                this.f287J = C0099z.m847b(motionEvent, 0);
                this.f279B = false;
                this.f311m.computeScrollOffset();
                if (this.ah == 2 && Math.abs(this.f311m.getFinalX() - this.f311m.getCurrX()) > this.f292O) {
                    this.f311m.abortAnimation();
                    this.f323y = false;
                    m309c();
                    this.f278A = true;
                    m286c(true);
                    setScrollState(1);
                    break;
                }
                m281a(false);
                this.f278A = false;
                break;
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                action = this.f287J;
                if (action != -1) {
                    action = C0099z.m845a(motionEvent, action);
                    float c = C0099z.m848c(motionEvent, action);
                    float f = c - this.f283F;
                    float abs = Math.abs(f);
                    float d = C0099z.m850d(motionEvent, action);
                    float abs2 = Math.abs(d - this.f286I);
                    if (f == 0.0f || m282a(this.f283F, f) || !m305a(this, false, (int) f, (int) c, (int) d)) {
                        if (abs > ((float) this.f282E) && 0.5f * abs > abs2) {
                            this.f278A = true;
                            m286c(true);
                            setScrollState(1);
                            this.f283F = f > 0.0f ? this.f285H + ((float) this.f282E) : this.f285H - ((float) this.f282E);
                            this.f284G = d;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > ((float) this.f282E)) {
                            this.f279B = true;
                        }
                        if (this.f278A && m285b(c)) {
                            at.m654b(this);
                            break;
                        }
                    }
                    this.f283F = c;
                    this.f284G = d;
                    this.f279B = true;
                    return false;
                }
                break;
            case C0338e.MapAttrs_uiCompass /*6*/:
                m280a(motionEvent);
                break;
        }
        if (this.f288K == null) {
            this.f288K = VelocityTracker.obtain();
        }
        this.f288K.addMovement(motionEvent);
        return this.f278A;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams;
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f266a) {
                    int i9 = layoutParams.f267b & 112;
                    switch (layoutParams.f267b & 7) {
                        case C0338e.MapAttrs_cameraBearing /*1*/:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case C0338e.MapAttrs_cameraTargetLng /*3*/:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case C0338e.MapAttrs_cameraZoom /*5*/:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case 16:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case 48:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams.f266a) {
                    bz a = m295a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.f355e * ((float) max))) + paddingLeft;
                        if (layoutParams.f269d) {
                            layoutParams.f269d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.f268c * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.f315q = paddingTop;
        this.f316r = i6 - paddingBottom;
        this.f299V = i7;
        if (this.f296S) {
            m277a(this.f307i, false, 0, false);
        }
        this.f296S = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f281D = Math.min(measuredWidth / 10, this.f280C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams;
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.f266a) {
                    int i6 = layoutParams.f267b & 7;
                    int i7 = layoutParams.f267b & 112;
                    i3 = Integer.MIN_VALUE;
                    i5 = Integer.MIN_VALUE;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i5 = 1073741824;
                    }
                    if (layoutParams.width != -2) {
                        i7 = 1073741824;
                        i3 = layoutParams.width != -1 ? layoutParams.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (layoutParams.height != -2) {
                        i5 = 1073741824;
                        if (layoutParams.height != -1) {
                            measuredWidth = layoutParams.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.f319u = MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f320v = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f321w = true;
        m309c();
        this.f321w = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams == null || !layoutParams.f266a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.f268c * ((float) paddingLeft)), 1073741824), this.f320v);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                bz a = m295a(childAt);
                if (a != null && a.f352b == this.f307i && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.f306h != null) {
                this.f306h.m612a(savedState.f273b, savedState.f274c);
                m302a(savedState.f272a, false, true);
                return;
            }
            this.f308j = savedState.f272a;
            this.f309k = savedState.f273b;
            this.f310l = savedState.f274c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f272a = this.f307i;
        if (this.f306h != null) {
            savedState.f273b = this.f306h.m619b();
        }
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m276a(i, i3, this.f313o, this.f313o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f293P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f306h == null || this.f306h.m606a() == 0) {
            return false;
        }
        if (this.f288K == null) {
            this.f288K = VelocityTracker.obtain();
        }
        this.f288K.addMovement(motionEvent);
        float x;
        int a;
        switch (motionEvent.getAction() & 255) {
            case C0338e.MapAttrs_mapType /*0*/:
                this.f311m.abortAnimation();
                this.f323y = false;
                m309c();
                x = motionEvent.getX();
                this.f285H = x;
                this.f283F = x;
                x = motionEvent.getY();
                this.f286I = x;
                this.f284G = x;
                this.f287J = C0099z.m847b(motionEvent, 0);
                break;
            case C0338e.MapAttrs_cameraBearing /*1*/:
                if (this.f278A) {
                    VelocityTracker velocityTracker = this.f288K;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f290M);
                    a = (int) ao.m637a(velocityTracker, this.f287J);
                    this.f323y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    bz i = m291i();
                    m303a(m273a(i.f352b, ((((float) scrollX) / ((float) clientWidth)) - i.f355e) / i.f354d, a, (int) (C0099z.m848c(motionEvent, C0099z.m845a(motionEvent, this.f287J)) - this.f285H)), true, true, a);
                    this.f287J = -1;
                    m292j();
                    z = this.f295R.m1000c() | this.f294Q.m1000c();
                    break;
                }
                break;
            case C0338e.MapAttrs_cameraTargetLat /*2*/:
                if (!this.f278A) {
                    a = C0099z.m845a(motionEvent, this.f287J);
                    float c = C0099z.m848c(motionEvent, a);
                    float abs = Math.abs(c - this.f283F);
                    float d = C0099z.m850d(motionEvent, a);
                    x = Math.abs(d - this.f284G);
                    if (abs > ((float) this.f282E) && abs > x) {
                        this.f278A = true;
                        m286c(true);
                        this.f283F = c - this.f285H > 0.0f ? this.f285H + ((float) this.f282E) : this.f285H - ((float) this.f282E);
                        this.f284G = d;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f278A) {
                    z = false | m285b(C0099z.m848c(motionEvent, C0099z.m845a(motionEvent, this.f287J)));
                    break;
                }
                break;
            case C0338e.MapAttrs_cameraTargetLng /*3*/:
                if (this.f278A) {
                    m277a(this.f307i, true, 0, false);
                    this.f287J = -1;
                    m292j();
                    z = this.f295R.m1000c() | this.f294Q.m1000c();
                    break;
                }
                break;
            case C0338e.MapAttrs_cameraZoom /*5*/:
                a = C0099z.m846b(motionEvent);
                this.f283F = C0099z.m848c(motionEvent, a);
                this.f287J = C0099z.m847b(motionEvent, a);
                break;
            case C0338e.MapAttrs_uiCompass /*6*/:
                m280a(motionEvent);
                this.f283F = C0099z.m848c(motionEvent, C0099z.m845a(motionEvent, this.f287J));
                break;
        }
        if (z) {
            at.m654b(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.f321w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(ae aeVar) {
        if (this.f306h != null) {
            this.f306h.m620b(this.f312n);
            this.f306h.m615a((ViewGroup) this);
            for (int i = 0; i < this.f303e.size(); i++) {
                bz bzVar = (bz) this.f303e.get(i);
                this.f306h.m616a((ViewGroup) this, bzVar.f352b, bzVar.f351a);
            }
            this.f306h.m623b((ViewGroup) this);
            this.f303e.clear();
            m289g();
            this.f307i = 0;
            scrollTo(0, 0);
        }
        ae aeVar2 = this.f306h;
        this.f306h = aeVar;
        this.f302b = 0;
        if (this.f306h != null) {
            if (this.f312n == null) {
                this.f312n = new ce();
            }
            this.f306h.m611a(this.f312n);
            this.f323y = false;
            boolean z = this.f296S;
            this.f296S = true;
            this.f302b = this.f306h.m606a();
            if (this.f308j >= 0) {
                this.f306h.m612a(this.f309k, this.f310l);
                m302a(this.f308j, false, true);
                this.f308j = -1;
                this.f309k = null;
                this.f310l = null;
            } else if (z) {
                requestLayout();
            } else {
                m309c();
            }
        }
        if (this.aa != null && aeVar2 != aeVar) {
            this.aa.m625a(aeVar2, aeVar);
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.ac == null) {
                try {
                    this.ac = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.ac.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f323y = false;
        m302a(i, !this.f296S, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f324z) {
            this.f324z = i;
            m309c();
        }
    }

    void setOnAdapterChangeListener(cb cbVar) {
        this.aa = cbVar;
    }

    public void setOnPageChangeListener(cc ccVar) {
        this.f300W = ccVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f313o;
        this.f313o = i;
        int width = getWidth();
        m276a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f314p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f314p;
    }
}
