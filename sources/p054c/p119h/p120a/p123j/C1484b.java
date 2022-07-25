package p054c.p119h.p120a.p123j;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c.h.a.j.b */
public @interface C1484b {
    int descriptionResId() default -1;

    boolean ignoreInStringBlurb() default false;

    String key();

    int labelResId() default -1;
}
