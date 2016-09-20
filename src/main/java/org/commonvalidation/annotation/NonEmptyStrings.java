package org.commonvalidation.annotation;

import org.commonvalidation.validator.NonEmptyStringsValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Checks whether collection contains empty strings.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NonEmptyStringsValidator.class)
public @interface NonEmptyStrings {

    String message() default "{Collection contains empty strings}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
