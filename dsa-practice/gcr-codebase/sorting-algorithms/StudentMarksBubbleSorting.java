import java.util.*;

public class StudentMarksBubbleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = {85, 70, 95, 60, 80, 90};
        bubbleSort(marks);
        
        System.out.println("Sorted student marks are :");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        boolean swapped;

        // Traversing through all elements in the array
        for (int i = 0; i < len - 1; i++) {
            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swaping, if elements are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
    
}
