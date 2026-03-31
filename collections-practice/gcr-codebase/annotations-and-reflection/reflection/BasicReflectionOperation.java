package reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.*;

public class BasicReflectionOperation {
	public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter class name: ");
	        String className = sc.nextLine();

	        try {
	            Class c = Class.forName(className);
	            // Constructor
	            System.out.println("\nConstructors:");
	            for (Constructor con : c.getConstructors()) {
	                System.out.println(con.getName());
	            }

	            // Fields
	            System.out.println("\nFields:");
	            for (Field f : c.getDeclaredFields()) {
	                System.out.println(f.getName());
	            }

	            // Methods
	            System.out.println("\nMethods:");
	            for (Method m : c.getMethods()) {
	                System.out.println(m.getName());
	            }

	        } catch (Exception e) {
	            System.out.println("Invalid class name!");
	        }
	}
}
