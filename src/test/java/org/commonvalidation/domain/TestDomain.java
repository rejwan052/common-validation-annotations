package org.commonvalidation.domain;

import org.commonvalidation.annotation.NumberLength;

public class TestDomain {

    @NumberLength(min = 3, max = 6)
    private long value;

    public TestDomain() {}

    public TestDomain(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

}
