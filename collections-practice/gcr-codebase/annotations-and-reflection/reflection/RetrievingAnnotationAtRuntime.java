package reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author{
	String name();
	int age();
}

@Author(name = "Aditya", age = 22)
class Book{
	
}

public class RetrievingAnnotationAtRuntime {
	public static void main(String args[]) throws Exception{
		Class<?> cl = Book.class;
		if(cl.isAnnotationPresent(Author.class)) {
			Author author = cl.getAnnotation(Author.class);
			System.out.println("Author is: "+ author.name());
			System.out.println("Age is: "+ author.age());
		}
	}
}
