package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class ae {
    private DataSetObservable f340a;

    public ae() {
        this.f340a = new DataSetObservable();
    }

    public abstract int m606a();

    public int m607a(Object obj) {
        return -1;
    }

    public CharSequence m608a(int i) {
        return null;
    }

    public Object m609a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object m610a(ViewGroup viewGroup, int i) {
        return m609a((View) viewGroup, i);
    }

    public void m611a(DataSetObserver dataSetObserver) {
        this.f340a.registerObserver(dataSetObserver);
    }

    public void m612a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void m613a(View view) {
    }

    public void m614a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void m615a(ViewGroup viewGroup) {
        m613a((View) viewGroup);
    }

    public void m616a(ViewGroup viewGroup, int i, Object obj) {
        m614a((View) viewGroup, i, obj);
    }

    public abstract boolean m617a(View view, Object obj);

    public float m618b(int i) {
        return 1.0f;
    }

    public Parcelable m619b() {
        return null;
    }

    public void m620b(DataSetObserver dataSetObserver) {
        this.f340a.unregisterObserver(dataSetObserver);
    }

    public void m621b(View view) {
    }

    public void m622b(View view, int i, Object obj) {
    }

    public void m623b(ViewGroup viewGroup) {
        m621b((View) viewGroup);
    }

    public void m624b(ViewGroup viewGroup, int i, Object obj) {
        m622b((View) viewGroup, i, obj);
    }
}
