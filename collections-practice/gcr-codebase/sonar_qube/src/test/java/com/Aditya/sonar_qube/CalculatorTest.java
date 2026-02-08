package com.Aditya.sonar_qube;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
@Test
public void testAddition() {
Calculator calculator = new Calculator();
assertEquals(2,calculator.add(1,1));
}

@Test
public void testSubtraction() {
Calculator calculator = new Calculator();
assertEquals(2, calculator.subtract(5, 3));
}
@Test
public void testMultiply() {
Calculator calculator = new Calculator();
assertEquals(15, calculator.multiply(5, 3));
}
}