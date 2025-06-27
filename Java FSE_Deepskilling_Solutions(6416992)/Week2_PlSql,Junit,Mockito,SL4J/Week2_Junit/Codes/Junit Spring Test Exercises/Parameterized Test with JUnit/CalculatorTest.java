package com.example.junitspring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "2, true",
            "3, false",
            "10, true",
            "15, false",
            "0, true",
            "-4, true",
            "-7, false"
    })
    void testIsEven(int number, boolean expectedResult) {
        boolean result = calculator.isEven(number);
        assertEquals(expectedResult, result, "Check if number is even");
    }
}
