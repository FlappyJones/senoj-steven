package com.google.ads.p009b;

import com.google.ads.util.C0229g;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.ads.b.g */
public abstract class C0197g {
    protected void m1665a() {
    }

    public void m1666a(Map map) {
        Map hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C0199i c0199i = (C0199i) field.getAnnotation(C0199i.class);
            if (c0199i != null) {
                hashMap.put(c0199i.m1667a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            C0229g.m1842e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    C0229g.m1836b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    C0229g.m1836b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Bad Type");
                }
            } else {
                C0229g.m1842e("Unexpected Server Option: " + ((String) entry.getKey()) + " = '" + ((String) entry.getValue()) + "'");
            }
        }
        String str = null;
        for (Field field22 : hashMap.values()) {
            String str2;
            if (((C0199i) field22.getAnnotation(C0199i.class)).m1668b()) {
                C0229g.m1836b("Required Server Option missing: " + ((C0199i) field22.getAnnotation(C0199i.class)).m1667a());
                str2 = (str == null ? "" : str + ", ") + ((C0199i) field22.getAnnotation(C0199i.class)).m1667a();
            } else {
                str2 = str;
            }
            str = str2;
        }
        if (str != null) {
            throw new C0198h("Required Server Option(s) missing: " + str);
        }
        m1665a();
    }
}
