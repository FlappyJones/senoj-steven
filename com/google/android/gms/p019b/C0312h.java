package com.google.android.gms.p019b;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.b.h */
public final class C0312h extends C0310f {
    private final Object f1500a;

    private C0312h(Object obj) {
        this.f1500a = obj;
    }

    public static C0309e m2399a(Object obj) {
        return new C0312h(obj);
    }

    public static Object m2400a(C0309e c0309e) {
        if (c0309e instanceof C0312h) {
            return ((C0312h) c0309e).f1500a;
        }
        IBinder asBinder = c0309e.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (Throwable e22) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
