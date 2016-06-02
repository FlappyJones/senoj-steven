package com.google.tagmanager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.tagmanager.e */
public class C0538e {
    public static final Object f2363a;
    private final ConcurrentHashMap f2364b;
    private final Map f2365c;
    private final ReentrantLock f2366d;
    private final LinkedList f2367e;

    static {
        f2363a = new Object();
    }

    C0538e() {
        this.f2364b = new ConcurrentHashMap();
        this.f2365c = new HashMap();
        this.f2366d = new ReentrantLock();
        this.f2367e = new LinkedList();
    }

    void m4814a(C0533f c0533f) {
        this.f2364b.put(c0533f, Integer.valueOf(0));
    }
}
