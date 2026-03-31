import java.util.*;
public class EmployeeIDInsertionSorting {
    // main funcion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] employeeIDs = {102, 105, 101, 104, 103};
        insertionSort(employeeIDs); // callingh a function
        
        System.out.println("Sorted Employee IDs:");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
    public static void insertionSort(int[] employeeIDs) {
        int len = employeeIDs.length;
        for(int i = 1; i < len; i++){
            int j = i;
            
            while(j > 0 && employeeIDs[j-1] > employeeIDs[j]){
                // Swap arr[j] and arr[j-1]
                int temp = employeeIDs[j];
                employeeIDs[j] = employeeIDs[j-1];
                employeeIDs[j-1] = temp;
                j--;
            }
        }
    }
}

        
