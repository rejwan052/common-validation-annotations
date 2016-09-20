package org.commonvalidation.validator;

import org.commonvalidation.domain.TestDomain;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static org.junit.Assert.assertTrue;

public class NumberLengthValidatorTest {

    private TestDomain testDomain;

    private Validator validator;

    @Before
    public void init() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        this.validator = validatorFactory.getValidator();
    }

    @Test
    public void testWhenValueIsValid() {
        testDomain = new TestDomain(1234L);
        Set<ConstraintViolation<TestDomain>> constraintViolations =
                validator.validate(testDomain);
        assertTrue(constraintViolations.isEmpty());
    }

}
