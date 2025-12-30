import java.util.*;
public class SlidingWindowMaximum {
    // main function
    public static void main(String[] args) {
        int[] nums = {2, 5, -1, -5, -4,8, 2, 12, 21};
        int k = 3;// size of a window
        int[] result = maxSlidingWindow(nums, k); // calling a function
        System.out.println(Arrays.toString(result)); 
    }
    // Method to find maximum in each sliding window of size k
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // Edge case: if input array is null or window size is 0, return empty array
        if (nums == null || k <= 0) return new int[0];
        int len = nums.length; // length of a array
        int[] result = new int[len - k + 1]; // Array to store maximums for each window
        Deque<Integer> deque = new ArrayDeque<>(); 
        for (int i = 0; i < len; i++) {
            // Remove indices that are outside the current window
            // If the index at the front is out of this window's range, remove it
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            // Maintain decreasing order in deque
            // Remove indices from the back whose corresponding values are less than current value
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            // Add current element's index to the deque
            deque.offerLast(i);
            // Once the first full window is traversed, start recording max values
            // The maximum value in the current window is at the front of the deque
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}