package annotationandreflection;

/*Problem Statement:
Define an annotation @BugReport that can be applied multiple times on a method.
🔹 Steps to Follow:
Define @BugReport with a description field.
Use @Repeatable to allow multiple bug reports.
Apply it twice on a method.
Retrieve and print all bug reports.
*/

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports{
	BugReport[] value();
}

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport{
	String description();
}

class Test{
	 @BugReport(description = "Null pointer issue")
	  @BugReport(description = "Slow performance")
	 @BugReport(description = "Slow ")
	    public void myMethod() {
		 
	 }
}
public class UsingAndCreatingRepeatableAnnotation {
	public static void main(String args[]) throws Exception {
		Method method = Test.class.getDeclaredMethod("myMethod");
		
		BugReport[] bugs = method.getAnnotationsByType(BugReport.class);
		for(BugReport bug: bugs) {
			System.out.println("Bug is:"+ bug.description());
		}
	}
}
