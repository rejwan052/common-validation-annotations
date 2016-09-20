package org.commonvalidation.validator;

import org.commonvalidation.annotation.NonEmptyStrings;

import java.util.Collection;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NonEmptyStringsValidator
        implements ConstraintValidator<NonEmptyStrings, Collection<String>> {

    public void initialize(NonEmptyStrings nonEmptyStrings) {}

    public boolean isValid(Collection<String> value, ConstraintValidatorContext context) {
        return value.stream().allMatch(s -> !s.trim().isEmpty());
    }

}
