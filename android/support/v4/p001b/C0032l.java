package android.support.v4.p001b;

import java.util.Map;

/* renamed from: android.support.v4.b.l */
public class C0032l {
    static Object[] f184b;
    static int f185c;
    static Object[] f186d;
    static int f187e;
    int[] f188f;
    Object[] f189g;
    int f190h;

    public C0032l() {
        this.f188f = C0036c.f196a;
        this.f189g = C0036c.f198c;
        this.f190h = 0;
    }

    private static void m196a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0033a.class) {
                if (f187e < 10) {
                    objArr[0] = f186d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f186d = objArr;
                    f187e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0033a.class) {
                if (f185c < 10) {
                    objArr[0] = f184b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f184b = objArr;
                    f185c++;
                }
            }
        }
    }

    private void m197e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0033a.class) {
                if (f186d != null) {
                    objArr = f186d;
                    this.f189g = objArr;
                    f186d = (Object[]) objArr[0];
                    this.f188f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f187e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0033a.class) {
                if (f184b != null) {
                    objArr = f184b;
                    this.f189g = objArr;
                    f184b = (Object[]) objArr[0];
                    this.f188f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f185c--;
                    return;
                }
            }
        }
        this.f188f = new int[i];
        this.f189g = new Object[(i << 1)];
    }

    int m198a() {
        int i = this.f190h;
        if (i == 0) {
            return -1;
        }
        int a = C0036c.m235a(this.f188f, i, 0);
        if (a < 0 || this.f189g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f188f[i2] == 0) {
            if (this.f189g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f188f[a] == 0) {
            if (this.f189g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    int m199a(Object obj) {
        int i = 1;
        int i2 = this.f190h * 2;
        Object[] objArr = this.f189g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    int m200a(Object obj, int i) {
        int i2 = this.f190h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0036c.m235a(this.f188f, i2, i);
        if (a < 0 || obj.equals(this.f189g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f188f[i3] == i) {
            if (obj.equals(this.f189g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f188f[a] == i) {
            if (obj.equals(this.f189g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    public Object m201a(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object obj2 = this.f189g[i2];
        this.f189g[i2] = obj;
        return obj2;
    }

    public void m202a(int i) {
        if (this.f188f.length < i) {
            Object obj = this.f188f;
            Object obj2 = this.f189g;
            m197e(i);
            if (this.f190h > 0) {
                System.arraycopy(obj, 0, this.f188f, 0, this.f190h);
                System.arraycopy(obj2, 0, this.f189g, 0, this.f190h << 1);
            }
            C0032l.m196a(obj, obj2, this.f190h);
        }
    }

    public Object m203b(int i) {
        return this.f189g[i << 1];
    }

    public Object m204c(int i) {
        return this.f189g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f190h != 0) {
            C0032l.m196a(this.f188f, this.f189g, this.f190h);
            this.f188f = C0036c.f196a;
            this.f189g = C0036c.f198c;
            this.f190h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return obj == null ? m198a() >= 0 : m200a(obj, obj.hashCode()) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m199a(obj) >= 0;
    }

    public Object m205d(int i) {
        int i2 = 8;
        Object obj = this.f189g[(i << 1) + 1];
        if (this.f190h <= 1) {
            C0032l.m196a(this.f188f, this.f189g, this.f190h);
            this.f188f = C0036c.f196a;
            this.f189g = C0036c.f198c;
            this.f190h = 0;
        } else if (this.f188f.length <= 8 || this.f190h >= this.f188f.length / 3) {
            this.f190h--;
            if (i < this.f190h) {
                System.arraycopy(this.f188f, i + 1, this.f188f, i, this.f190h - i);
                System.arraycopy(this.f189g, (i + 1) << 1, this.f189g, i << 1, (this.f190h - i) << 1);
            }
            this.f189g[this.f190h << 1] = null;
            this.f189g[(this.f190h << 1) + 1] = null;
        } else {
            if (this.f190h > 8) {
                i2 = this.f190h + (this.f190h >> 1);
            }
            Object obj2 = this.f188f;
            Object obj3 = this.f189g;
            m197e(i2);
            this.f190h--;
            if (i > 0) {
                System.arraycopy(obj2, 0, this.f188f, 0, i);
                System.arraycopy(obj3, 0, this.f189g, 0, i << 1);
            }
            if (i < this.f190h) {
                System.arraycopy(obj2, i + 1, this.f188f, i, this.f190h - i);
                System.arraycopy(obj3, (i + 1) << 1, this.f189g, i << 1, (this.f190h - i) << 1);
            }
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f190h) {
            try {
                Object b = m203b(i);
                Object c = m204c(i);
                Object obj2 = map.get(b);
                if (c == null) {
                    if (obj2 != null || !map.containsKey(b)) {
                        return false;
                    }
                } else if (!c.equals(obj2)) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public Object get(Object obj) {
        int a = obj == null ? m198a() : m200a(obj, obj.hashCode());
        return a >= 0 ? this.f189g[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f188f;
        Object[] objArr = this.f189g;
        int i = this.f190h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f190h <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int a;
        int i;
        int i2 = 8;
        if (obj == null) {
            a = m198a();
            i = 0;
        } else {
            i = obj.hashCode();
            a = m200a(obj, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            Object obj3 = this.f189g[i3];
            this.f189g[i3] = obj2;
            return obj3;
        }
        a ^= -1;
        if (this.f190h >= this.f188f.length) {
            if (this.f190h >= 8) {
                i2 = this.f190h + (this.f190h >> 1);
            } else if (this.f190h < 4) {
                i2 = 4;
            }
            Object obj4 = this.f188f;
            Object obj5 = this.f189g;
            m197e(i2);
            if (this.f188f.length > 0) {
                System.arraycopy(obj4, 0, this.f188f, 0, obj4.length);
                System.arraycopy(obj5, 0, this.f189g, 0, obj5.length);
            }
            C0032l.m196a(obj4, obj5, this.f190h);
        }
        if (a < this.f190h) {
            System.arraycopy(this.f188f, a, this.f188f, a + 1, this.f190h - a);
            System.arraycopy(this.f189g, a << 1, this.f189g, (a + 1) << 1, (this.f190h - a) << 1);
        }
        this.f188f[a] = i;
        this.f189g[a << 1] = obj;
        this.f189g[(a << 1) + 1] = obj2;
        this.f190h++;
        return null;
    }

    public Object remove(Object obj) {
        int a = obj == null ? m198a() : m200a(obj, obj.hashCode());
        return a >= 0 ? m205d(a) : null;
    }

    public int size() {
        return this.f190h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f190h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f190h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0032l b = m203b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m204c(i);
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
