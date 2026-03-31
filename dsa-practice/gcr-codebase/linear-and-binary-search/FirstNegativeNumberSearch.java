import java.util.*;
public class FirstNegativeNumberSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findFirstNegative(arr)); 
        
    }
    public static int findFirstNegative(int[] arr){
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] < 0){
                return idx;
            }
        }
        return -1;
    }
}
