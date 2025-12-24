import java.util.*;
public class Person {
    String name;
    int age;

    Person(){ // default constructor
        name = "ram";
        age = 25;
    }
    Person(String name, int age) { // parameterised constructor
        this.name = name;
        this.age = age;
    }
    public void PersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public Person(Person second) {
        this.name = second.name;
        this.age = second.age;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        String name = sc.nextLine();
        System.out.println("Enter the age of the person:");
        int age = sc.nextInt();
        Person person = new Person(name, age);// calling parameterised constructor
        System.out.println("Person Details are :->");
        person.PersonDetails();

        Person person2 = new Person(); // calling default constructor
        System.out.println("Default Person Details are ->:");
        person2.PersonDetails();
        Person person3 = new Person(person); // copying constructor
        System.out.println("Copied Person Details are->:");
        person3.PersonDetails();
    }
}
