package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void should_return_sum() {
        Calculator c = new Calculator();
        assertEquals(30, c.sum(10, 20), 2);
    }

    @Test
    public void should_return_substraction() {
        Calculator c = new Calculator();
        assertEquals(10, c.subtraction(30, 20), 2);
    }

    @Test
    public void should_subtraction_positive_return_minus_one() {
        Calculator c = new Calculator();
        assertEquals(-1, c.subtractionOnlyPositiveNumbers(-4, 4), 0);
    }
    @Test
    public void should_return_multiplication() {
        Calculator c = new Calculator();
        assertEquals(20, c.multiplication(4,5),0);
    }
    @Test
    public void should_return_division() {
        Calculator c = new Calculator();
        assertEquals(0.75, c.division(5, 4), 4);
    }
}