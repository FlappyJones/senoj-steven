package com.google.tagmanager.p014a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.tagmanager.a.bg */
public class bg extends AbstractList implements ai, RandomAccess {
    private final ai f2266a;

    public bg(ai aiVar) {
        this.f2266a = aiVar;
    }

    public String m4678a(int i) {
        return (String) this.f2266a.get(i);
    }

    public List m4679a() {
        return this.f2266a.m4570a();
    }

    public void m4680a(C0516h c0516h) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object get(int i) {
        return m4678a(i);
    }

    public Iterator iterator() {
        return new bi(this);
    }

    public ListIterator listIterator(int i) {
        return new bh(this, i);
    }

    public int size() {
        return this.f2266a.size();
    }
}
