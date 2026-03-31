package reflection;

import java.lang.reflect.Method;

class Calculator{
	private int multiply(int a, int b) {
		return a*b;
	}
}

public class InvokePrivateMethod {
	public static void main(String args[]) throws Exception{
		Calculator calc = new Calculator();
		Class<?> cl = calc.getClass();
		// Accsessing private Method
		Method method = cl.getDeclaredMethod("multiply", int.class, int.class);
		method.setAccessible(true);// Allowing access to private method
		
		// Invoking the method dynamically
		int ans = (int)method.invoke(calc, 5, 10);
		System.out.println("Multiplication Result is:"+ ans);
	}
}
