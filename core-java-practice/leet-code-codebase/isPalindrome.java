class Solution {

    public boolean isPalindrome(int x) {
        int local = x;
        int sum = 0;
        int remainder, mod;
        while (x > 0) {
            mod = x % 10;
            x = x / 10;
            sum = sum * 10 + mod;
        }
            return (sum == local );
         }
 }    