package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {
    private final ArrayList f82a;
    private Context f83b;
    private C0019m f84c;
    private int f85d;
    private OnTabChangeListener f86e;
    private C0028v f87f;
    private boolean f88g;

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        String f81a;

        static {
            CREATOR = new C0027u();
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f81a = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f81a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f81a);
        }
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82a = new ArrayList();
        m73a(context, attributeSet);
    }

    private C0007w m72a(String str, C0007w c0007w) {
        C0028v c0028v = null;
        int i = 0;
        while (i < this.f82a.size()) {
            C0028v c0028v2 = (C0028v) this.f82a.get(i);
            if (!c0028v2.f173a.equals(str)) {
                c0028v2 = c0028v;
            }
            i++;
            c0028v = c0028v2;
        }
        if (c0028v == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f87f != c0028v) {
            if (c0007w == null) {
                c0007w = this.f84c.m108a();
            }
            if (!(this.f87f == null || this.f87f.f176d == null)) {
                c0007w.m86a(this.f87f.f176d);
            }
            if (c0028v != null) {
                if (c0028v.f176d == null) {
                    c0028v.f176d = Fragment.m6a(this.f83b, c0028v.f174b.getName(), c0028v.f175c);
                    c0007w.m85a(this.f85d, c0028v.f176d, c0028v.f173a);
                } else {
                    c0007w.m87b(c0028v.f176d);
                }
            }
            this.f87f = c0028v;
        }
        return c0007w;
    }

    private void m73a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f85d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        C0007w c0007w = null;
        for (int i = 0; i < this.f82a.size(); i++) {
            C0028v c0028v = (C0028v) this.f82a.get(i);
            c0028v.f176d = this.f84c.m107a(c0028v.f173a);
            if (!(c0028v.f176d == null || c0028v.f176d.m35d())) {
                if (c0028v.f173a.equals(currentTabTag)) {
                    this.f87f = c0028v;
                } else {
                    if (c0007w == null) {
                        c0007w = this.f84c.m108a();
                    }
                    c0007w.m86a(c0028v.f176d);
                }
            }
        }
        this.f88g = true;
        C0007w a = m72a(currentTabTag, c0007w);
        if (a != null) {
            a.m84a();
            this.f84c.m109b();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f88g = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f81a);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f81a = getCurrentTabTag();
        return savedState;
    }

    public void onTabChanged(String str) {
        if (this.f88g) {
            C0007w a = m72a(str, null);
            if (a != null) {
                a.m84a();
            }
        }
        if (this.f86e != null) {
            this.f86e.onTabChanged(str);
        }
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f86e = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
