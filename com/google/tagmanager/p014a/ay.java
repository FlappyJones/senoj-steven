package com.google.tagmanager.p014a;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.tagmanager.a.ay */
final class ay extends ax {
    ay(int i) {
        super(null);
    }

    public void m4667a() {
        if (!m4664b()) {
            for (int i = 0; i < m4665c(); i++) {
                Entry b = m4663b(i);
                if (((C0530s) b.getKey()).m4795c()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : m4666d()) {
                if (((C0530s) entry.getKey()).m4795c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.m4662a();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return super.m4661a((C0530s) obj, obj2);
    }
}
