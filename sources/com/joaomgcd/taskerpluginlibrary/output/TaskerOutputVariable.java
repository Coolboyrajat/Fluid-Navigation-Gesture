package com.joaomgcd.taskerpluginlibrary.output;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TaskerOutputVariable {
    int htmlLabelResId();

    int labelResId();

    int maxApi() default Integer.MAX_VALUE;

    int minApi() default -1;

    String name();
}
