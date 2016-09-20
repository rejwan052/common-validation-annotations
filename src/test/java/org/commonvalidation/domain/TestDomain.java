package org.commonvalidation.domain;

import org.commonvalidation.annotation.NonEmptyStrings;
import org.commonvalidation.annotation.NumberLength;

import java.util.ArrayList;
import java.util.List;

public class TestDomain {

    @NumberLength(min = 3, max = 6)
    private long value;

    @NonEmptyStrings
    private List<String> strings = new ArrayList<>();

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

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public void addString(String s) {
        getStrings().add(s);
    }

}
