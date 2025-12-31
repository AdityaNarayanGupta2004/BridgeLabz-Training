import java.util.Scanner;
public class FirstAndLastOccurrencesInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int idx = 0; idx < arr.length; idx++){
            arr[idx] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = 4;
        int firstOcc = findFirst(arr, target);
        int lastOcc = findLast(arr, target);

        if (firstOcc != -1 && lastOcc != -1) {
            System.out.println("First occurrence of given target" + target + " is found at index: " + firstOcc);
            System.out.println("Last occurrence of given target " + target + " is found at index: " + lastOcc);
        } else {
            System.out.println("Give target number "+ target+ " is not Found in the array");
        }
    }
    // Find first occurrence of target
    public static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // continue search on left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    // Find last occurrence of target
    public static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // continue search on right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
