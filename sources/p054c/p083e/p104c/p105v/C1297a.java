package p054c.p083e.p104c.p105v;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c.e.c.v.a */
public @interface C1297a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
