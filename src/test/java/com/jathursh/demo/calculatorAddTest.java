package com.jathursh.demo;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator tests")

public class calculatorAddTest {

    Calculator calculator = new Calculator();

    /* @Nested -> define a nested test class within an outer test class.
    This annotation is useful when you want to group related tests together and keep them organized */
    @Nested
    @DisplayName("All the exception test cases")
    class ExceptionCases{

        @Test
        @DisplayName("Test add method")
        void addTest1() {

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
        void addTest2() {

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
        void addTest3() {

            int sum = calculator.add(41000, 41000);
            assertEquals(82000, sum);

            // OR below 2 lines code

//        int sum1 = assertTimeout(Duration.ofMillis(1030), () -> calculator.add(41000, 41000));
//        assertEquals(82000, sum1);
        }
    }
}
