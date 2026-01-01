import java.util.*;
public class ComparisonOfSearchPerformance { // linear search and binary search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sizes = {1000, 10000, 1000000};
        int target = sc.nextInt();
        for (int size : sizes) {
            int[] data = generateDataset(size);
            //Linear Search time
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long timeLinear = System.nanoTime() - startLinear;
            //Sort and measure Binary Search time
            Arrays.sort(data);
            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long timeBinary = System.nanoTime() - startBinary;

            System.out.println("The size of Dataset is : " + size);
            System.out.println("Linear Search complexity: " + timeLinear / 1e6 + " ms");
            System.out.println("Binary Search complexity: " + timeBinary / 1e6 + " ms");
        }
    }
    // Linear Search:-> O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    // Binary Search:-> O(log N), for sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
    // Generating array with random integers using Random
    public static int[] generateDataset(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(size * 2);
        }
        return arr;
    }
}
