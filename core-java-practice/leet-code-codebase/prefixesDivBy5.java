public class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int mod = 0;
        for(int i = 0; i < nums.length; i++){
            mod = (mod * 2 + nums[i]) % 5;
            if(mod == 0){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
} prefi {
    
}
