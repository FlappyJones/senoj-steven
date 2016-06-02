package org.andengine.p003b;

import android.os.Process;
import org.andengine.p003b.p004b.p036a.C0576a;
import org.andengine.p005d.p057e.C0637a;

/* renamed from: org.andengine.b.d */
public class C0593d extends Thread {
    private C0575a f2519a;
    private final C0576a f2520b;

    public C0593d() {
        super(C0593d.class.getSimpleName());
        this.f2520b = new C0576a();
    }

    public void m4995a(C0575a c0575a) {
        this.f2519a = c0575a;
    }

    public void run() {
        Process.setThreadPriority(this.f2519a.m4946d().m4977l());
        while (true) {
            try {
                this.f2520b.a_(0.0f);
                this.f2519a.m4955m();
            } catch (Throwable e) {
                C0637a.m5152a(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(" interrupted. Don't worry - this ").append(e.getClass().getSimpleName()).append(" is most likely expected!").toString(), e);
                interrupt();
                return;
            }
        }
    }
}
