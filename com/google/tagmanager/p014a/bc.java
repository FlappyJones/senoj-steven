package com.google.tagmanager.p014a;

import java.util.Map.Entry;

/* renamed from: com.google.tagmanager.a.bc */
class bc implements Comparable, Entry {
    final /* synthetic */ ax f2257a;
    private final Comparable f2258b;
    private Object f2259c;

    bc(ax axVar, Comparable comparable, Object obj) {
        this.f2257a = axVar;
        this.f2258b = comparable;
        this.f2259c = obj;
    }

    bc(ax axVar, Entry entry) {
        this(axVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private boolean m4670a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public int m4671a(bc bcVar) {
        return m4672a().compareTo(bcVar.m4672a());
    }

    public Comparable m4672a() {
        return this.f2258b;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m4671a((bc) obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m4670a(this.f2258b, entry.getKey()) && m4670a(this.f2259c, entry.getValue());
    }

    public /* synthetic */ Object getKey() {
        return m4672a();
    }

    public Object getValue() {
        return this.f2259c;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f2258b == null ? 0 : this.f2258b.hashCode();
        if (this.f2259c != null) {
            i = this.f2259c.hashCode();
        }
        return hashCode ^ i;
    }

    public Object setValue(Object obj) {
        this.f2257a.m4658e();
        Object obj2 = this.f2259c;
        this.f2259c = obj;
        return obj2;
    }

    public String toString() {
        return this.f2258b + "=" + this.f2259c;
    }
}
