package com.google.tagmanager.p014a;

import java.util.NoSuchElementException;

/* renamed from: com.google.tagmanager.a.al */
class al implements C0517i {
    final /* synthetic */ aj f2226a;
    private int f2227b;
    private final int f2228c;

    private al(aj ajVar) {
        this.f2226a = ajVar;
        this.f2227b = 0;
        this.f2228c = ajVar.m4603a();
    }

    public Byte m4618a() {
        return Byte.valueOf(m4619b());
    }

    public byte m4619b() {
        try {
            byte[] bArr = this.f2226a.f2224c;
            int i = this.f2227b;
            this.f2227b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f2227b < this.f2228c;
    }

    public /* synthetic */ Object next() {
        return m4618a();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
