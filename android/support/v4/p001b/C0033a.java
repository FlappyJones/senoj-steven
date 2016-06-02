package android.support.v4.p001b;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.b.a */
public class C0033a extends C0032l implements Map {
    C0034f f191a;

    private C0034f m206b() {
        if (this.f191a == null) {
            this.f191a = new C0035b(this);
        }
        return this.f191a;
    }

    public Set entrySet() {
        return m206b().m222d();
    }

    public Set keySet() {
        return m206b().m223e();
    }

    public void putAll(Map map) {
        m202a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        return m206b().m224f();
    }
}
