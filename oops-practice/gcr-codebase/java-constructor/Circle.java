import java.util.*;
public class Circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        Circle circle = new Circle(radius); // calling parameterised constructor
        System.out.println("Circle Details:");
        circle.DisplayingCircleDetails();
        Circle Circle2 = new Circle(); // calling default construtor
        System.out.println("Default Circle Details:");
        Circle2.DisplayingCircleDetails();
    }
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public Circle(){ // for default 
        radius = 5; 
    }
    public void DisplayingCircleDetails(){
        System.out.println("Radius of circle is: " + radius);
        System.out.println("Area of circle is : " + (Math.PI * radius * radius));
        System.out.println("Circumference of circle is: " + (2 * Math.PI * radius));
    }
}
