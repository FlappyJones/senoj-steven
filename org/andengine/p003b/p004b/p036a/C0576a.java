package org.andengine.p003b.p004b.p036a;

import java.util.ArrayList;
import org.andengine.p003b.p004b.C0132c;

/* renamed from: org.andengine.b.b.a.a */
public class C0576a implements C0132c {
    private final ArrayList f2476a;

    public C0576a() {
        this.f2476a = new ArrayList();
    }

    public synchronized void a_(float f) {
        ArrayList arrayList = this.f2476a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Runnable) arrayList.remove(size)).run();
        }
    }
}
