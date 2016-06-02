package com.google.tagmanager.p014a;

/* renamed from: com.google.tagmanager.a.p */
final class C0527p {
    private final Object f2341a;
    private final int f2342b;

    C0527p(Object obj, int i) {
        this.f2341a = obj;
        this.f2342b = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0527p)) {
            return false;
        }
        C0527p c0527p = (C0527p) obj;
        return this.f2341a == c0527p.f2341a && this.f2342b == c0527p.f2342b;
    }

    public int hashCode() {
        return (System.identityHashCode(this.f2341a) * 65535) + this.f2342b;
    }
}
