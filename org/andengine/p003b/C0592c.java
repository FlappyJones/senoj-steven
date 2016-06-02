package org.andengine.p003b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: org.andengine.b.c */
public class C0592c extends ReentrantLock {
    final Condition f2517a;
    final AtomicBoolean f2518b;

    public C0592c(boolean z) {
        super(z);
        this.f2517a = newCondition();
        this.f2518b = new AtomicBoolean(false);
    }

    void m4991a() {
        this.f2518b.set(true);
        this.f2517a.signalAll();
    }

    void m4992b() {
        this.f2518b.set(false);
        this.f2517a.signalAll();
    }

    void m4993c() {
        while (!this.f2518b.get()) {
            this.f2517a.await();
        }
    }

    void m4994d() {
        while (this.f2518b.get()) {
            this.f2517a.await();
        }
    }
}
