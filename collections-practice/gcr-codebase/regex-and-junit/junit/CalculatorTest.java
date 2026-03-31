package junit.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calc = new Calculator();
	@Test
	public void testAdd() {
		assertEquals(10, calc.add(6, 4));
	}
	@Test
	public void testSubtract() {
		assertEquals(2, calc.subtract(3,1));
	}
	@Test
	public void testMultiply() {
		assertEquals(8, calc.multiply(4, 2));
	}
	@Test
	public void testdivide() {
		assertEquals(2, calc.divide(8,4));
	}
	@Test
	public void testDividebyZero() {
		Exception exception = assertThrows(IllegalArgumentException.class,()-> calc.divide(8, 0));
		assertEquals("Division by zero is not allowed", exception.getMessage());
	}
	
}
