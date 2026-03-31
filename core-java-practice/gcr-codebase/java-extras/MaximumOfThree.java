import java.util.*;
public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = takeInput(sc, "Enter the first number: ");
        int num2 = takeInput(sc, "Enter the second number: ");
        int num3 = takeInput(sc, "Enter the third number: ");

        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
        sc.close();
    }

    public static int takeInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int findMaximum(int firstnum, int secondnum, int thirdnum) {
        int max = firstnum;
        if(secondnum > max){
            max = secondnum;
        }
        if(thirdnum > max){
            max = thirdnum;
        }
        return max;
    }
}
