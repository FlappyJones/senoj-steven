package com.google.tagmanager.p014a;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.tagmanager.a.be */
class be extends AbstractSet {
    final /* synthetic */ ax f2264a;

    private be(ax axVar) {
        this.f2264a = axVar;
    }

    public boolean m4675a(Entry entry) {
        if (contains(entry)) {
            return false;
        }
        this.f2264a.m4661a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public /* synthetic */ boolean add(Object obj) {
        return m4675a((Entry) obj);
    }

    public void clear() {
        this.f2264a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f2264a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator iterator() {
        return new bd(null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f2264a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f2264a.size();
    }
}
