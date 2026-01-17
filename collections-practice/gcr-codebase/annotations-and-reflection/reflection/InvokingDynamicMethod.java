package reflection;

import java.lang.reflect.Method;
/*Dynamic Method Invocation: Define a class MathOperations with multiple public methods (add, subtract, multiply). 
Use Reflection to dynamically call any method based on user input.*/
import java.util.*;
class MathOperation{
	public int add(int a, int b) {
		return a+b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
}

public class InvokingDynamicMethod {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the method name to call:\n 1-> add, \n 2->Subtract, \n 3-> Multiply");
		String methodname = sc.nextLine();
		System.out.println("Enter the first Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2 = sc.nextInt();
		MathOperation obj = new MathOperation();
		// getting the class object of class MathOperation
		Class<?> cl = MathOperation.class;
		Method method = cl.getMethod(methodname, int.class, int.class);
		int ans = (int)method.invoke(obj, num1, num2);
		System.out.println("Answer of "+methodname+" is :"+ ans);
		
	}
}
