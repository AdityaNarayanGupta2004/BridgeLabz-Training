import java.util.*;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                System.out.println("Invalid age");
            }else if(arr[i] <= 18){
                System.out.println("The student with the age "+ arr[i]+" cannot vote");
            }else{
                System.out.println("The student with the age "+ arr[i] +" can vote");
            }
        }
    }
}
