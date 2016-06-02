package com.google.ads.p009b;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.ads.b.i */
public @interface C0199i {
    String m1667a();

    boolean m1668b() default true;
}
