package com.advexample.junitparamdemo;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AppTest.class, MathUtilsTest.class })
public class AllTests {
    // No code needed here
}
