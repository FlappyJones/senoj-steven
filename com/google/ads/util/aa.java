package com.google.ads.util;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class aa {
    private static final Object f1067a;
    private static int f1068b;
    private static HashMap f1069c;
    private final ArrayList f1070d;
    public final int f1071u;

    static {
        f1067a = new Object();
        f1068b = 0;
        f1069c = new HashMap();
    }

    public aa() {
        this.f1070d = new ArrayList();
        synchronized (f1067a) {
            int i = f1068b;
            f1068b = i + 1;
            this.f1071u = i;
            Integer num = (Integer) f1069c.get(getClass());
            if (num == null) {
                f1069c.put(getClass(), Integer.valueOf(1));
            } else {
                f1069c.put(getClass(), Integer.valueOf(num.intValue() + 1));
            }
        }
        C0229g.m1840d("State created: " + toString());
    }

    private void m1723a(ac acVar) {
        this.f1070d.add(acVar);
    }

    protected void finalize() {
        synchronized (f1067a) {
            f1069c.put(getClass(), Integer.valueOf(((Integer) f1069c.get(getClass())).intValue() - 1));
        }
        super.finalize();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f1071u + "]";
    }
}
