package com.anotation;

import java.lang.annotation.*;

/**
 * Created by jieping.hjp on 2017/7/22.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}