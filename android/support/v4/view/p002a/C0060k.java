package android.support.v4.view.p002a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.view.a.k */
public class C0060k {
    private static final C0061l f327a;
    private final Object f328b;

    static {
        if (VERSION.SDK_INT >= 19) {
            f327a = new C0066o();
        } else if (VERSION.SDK_INT >= 16) {
            f327a = new C0063m();
        } else {
            f327a = new C0062q();
        }
    }

    public C0060k() {
        this.f328b = f327a.m551a(this);
    }

    public C0060k(Object obj) {
        this.f328b = obj;
    }

    public C0048a m546a(int i) {
        return null;
    }

    public Object m547a() {
        return this.f328b;
    }

    public List m548a(String str, int i) {
        return null;
    }

    public boolean m549a(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0048a m550b(int i) {
        return null;
    }
}
