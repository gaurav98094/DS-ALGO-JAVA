class Solution {
    public boolean canJump(int[] nums) {
        int far = 0;
        
        if(nums.length==1)
            return true;
        
        for(int i=0;i<nums.length;i++){       
            far = Math.max(far,i+nums[i]); 
            if(far>=(nums.length-1))
                return true;
        }
        return false;
    }
}