package com.epam.module2.task06;

import java.lang.annotation.*;

/**
 * Created by pxjok on 03.10.2015.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SubmarineInfo {
    String author() default "John Doe";
    String description();
}
