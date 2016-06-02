package org.andengine.p005d.p037a.p052b;

import java.util.ArrayList;
import org.andengine.p005d.p057e.C0637a;

/* renamed from: org.andengine.d.a.b.a */
public abstract class C0619a {
    private final ArrayList f2554a;
    private final int f2555b;
    private final int f2556c;
    private int f2557d;

    public C0619a() {
        this(0);
    }

    public C0619a(int i) {
        this(i, 1);
    }

    public C0619a(int i, int i2) {
        this(i, i2, Integer.MAX_VALUE);
    }

    public C0619a(int i, int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("pGrowth must be greater than 0!");
        } else if (i3 < 0) {
            throw new IllegalArgumentException("pAvailableItemsMaximum must be at least 0!");
        } else {
            this.f2555b = i2;
            this.f2556c = i3;
            this.f2554a = new ArrayList(i);
            if (i > 0) {
                m5076a(i);
            }
        }
    }

    public synchronized void m5076a(int i) {
        ArrayList arrayList = this.f2554a;
        int size = this.f2556c - arrayList.size();
        if (i >= size) {
            i = size;
        }
        for (size = i - 1; size >= 0; size--) {
            arrayList.add(m5080c());
        }
    }

    protected void m5077a(Object obj) {
    }

    protected abstract Object m5078b();

    protected void m5079b(Object obj) {
    }

    protected Object m5080c() {
        return m5078b();
    }

    public synchronized void m5081c(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot recycle null item!");
        }
        m5077a(obj);
        if (this.f2554a.size() < this.f2556c) {
            this.f2554a.add(obj);
        }
        this.f2557d--;
        if (this.f2557d < 0) {
            C0637a.m5159d("More items recycled than obtained!");
        }
    }

    public synchronized Object m5082d() {
        Object remove;
        if (this.f2554a.size() > 0) {
            remove = this.f2554a.remove(this.f2554a.size() - 1);
        } else {
            if (this.f2555b == 1 || this.f2556c == 0) {
                remove = m5080c();
            } else {
                m5076a(this.f2555b);
                remove = this.f2554a.remove(this.f2554a.size() - 1);
            }
            C0637a.m5150a(new StringBuilder(String.valueOf(getClass().getName())).append("<").append(remove.getClass().getSimpleName()).append("> was exhausted, with ").append(this.f2557d).append(" item not yet recycled. Allocated ").append(this.f2555b).append(" more.").toString());
        }
        m5079b(remove);
        this.f2557d++;
        return remove;
    }
}
