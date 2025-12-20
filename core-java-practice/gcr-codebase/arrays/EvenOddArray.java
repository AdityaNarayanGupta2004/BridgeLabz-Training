import java.util.*;
public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i < number; i++){
            arr[i] = sc.nextInt();
        }
        int odd[]= new int[number];
        int even[]= new int[number];
        int oddidx=0;
        int evenidx=0;
        for(int i=0; i < number; i++) {
            if(arr[i] % 2 == 0) {
                even[evenidx++] = number;
            } else {
                odd[oddidx++] = number;
            }
        }
        for(int i=0;i<oddidx;i++){
            System.out.println("Odd number: " + odd[i]);
        }
        System.out.println();
        for(int i=0;i<evenidx;i++){
            System.out.println("Even number: " + even[i]);
        }
    }
}
