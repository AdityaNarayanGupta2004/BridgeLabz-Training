import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        find(number);     
    }
    private static void find(int number){
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        for(int i=0;i<number;i++){
            int sumOftwo = first + second;
            first = second;
            second = sumOftwo;
            System.out.print(sumOftwo +" ");
        }
    }
}
