package com.noah.SpringMVC.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD , ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//定義 course default 值
//	public String value() default "LUV，這裡為預設值";
	public String[] value() default {"LUV，這裡為預設值"};
	//定義 錯誤訊息 default 值
	public String message() default "須以LUV開頭，這裡為預設值";
	//define defalut groups
	public Class<?>[] groups() default{};
	//define defalut payloads
	public Class<? extends Payload>[] payload() default{};
}
