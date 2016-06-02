package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.b.h */
final class C0040h implements Set {
    final /* synthetic */ C0034f f206a;

    C0040h(C0034f c0034f) {
        this.f206a = c0034f;
    }

    public boolean m240a(Entry entry) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ boolean add(Object obj) {
        return m240a((Entry) obj);
    }

    public boolean addAll(Collection collection) {
        int a = this.f206a.m211a();
        for (Entry entry : collection) {
            this.f206a.m216a(entry.getKey(), entry.getValue());
        }
        return a != this.f206a.m211a();
    }

    public void clear() {
        this.f206a.m221c();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.f206a.m212a(entry.getKey());
        return a >= 0 ? C0036c.m236a(this.f206a.m213a(a, 1), entry.getValue()) : false;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        return C0034f.m208a((Set) this, obj);
    }

    public int hashCode() {
        int a = this.f206a.m211a() - 1;
        int i = 0;
        while (a >= 0) {
            Object a2 = this.f206a.m213a(a, 0);
            Object a3 = this.f206a.m213a(a, 1);
            a--;
            i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f206a.m211a() == 0;
    }

    public Iterator iterator() {
        return new C0042j(this.f206a);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f206a.m211a();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
