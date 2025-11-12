package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class test {
    // Тесты для factorial
    @Test
    void factorialZero() {
        assertEquals(1, Main.factorial(0));
    }

    @Test
    void factorialPositive() {
        assertEquals(120, Main.factorial(5));
    }

    @Test
    void factorialNegative_throws() {
        assertThrows(IllegalArgumentException.class, () -> Main.factorial(-1));
    }

    // Тесты для triangleArea
    @Test
    void triangleArea_PositiveValues() {
        assertEquals(10.0, Main.triangleArea(5, 4), 0.001);
    }

    @Test
    void triangleArea_NegativeBase_throws() {
        assertThrows(IllegalArgumentException.class, () -> Main.triangleArea(-2, 4));
    }

    @Test
    void triangleArea_ZeroHeight_throws() {
        assertThrows(IllegalArgumentException.class, () -> Main.triangleArea(5, 0));
    }

    // Тесты для isGreater
    @Test
    void isGreater_TrueIfFirstGreater() {
        assertTrue(Main.isGreater(10, 5));
    }

    @Test
    void isGreater_FalseIfFirstNotGreater() {
        assertFalse(Main.isGreater(5, 10));
    }

    @Test
    void isGreater_FalseIfEqual() {
        assertFalse(Main.isGreater(5,5));
    }
}

