import java.util.*;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Is the number "+ num +" divisible by 5 ");
        if(num % 5 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
