import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                if(arr[i] % 2 == 0){
                    System.out.println("The Number is "+ arr[i]+ " is even");
                }else{
                    System.out.println("The Number is"+ arr[i]+ " is odd");
                }
            }else{
                if(arr[i] < 0){
                    System.out.println("The Number "+ arr[i]+ " is Negative");
                }else{
                    System.out.println("The Number is"+ arr[i]+ " is Zero");
                }
            }
        }
        if(arr[0] > arr[n-1]){
            System.out.println("The First element of array is greater than the last element");
        }else if(arr[0] < arr[n-1]){
            System.out.println("The first element of array is less than the last elemnt");
        }else{
            System.out.println("Both the first and last element are equal to each other");
        }
    }
}
