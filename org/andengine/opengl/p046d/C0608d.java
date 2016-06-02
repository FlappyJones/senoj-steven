package org.andengine.opengl.p046d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.andengine.opengl.p046d.p074a.C0706c;
import org.andengine.opengl.p064b.C0673g;
import org.andengine.opengl.util.BufferUtils;
import org.andengine.opengl.util.C0714e;
import org.andengine.p005d.C0633c;

/* renamed from: org.andengine.opengl.d.d */
public abstract class C0608d implements C0607c {
    protected final int f2532c;
    protected final boolean f2533d;
    protected final int f2534e;
    protected final ByteBuffer f2535f;
    protected int f2536g;
    protected boolean f2537h;
    protected boolean f2538i;
    protected final C0709e f2539j;
    protected final C0706c f2540k;

    public C0608d(C0709e c0709e, int i, C0708a c0708a, boolean z, C0706c c0706c) {
        this.f2536g = -1;
        this.f2537h = true;
        this.f2539j = c0709e;
        this.f2532c = i;
        this.f2534e = c0708a.m5378a();
        this.f2533d = z;
        this.f2540k = c0706c;
        this.f2535f = BufferUtils.m5385a(i * 4);
        this.f2535f.order(ByteOrder.nativeOrder());
    }

    private void m5028c(C0714e c0714e) {
        this.f2536g = c0714e.m5429h();
        this.f2537h = true;
    }

    protected abstract void m5029a();

    public void m5030a(int i, int i2) {
        GLES20.glDrawArrays(i, 0, i2);
    }

    public void m5031a(C0714e c0714e) {
        c0714e.m5418b(this.f2536g);
        this.f2536g = -1;
    }

    public void m5032a(C0714e c0714e, C0673g c0673g) {
        m5033b(c0714e);
        c0673g.m5245a(c0714e, this.f2540k);
    }

    public void m5033b(C0714e c0714e) {
        if (this.f2536g == -1) {
            m5028c(c0714e);
            if (this.f2539j != null) {
                this.f2539j.m5380a((C0607c) this);
            }
        }
        c0714e.m5410a(this.f2536g);
        if (this.f2537h) {
            m5029a();
            this.f2537h = false;
        }
    }

    public void m5034b(C0714e c0714e, C0673g c0673g) {
        c0673g.m5247b(c0714e);
    }

    public boolean m5035b() {
        return this.f2533d;
    }

    public boolean m5036c() {
        return this.f2538i;
    }

    public boolean m5037d() {
        return this.f2536g != -1;
    }

    public void m5038e() {
        this.f2536g = -1;
        this.f2537h = true;
    }

    public void m5039f() {
        this.f2537h = true;
    }

    protected void finalize() {
        super.finalize();
        if (!this.f2538i) {
            m5040n();
        }
    }

    public void m5040n() {
        if (this.f2538i) {
            throw new C0633c();
        }
        this.f2538i = true;
        if (this.f2539j != null) {
            this.f2539j.m5383b(this);
        }
        BufferUtils.m5386a(this.f2535f);
    }
}
