package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: android.support.v4.b.i */
final class C0041i implements Set {
    final /* synthetic */ C0034f f207a;

    C0041i(C0034f c0034f) {
        this.f207a = c0034f;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f207a.m221c();
    }

    public boolean contains(Object obj) {
        return this.f207a.m212a(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        return C0034f.m207a(this.f207a.m219b(), collection);
    }

    public boolean equals(Object obj) {
        return C0034f.m208a((Set) this, obj);
    }

    public int hashCode() {
        int i = 0;
        for (int a = this.f207a.m211a() - 1; a >= 0; a--) {
            Object a2 = this.f207a.m213a(a, 0);
            i += a2 == null ? 0 : a2.hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f207a.m211a() == 0;
    }

    public Iterator iterator() {
        return new C0039g(this.f207a, 0);
    }

    public boolean remove(Object obj) {
        int a = this.f207a.m212a(obj);
        if (a < 0) {
            return false;
        }
        this.f207a.m215a(a);
        return true;
    }

    public boolean removeAll(Collection collection) {
        return C0034f.m209b(this.f207a.m219b(), collection);
    }

    public boolean retainAll(Collection collection) {
        return C0034f.m210c(this.f207a.m219b(), collection);
    }

    public int size() {
        return this.f207a.m211a();
    }

    public Object[] toArray() {
        return this.f207a.m220b(0);
    }

    public Object[] toArray(Object[] objArr) {
        return this.f207a.m217a(objArr, 0);
    }
}
