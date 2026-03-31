public class Solution {
    public int SearchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length;
        while (i < j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                j = mid;
            } else {
                i++;
            }
        }
        return i;
    }
} {
    
}
