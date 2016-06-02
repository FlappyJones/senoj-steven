package com.google.tagmanager;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.tagmanager.r */
public class C0550r {
    private static C0550r f2392f;
    private final C0552v f2393a;
    private final Context f2394b;
    private final C0538e f2395c;
    private volatile C0555w f2396d;
    private final ConcurrentMap f2397e;

    C0550r(Context context, C0552v c0552v, C0538e c0538e) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.f2394b = context.getApplicationContext();
        this.f2393a = c0552v;
        this.f2396d = C0555w.STANDARD;
        this.f2397e = new ConcurrentHashMap();
        this.f2395c = c0538e;
        this.f2395c.m4814a(new C0551s(this));
        this.f2395c.m4814a(new C0534a(this.f2394b));
    }

    public static C0550r m4841a(Context context) {
        C0550r c0550r;
        synchronized (C0550r.class) {
            if (f2392f == null) {
                f2392f = new C0550r(context, new C0553t(), new C0538e());
            }
            c0550r = f2392f;
        }
        return c0550r;
    }

    public C0555w m4842a() {
        return this.f2396d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    synchronized boolean m4843a(android.net.Uri r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r2 = com.google.tagmanager.C0545m.m4831a();	 Catch:{ all -> 0x0033 }
        r0 = r2.m4834a(r6);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0077;
    L_0x000b:
        r3 = r2.m4837d();	 Catch:{ all -> 0x0033 }
        r0 = com.google.tagmanager.C0554u.f2399a;	 Catch:{ all -> 0x0033 }
        r1 = r2.m4835b();	 Catch:{ all -> 0x0033 }
        r1 = r1.ordinal();	 Catch:{ all -> 0x0033 }
        r0 = r0[r1];	 Catch:{ all -> 0x0033 }
        switch(r0) {
            case 1: goto L_0x0021;
            case 2: goto L_0x0036;
            case 3: goto L_0x0036;
            default: goto L_0x001e;
        };
    L_0x001e:
        r0 = 1;
    L_0x001f:
        monitor-exit(r5);
        return r0;
    L_0x0021:
        r0 = r5.f2397e;	 Catch:{ all -> 0x0033 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0033 }
        r0 = (com.google.tagmanager.C0536c) r0;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x001e;
    L_0x002b:
        r1 = 0;
        r0.m4810a(r1);	 Catch:{ all -> 0x0033 }
        r0.m4808a();	 Catch:{ all -> 0x0033 }
        goto L_0x001e;
    L_0x0033:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x0036:
        r0 = r5.f2397e;	 Catch:{ all -> 0x0033 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0033 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0033 }
    L_0x0040:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x001e;
    L_0x0046:
        r0 = r4.next();	 Catch:{ all -> 0x0033 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0033 }
        r1 = r0.getValue();	 Catch:{ all -> 0x0033 }
        r1 = (com.google.tagmanager.C0536c) r1;	 Catch:{ all -> 0x0033 }
        r0 = r0.getKey();	 Catch:{ all -> 0x0033 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0033 }
        r0 = r0.equals(r3);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0069;
    L_0x005e:
        r0 = r2.m4836c();	 Catch:{ all -> 0x0033 }
        r1.m4810a(r0);	 Catch:{ all -> 0x0033 }
        r1.m4808a();	 Catch:{ all -> 0x0033 }
        goto L_0x0040;
    L_0x0069:
        r0 = r1.m4811b();	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0040;
    L_0x006f:
        r0 = 0;
        r1.m4810a(r0);	 Catch:{ all -> 0x0033 }
        r1.m4808a();	 Catch:{ all -> 0x0033 }
        goto L_0x0040;
    L_0x0077:
        r0 = 0;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.tagmanager.r.a(android.net.Uri):boolean");
    }
}
