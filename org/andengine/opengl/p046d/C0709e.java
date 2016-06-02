package org.andengine.opengl.p046d;

import java.util.ArrayList;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.d.e */
public class C0709e {
    private final ArrayList f2816a;
    private final ArrayList f2817b;

    public C0709e() {
        this.f2816a = new ArrayList();
        this.f2817b = new ArrayList();
    }

    public void m5379a() {
    }

    public synchronized void m5380a(C0607c c0607c) {
        this.f2816a.add(c0607c);
    }

    public synchronized void m5381a(C0714e c0714e) {
        ArrayList arrayList = this.f2816a;
        ArrayList arrayList2 = this.f2817b;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            C0607c c0607c = (C0607c) arrayList2.remove(size);
            if (c0607c.m5026d()) {
                c0607c.m5022a(c0714e);
            }
            arrayList.remove(c0607c);
        }
    }

    public synchronized void m5382b() {
        ArrayList arrayList = this.f2816a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0607c) arrayList.get(size)).m5027e();
        }
        arrayList.clear();
    }

    public synchronized void m5383b(C0607c c0607c) {
        if (this.f2816a.remove(c0607c)) {
            this.f2817b.add(c0607c);
        }
    }

    public synchronized void m5384c() {
        ArrayList arrayList = this.f2816a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0607c) arrayList.get(size)).m5027e();
        }
        arrayList.clear();
    }
}
