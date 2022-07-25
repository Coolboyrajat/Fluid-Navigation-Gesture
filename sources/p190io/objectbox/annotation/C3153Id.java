package p190io.objectbox.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: io.objectbox.annotation.Id */
public @interface C3153Id {
    boolean assignable() default false;
}
