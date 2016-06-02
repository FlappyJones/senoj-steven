package com.google.tagmanager.p014a;

import java.io.IOException;

/* renamed from: com.google.tagmanager.a.ag */
class ag {
    private final am f2216a;
    private final C0526o f2217b;
    private C0516h f2218c;
    private volatile am f2219d;

    private void m4568b() {
        if (this.f2219d == null) {
            synchronized (this) {
                if (this.f2219d != null) {
                    return;
                }
                try {
                    if (this.f2218c != null) {
                        this.f2219d = (am) this.f2216a.m1866c().m1899c(this.f2218c, this.f2217b);
                    }
                } catch (IOException e) {
                }
            }
        }
    }

    public am m4569a() {
        m4568b();
        return this.f2219d;
    }

    public boolean equals(Object obj) {
        m4568b();
        return this.f2219d.equals(obj);
    }

    public int hashCode() {
        m4568b();
        return this.f2219d.hashCode();
    }

    public String toString() {
        m4568b();
        return this.f2219d.toString();
    }
}
