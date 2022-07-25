package p190io.objectbox.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p190io.objectbox.annotation.apihint.Beta;

@Target({ElementType.FIELD})
@Beta
@Retention(RetentionPolicy.CLASS)
/* renamed from: io.objectbox.annotation.Backlink */
public @interface Backlink {
    /* renamed from: to */
    String mo9473to() default "";
}
