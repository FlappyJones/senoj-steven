package com.google.tagmanager.p014a;

/* renamed from: com.google.tagmanager.a.c */
public abstract class C0515c implements ap {
    protected int f2210a;
    private boolean f2211b;

    public C0515c() {
        this.f2211b = true;
        this.f2210a = -1;
    }

    public ap m4543a() {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }

    bf m4544b() {
        return new bf(this);
    }

    public /* synthetic */ Object clone() {
        return m4543a();
    }

    public an m4545n() {
        throw new UnsupportedOperationException("toBuilder() is not supported in mutable messages.");
    }

    public an m4546o() {
        throw new UnsupportedOperationException("newBuilderForType() is not supported in mutable messages.");
    }
}
