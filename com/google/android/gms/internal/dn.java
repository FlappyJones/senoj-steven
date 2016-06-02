package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class dn {
    private final List f1967a;
    private final Object f1968b;

    private dn(Object obj) {
        this.f1968b = C0394do.m3687a(obj);
        this.f1967a = new ArrayList();
    }

    public dn m3686a(String str, Object obj) {
        this.f1967a.add(((String) C0394do.m3687a((Object) str)) + "=" + String.valueOf(obj));
        return this;
    }

    public String toString() {
        StringBuilder append = new StringBuilder(100).append(this.f1968b.getClass().getSimpleName()).append('{');
        int size = this.f1967a.size();
        for (int i = 0; i < size; i++) {
            append.append((String) this.f1967a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
