package com.orion10110.training.ExersizeOne.Annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(RUNTIME)
@Target({METHOD,CONSTRUCTOR})
public @interface Start {
	double x() default 0;
	double y() default 0;
}
