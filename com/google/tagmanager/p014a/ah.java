package com.google.tagmanager.p014a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.tagmanager.a.ah */
public class ah extends AbstractList implements ai, RandomAccess {
    public static final ai f2220a;
    private final List f2221b;

    static {
        f2220a = new bg(new ah());
    }

    public ah() {
        this.f2221b = new ArrayList();
    }

    public ah(ai aiVar) {
        this.f2221b = new ArrayList(aiVar.size());
        addAll(aiVar);
    }

    private static String m4572a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C0516h ? ((C0516h) obj).m4595f() : ac.m4556b((byte[]) obj);
    }

    public String m4573a(int i) {
        Object obj = this.f2221b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String f;
        if (obj instanceof C0516h) {
            C0516h c0516h = (C0516h) obj;
            f = c0516h.m4595f();
            if (c0516h.m4596g()) {
                this.f2221b.set(i, f);
            }
            return f;
        }
        byte[] bArr = (byte[]) obj;
        f = ac.m4556b(bArr);
        if (ac.m4555a(bArr)) {
            this.f2221b.set(i, f);
        }
        return f;
    }

    public String m4574a(int i, String str) {
        return ah.m4572a(this.f2221b.set(i, str));
    }

    public List m4575a() {
        return Collections.unmodifiableList(this.f2221b);
    }

    public void m4576a(C0516h c0516h) {
        this.f2221b.add(c0516h);
        this.modCount++;
    }

    public /* synthetic */ void add(int i, Object obj) {
        m4578b(i, (String) obj);
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof ai) {
            collection = ((ai) collection).m4570a();
        }
        boolean addAll = this.f2221b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public String m4577b(int i) {
        Object remove = this.f2221b.remove(i);
        this.modCount++;
        return ah.m4572a(remove);
    }

    public void m4578b(int i, String str) {
        this.f2221b.add(i, str);
        this.modCount++;
    }

    public void clear() {
        this.f2221b.clear();
        this.modCount++;
    }

    public /* synthetic */ Object get(int i) {
        return m4573a(i);
    }

    public /* synthetic */ Object remove(int i) {
        return m4577b(i);
    }

    public /* synthetic */ Object set(int i, Object obj) {
        return m4574a(i, (String) obj);
    }

    public int size() {
        return this.f2221b.size();
    }
}
