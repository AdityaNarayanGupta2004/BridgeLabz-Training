package annotationandreflection;
/*Create a custom annotation @TaskInfo to mark tasks with priority and assigned person.
🔹 Steps to Follow:
Define an annotation @TaskInfo with fields priority and assignedTo.
Apply this annotation to a method in TaskManager class.
Retrieve the annotation details using Reflection API.
*/
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
	int priority();
	String assignedTo();
}

class TaskManager{
	@TaskInfo(priority = 1, assignedTo = "Aditya")
	public void completetask() {
		System.out.println("Task Completed");
	}
	@TaskInfo(priority = 2, assignedTo= "madhav")
	public void reviewTask() {
		System.out.println("Taask is  under review");
	}
}


public class CustomAnnotation {
	public static void main(String args[]) {
		Method[] method = TaskManager.class.getDeclaredMethods();
		for(Method meth: method) {
			if(meth.isAnnotationPresent(TaskInfo.class)) {
				TaskInfo info = meth.getAnnotation(TaskInfo.class);
				System.out.println("Method:" + meth.getName());
				System.out.println("Priority: "+ info.priority());
				System.out.println("Assigne To: "+ info.assignedTo());
				System.out.println();
			}
		}
	}
}
