package com.advexample.junitparamdemo;

public class ExceptionThrower {
    public void throwExceptionIfNegative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        }
    }
}

