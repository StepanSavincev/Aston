package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {

    @Test
    public void factorialZero() {
        Assert.assertEquals(Main.factorial(0), 1);
    }

    @Test
    public void factorialPositive() {
        Assert.assertEquals(Main.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void factorialNegativeThrows() {
        Main.factorial(-1);
    }

    @Test
    public void triangleAreaPositiveValues() {
        Assert.assertEquals(Main.triangleArea(5, 4), 10.0, 0.001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void triangleAreaNegativeBaseThrows() {
        Main.triangleArea(-2, 4);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void triangleAreaZeroHeightThrows() {
        Main.triangleArea(5, 0);
    }

    @Test
    public void isGreaterTrueIfFirstGreater() {
        Assert.assertTrue(Main.isGreater(10, 5));
    }

    @Test
    public void isGreaterFalseIfFirstNotGreater() {
        Assert.assertFalse(Main.isGreater(5, 10));
    }

    @Test
    public void isGreaterFalseIfEqual() {
        Assert.assertFalse(Main.isGreater(5, 5));
    }
}
