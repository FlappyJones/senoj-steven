package com.google.tagmanager.p014a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.tagmanager.a.o */
public class C0526o {
    private static volatile boolean f2338a;
    private static final C0526o f2339c;
    private final Map f2340b;

    static {
        f2338a = false;
        f2339c = new C0526o(true);
    }

    C0526o() {
        this.f2340b = new HashMap();
    }

    private C0526o(boolean z) {
        this.f2340b = Collections.emptyMap();
    }

    public static C0526o m4775a() {
        return f2339c;
    }

    public aa m4776a(am amVar, int i) {
        return (aa) this.f2340b.get(new C0527p(amVar, i));
    }
}
