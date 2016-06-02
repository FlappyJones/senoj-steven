package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: android.support.v4.b.k */
final class C0043k implements Collection {
    final /* synthetic */ C0034f f212a;

    C0043k(C0034f c0034f) {
        this.f212a = c0034f;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f212a.m221c();
    }

    public boolean contains(Object obj) {
        return this.f212a.m218b(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f212a.m211a() == 0;
    }

    public Iterator iterator() {
        return new C0039g(this.f212a, 1);
    }

    public boolean remove(Object obj) {
        int b = this.f212a.m218b(obj);
        if (b < 0) {
            return false;
        }
        this.f212a.m215a(b);
        return true;
    }

    public boolean removeAll(Collection collection) {
        int i = 0;
        int a = this.f212a.m211a();
        boolean z = false;
        while (i < a) {
            if (collection.contains(this.f212a.m213a(i, 1))) {
                this.f212a.m215a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        int i = 0;
        int a = this.f212a.m211a();
        boolean z = false;
        while (i < a) {
            if (!collection.contains(this.f212a.m213a(i, 1))) {
                this.f212a.m215a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public int size() {
        return this.f212a.m211a();
    }

    public Object[] toArray() {
        return this.f212a.m220b(1);
    }

    public Object[] toArray(Object[] objArr) {
        return this.f212a.m217a(objArr, 1);
    }
}
