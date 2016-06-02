package android.support.v4.p001b;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.support.v4.b.j */
final class C0042j implements Iterator, Entry {
    int f208a;
    int f209b;
    boolean f210c;
    final /* synthetic */ C0034f f211d;

    C0042j(C0034f c0034f) {
        this.f211d = c0034f;
        this.f210c = false;
        this.f208a = c0034f.m211a() - 1;
        this.f209b = -1;
    }

    public Entry m241a() {
        this.f209b++;
        this.f210c = true;
        return this;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (!this.f210c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            if (!(C0036c.m236a(entry.getKey(), this.f211d.m213a(this.f209b, 0)) && C0036c.m236a(entry.getValue(), this.f211d.m213a(this.f209b, 1)))) {
                z = false;
            }
            return z;
        }
    }

    public Object getKey() {
        if (this.f210c) {
            return this.f211d.m213a(this.f209b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public Object getValue() {
        if (this.f210c) {
            return this.f211d.m213a(this.f209b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public boolean hasNext() {
        return this.f209b < this.f208a;
    }

    public final int hashCode() {
        int i = 0;
        if (this.f210c) {
            Object a = this.f211d.m213a(this.f209b, 0);
            Object a2 = this.f211d.m213a(this.f209b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public /* synthetic */ Object next() {
        return m241a();
    }

    public void remove() {
        if (this.f210c) {
            this.f209b--;
            this.f208a--;
            this.f210c = false;
            this.f211d.m215a(this.f209b);
            return;
        }
        throw new IllegalStateException();
    }

    public Object setValue(Object obj) {
        if (this.f210c) {
            return this.f211d.m214a(this.f209b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
