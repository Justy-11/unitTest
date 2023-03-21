package com.jathursh.demo;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator tests")
class CalculatorTest {

    Calculator calculator = new Calculator();

    /* @Nested -> define a nested test class within an outer test class.
    This annotation is useful when you want to group related tests together and keep them organized */
    @Nested
    @DisplayName("All the exception test cases")
    class ExceptionCases{

        @Test
        @DisplayName("Test add method")
        void add() {

            Exception exception = assertThrows(RuntimeException.class, () -> calculator.add(-101, 100));
            assertEquals("Numbers less than -100 are not allowed", exception.getMessage());

            Exception exception2 = assertThrows(RuntimeException.class, () -> calculator.add(500001, 500001));
            assertEquals("Numbers greater than 50000 not allowed (Numerical overflow)", exception2.getMessage());
        }
    }

    @Nested
    @DisplayName("All the positive test cases")
    class PositiveCases{

        @Test
        @DisplayName("Test add method")
        void add() {

            assertAll("multiple test cases",
                    () -> assertEquals(47, calculator.add(23, 24)),
                    () -> assertEquals(100, calculator.add(47, 53)),
                    () -> assertEquals(1009, calculator.add(9, 1000)));
        }
    }

    @Nested
    @DisplayName("All the timeout test cases")
    class TimeOutCases{

        @Test
        @DisplayName("Test add method")
        @Timeout(value = 1100, unit = TimeUnit.MILLISECONDS)  // for timeout testing
        @RepeatedTest(5)  // repeat test 5 times
        void add() {

            int sum = calculator.add(41000, 41000);
            assertEquals(82000, sum);

            // OR below 2 lines code

//        int sum1 = assertTimeout(Duration.ofMillis(1030), () -> calculator.add(41000, 41000));
//        assertEquals(82000, sum1);
        }
    }

    // TODO: for example: following method is separated into different nested classes above,
    //  but same method cannot be in above separate nested classes (different methods should be separated)
    //  and this add() method test class should be commented after put this into nested class
    @Test
    @DisplayName("Test add method")
    @Timeout(value = 1100, unit = TimeUnit.MILLISECONDS)  // for timeout testing
    void add() {

        Exception exception = assertThrows(RuntimeException.class, () -> calculator.add(-101, 100));
        assertEquals("Numbers less than -100 are not allowed", exception.getMessage());

        Exception exception2 = assertThrows(RuntimeException.class, () -> calculator.add(500001, 500001));
        assertEquals("Numbers greater than 50000 not allowed (Numerical overflow)", exception2.getMessage());

        int sum = calculator.add(41000, 41000);
        assertEquals(82000, sum);

        // OR below 2 lines code

//        int sum1 = assertTimeout(Duration.ofMillis(1030), () -> calculator.add(41000, 41000));
//        assertEquals(82000, sum1);

        assertNotNull(exception);

        assertAll("multiple test cases",
                () -> assertEquals(47, calculator.add(23, 24)),
                () -> assertEquals(100, calculator.add(47, 53)),
                () -> assertEquals(1009, calculator.add(9, 1000)));

    }

    @Test
    @DisplayName("Test subtract method")
    @Disabled
    void subtract() {
    }

    @Test
    @DisplayName("Test multiply method")
    @Disabled
    void multiply() {
    }

    @Test
    @DisplayName("Test divide method")
    @Disabled
    void divide() {
    }

    @Test
    @DisplayName("Test isSumAllowed method")
    @Disabled
    void isSumAllowed() {
    }
}