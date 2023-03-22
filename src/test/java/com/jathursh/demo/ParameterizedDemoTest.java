package com.jathursh.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParameterizedDemoTest {

    @ParameterizedTest
//    @EmptySource // create an empty source inside value source array
//    @NullSource  // create null source inside value source array
    @NullAndEmptySource  // combine above 2
    @ValueSource(strings = {"abc","dfw", "dsf"})  // we can give one array only
    void testCase1(String arg){
        assertFalse(arg.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,33,22})
    void testCase2(int arg){
        assertTrue(arg > 0);
    }

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @ValueSource(ints = {1,2,33,22})
    void testCase3(int arg){
        assertTrue(calculator.isSumAllowed(arg));
    }

    @ParameterizedTest
    @MethodSource("intRange")  // take in a method
    void testCase4(int arg){
        assertTrue(calculator.isSumAllowed(arg));
    }

    public static IntStream intRange() {
        return IntStream.range(10, 40);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "11, 23, 34",
            "12, 22, 34",
            "13, 21, 34"
    })
    void testCase4(int n1, int n2, int expected){
        assertEquals(expected, calculator.add(n1, n2));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "sample-data.csv", numLinesToSkip = 1)
    void testCase5(int n1, int n2, int expected){
        assertEquals(expected, calculator.add(n1, n2));
    }

}
