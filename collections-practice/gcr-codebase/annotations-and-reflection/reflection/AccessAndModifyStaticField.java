package reflection;

import java.lang.reflect.Field;

/*Access and Modify Static Fields: Create a Configuration class with a private static field API_KEY. 
 * Use Reflection to modify its value and print it.
*/

class Configuration {
	private static String API_KEY = "original-key-1234";
	
	public static void display() {
		System.out.println("Current api is: "+ API_KEY);
	}
}

public class AccessAndModifyStaticField {
	public static void main(String[] args) throws Exception{
		Configuration.display();
		Field field = Configuration.class.getDeclaredField("API_KEY");
		field.setAccessible(true);
		field.set(null, "hack-key-678");
		
		Configuration.display();
	}
}
