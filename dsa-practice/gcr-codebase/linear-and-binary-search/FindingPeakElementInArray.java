import java.util.*;
public class FindingPeakElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        Arrays.sort(arr);
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element found at index is : " + peakIndex);
        System.out.println("Value of peak element is: " + arr[peakIndex]);
    }

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        // Edge cases: if there's only one element or peak is at ends
        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n - 1] > arr[n - 2]) return n - 1;
        int left = 1;
        int right = n - 2;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid; // Found peak
            }else if (arr[mid] < arr[mid - 1]){
                right = mid - 1; // Search left
            }else{
                left = mid + 1; // Search right
            }
        }
        return -1;
    }
}
