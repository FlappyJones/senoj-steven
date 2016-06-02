package com.google.tagmanager.p014a;

import java.util.Iterator;

/* renamed from: com.google.tagmanager.a.bi */
class bi implements Iterator {
    Iterator f2270a;
    final /* synthetic */ bg f2271b;

    bi(bg bgVar) {
        this.f2271b = bgVar;
        this.f2270a = this.f2271b.f2266a.iterator();
    }

    public String m4685a() {
        return (String) this.f2270a.next();
    }

    public boolean hasNext() {
        return this.f2270a.hasNext();
    }

    public /* synthetic */ Object next() {
        return m4685a();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
