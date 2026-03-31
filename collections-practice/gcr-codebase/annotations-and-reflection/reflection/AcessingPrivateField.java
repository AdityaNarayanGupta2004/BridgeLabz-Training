package reflection;

import java.lang.reflect.Field;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class AcessingPrivateField {
	public static void main(String[] args) throws Exception {
        // Creating object
        Person person = new Person(25);

        // Getting the Class object
        Class<?> personClass = person.getClass();

        Field ageField = personClass.getDeclaredField("age");
        ageField.setAccessible(true);

        // Retrieving the  value
        int originalAge = (int) ageField.get(person);
        System.out.println("Original age: " + originalAge);

        // Modifying the  value
        ageField.set(person, 30);

        // Retrieve=ing the  modified value
        int updatedAge = (int) ageField.get(person);
        System.out.println("Updated age: " + updatedAge);
	}
}
