import java.util.Scanner;

public class ValueStoreUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 10;
        int arr[] = new int[10];
        int idx = 0; // index
        while(idx < length){
            int num = sc.nextInt();
            if(num <= 0){
                break;
            }
            arr[idx]=num;
            idx++;
        }
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += arr[i];
        }
        System.out.println("the Sum is"+ sum );
    }
}
