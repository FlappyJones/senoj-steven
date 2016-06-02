package com.google.tagmanager.p014a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.tagmanager.a.au */
class au implements Iterator {
    private final Deque f2237a;
    private aj f2238b;

    private au(C0516h c0516h) {
        this.f2237a = new ArrayDeque(ar.f2229c.length);
        this.f2238b = m4643a(c0516h);
    }

    private aj m4643a(C0516h c0516h) {
        C0516h c0516h2 = c0516h;
        while (c0516h2 instanceof ar) {
            ar arVar = (ar) c0516h2;
            this.f2237a.push(arVar);
            c0516h2 = arVar.f2231e;
        }
        return (aj) c0516h2;
    }

    private aj m4644b() {
        while (!this.f2237a.isEmpty()) {
            aj a = m4643a(((ar) this.f2237a.pop()).f2232f);
            if (!a.m4593d()) {
                return a;
            }
        }
        return null;
    }

    public aj m4645a() {
        if (this.f2238b == null) {
            throw new NoSuchElementException();
        }
        aj ajVar = this.f2238b;
        this.f2238b = m4644b();
        return ajVar;
    }

    public boolean hasNext() {
        return this.f2238b != null;
    }

    public /* synthetic */ Object next() {
        return m4645a();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
