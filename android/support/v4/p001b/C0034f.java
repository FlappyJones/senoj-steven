package android.support.v4.p001b;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.b.f */
abstract class C0034f {
    C0040h f192b;
    C0041i f193c;
    C0043k f194d;

    C0034f() {
    }

    public static boolean m207a(Map map, Collection collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean m208a(Set set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (!(set.size() == set2.size() && set.containsAll(set2))) {
                z = false;
            }
            return z;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public static boolean m209b(Map map, Collection collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static boolean m210c(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract int m211a();

    protected abstract int m212a(Object obj);

    protected abstract Object m213a(int i, int i2);

    protected abstract Object m214a(int i, Object obj);

    protected abstract void m215a(int i);

    protected abstract void m216a(Object obj, Object obj2);

    public Object[] m217a(Object[] objArr, int i) {
        int a = m211a();
        Object[] objArr2 = objArr.length < a ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), a) : objArr;
        for (int i2 = 0; i2 < a; i2++) {
            objArr2[i2] = m213a(i2, i);
        }
        if (objArr2.length > a) {
            objArr2[a] = null;
        }
        return objArr2;
    }

    protected abstract int m218b(Object obj);

    protected abstract Map m219b();

    public Object[] m220b(int i) {
        int a = m211a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = m213a(i2, i);
        }
        return objArr;
    }

    protected abstract void m221c();

    public Set m222d() {
        if (this.f192b == null) {
            this.f192b = new C0040h(this);
        }
        return this.f192b;
    }

    public Set m223e() {
        if (this.f193c == null) {
            this.f193c = new C0041i(this);
        }
        return this.f193c;
    }

    public Collection m224f() {
        if (this.f194d == null) {
            this.f194d = new C0043k(this);
        }
        return this.f194d;
    }
}
