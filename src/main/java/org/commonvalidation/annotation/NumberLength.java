package org.commonvalidation.annotation;


import org.commonvalidation.validator.NumberLengthValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;

/**
 * Use to check length of an number. Annotation equivalent to {@link Size} annotation but for
 * numbers.
 * 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NumberLengthValidator.class)
public @interface NumberLength {

    String message() default "{Number contains too many digits}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int min();

    int max();
}
