class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        
        if(l==1)
            return nums[0];
        else if(l==2)
            return Math.max(nums[0],nums[1]);
        
        
        int dp[] = new int[l];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        
        for(int i=2;i<l;i++){
            dp[i]= Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        
        return dp[l-1];   
    }   
}