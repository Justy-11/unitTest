package com.jathursh.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator tests")
class CalculatorTest {

    Calculator calculator = new Calculator();

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