package org.andengine.p027a;

import java.util.ArrayList;

/* renamed from: org.andengine.a.b */
public abstract class C0564b implements C0563d {
    protected final ArrayList f2420a;
    protected float f2421b;

    public C0564b() {
        this.f2420a = new ArrayList();
        this.f2421b = 1.0f;
    }

    public float m4868a() {
        return this.f2421b;
    }

    public void m4869a(C0560c c0560c) {
        this.f2420a.add(c0560c);
    }

    public void m4870b() {
        ArrayList arrayList = this.f2420a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0560c c0560c = (C0560c) arrayList.get(size);
            c0560c.m4856e();
            c0560c.m4857f();
        }
    }

    public boolean m4871b(C0560c c0560c) {
        return this.f2420a.remove(c0560c);
    }
}
