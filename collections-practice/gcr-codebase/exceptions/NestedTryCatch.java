import java.util.*;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};
        try{
            System.out.print("Enter the index of array: ");
            int index = sc.nextInt();
            int element = array[index];
            System.out.println("Element at index " + index + ": " + element);
            try{
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();
                int result = element / divisor;
                System.out.println("Division result: " + result);
            }catch(ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index!");
        }finally{
            sc.close();
        }
    }
}