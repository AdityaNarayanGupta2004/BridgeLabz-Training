import java.util.*;

public class ArrayIndexOutOfBoundsDemonstration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"ram", "harry", "abc", "devil"};
        System.out.print("Enter the index (0 to " + (names.length - 1) + "): ");
        int index = sc.nextInt();
        ExceptionHandleFun(names, index);
    }

    public static void generate(String[] array, int index) {
        System.out.println("Accessed name: " + array[index]);
    }

    public static void ExceptionHandleFun(String[] array, int index) {
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
