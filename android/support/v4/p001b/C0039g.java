package android.support.v4.p001b;

import java.util.Iterator;

/* renamed from: android.support.v4.b.g */
final class C0039g implements Iterator {
    final int f201a;
    int f202b;
    int f203c;
    boolean f204d;
    final /* synthetic */ C0034f f205e;

    C0039g(C0034f c0034f, int i) {
        this.f205e = c0034f;
        this.f204d = false;
        this.f201a = i;
        this.f202b = c0034f.m211a();
    }

    public boolean hasNext() {
        return this.f203c < this.f202b;
    }

    public Object next() {
        Object a = this.f205e.m213a(this.f203c, this.f201a);
        this.f203c++;
        this.f204d = true;
        return a;
    }

    public void remove() {
        if (this.f204d) {
            this.f203c--;
            this.f202b--;
            this.f204d = false;
            this.f205e.m215a(this.f203c);
            return;
        }
        throw new IllegalStateException();
    }
}
