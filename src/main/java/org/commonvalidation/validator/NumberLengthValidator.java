package org.commonvalidation.validator;

import org.commonvalidation.annotation.NumberLength;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberLengthValidator implements ConstraintValidator<NumberLength, Number> {

    private int min;
    private int max;

    public void initialize(NumberLength numberLength) {
        this.min = numberLength.min();
        this.max = numberLength.max();
    }

    public boolean isValid(Number value, ConstraintValidatorContext context) {
        return value.toString().length() >= min && value.toString().length() <= max;
    }

}
