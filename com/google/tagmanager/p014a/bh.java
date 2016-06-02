package com.google.tagmanager.p014a;

import java.util.ListIterator;

/* renamed from: com.google.tagmanager.a.bh */
class bh implements ListIterator {
    ListIterator f2267a;
    final /* synthetic */ int f2268b;
    final /* synthetic */ bg f2269c;

    bh(bg bgVar, int i) {
        this.f2269c = bgVar;
        this.f2268b = i;
        this.f2267a = this.f2269c.f2266a.listIterator(this.f2268b);
    }

    public String m4681a() {
        return (String) this.f2267a.next();
    }

    public void m4682a(String str) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void add(Object obj) {
        m4684b((String) obj);
    }

    public String m4683b() {
        return (String) this.f2267a.previous();
    }

    public void m4684b(String str) {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        return this.f2267a.hasNext();
    }

    public boolean hasPrevious() {
        return this.f2267a.hasPrevious();
    }

    public /* synthetic */ Object next() {
        return m4681a();
    }

    public int nextIndex() {
        return this.f2267a.nextIndex();
    }

    public /* synthetic */ Object previous() {
        return m4683b();
    }

    public int previousIndex() {
        return this.f2267a.previousIndex();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void set(Object obj) {
        m4682a((String) obj);
    }
}
