package com.google.tagmanager;

import com.google.analytics.p012a.p013a.C0274q;

/* renamed from: com.google.tagmanager.c */
public class C0536c {
    private final C0550r f2355a;
    private C0537d f2356b;
    private C0547o f2357c;
    private C0535b f2358d;
    private volatile String f2359e;
    private volatile C0274q f2360f;
    private volatile long f2361g;
    private volatile int f2362h;

    private boolean m4805b(long j) {
        if (this.f2361g == 0) {
            this.f2362h--;
            return true;
        }
        long j2 = j - this.f2361g;
        if (j2 < 5000) {
            return false;
        }
        if (this.f2362h < 30) {
            this.f2362h = Math.min(30, ((int) Math.floor((double) (j2 / 900000))) + this.f2362h);
        }
        if (this.f2362h <= 0) {
            return false;
        }
        this.f2362h--;
        return true;
    }

    private synchronized C0547o m4806c() {
        return this.f2357c;
    }

    private boolean m4807d() {
        return this.f2355a.m4842a() == C0555w.f2401b;
    }

    public synchronized void m4808a() {
        if (m4806c() == null) {
            C0542i.m4828b("refresh called for closed container");
        } else {
            try {
                if (m4807d()) {
                    C0542i.m4828b("Container is in DEFAULT_CONTAINER mode. Refresh request is ignored.");
                } else {
                    long a = this.f2358d.m4804a();
                    if (m4805b(a)) {
                        C0542i.m4830d("Container refresh requested");
                        m4809a(0);
                        this.f2361g = a;
                    } else {
                        C0542i.m4830d("Container refresh was called too often. Ignored.");
                    }
                }
            } catch (Exception e) {
                C0542i.m4827a("Calling refresh() throws an exception: " + e.getMessage());
            }
        }
    }

    synchronized void m4809a(long j) {
        if (!(this.f2356b == null || m4807d())) {
            this.f2356b.m4812a(j, this.f2360f == null ? null : this.f2360f.m2083C());
        }
    }

    synchronized void m4810a(String str) {
        this.f2359e = str;
        if (this.f2356b != null) {
            this.f2356b.m4813a(str);
        }
    }

    String m4811b() {
        return this.f2359e;
    }
}
