package android.support.v4.view.p002a;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.view.a.x */
public class C0073x {
    private static final aa f335a;
    private final Object f336b;

    static {
        if (VERSION.SDK_INT >= 16) {
            f335a = new ab();
        } else if (VERSION.SDK_INT >= 15) {
            f335a = new C0050z();
        } else if (VERSION.SDK_INT >= 14) {
            f335a = new C0049y();
        } else {
            f335a = new ac();
        }
    }

    public C0073x(Object obj) {
        this.f336b = obj;
    }

    public static C0073x m571a() {
        return new C0073x(f335a.m358a());
    }

    public void m572a(int i) {
        f335a.m361b(this.f336b, i);
    }

    public void m573a(boolean z) {
        f335a.m360a(this.f336b, z);
    }

    public void m574b(int i) {
        f335a.m359a(this.f336b, i);
    }

    public void m575c(int i) {
        f335a.m362c(this.f336b, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0073x c0073x = (C0073x) obj;
        return this.f336b == null ? c0073x.f336b == null : this.f336b.equals(c0073x.f336b);
    }

    public int hashCode() {
        return this.f336b == null ? 0 : this.f336b.hashCode();
    }
}
