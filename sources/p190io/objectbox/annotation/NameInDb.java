package p190io.objectbox.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: io.objectbox.annotation.NameInDb */
public @interface NameInDb {
    String value();
}
