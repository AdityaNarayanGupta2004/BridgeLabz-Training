package annotationandreflection;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class UsingTodoDemo {
	
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Todo {
        String task();
        String assignedTo();
        String priority() default "MEDIUM";
    }

    @Todo(task = "Login feature", assignedTo = "Alice")
    public void login() {}

    @Todo(task = "Profile page", assignedTo = "Bob", priority = "HIGH")
    public void profile() {}

    public static void main(String[] args) {
        Method[] methods = UsingTodoDemo.class.getDeclaredMethods();
        for (Method m : methods) {
            Todo todo = m.getAnnotation(Todo.class);
            if (todo != null) {
                System.out.println(m.getName() + "->" + todo.task() + " | " + todo.assignedTo() + " | " + todo.priority());
            }
        }
    }
}

