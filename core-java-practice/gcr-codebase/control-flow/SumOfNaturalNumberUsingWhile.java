import java.util.*;

public class SumOfNaturalNumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int idx = 1;
        int sum2 = num*(num+1)/2;
        while(idx <= num){
            sum += idx;
            idx++; 
        }
        if(sum==sum2){
            System.out.println("The sum of first " + num + " natural numbers is same by both formula and loop is: " + sum);
        }else{
            System.out.println("There is an Error in the Calculation.");
        }
        // sc.close();
    }
}
