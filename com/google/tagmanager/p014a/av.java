package com.google.tagmanager.p014a;

/* renamed from: com.google.tagmanager.a.av */
class av implements C0517i {
    int f2239a;
    final /* synthetic */ ar f2240b;
    private final au f2241c;
    private C0517i f2242d;

    private av(ar arVar) {
        this.f2240b = arVar;
        this.f2241c = new au(null);
        this.f2242d = this.f2241c.m4645a().m4611c();
        this.f2239a = arVar.m4626a();
    }

    public Byte m4646a() {
        return Byte.valueOf(m4647b());
    }

    public byte m4647b() {
        if (!this.f2242d.hasNext()) {
            this.f2242d = this.f2241c.m4645a().m4611c();
        }
        this.f2239a--;
        return this.f2242d.m4617b();
    }

    public boolean hasNext() {
        return this.f2239a > 0;
    }

    public /* synthetic */ Object next() {
        return m4646a();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
