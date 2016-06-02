package com.google.tagmanager.p014a;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.tagmanager.a.h */
public abstract class C0516h implements Iterable {
    public static final C0516h f2222a;
    static final /* synthetic */ boolean f2223b;

    static {
        f2223b = !C0516h.class.desiredAssertionStatus();
        f2222a = new aj(new byte[0]);
    }

    C0516h() {
    }

    public static C0516h m4579a(Iterable iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Collection arrayList = new ArrayList();
            for (C0516h add : iterable) {
                arrayList.add(add);
            }
            collection = arrayList;
        }
        return collection.isEmpty() ? f2222a : C0516h.m4580a(collection.iterator(), collection.size());
    }

    private static C0516h m4580a(Iterator it, int i) {
        if (!f2223b && i < 1) {
            throw new AssertionError();
        } else if (i == 1) {
            return (C0516h) it.next();
        } else {
            int i2 = i >>> 1;
            return C0516h.m4580a(it, i2).m4585a(C0516h.m4580a(it, i - i2));
        }
    }

    public static C0516h m4581a(byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new aj(obj);
    }

    public static C0521j m4582i() {
        return new C0521j(128);
    }

    public abstract int m4583a();

    protected abstract int m4584a(int i, int i2, int i3);

    public C0516h m4585a(C0516h c0516h) {
        int a = m4583a();
        int a2 = c0516h.m4583a();
        if (((long) a) + ((long) a2) < 2147483647L) {
            return ar.m4621a(this, c0516h);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + a + "+" + a2);
    }

    public abstract String m4586a(String str);

    void m4587a(OutputStream outputStream, int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i2);
        } else if (i + i2 > m4583a()) {
            throw new IndexOutOfBoundsException("Source end offset exceeded: " + (i + i2));
        } else if (i2 > 0) {
            m4590b(outputStream, i, i2);
        }
    }

    protected abstract void m4588a(byte[] bArr, int i, int i2, int i3);

    protected abstract int m4589b(int i, int i2, int i3);

    abstract void m4590b(OutputStream outputStream, int i, int i2);

    public void m4591b(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("Target offset < 0: " + i2);
        } else if (i3 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i3);
        } else if (i + i3 > m4583a()) {
            throw new IndexOutOfBoundsException("Source end offset < 0: " + (i + i3));
        } else if (i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException("Target end offset < 0: " + (i2 + i3));
        } else if (i3 > 0) {
            m4588a(bArr, i, i2, i3);
        }
    }

    public abstract C0517i m4592c();

    public boolean m4593d() {
        return m4583a() == 0;
    }

    public byte[] m4594e() {
        int a = m4583a();
        if (a == 0) {
            return ac.f2213a;
        }
        byte[] bArr = new byte[a];
        m4588a(bArr, 0, 0, a);
        return bArr;
    }

    public String m4595f() {
        try {
            return m4586a("UTF-8");
        } catch (Throwable e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract boolean m4596g();

    public abstract C0522k m4597h();

    public abstract int hashCode();

    public /* synthetic */ Iterator iterator() {
        return m4592c();
    }

    protected abstract int m4598j();

    protected abstract boolean m4599k();

    protected abstract int m4600l();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m4583a())});
    }
}
