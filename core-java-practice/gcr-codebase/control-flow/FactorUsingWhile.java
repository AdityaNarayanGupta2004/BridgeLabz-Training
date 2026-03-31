import java.util.Scanner;

public class FactorUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int idx = 1;
        while (idx <= number) {
            if (number % idx == 0){
                System.out.println(idx);
            }
            idx++;
        }
    }
}
