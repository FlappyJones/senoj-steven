package com.google.tagmanager.p014a;

/* renamed from: com.google.tagmanager.a.d */
public abstract class C0258d implements aq {
    private static final C0526o f1306a;

    static {
        f1306a = C0526o.m4775a();
    }

    private bf m1900a(am amVar) {
        return amVar instanceof C0254a ? ((C0254a) amVar).m1869Q() : amVar instanceof C0515c ? ((C0515c) amVar).m4544b() : new bf(amVar);
    }

    private am m1901b(am amVar) {
        if (amVar == null || amVar.m1864j()) {
            return amVar;
        }
        throw m1900a(amVar).m4676a().m4566a(amVar);
    }

    public am m1902a(C0516h c0516h, C0526o c0526o) {
        am amVar;
        try {
            C0522k h = c0516h.m4597h();
            amVar = (am) m1898b(h, c0526o);
            h.m4724a(0);
            return amVar;
        } catch (af e) {
            throw e.m4566a(amVar);
        } catch (Throwable e2) {
            throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
        } catch (af e3) {
            throw e3;
        }
    }

    public am m1903b(C0516h c0516h, C0526o c0526o) {
        return m1901b(m1902a(c0516h, c0526o));
    }

    public /* synthetic */ Object m1904c(C0516h c0516h, C0526o c0526o) {
        return m1903b(c0516h, c0526o);
    }
}
