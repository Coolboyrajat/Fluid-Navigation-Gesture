package p054c.p083e.p104c.p105v;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c.e.c.v.b */
public @interface C1298b {
    boolean nullSafe() default true;

    Class<?> value();
}
