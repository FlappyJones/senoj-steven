package org.andengine.opengl.p067c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: org.andengine.opengl.c.e */
public class C0701e {
    private final HashSet f2777a;
    private final HashMap f2778b;
    private final ArrayList f2779c;
    private final ArrayList f2780d;
    private final ArrayList f2781e;
    private C0703g f2782f;

    public C0701e() {
        this.f2777a = new HashSet();
        this.f2778b = new HashMap();
        this.f2779c = new ArrayList();
        this.f2780d = new ArrayList();
        this.f2781e = new ArrayList();
    }

    public synchronized void m5365a() {
        this.f2782f = new C0703g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m5366a(org.andengine.opengl.util.C0714e r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r3 = r8.f2777a;	 Catch:{ all -> 0x0049 }
        r4 = r8.f2779c;	 Catch:{ all -> 0x0049 }
        r5 = r8.f2780d;	 Catch:{ all -> 0x0049 }
        r6 = r8.f2781e;	 Catch:{ all -> 0x0049 }
        r0 = r4.size();	 Catch:{ all -> 0x0049 }
        r0 = r0 + -1;
        r1 = r0;
    L_0x0010:
        if (r1 >= 0) goto L_0x0031;
    L_0x0012:
        r7 = r5.size();	 Catch:{ all -> 0x0049 }
        if (r7 <= 0) goto L_0x001d;
    L_0x0018:
        r0 = r7 + -1;
        r2 = r0;
    L_0x001b:
        if (r2 >= 0) goto L_0x004c;
    L_0x001d:
        r2 = r6.size();	 Catch:{ all -> 0x0049 }
        if (r2 <= 0) goto L_0x0028;
    L_0x0023:
        r0 = r2 + -1;
        r1 = r0;
    L_0x0026:
        if (r1 >= 0) goto L_0x006c;
    L_0x0028:
        if (r7 > 0) goto L_0x002c;
    L_0x002a:
        if (r2 <= 0) goto L_0x002f;
    L_0x002c:
        java.lang.System.gc();	 Catch:{ all -> 0x0049 }
    L_0x002f:
        monitor-exit(r8);
        return;
    L_0x0031:
        r0 = r4.get(r1);	 Catch:{ all -> 0x0049 }
        r0 = (org.andengine.opengl.p067c.C0687a) r0;	 Catch:{ all -> 0x0049 }
        r2 = r0.m5303e();	 Catch:{ all -> 0x0049 }
        if (r2 == 0) goto L_0x0040;
    L_0x003d:
        r0.m5299c(r9);	 Catch:{ IOException -> 0x0044 }
    L_0x0040:
        r0 = r1 + -1;
        r1 = r0;
        goto L_0x0010;
    L_0x0044:
        r0 = move-exception;
        org.andengine.p005d.p057e.C0637a.m5153a(r0);	 Catch:{ all -> 0x0049 }
        goto L_0x0040;
    L_0x0049:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x004c:
        r0 = r5.remove(r2);	 Catch:{ all -> 0x0049 }
        r0 = (org.andengine.opengl.p067c.C0687a) r0;	 Catch:{ all -> 0x0049 }
        r1 = r0.m5300c();	 Catch:{ all -> 0x0049 }
        if (r1 != 0) goto L_0x0060;
    L_0x0058:
        r0.m5296a(r9);	 Catch:{ IOException -> 0x0067 }
        r1 = r8.f2782f;	 Catch:{ IOException -> 0x0067 }
        r1.m5372a(r9, r0);	 Catch:{ IOException -> 0x0067 }
    L_0x0060:
        r4.add(r0);	 Catch:{ all -> 0x0049 }
        r0 = r2 + -1;
        r2 = r0;
        goto L_0x001b;
    L_0x0067:
        r1 = move-exception;
        org.andengine.p005d.p057e.C0637a.m5153a(r1);	 Catch:{ all -> 0x0049 }
        goto L_0x0060;
    L_0x006c:
        r0 = r6.remove(r1);	 Catch:{ all -> 0x0049 }
        r0 = (org.andengine.opengl.p067c.C0687a) r0;	 Catch:{ all -> 0x0049 }
        r5 = r0.m5300c();	 Catch:{ all -> 0x0049 }
        if (r5 == 0) goto L_0x007b;
    L_0x0078:
        r0.m5298b(r9);	 Catch:{ all -> 0x0049 }
    L_0x007b:
        r4.remove(r0);	 Catch:{ all -> 0x0049 }
        r3.remove(r0);	 Catch:{ all -> 0x0049 }
        r0 = r1 + -1;
        r1 = r0;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.andengine.opengl.c.e.a(org.andengine.opengl.util.e):void");
    }

    public synchronized boolean m5367a(C0687a c0687a) {
        boolean z;
        if (c0687a == null) {
            throw new IllegalArgumentException("pTexture must not be null!");
        } else if (this.f2777a.contains(c0687a)) {
            this.f2781e.remove(c0687a);
            z = false;
        } else {
            this.f2777a.add(c0687a);
            this.f2780d.add(c0687a);
            z = true;
        }
        return z;
    }

    public synchronized void m5368b() {
        HashSet hashSet = this.f2777a;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C0687a) it.next()).m5301d();
            }
        }
        if (!this.f2779c.isEmpty()) {
            this.f2780d.addAll(this.f2779c);
            this.f2779c.clear();
        }
        if (!this.f2781e.isEmpty()) {
            this.f2777a.removeAll(this.f2781e);
            this.f2781e.clear();
        }
        this.f2782f.m5038e();
    }

    public synchronized void m5369c() {
        Iterator it = this.f2777a.iterator();
        while (it.hasNext()) {
            ((C0687a) it.next()).m5301d();
        }
        this.f2780d.clear();
        this.f2779c.clear();
        this.f2777a.clear();
        this.f2778b.clear();
        this.f2782f.m5040n();
        this.f2782f = null;
    }
}
