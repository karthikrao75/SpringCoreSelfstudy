package com.karthik.SpringMVCDemo5.CustValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=HobbyValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	String IsValidHobbies();
	//if we want above method not to be mandatory field add default like bellow.
	String message() default "please provide hobbies in -music,cricket,football";
    
    Class<?>[] groups() default {};
     
	Class<? extends Payload>[] payload() default {};
}
