package com.google.tagmanager.p014a;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.tagmanager.a.bd */
class bd implements Iterator {
    final /* synthetic */ ax f2260a;
    private int f2261b;
    private boolean f2262c;
    private Iterator f2263d;

    private bd(ax axVar) {
        this.f2260a = axVar;
        this.f2261b = -1;
    }

    private Iterator m4673b() {
        if (this.f2263d == null) {
            this.f2263d = this.f2260a.f2252c.entrySet().iterator();
        }
        return this.f2263d;
    }

    public Entry m4674a() {
        this.f2262c = true;
        int i = this.f2261b + 1;
        this.f2261b = i;
        return i < this.f2260a.f2251b.size() ? (Entry) this.f2260a.f2251b.get(this.f2261b) : (Entry) m4673b().next();
    }

    public boolean hasNext() {
        return this.f2261b + 1 < this.f2260a.f2251b.size() || m4673b().hasNext();
    }

    public /* synthetic */ Object next() {
        return m4674a();
    }

    public void remove() {
        if (this.f2262c) {
            this.f2262c = false;
            this.f2260a.m4658e();
            if (this.f2261b < this.f2260a.f2251b.size()) {
                ax axVar = this.f2260a;
                int i = this.f2261b;
                this.f2261b = i - 1;
                axVar.m4656c(i);
                return;
            }
            m4673b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
