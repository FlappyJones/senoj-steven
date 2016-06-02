package org.andengine.opengl.p062a;

import java.util.ArrayList;
import org.andengine.opengl.util.C0714e;

/* renamed from: org.andengine.opengl.a.c */
public class C0668c {
    private final ArrayList f2677a;

    public C0668c() {
        this.f2677a = new ArrayList();
    }

    public void m5235a() {
    }

    public synchronized void m5236a(C0714e c0714e) {
        ArrayList arrayList = this.f2677a;
        int size = arrayList.size();
        if (size > 0) {
            for (int i = size - 1; i >= 0; i--) {
                ((C0666a) arrayList.get(i)).m5231a(c0714e);
            }
        }
    }

    public synchronized void m5237b() {
        ArrayList arrayList = this.f2677a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0666a) arrayList.get(size)).m5232b();
        }
        this.f2677a.clear();
    }

    public synchronized void m5238c() {
        ArrayList arrayList = this.f2677a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0666a) arrayList.get(size)).m5232b();
        }
    }
}
