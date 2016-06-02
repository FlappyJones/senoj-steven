package com.google.tagmanager.p014a;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/* renamed from: com.google.tagmanager.a.at */
class at {
    private final Deque f2236a;

    private at() {
        this.f2236a = new ArrayDeque(ar.f2229c.length);
    }

    private int m4638a(int i) {
        int binarySearch = Arrays.binarySearch(ar.f2229c, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    private C0516h m4640a(C0516h c0516h, C0516h c0516h2) {
        m4641a(c0516h);
        m4641a(c0516h2);
        C0516h c0516h3 = (C0516h) this.f2236a.pop();
        while (!this.f2236a.isEmpty()) {
            c0516h3 = new ar(c0516h3, null);
        }
        return c0516h3;
    }

    private void m4641a(C0516h c0516h) {
        if (c0516h.m4599k()) {
            m4642b(c0516h);
        } else if (c0516h instanceof ar) {
            ar arVar = (ar) c0516h;
            m4641a(arVar.f2231e);
            m4641a(arVar.f2232f);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + c0516h.getClass());
        }
    }

    private void m4642b(C0516h c0516h) {
        int a = m4638a(c0516h.m4583a());
        int i = ar.f2229c[a + 1];
        if (this.f2236a.isEmpty() || ((C0516h) this.f2236a.peek()).m4583a() >= i) {
            this.f2236a.push(c0516h);
            return;
        }
        int i2 = ar.f2229c[a];
        C0516h c0516h2 = (C0516h) this.f2236a.pop();
        while (!this.f2236a.isEmpty() && ((C0516h) this.f2236a.peek()).m4583a() < i2) {
            c0516h2 = new ar(c0516h2, null);
        }
        c0516h2 = new ar(c0516h, null);
        while (!this.f2236a.isEmpty()) {
            if (((C0516h) this.f2236a.peek()).m4583a() >= ar.f2229c[m4638a(c0516h2.m4583a()) + 1]) {
                break;
            }
            c0516h2 = new ar(c0516h2, null);
        }
        this.f2236a.push(c0516h2);
    }
}
