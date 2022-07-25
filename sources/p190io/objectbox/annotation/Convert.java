package p190io.objectbox.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p190io.objectbox.converter.PropertyConverter;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: io.objectbox.annotation.Convert */
public @interface Convert {
    Class<? extends PropertyConverter> converter();

    Class dbType();
}
