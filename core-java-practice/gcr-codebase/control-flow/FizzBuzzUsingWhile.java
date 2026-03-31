import java.util.*;
public class FizzBuzzUsingWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Not a positive integer.");
            return;
        }
        int idx = 1;
        while (idx <= number) {
            if (idx % 3 == 0 && idx % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (idx % 3 == 0){
                System.out.println("Fizz");
            }
            else if (idx % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(idx);
            }
            idx++;
        }
    }
}
