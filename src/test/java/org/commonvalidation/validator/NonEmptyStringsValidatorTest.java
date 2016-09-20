package org.commonvalidation.validator;

import org.commonvalidation.domain.TestDomain;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NonEmptyStringsValidatorTest {
    private TestDomain testDomain;

    private Validator validator;

    @Before
    public void init() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        this.validator = validatorFactory.getValidator();
    }

    @Test
    public void testWhenItDoesntContainEmptyStrings() {
        testDomain = new TestDomain(123L);
        testDomain.addString("a");
        testDomain.addString("b");
        testDomain.addString("c");

        Set<ConstraintViolation<TestDomain>> constraintViolations =
                validator.validate(testDomain);
        assertTrue(constraintViolations.isEmpty());
    }

    @Test
    public void testWhenItContainEmptyStrings() {
        testDomain = new TestDomain(123L);
        testDomain.addString("a");
        testDomain.addString("b");
        testDomain.addString("");

        Set<ConstraintViolation<TestDomain>> constraintViolations =
                validator.validate(testDomain);
        assertFalse(constraintViolations.isEmpty());
    }
}
