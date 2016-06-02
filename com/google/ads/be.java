package com.google.ads;

class be implements Runnable {
    final /* synthetic */ ba f1023a;
    final /* synthetic */ C0201d f1024b;
    final /* synthetic */ bd f1025c;

    be(bd bdVar, ba baVar, C0201d c0201d) {
        this.f1025c = bdVar;
        this.f1023a = baVar;
        this.f1024b = c0201d;
    }

    public void run() {
        this.f1025c.m1695b(this.f1023a, this.f1024b);
        synchronized (this.f1025c.f1020e) {
            this.f1025c.f1019d = null;
        }
    }
}
