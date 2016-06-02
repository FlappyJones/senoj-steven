package org.andengine.opengl.p064b;

import java.util.ArrayList;
import org.andengine.p005d.p057e.C0637a;

/* renamed from: org.andengine.opengl.b.h */
public class C0682h {
    private final ArrayList f2728a;

    public C0682h() {
        this.f2728a = new ArrayList();
    }

    public synchronized void m5275a() {
        m5276a(C0677b.m5256a());
        m5276a(C0679d.m5263a());
        m5276a(C0681f.m5271a());
        m5276a(C0674a.m5250a());
        m5276a(C0680e.m5267a());
        m5276a(C0678c.m5259a());
    }

    public synchronized void m5276a(C0673g c0673g) {
        if (c0673g == null) {
            throw new IllegalArgumentException("pShaderProgram must not be null!");
        }
        if (c0673g.m5248b()) {
            C0637a.m5157c("Loading an already compiled " + C0673g.class.getSimpleName() + ": '" + c0673g.getClass().getSimpleName() + "'. '" + c0673g.getClass().getSimpleName() + "' will be recompiled.");
            c0673g.m5246a(false);
        }
        if (this.f2728a.contains(c0673g)) {
            C0637a.m5157c("Loading an already loaded " + C0673g.class.getSimpleName() + ": '" + c0673g.getClass().getSimpleName() + "'.");
        } else {
            this.f2728a.add(c0673g);
        }
    }

    public synchronized void m5277b() {
        ArrayList arrayList = this.f2728a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0673g) arrayList.get(size)).m5246a(false);
        }
        this.f2728a.clear();
    }

    public synchronized void m5278c() {
        ArrayList arrayList = this.f2728a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0673g) arrayList.get(size)).m5246a(false);
        }
    }
}
