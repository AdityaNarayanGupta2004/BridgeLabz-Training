package annotationandreflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
	String level() default "HIGH";
}

class Service{
	@ImportantMethod
	void processdata() {
		
	}
	
	@ImportantMethod(level = "MEDIUM")
	void validdataData() {
		// empty method
	}
	
	void helperMethod() {
		// empty method 
	}
}

public class CreatingAnnotationToMarkMethod {
	public static void main(String args[]) {
		Method methods[] = Service.class.getDeclaredMethods();
		for(Method method: methods) {
			if(method.isAnnotationPresent(ImportantMethod.class)) {
				ImportantMethod imp = method.getAnnotation(ImportantMethod.class);
				System.out.println("Method Name:"+method.getName()+",Importance level: "+ imp.level());
			}
		}
	}
}
