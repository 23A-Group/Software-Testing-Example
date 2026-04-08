package com.group23a;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CalculatorTest {

    @Test
    @DisplayName("Check if 2 + 3 equals 5")
    void testAddition() {
        Calculator calc = new Calculator();
        
        // The core of testing: assertEquals(Expected, Actual)
        assertEquals(5, calc.add(2, 3), "The addition logic is broken!");
    }
}
