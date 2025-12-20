import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numnber");
        int number = sc.nextInt();
        for(int i = 1; i < 11; i++){
            System.out.println(number +" * "+ i +" = "+ i*number);
        }
    }
}
