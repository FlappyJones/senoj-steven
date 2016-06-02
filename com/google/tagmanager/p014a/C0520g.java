package com.google.tagmanager.p014a;

import java.util.NoSuchElementException;

/* renamed from: com.google.tagmanager.a.g */
class C0520g implements C0517i {
    final /* synthetic */ C0518e f2310a;
    private int f2311b;
    private final int f2312c;

    private C0520g(C0518e c0518e) {
        this.f2310a = c0518e;
        this.f2311b = c0518e.m4708b();
        this.f2312c = this.f2311b + c0518e.m4706a();
    }

    public Byte m4710a() {
        return Byte.valueOf(m4711b());
    }

    public byte m4711b() {
        if (this.f2311b >= this.f2312c) {
            throw new NoSuchElementException();
        }
        byte[] bArr = this.f2310a.c;
        int i = this.f2311b;
        this.f2311b = i + 1;
        return bArr[i];
    }

    public boolean hasNext() {
        return this.f2311b < this.f2312c;
    }

    public /* synthetic */ Object next() {
        return m4710a();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
