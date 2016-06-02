package com.google.tagmanager.p014a;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.tagmanager.a.ax */
class ax extends AbstractMap {
    private final int f2250a;
    private List f2251b;
    private Map f2252c;
    private boolean f2253d;
    private volatile be f2254e;

    private ax(int i) {
        this.f2250a = i;
        this.f2251b = Collections.emptyList();
        this.f2252c = Collections.emptyMap();
    }

    private int m4651a(Comparable comparable) {
        int compareTo;
        int i = 0;
        int size = this.f2251b.size() - 1;
        if (size >= 0) {
            compareTo = comparable.compareTo(((bc) this.f2251b.get(size)).m4672a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            compareTo = comparable.compareTo(((bc) this.f2251b.get(i2)).m4672a());
            if (compareTo < 0) {
                compareTo = i2 - 1;
                size = i;
            } else if (compareTo <= 0) {
                return i2;
            } else {
                int i3 = size;
                size = i2 + 1;
                compareTo = i3;
            }
            i = size;
            size = compareTo;
        }
        return -(i + 1);
    }

    static ax m4652a(int i) {
        return new ay(i);
    }

    private Object m4656c(int i) {
        m4658e();
        Object value = ((bc) this.f2251b.remove(i)).getValue();
        if (!this.f2252c.isEmpty()) {
            Iterator it = m4659f().entrySet().iterator();
            this.f2251b.add(new bc(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private void m4658e() {
        if (this.f2253d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap m4659f() {
        m4658e();
        if (this.f2252c.isEmpty() && !(this.f2252c instanceof TreeMap)) {
            this.f2252c = new TreeMap();
        }
        return (SortedMap) this.f2252c;
    }

    private void m4660g() {
        m4658e();
        if (this.f2251b.isEmpty() && !(this.f2251b instanceof ArrayList)) {
            this.f2251b = new ArrayList(this.f2250a);
        }
    }

    public Object m4661a(Comparable comparable, Object obj) {
        m4658e();
        int a = m4651a(comparable);
        if (a >= 0) {
            return ((bc) this.f2251b.get(a)).setValue(obj);
        }
        m4660g();
        int i = -(a + 1);
        if (i >= this.f2250a) {
            return m4659f().put(comparable, obj);
        }
        if (this.f2251b.size() == this.f2250a) {
            bc bcVar = (bc) this.f2251b.remove(this.f2250a - 1);
            m4659f().put(bcVar.m4672a(), bcVar.getValue());
        }
        this.f2251b.add(i, new bc(this, comparable, obj));
        return null;
    }

    public void m4662a() {
        if (!this.f2253d) {
            this.f2252c = this.f2252c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2252c);
            this.f2253d = true;
        }
    }

    public Entry m4663b(int i) {
        return (Entry) this.f2251b.get(i);
    }

    public boolean m4664b() {
        return this.f2253d;
    }

    public int m4665c() {
        return this.f2251b.size();
    }

    public void clear() {
        m4658e();
        if (!this.f2251b.isEmpty()) {
            this.f2251b.clear();
        }
        if (!this.f2252c.isEmpty()) {
            this.f2252c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m4651a(comparable) >= 0 || this.f2252c.containsKey(comparable);
    }

    public Iterable m4666d() {
        return this.f2252c.isEmpty() ? az.m4668a() : this.f2252c.entrySet();
    }

    public Set entrySet() {
        if (this.f2254e == null) {
            this.f2254e = new be();
        }
        return this.f2254e;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m4651a(comparable);
        return a >= 0 ? ((bc) this.f2251b.get(a)).getValue() : this.f2252c.get(comparable);
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m4661a((Comparable) obj, obj2);
    }

    public Object remove(Object obj) {
        m4658e();
        Comparable comparable = (Comparable) obj;
        int a = m4651a(comparable);
        return a >= 0 ? m4656c(a) : this.f2252c.isEmpty() ? null : this.f2252c.remove(comparable);
    }

    public int size() {
        return this.f2251b.size() + this.f2252c.size();
    }
}
