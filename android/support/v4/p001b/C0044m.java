package android.support.v4.p001b;

/* renamed from: android.support.v4.b.m */
public class C0044m implements Cloneable {
    private static final Object f213a;
    private boolean f214b;
    private int[] f215c;
    private Object[] f216d;
    private int f217e;

    static {
        f213a = new Object();
    }

    public C0044m() {
        this(10);
    }

    public C0044m(int i) {
        this.f214b = false;
        if (i == 0) {
            this.f215c = C0036c.f196a;
            this.f216d = C0036c.f198c;
        } else {
            int a = C0036c.m234a(i);
            this.f215c = new int[a];
            this.f216d = new Object[a];
        }
        this.f217e = 0;
    }

    private void m242d() {
        int i = this.f217e;
        int[] iArr = this.f215c;
        Object[] objArr = this.f216d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f213a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f214b = false;
        this.f217e = i2;
    }

    public int m243a(int i) {
        if (this.f214b) {
            m242d();
        }
        return this.f215c[i];
    }

    public C0044m m244a() {
        try {
            C0044m c0044m = (C0044m) super.clone();
            try {
                c0044m.f215c = (int[]) this.f215c.clone();
                c0044m.f216d = (Object[]) this.f216d.clone();
                return c0044m;
            } catch (CloneNotSupportedException e) {
                return c0044m;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public int m245b() {
        if (this.f214b) {
            m242d();
        }
        return this.f217e;
    }

    public Object m246b(int i) {
        if (this.f214b) {
            m242d();
        }
        return this.f216d[i];
    }

    public void m247c() {
        int i = this.f217e;
        Object[] objArr = this.f216d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f217e = 0;
        this.f214b = false;
    }

    public /* synthetic */ Object clone() {
        return m244a();
    }

    public String toString() {
        if (m245b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f217e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f217e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m243a(i));
            stringBuilder.append('=');
            C0044m b = m246b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
