package com.dyx.zhujie;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({FIELD, METHOD })
public @interface Default {
	public String value() default "" ;

//	public char value() default ''; 
//	public int value() default 1 ;
}
