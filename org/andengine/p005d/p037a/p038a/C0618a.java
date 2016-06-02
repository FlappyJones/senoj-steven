package org.andengine.p005d.p037a.p038a;

import java.util.Arrays;
import org.andengine.p005d.p037a.p051c.C0617a;

/* renamed from: org.andengine.d.a.a.a */
public class C0618a implements C0617a {
    protected Object[] f2551a;
    protected int f2552b;
    protected int f2553c;

    public C0618a() {
        this(1);
    }

    public C0618a(int i) {
        this.f2551a = new Object[i];
    }

    private void m5072c() {
        int length = this.f2551a.length;
        if (this.f2553c != length) {
            return;
        }
        if (this.f2553c - this.f2552b != length) {
            m5075b();
            return;
        }
        Object obj = new Object[(((length * 3) >> 1) + 1)];
        System.arraycopy(this.f2551a, 0, obj, 0, length);
        this.f2551a = obj;
    }

    public Object m5073a() {
        if (this.f2552b == this.f2553c) {
            return null;
        }
        Object obj = this.f2551a[this.f2552b];
        this.f2551a[this.f2552b] = null;
        this.f2552b++;
        if (this.f2552b == this.f2553c) {
            this.f2552b = 0;
            this.f2553c = 0;
        }
        return obj;
    }

    public void m5074a(Object obj) {
        m5072c();
        this.f2551a[this.f2553c] = obj;
        this.f2553c++;
    }

    public void m5075b() {
        int i = this.f2553c - this.f2552b;
        if (i == 0) {
            this.f2552b = 0;
            this.f2553c = 0;
            return;
        }
        System.arraycopy(this.f2551a, this.f2552b, this.f2551a, 0, i);
        int max = Math.max(i, this.f2552b);
        int max2 = Math.max(max, this.f2553c);
        if (max < max2) {
            Arrays.fill(this.f2551a, max, max2, null);
        }
        this.f2552b = 0;
        this.f2553c = i;
    }
}
